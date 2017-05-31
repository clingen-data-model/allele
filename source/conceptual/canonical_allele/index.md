---
title: CanonicalAllele
description: A stable identifier for an allele, grouping together the different ways that the allele might be described across different versions of different ReferenceSequences.
layout: conceptual
model: allele
related_page_title: CanonicalAllele
related_page_url: /resource/canonical_allele

---

Scope and Usage
---------------

Variation at a genetic locus can be described using a set of alleles that may occur, located at a particular position on a reference sequence (see e.g. ContextualAllele).  However, there may be multiple equivalent representations of a given allele. For instance, an allele may be described in the context of different versions of a reference sequence, or because the string-based representation of an allele is not unique due to sequence redundancy. A `CanonicalAllele` is a unique identifier, within a system, that can be associated with equivalent alleles.

A `CanonicalAllele` represents an aggregation of the many representations of the Allele entity into a single object with a stable identifier.  One example of such a stable identifier would be a dbSNP ID, plus a choice of an allele at that locus.  Another would be an integer key created by an implementor.

Providing a stable identifier allows `CanonicalAllele` to be the referenceable version of genetic variation.    The `CanonicalAllele` is the entity about which statements are made by other entities such as population frequency information, assertions, observations, and so on.

The need for canonicalization, and the methods that can potentially be used to aggregate alleles under a `CanonicalAllele` are elaborated in the [Canonicalization discussion page](/discussion/canonicalization.html)

If the two systems share a canonicalizer, then the id of the `CanonicalAllele` MUST be the same in each system, and can be used as a reference to the allele across multiple systems.

## Subclass hierarchy and type safety

Specific Allele representations will be grouped together under a `CanonicalAllele` if they represent identical entities.  In particular, Alleles based on DNA (genomic and transcript) can be grouped together under a `CanonicalAllele`, and Alleles based on amino acids may be grouped together under a different `CanonicalAllele`, but DNA and Amino Acid alleles may not be grouped together under a `CanonicalAllele`.  Consider a missense change to a protein that can be induced by two different genomic variations.  If a `CanonicalAllele` included both DNA and Protein Alleles, then the two different genomic variations would be considered identical through their identity with the same protein allele.  For this reason, `CanonicalAllele` does not aggregate protein with DNA Alleles.

`CanoncialAllele` is an abstract class; no instances of `CanonicalAllele` itself may be created.  Subclasses of `CanonicalAllele` are either Simple or Complex.  ContextualAlleles are alleles that can be described by denoting a single contiguous region of a `ReferenceSequence`, and a sequence that will occur in place of that region.  Note that the replacement sequence may be the same as the original sequence.  A `ComplexAllele` is a set of `ContextualAllele`s that all occur on the same copy of the chromosome, i.e. a Haplotype.

A validator MUST ensure that this type safety is preserved

Exclusions and Limitations
--------------------------

The current Allele model does not specifically model the provenance of how canonicalization occured, so if canonicalizers change over time (say due to the mapping issue below) or if multiple canonicalizers are available, this model does not provide a way for implementers to track this information.

Implicit in the idea that a TranscriptAlleles and GenomicAlleles can be aggregated under a `CanonicalAllele` is the idea that the alignment from TranscriptReferenceSequence to a GenomicReferenceSequence is known, and stable.   No information about these alignments is included in the model, however.   This potentially allows the following situation:  Based on one set of alignments, GenomeAllele A is aggregated with ReferenceAllele B.  Suppose that with a different set of alignments, ReferenceAlleleB is now aggregated with GenomeAllele C.  This may lead to the incorrect aggregation of GenomeAlleles A and C.  It is the responsibility of the canonicalization service to guard against this.

Conceptual Model
----------------

[![CanonicalAllele Conceptual Diagram](/images/CanonicalAlleleConceptual.svg){: .img-responsive}](/images/`CanonicalAllele`Conceptual.svg)

Related Resources: [CanonicalAllele](/resource/canonical_allele/index.html), [ContextualAllele](/resource/contextual_allele/index.html), [Provenance](/resource/provenance/index.html)

Attributes
----------

identifier:

`CanonicalAlleleIdentifier` can only be used for identifiers granted by a canonicalizing authority.  Historic names, HGVS expressions, and other non-canonical representations of an allele are not appropriate uses of `CanonicalAlleleIdentifier`.  For identifiers of this type, see `AlleleName`.

active:

Flag indicating whether the `CanonicalAllele` is the currently-canonical `CanonicalAllele`. If not, one or more subsequent `CanonicalAllele`s will be in the `replacement` relation.
