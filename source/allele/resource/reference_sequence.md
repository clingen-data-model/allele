---
title: ReferenceSequence
description: A versioned sequence of nucleotide bases or amino acids.

---

Scope and Usage
---------------

All alleles are described relative to a ReferenceSequence: the position of the allele is given as an offset relative to the beginning of a ReferenceSequence and the sequence described by an allele is given relative to the sequence at that position of the ReferenceSequence.

Context
-------

The ReferenceSequence resource is described by the following attributes

* identifier (mandatory)
* kind (mandatory)
* genomicSequenceType (mandatory)
* codingRegionOffset (optional)
* gene (optional)

Resource Content
----------------

![ReferenceSequence resource diagram](/images/ReferenceSequence.svg)

This resource is referenced by [SimpleAminoAcidAllele](simple_amino_acid_allele.html)

	<ReferenceSequence>
		<identifier></identifier>
		<kind></kind>
		<chr></chr>
		<genomicSequenceType></genomicSequenceType>
		<codingRegionOffset></codingRegionOffset>
		<gene></gene>
	</ReferenceSequence>

Notes
-----

The preferred ReferenceSequence to bind an allele to will be the NC_* reference assembly, as defined by RefSeq.

Search Parameters
-----------------

{:.table}
| name | type | description | paths |
|------|------|-------------|-------|
| _id  | integer | the numeric integer identifer for the ReferenceSequence|


Examples
--------

Homo sapiens chromosome 1, GRCh38 Primary Assembly
NCBI Reference Sequence: NC_000001.11

	<ReferenceSequence>
		<identifier>
			<label>Homo sapiens chromosome 1, GRCh38 Primary Assembly.</label>
			<system>refseq</system>
			<value>NC_000001.11</value>
		</identifier>
		<kind>nucleotide</kind>
		<chr>1</chr>
		<genomicSequenceType>chr</genomicSequenceType>
		<codingRegionOffset>0</codingRegionOffset>
	</ReferenceSequence>

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
terminology binding
: Codes identifying human chromosomes

#### ReferenceSequence.genomicSequenceType

{:.dl-horizontal}
terminology binding
: Codes identifying the types of genomic sequences

#### ReferenceSequence.codingRegionOffset

{:.dl-horizontal}
definition
: lorem ipsum

#### ReferenceSequence.gene

{:.dl-horizontal}
terminology binding
: Codes describing human genes
