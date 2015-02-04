---
title: CanonicalAllele
---

Definition
----------

A stable identifier for an allele, grouping together the different ways that allele might be described across different versions of different ReferenceSequences.

Scope and Usage
---------------

Variation at a genetic locus can be described using a set of alleles that may occur, located at a particular position on a reference sequence (see e.g. SimpleAllele).  However, ReferenceSequences are not completely stable; over time, new sequences are discovered and old sequences are modified.  If an Allele is defined against an old sequence, and against the new sequence, both position and reference allele may vary across these representations. Furthermore, if a genomic variant occurs in a transcript, the allele may be defined with respect to either the genomic sequence, or the transcript sequence.

The problem of multiple representations of the same entity is compounded by the fact that none of these representations may be chosen as stable: any one of the reference sequences may be updated in the future, tying any preferred representation to an obsolete reference sequence.

Multiple representations of an allele are often produced when tandem repeats occur in the genome. For instance, if a region with three contiguous T bases is replaced with only 2 T bases, differing tools have several ways to represent the change (for instance, the removal of each of the three bases independently could all be reported, and would often be seen as different alleles, though they are indistinguishable, and should be aggregated together.

A CanonicalAllele represents an aggregation of the many representations of the Allele entity into a single object with a stable identifier.  One example of such a stable identifier would be a dbSNP ID, plus a choice of an allele at that locus.  Another would be an integer key created by an implementor.

Providing a stable identifier allows CanonicalAllele to be the referenceable version of genetic variation.    The CanonicalAllele is the entity about which statements are made by other entities such as population frequency information, assertions, observations, and so on.

Specific Allele representations will be grouped together under a CanonicalAllele if they represent identical entities.  In particular, Alleles based on DNA (genomic and transcript) can be grouped together under a CanonicalAllele, and Alleles based on proteins may be grouped together under a different CanonicalAllele, but DNA and Protein alleles may not be grouped together under a CanonicalAllele.  Consider a missense change to a protein that can be induced by two different genomic variations.  If a CanonicalAllele included both DNA and Protein Alleles, then the two different genomic variations would be considered identical through their identity with the same protein allele.  For this reason, CanonicalAllele does not aggregate protein with DNA Alleles.

CanoncialAllele is an abstract class; no instances of CanonicalAllele itself may be created.  Subclasses of CanonicalAllele are either Simple or Complex.  SimpleAlleles are alleles that can be described by denoting a single contiguous region of a ReferenceSequence, and a sequence that will occur in place of that region.  Note that the replacement sequence may be the same as the original sequence.  A ComplexAllele is a set of SimpleAlleles that all occur on the same copy of the chromosome, i.e. a Haplotype.

Implementors must choose a canonicalization method: a method for determining whether a given allele defined with respect to a particular ReferenceSequence can be aggregated into a previously known CanonicalAllele, and to provide a new CanonicalAlleleID when it cannot.   Because CanonicalAlleleID represents a potentially useful way to communicate about alleles with external systems, it would be beneficial to choose a canonicalization scheme that is externally implemented and can be used consistently by multiple parties.

One such canonicalization scheme (for DNA Alleles) would be to use dbSNP ids and the alternate allele as the CanonicalAllele identifier.  To canonicalize an allele, the NCBI Variation Reporter API would be queried for that allele.  If the alleles is known, then the dbSNP id would be returned and could be used.    In the case where the allele is not returned, however, a submission to dbSNP would then need to be instituted.  Because rsids are not immediately awarded, a temporary identifier would have to be used by the implementing system, to be updated once an rsid was granted, which may take as long as one month.  Another limitation of such an approach is that dbSNP ids can not be used for CanonicalProteinAlleles, so a different canonicalization approach must be made for that case.

Exclusions and Limitations
--------------------------

The current Allele model does not specifically model the provenance of how canonicalization occured, so if canonicalizers change over time (say due to the mapping issue below) or if multiple canonicalizers are available, this model does not provide a way for implementors to track this information.

Implicit in the idea that a TranscriptAlleles and GenomicAlleles can be aggregated under a CanonicalAllele is the idea that the alignment from TranscriptReferenceSequence to a GenomicReferenceSequence is known, and stable.   No information about these alignments is included in the model, however.   This potentially allows the following situation:  Based on one set of alignments, GenomeAllele A is aggregated with ReferenceAllele B.  Suppose that with a different set of alignments, ReferenceAlleleB is now aggregated with GenomeAllele C.  This may lead to the incorrect aggregation of GenomeAlleles A and C.  It is the responsibility of the canonicalization service to guard against this.
