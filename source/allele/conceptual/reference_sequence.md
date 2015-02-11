---
title: ReferenceSequence
---

Definition
----------

A versioned sequence of nucleotide bases or amino acids.  

Scope and Usage
---------------

Reference sequences each have a versioned accession number: A short string key that can be used to look up the exact sequence, must be in a public database.  Any change to the sequence necessitates a change to the version.

ReferenceSequence is abstract: actual instances must be either a GenomicReferenceSequence, a TranscriptReferenceSequence, or a ProteinReferenceSequence.

The main usage of ReferenceSequence is as a base against which variation can be described.

Exclusions and Limitations
--------------------------

Only a subset of the relationships between different subclasses of ReferenceSequence are modeled in version 1.0.   In particular, the relationship between GenomicReferenceSequence and TranscriptReferenceSequence is left unmodeled.  In actuality, the relationship between two sequences of these types would be created by aligning the TranscriptReferenceSequence to the GenomicReferenceSequence  (using a tool such as BLAT.) , and details of this mapping would be included in a class joining these two types of ReferenceSequence.
