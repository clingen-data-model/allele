---
title: ComplexAminoAcidCanonicalAllele
layout: conceptual
model: allele
description: A stable identifier for a complex protein allele, based on an aggregation of SimpleAminoAcidCanonicalAlleles.

---

Scope and Usage
---------------

ComplexAminoAcidCanonicalAllele is a protein-specific subclass of ComplexCanonicalAllele.  It represents a particular set of SimpleAminoAcidCanonicalAlleles that occur together in the same protein.

This subclass of [ComplexCanonicalAllele](complex_canonical_allele.html) exists in the conceptual to ensure type-safety: a ComplexAminoAcidCanonicalAllele can only be composed of [SimpleAminoAcidCanonicalAllele](simple_amino_acid_canonical_allele.html)s (not, for instance, nucleotide alleles).

See Also
--------

[ComplexCanonicalAllele](complex_canonical_allele.html), [SimpleAminoAcidCanonicalAllele](simple_amino_acid_canonical_allele.html)

Related Resources: [CanonicalAllele](/resource/canonical_allele/index.html)
