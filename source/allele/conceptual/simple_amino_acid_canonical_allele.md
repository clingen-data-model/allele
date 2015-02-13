---
title: SimpleAminoAcidCanonicalAllele
description: A stable identifier for a simple  allele, grouping together the different ways that the allele might be described across different versions of a particular AminoAcidReferenceSequence. 

---

Scope and Usage
---------------

See also: SimpleCanonicalAllele, SimpleAminoAcidAllele

SimpleAminoAcidCanonicalAlleles aggregate different SimpleAminoAcidAlleles that are different representations of the same amino acid variation.   SimpleAminoAcidAlleles may be aggregated when they are:  
..* in different versions of the same AminoAcidReferenceSequence.  
..* in different AminoAcidReferenceSequences from the same public database, as long as their associated TranscriptReferenceSequence maps to the same Gene
..* in different AminoAcidReferenceSequences from different public databases, as long as their associated TranscriptReferenceSequence maps to the same gene.

(Note CB: Is this right?  We could make a more restricted aggregation by limiting to the first case.  It would not necessarily be terrible: the protein canonical alleles would still all be linked eventually via the associated nucleotide canonical allele.  But what is written above more closely paralleles what we do on the nucleotide side.  Or is it canonicalizers choice?)

Exclusions and Limitations
--------------------------

The amino acid aggregation described here depends upon having alignments of a gene''s associated amino acids, but this alignment is not currently represented in the model.
