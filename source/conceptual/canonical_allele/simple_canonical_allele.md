---
title: SimpleCanonicalAllele
layout: conceptual
model: allele
description: A stable identifier for a set of equivalent ContextualAlleles, grouping together the different ways that the allele might be described across different versions of different ReferenceSequences.

---

Scope and Usage
---------------



SimpleCanonicalAllele is a CanonicalAllele that is derived from the aggregation of multiple ContextualAlleles, which each record a particular choice of a variant sequence at a particular contiguous region in a particular ReferenceSequence.

SimpleCanonicalAllele is an abstract class, so no instances of bare SimpleCanonicalAllele can exist; every instance must either be a SimpleNucleotideCanonicalAllele or a SimpleAminoAcidCanonicalAllele.

Like any CanonicalAllele, a SimpleCanonicalAllele has a stable identifier that is independent of updates or additions to the underlying ReferenceSequences.  In addition, a SimpleCanonicalAllele, because it refers to a single contiguous region, may have a LocusIdentifier, that canonically describes that contiguous region, independent of particular references.

While NucleotideContextualAlleles may be aggregated together into a SimpleNucleotideCanonicalAllele, and AminoAcidContextualAlleles may be aggregated together into a SimpleAminoAcidCanonicalAllele, NucleotideContextualAlleles may not be aggregated with AminoAcidContextualAlleles.  Aggregation of this type would imply identity between these two types of alleles, which is invalid, since multiple nucleotide alleles may lead to the same amino acid allele instance, due to codon degeneracy.

Exclusions and Limitations
--------------------------

Given, for example, two nearby SNPs, one technically possible representation would be to write a ContextualAllele that includes the entire reference stretch between them.   While this is not explicitly disallowed by the model, suggested that a more useful approach is to treat this situation with two ContextualAlleles (corresponding to the two SNPs) aggregated into a ComplexNucleotideCanonicalAllele

See Also
--------

[ContextualAllele](../contextual_allele/index.html), [CanonicalAllele](index.html)

Related Resources: [CanonicalAllele](/resource/canonical_allele/index.html)
