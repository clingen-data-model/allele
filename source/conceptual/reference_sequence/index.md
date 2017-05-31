---
title: ReferenceSequence
layout: conceptual
model: allele
description: A versioned sequence of nucleotide bases or amino acids.
related_page_title: Reference Sequence
related_page_url: /resource/reference_sequence

---

Scope and Usage
---------------

Reference sequences each have a versioned accession number.  The accession number is a stable, reliable key that can be used to look up the exact sequence from a publicly accessible database.  Any change to the sequence necessitates a change to the version. These accession numbers are stored in the identifier attribute of the ReferenceSequence.

ReferenceSequence is the abstract representation of all reference sequences.  Actual 'concrete' instances of a reference sequence must either be a [ChromosomeReferenceSequence](chromosome_reference_sequence.html), a [GeneReferenceSequence](gene_reference_sequence.html), a [TranscriptReferenceSequence](transcript_reference_sequence.html), or a
[AminoAcidReferenceSequence](amino_acid_reference_sequence.html). As shown in the diagram there are two other abstract subtypes, [NucleotideReferenceSequence](nucleotide_reference_sequence.html) and [GenomicReferenceSequence](genomic_reference_sequence.html) which represent reference sequences composed of any nucleotide sequences versus only genomic nucleotide sequences, respectively. These ReferenceSequence subtypes distinguish the nucleotide [TranscriptReferenceSequence](transcript_reference_sequence.html) from both the more specialized genomic nucleotide [ChromosomeReferenceSequence](chromosome_reference_sequence.html) and [GeneReferenceSequence](gene_reference_sequence.html).


The main usage of ReferenceSequence is as a base against which variation can be described by way of a [ReferenceCoordinate](.../contextual_allele/reference_coordinate.html).

Exclusions and Limitations
--------------------------

Only a subset of the relationships between different subclasses of ReferenceSequence are modeled in version 1.0 of the Allele Model.   In particular, the relationship between [GenomicReferenceSequence](genomic_reference_sequence.html) and [TranscriptReferenceSequence](transcript_reference_sequence.html) is left unmodeled.  In actuality, the relationship between two sequences of these types would be created by aligning the [TranscriptReferenceSequence](transcript_reference_sequence.html) to the [GenomicReferenceSequence](genomic_reference_sequence.html)  (using a tool such as BLAT.), and details of this mapping would be included in a class joining these two types of ReferenceSequence.

The ReferenceSequence model does not include support for custom, private or non-public reference sequences.  It also, does not include public reference sequences that are not representative of a chromosome, gene, transcript or amino acid.

Conceptual Model
----------------

[![ReferenceSequence Conceptual Diagram](/images/ReferenceSequenceConceptual.svg){: .img-responsive}](/images/ReferenceSequenceConceptual.svg)

Resource Model: [ReferenceSequence](/resource/reference_sequence/index.html#resource-model)

Attributes
----------

{:.table}
| Attribute Name | Attribute Type |
|----------------|----------------|
| identifier     | Identifier     |

identifier: The Identifier must contains the versioned accession that can be used to uniquely identify the sequence in a public database as well as the information about which authority assigned the accession number.  It may optionally contain the time period over which the identifier is considered valid.   For ReferenceSequence, an identifier is valid unless the accession number is withdrawn.  If a new version of a sequence is created, it will be given a different versioned accession number, and therefore a different identifier.  In this case, the previous identifier is still valid: it can still be used to retrieve the given sequence, even if that sequence is no longer the most recent sequence associated with a given entity.


