---
title: CanonicalAllele
description: One of a set of coexisting sequence variants of a gene.
sequence_ontology: SO:0001023

---

Scope and Usage
---------------

A CanonicalAllele is a reference to a sequence change, independent of any particular representation relative to a ReferenceSequence. Since alleles are represented as a change (or no change) relative to a ReferenceSequence, a CanonicalAllele is composed of potentially multiple such representations (SimpleAlleles) that correspond to the same CanonicalAllele. One SimpleAllele is selected as the preferred representation of a CanonicalAllele

Context
-------

The CanonicalAllele resource is described by the following attributes.

* identifier: The assigned identifier that uniquely describes this CanonicalAllele
* active: Is the CanonicalAllele active, or is it invalid or superceeded by a different CanonicalAllele
* replacement: The CanonicalAllele to use instead in case it is found to describe the same allele as another CanonicalAllele
* sequenceType: The type of sequence refered to by the CanonicalAllele (nucleotide, amino acid, etc)
* complexityType: Is the CanonicalAllele represented by one SimpleAllele, or is it a composition of multiple CanonicalAlleles
* RelatedSimpleAllele: The preferred SimpleAllele used to represent the CanonicalAllele.


Resource Content
----------------



Notes
-----

Search Parameters
-----------------

{:.table}
| name | type | description | related attribute |
|------|------|-------------|-------|


Examples
--------

Formal Definitions
------------------
