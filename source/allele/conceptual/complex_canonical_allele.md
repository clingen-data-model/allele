---
title: ComplexCanonicalAllele
description: A stable identifier for a complex allele, defined as a series of two or more SimpleCanonicalAlleles that occur in cis.

---





Scope and Usage
---------------

ComplexCanonicalAllele is an abstract class; any instance of ComplexCanonicalAllele must be either a NucleotideComplexCanonicalAllele or a ProteinComplexCanonicalAllele.

A ComplexCanonicalAllele is an aggregation of two or more SimpleCanonicalAlleles, and provides a way to attach assertions or observations to the that collection.  The assertion that a particular person has a ComplexCanonicalAllele is equivalent to the assertion that they contain all of the SimpleCanonicalAlleles in cis (i.e. on the same copy of the chromosome).  

ComplexCanonicalAllele is a suitable class for describing pharmacogenomic star alleles or other haplotypes.

Because the ComplexCanonicalAllele is defined as an aggregation of SimpleCanonicalAlleles, canonicalization of the complex alleles is straightforward: every unique combination of CanonicalSimpleAlleles is already canonicalized.  

Exclusions and Limitations
--------------------------

ComplexCanonicalAllele is exclusivly used for alleles in cis.  It can not be used to represent, e.g. compound heterozygotes.

Concrete aggregation must occur at either the nucleotide or protein level; there is no way to build a complex allele that involves one CanonicalNucleotideSimpleAllele and one CanonicalProteinSimpleAllele.

There is exactly one level of aggregation: SimpleAlleles are aggregated to ComplexAlleles, but ComplexAlleles cannot be further aggregated to new ComplexAlleles.  In this case, a new ComplexAllele must be created based on the union of all of the involved SimpleAlleles.
