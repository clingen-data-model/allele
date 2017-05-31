---
title: ComplexNucleotideCanonicalAllele
layout: conceptual
model: allele
description: A stable identifier for a complex nucleotide allele, based on an aggregation of SimpleNucleotideCanonicalAlleles.

---


Scope and Usage
---------------

ComplexNucleotideCanonicalAllele is a nucleotide-specific subclass of [ComplexCanonicalAllele](complex_canonical_allele.html).  It represents a particular set of SimpleNucleotideCanonicalAlleles that occur in *cis*.

This subclass of [ComplexCanonicalAllele](complex_canonical_allele.html) exists in the conceptual to ensure type-safety: a ComplexNucleotideCanonicalAllele can only be composed of [SimpleNucleotideCanonicalAllele](simple_nucleotide_canonical_allele.html)s (not, for instance, nucleotide alleles).

See Also
--------

[ComplexCanonicalAllele](complex_canonical_allele.html), [SimpleNucleotideCanonicalAllele](simple_nucleotide_canonical_allele.html)

Related Resources: [CanonicalAllele](/resource/canonical_allele/index.html)
