---
title: SimpleAllele
layout: resource
alias: simple allele, allele, variant, sequence variant, snv, amino acid variant, dna change, aa change
description: A representation of an allele relative to a reference sequence. A CanonicalAllele is a composition of these, with one SimpleAllele selected as a prefered representation.
model: allele
resource: SimpleAllele
composed_of:
  - name: alleleName
    type: AlleleName
    multiplicity: 0..*
  - name: related
    type: RelatedSimpleAllele
    multiplicity: 0..*
  - name: referenceCoordinate
    type: ReferenceCoordinate
    multiplicity: 1
attributes:
  - name: identifier
    type: Identifier[]
    definition: set of identifiers uniquely identifying this SimpleAllele in this (and other) data stores
  - name: canonicalAllele
    type: CanonicalAllele
    definition: associated CanonicalAllele
  - name: sequenceClass
    type: code
    definition: associated class of sequence
  - name: nucleotideSequenceClass
    type: code
    definition: associated class of nucleotide sequence
  - name: allele
    type: string
    definition: simple string description of allele
  - name: nucleotideChangeType
    type: CodeableConcept
    definition: Change described by SimpleAllele
  - name: aminoAcidChangeType
    type: CodeableConcept
    definition: amino acid change described by SimpleAllele
related_page: /allele/conceptual/simple_allele

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
* primaryNucleotideChangeType: type of change if SimpleAllele represents a nucleotide change (insertion, deletion, etc.)
* ancillaryNucleotideChangeType[]: additional change types for nucleotide simple alleles for finer classification when desired.
* primaryAminoAcidChangeType: type of change if SimpleAllele represents an amino acid change (frameshift, etc)
* ancillaryAminoAcidChangeType[]: additional change types for amino acid simple alleles for finer classifcation when desired.
* ReferenceCoordinate: The coordinates of the allele relative to a ReferenceSequence
* AlleleName: Identifiers giving the allele a unique name, possible HGVS expressions, etc.

Resource Model
----------------

[![SimpleAllele Resource Diagram](/images/SimpleAlleleResource.svg){: .img-responsive}](/images/SimpleAlleleResource.svg)

Conceptual Model: [SimpleAllele](/allele/conceptual/simple_allele/index.html#conceptual-model)


Notes
-----

Search Parameters
-----------------

{:.table}
| name | type | description | related attribute |
|------|------|-------------|-------------------|
| _id  | token | the integer identifier of the simple allele | |


Formal Definitions
------------------



