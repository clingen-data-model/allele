---
title: SimpleAllele
description: A representation of an allele relative to a reference sequence. A CanonicalAllele is a composition of these, with one SimpleAllele selected as a prefered representation.

---

Scope and Usage
---------------

A SimpleAllele does not exist outside the context of a CanonicalAllele; a CanonicalAllele is represented by one or more simple alleles. 

Context
-------

The SimpleAllele resource is described by the following attributes.

* identifier[] The set of identifiers that describe the SimpleAllele
* canonicalAllele The CanonicalAllele associated with the SimpleAllele
* 


Resource Content
----------------

![SimpleAllele diagram](/images/SimpleAllele.svg)


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



