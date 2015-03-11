---
title: ReferenceSequence
description: A versioned sequence of nucleotide bases or amino acids.
sequence_ontology: SO:0000994

---

Scope and Usage
---------------

All alleles are described relative to a ReferenceSequence: the position of the allele is given as an offset relative to the beginning of a ReferenceSequence and the sequence described by an allele is given relative to the sequence at that position of the ReferenceSequence.

Context
-------

The ReferenceSequence resource is described by the following attributes

* identifier (mandatory)
* sequenceClass (mandatory)
* nucleotideSequenceClass (optional)
* genomicSequenceClass (optional)
* gene (optional)
* referenceGenome (optional)

Resource Model
----------------

[![ReferenceSequence Resource Diagram](/images/ReferenceSequenceResource.svg){: .img-responsive}](/images/ReferenceSequenceResource.svg)

Conceptual Model: [ReferenceSequence](/allele/conceptual/reference_sequence/index.html#conceptual_model)

This resource is referenced by [SimpleAllele](/allele/resource/simple_allele) & [Gene](/allele/resource/gene)

Notes
-----

The preferred ReferenceSequence to bind an allele to will be the NC_* reference assembly, as defined by RefSeq.

Search Parameters
-----------------

{:.table}
| name | type | description | related attribute |
|------|------|-------------|-------|
| _id  | token | the integer identifer for the ReferenceSequence|
| chr | token | the chromosome code | ReferenceSequence.chr |
| referenceGenome-id | token | | |
| referenceGenome-name | string | | |
| gene | resource | | |


Examples
--------

{:.table}
|Name                       |||
|---------------------------|||
|RS201-NM\_001014794.2-ILK|[XML](/allele/implementation/examples/RS201.html#xml)|[JSON](/allele/implementation/examples/RS201.html#json)|
|RS202-NC\_000011.9-b37|[XML](/allele/implementation/examples/RS202.html#xml)|[JSON](/allele/implementation/examples/RS202.html#json)|
|RS203-NC\_000011.10-b38|[XML](/allele/implementation/examples/RS203.html#xml)|[JSON](/allele/implementation/examples/RS203.html#json)|
|RS210-NC\_000017.11-b38|[XML](/allele/implementation/examples/RS210.html#xml)|[JSON](/allele/implementation/examples/RS210.html#json)|


Formal Definitions
------------------

#### ReferenceSequence

{:.dl-horizontal}
definition
: Consensus sequence of a portion of the genome against which alleles are aligned and described.

control
: 1..1

requirements
: For every allele there must be a corresponding reference sequence.

#### ReferenceSequence.identifier

{:.dl-horizontal}
definition
: The versioned accession that can be used to uniquely identify the sequence in a public database, as well as the information about which entity assigned the accession, and the time period over which the identifier is considered valid.

multiplicity
: 1..1

requirements
: For ReferenceSequence, an identifier is valid unless the accession is withdrawn. If a new version of a sequence is created, it will be given a different versioned accession, and therefore a different identifier. In this case, the previous identifier is still valid: it can still be used to retrieve the given sequence, even if that sequence is no longer the most recent sequence associated with a given entity.

terminology binding
: One of a set of valid reference sequence acessions from a recognized authority

#### ReferenceSequence.kind

{:.dl-horizontal}
definition
: The type of reference sequence.

multiplicity
: 1..1

terminology binding
: Codes identifying kinds of reference sequences

#### ReferenceSequence.chr

{:.dl-horizontal}
definition
: chromosome to which ReferenceSequence is bound

multiplicity
: 0..1

terminology binding
: Codes identifying human chromosomes

#### ReferenceSequence.genomicSequenceType

{:.dl-horizontal}
terminology binding
: Codes identifying the types of genomic sequences

#### ReferenceSequence.codingRegionOffset

{:.dl-horizontal}
definition
: offset of start of sequence from start of coding region

multiplicity
: 1..1

#### ReferenceSequence.gene

{:.dl-horizontal}
definition
: gene, if sequence is reference for specific gene

multiplicity
: 0..1

terminology binding
: Codes describing human genes