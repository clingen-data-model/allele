---
title: SimpleAminoAcidCanonicalAllele
layout: conceptual
model: allele
description: A stable identifier for a allele instance, grouping together the different ways that the allele might be described across different versions of a particular AminoAcidReferenceSequence.

---

Scope and Usage
---------------


SimpleAminoAcidCanonicalAlleles aggregate different SimpleAminoAcidAlleles that are different representations of the same amino acid variation.  SimpleAminoAcidAlleles MAY be aggregated (this is
left as an implementation detail to a canonicalizer) when they are:  

* in different versions of the same AminoAcidReferenceSequence.  
* in different AminoAcidReferenceSequences from the same public database, as long as their associated TranscriptReferenceSequence maps to the same Gene
* in different AminoAcidReferenceSequences from different public databases, as long as their associated TranscriptReferenceSequence maps to the same gene.

Exclusions and Limitations
--------------------------

The amino acid aggregation described here depends upon having alignments of a gene''s associated amino acids, but this alignment is not currently represented in the model.

See Also
--------

[SimpleCanonicalAllele](simple_canonical_allele.html), [SimpleAminoAcidAllele](simple_amino_acid_allele.html)

Related Resources: [CanonicalAllele](/resource/canonical_allele/index.html)
