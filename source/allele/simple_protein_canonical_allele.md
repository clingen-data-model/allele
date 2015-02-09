---
title: SimpleProteinCanonicalAllele
---

Definition
----------

A stable identifier for a simple protein allele, grouping together the different ways that the allele might be described across different versions of a particular ProteinReferenceSequence.

Scope and Usage
---------------

See also: SimpleCanonicalAllele, ProteinSimpleAllele

SimpleProteinCanonicalAlleles aggregate different ProteinSimpleAlleles that are different representations of the same protein variation.   ProteinSimpleAlleles may be aggregated when they are:  
..* in different versions of the same ProteinReferenceSequence.  
..* in different ProteinReferenceSequences from the same public database, as long as their associated TranscriptReferenceSequence maps to the same Gene
..* in different ProteinReferenceSequences from different public databases, as long as their associated TranscriptReferenceSequence maps to the same gene.

(Note CB: Is this right?  We could make a more restricted aggregation by limiting to the first case.  It would not necessarily be terrible: the protein canonical alleles would still all be linked eventually via the associated nucleotide canonical allele.  But what is written above more closely paralleles what we do on the nucleotide side.  Or is it canonicalizers choice?)

Exclusions and Limitations
--------------------------

The protein aggregation described here depends upon having alignments of a gene''s associated proteins, but this alignment is not currently represented in the model.
