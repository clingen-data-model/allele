---
title: SimpleAllele
description: A representation of an allele relative to a reference sequence. A CanonicalAllele is a composition of these, with one SimpleAllele selected as a prefered representation.

---

Scope and Usage
---------------

A CanonicalAllele does not exist outside the context of a SimpleAllele; a CanonicalAllele is represented by one or more simple alleles. 

Context
-------

The SimpleAllele resource is described by the following attributes.

* identifier[]: The set of identifiers that describe the SimpleAllele
* canonicalAllele: The CanonicalAllele associated with the SimpleAllele
* sequenceType: The type of sequence referred to by the SimpleAllele (nucleotide/amino acid, etc)
* allele: HGVS expression representing the SimpleAllele
* nucleotideChangeType: type of change if SimpleAllele represents a nucleotide change (insertion, deletion, etc.)
* aminoAcidChangeType: type of change if SimpleAllele represents an amino acid change (frameshift, etc)
* ReferenceCoordinate: The coordinates of the allele relative to a ReferenceSequence
* AlleleName: Identifiers giving the allele a unique name, possible HGVS expressions, etc.

Resource Model
----------------

[![SimpleAllele Resource Diagram](/images/SimpleAlleleResource.svg){: .img-responsive}](/images/SimpleAlleleResource.svg)

Conceptual Model: [SimpleAllele](/allele/conceptual/simple_allele/index.html#conceptual_model)


Notes
-----

Search Parameters
-----------------

{:.table}
| name | type | description | related attribute |
|------|------|-------------|-------------------|
| _id  | token | the integer identifier of the simple allele | |


Examples
--------

Formal Definitions
------------------



