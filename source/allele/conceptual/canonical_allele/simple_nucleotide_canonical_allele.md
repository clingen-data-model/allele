---
title: SimpleNucleotideCanonicalAllele
description: A stable identifier for a simple nucleotide allele, grouping together the different ways that the allele might be described across different versions of different GenomeReferences and TranscriptReferenceSequences.

---

Scope and Usage
---------------

SimpleNucleotideCanonicalAlleles aggregate different NucleotideSimpleAlleles that are different representations of the same genetic variation.   Potentially, this aggregates all the versions of the allele in different GenomicReferenceSequences, as well as a TranscriptSimpleAllele for any transcript that maps to any of those GenomicReferenceSequences.

Exclusions and Limitations
--------------------------

Aggregation of TranscriptSimpleAlleles with GenomicSimpleAlleles requires the mapping of a TranscriptReferenceSequence to a GenomicReferenceSequence, and the identification of the Alleles will depend on the details of the mapping process.  A more complete version of the allele model would incorporate information about the transcript alignment.

See Also
--------

[SimpleCanonicalAllele](simple_canonical_allele.html), [NucleotideSimpleAllele](nucleotide_simple_allele.html)

Related Resources: [CanonicalAllele](/allele/resource/canonical_allele/index.html)