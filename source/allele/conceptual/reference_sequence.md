---
title: ReferenceSequence
description: A versioned sequence of nucleotide bases or amino acids.

---

Scope and Usage
---------------

Reference sequences each have a versioned accession number: A short string key that can be used to look up the exact sequence, must be in a public database.  Any change to the sequence necessitates a change to the version. These accession numbers are stored in the identifier attribute of the ReferenceSequence.

ReferenceSequence is abstract: actual instances must be either a [ChromosomeReferenceSequence](chromosome_reference_sequence.html), a [GeneReferenceSequence](gene_reference_sequence.html), a [TranscriptReferenceSequence](transcript_reference_sequence.html), or a
[AminoAcidReferenceSequence] (amino_acid_reference_sequence.html).


The main usage of ReferenceSequence is as a base against which variation can be described.

Exclusions and Limitations
--------------------------

Only a subset of the relationships between different subclasses of ReferenceSequence are modeled in version 1.0 of the Allele Model.   In particular, the relationship between [GenomicReferenceSequence](genomic_reference_sequence.html) and [TranscriptReferenceSequence](transcript_reference_sequence.html) is left unmodeled.  In actuality, the relationship between two sequences of these types would be created by aligning the [TranscriptReferenceSequence](transcript_reference_sequence.html) to the [GenomicReferenceSequence](genomic_reference_sequence.html)  (using a tool such as BLAT.) , and details of this mapping would be included in a class joining these two types of ReferenceSequence.

Attributes
----------

| Attribute Name | Attribute Type |
|----------------|----------------|
| identifier     | Identifier     |

identifier: An Identifier contains the versioned accession that can be used to uniquely identify the sequence in a public database, as well as the information about which entity assigned the accession, and the time period over which the identifier is considered valid.   For ReferenceSequence, an identifier is valid unless the accession is withdrawn.  If a new version of a sequence is created, it will be given a different versioned accession, and therefore a different identifier.  In this case, the previous identifier is still valid: it can still be used to retrieve the given sequence, even if that sequence is no longer the most recent sequence associated with a given entity.


