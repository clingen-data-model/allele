---
title: Gene
layout: resource
description: A region (or regions) that includes all of the sequence elements necessary to encode a functional transcript. A gene may include regulatory regions, transcribed regions and/or other functional sequence regions.
sequence_ontology: SO:0000704
model: allele
resource: gene
related_page: /allele/conceptual/gene
examples:
  - id: G101
    title: G101-ILK
    description: 'A minimal Gene resource example.'
    xml: "/main/resources/example-xml/G101-ILK.xml"
    schema: "/main/resources/clingen-xsd/gene.xsd"
    json: "/main/resources/example-json/G101-ILK.json"
  - id: G102
    title: G102-BRCA1
    description: Gene example with aliases.
    xml: "/main/resources/example-xml/G102-BRCA1.xml"
    schema: "/main/resources/clingen-xsd/gene.xsd"
    json: "/main/resources/example-json/G102-BRCA1.json"

---


Scope and Usage
---------------

A gene is identified by an external authority, typically HGNC, although the data model is configured to recognize identifiers from multiple authorities.

An implementing system should choose one gene naming authority to base gene names and symbols from. Names and symbols are not guaranteed to be immutable (gene names and symbols often change over time), but they should be unique within the same implementation.



