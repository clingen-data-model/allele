---
title: ReferenceSequence
layout: resource
alias: reference sequence, refseq, sequence, accession
description: A versioned sequence of nucleotide bases or amino acids.
sequence_ontology: SO:0001411
model: allele
resource: ReferenceSequence
related_page: /allele/conceptual/reference_sequence
composed_of:
  - name: related
    type: RelatedReferenceSequence
    multiplicity: 0..*
attributes:
  - name: identifier
    type: Identifier
    definition: The versioned accession that can be used to uniquely identify the sequence in a public database, as well as the information about which entity assigned the accession, and the time period over which the identifier is considered valid.
    multiplicity: 1..1
    requirements: For ReferenceSequence, an identifier is valid unless the accession is withdrawn. If a new version of a sequence is created, it will be given a different versioned accession, and therefore a different identifier. In this case, the previous identifier is still valid, it can still be used to retrieve the given sequence, even if that sequence is no longer the most recent sequence associated with a given entity.
    terminology binding: One of a set of valid reference sequence acessions from a recognized authority
  - name: sequenceClass
    type: code
    definition: The type of reference sequence.
    multiplicity: 1..1
    terminology binding: Codes identifying kinds of reference sequences
  - name: nucleotideSequenceClass
    type: code
    definition: the class of sequence representing a nucleotide sequence
  - name: genomicSequenceClass
    type: code
    definition: the class of sequence representing a genomic sequence
  - name: chromosome
    type: code
    definition: chromosome to which ReferenceSequence is bound
    multiplicity: 0..1
    terminology binding: Codes identifying human chromosomes
  - name: codingRegionOffset
    type: integer
    definition: offset of start of sequence from start of coding region
    multiplicity: 1..1
  - name: referenceGenome
    type: CodableConcept
    definition: The reference genome to which this reference sequence is attached
  - name: gene
    type: Gene[]
    definition: gene, if sequence is reference for specific gene
    multiplicity: 0..*
    terminology binding: Codes describing human genes
examples:
  - id: RS201
    title: RS201-NM_001014794.2-ILK
    description: ILK transcript variant 2, mRNA w/ Gene reference.
    xml: "/main/resources/example-xml/RS201-NM_001014794.2-ILK.xml"
    schema: /main/resources/clingen-xsd/referencesequence.xsd
    json: "/main/resources/example-json/RS201-NM_001014794.2-ILK.json"
    resource: ReferenceSequence
  - id: RS202
    title: RS202-NC_000011.9-b37
    description: Genomic Chromosome 11 sequence from GRCh37 build.
    xml: "/main/resources/example-xml/RS202-NC_000011.9-b37.xml"
    schema: /main/resources/clingen-xsd/referencesequence.xsd
    json: "/main/resources/example-json/RS202-NC_000011.9-b37.json"
    resource: ReferenceSequence
  - id: RS203
    title: RS203-NC_000011.10-b38
    description: Genomic Chromosome 11 sequence from GRCh38 build.
    xml: "/main/resources/example-xml/RS203-NC_000011.10-b38.xml"
    schema: /main/resources/clingen-xsd/referencesequence.xsd
    json: "/main/resources/example-json/RS203-NC_000011.10-b38.json"
    resource: ReferenceSequence
  - id: RS210
    title: RS210-NC_000017.11-b38
    description: Genomic Chromosome 17 sequence from GRCh38 build.
    xml: "/main/resources/example-xml/RS210-NC_000017.11-b38.xml"
    schema: /main/resources/clingen-xsd/referencesequence.xsd
    json: "/main/resources/example-json/RS210-NC_000017.11-b38.json"
    resource: ReferenceSequence
  - id: RS211
    title: RS211-NC_000017.10-b37
    description: Genomic Chromosome 17 sequence from GRCh37 build.
    xml: "/main/resources/example-xml/RS211-NC_000017.10-b37.xml"
    schema: /main/resources/clingen-xsd/referencesequence.xsd
    json: "/main/resources/example-json/RS211-NC_000017.10-b37.json"
    resource: ReferenceSequence
  - id: RS212
    title: RS212-NG_005905.2-BRCA1
    description: Genomic Gene BRCA1 sequence w/ Gene reference.
    xml: "/main/resources/example-xml/RS212-NG_005905.2-BRCA1.xml"
    schema: /main/resources/clingen-xsd/referencesequence.xsd
    json: "/main/resources/example-json/RS212-NG_005905.2-BRCA1.json"
    resource: ReferenceSequence
  - id: RS213
    title: RS213-NM_007294.3-BRCA1
    description: BRCA1 transcript w/ Gene & Protein sequence reference.
    xml: "/main/resources/example-xml/RS213-NM_007294.3-BRCA1.xml"
    schema: /main/resources/clingen-xsd/referencesequence.xsd
    json: "/main/resources/example-json/RS213-NM_007294.3-BRCA1.json"
    resource: ReferenceSequence
  - id: RS214
    title: RS214-NP_009225.1-BRCA1
    description: BRCA1 transcript w/ Gene & Protein sequence reference.
    xml: "/main/resources/example-xml/RS214-NP_009225.1-BRCA1.xml"
    schema: /main/resources/clingen-xsd/referencesequence.xsd
    json: "/main/resources/example-json/RS214-NP_009225.1-BRCA1.json"
    resource: ReferenceSequence
  - id: RS215
    title: RS215-U14680.1-BRCA1
    description: Genomic Gene BRCA1 sequence w/ Gene reference.
    xml: "/main/resources/example-xml/RS215-U14680.1-BRCA1.xml"
    schema: /main/resources/clingen-xsd/referencesequence.xsd
    json: "/main/resources/example-json/RS215-U14680.1-BRCA1.json"
    resource: ReferenceSequence
  - id: RS216
    title: RS216-LRG_292p1-BRCA1
    description: ''
    xml: "/main/resources/example-xml/RS216-LRG_292p1-BRCA1.xml"
    schema: /main/resources/clingen-xsd/referencesequence.xsd
    json: "/main/resources/example-json/RS216-LRG_292p1-BRCA1.json"
    resource: ReferenceSequence
  - id: RS217
    title: RS217-LRG_292t1-BRCA1
    description: ''
    xml: "/main/resources/example-xml/RS217-LRG_292t1-BRCA1.xml"
    schema: /main/resources/clingen-xsd/referencesequence.xsd
    json: "/main/resources/example-json/RS217-LRG_292t1-BRCA1.json"
    resource: ReferenceSequence
  - id: RS218
    title: RS218-LRG_292-BRCA1
    description: ''
    xml: "/main/resources/example-xml/RS218-LRG_292-BRCA1.xml"
    schema: /main/resources/clingen-xsd/referencesequence.xsd
    json: "/main/resources/example-json/RS218-LRG_292-BRCA1.json"
    resource: ReferenceSequence

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

