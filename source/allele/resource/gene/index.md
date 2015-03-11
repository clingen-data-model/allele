---
title: Gene
description: A region (or regions) that includes all of the sequence elements necessary to encode a functional transcript. A gene may include regulatory regions, transcribed regions and/or other functional sequence regions.
sequence_ontology: SO:0000704

---


Scope and Usage
---------------

A gene is identified by an external authority, typically HGNC, although the data model is configured to recognize identifiers from multiple authorities.

Context
-------

The Gene resource is described by the following attributes

* identifer: the set of identifiers from external authorities that identify the Gene.
* symbol: the string symbol identifying the gene.
* name: the human readable name for a gene.
* aliasSymbol: a list of alternative symbols used to identify the gene.

Resource Model
----------------

![Gene](/images/GeneResource.svg)

Conceptual Model: [Gene](/allele/conceptual/gene/index.html#conceptual_model)
	
Notes
-----

Search Parameters
-----------------

{:.table}
| name | type | description | related attribute |
|------|------|-------------|-------|
| _id  | token | search by the numeric internal identifier of the gene | 


Examples
--------

{:.table}
|Name                       |||
|---------------------------|||
|G101-ILK (minimal)|[XML](/allele/implementation/examples/G101.html#xml)|[JSON](/allele/implementation/examples/G101.html#json)|
|G102-BRCA1 (w/ aliases)|[XML](/allele/implementation/examples/G102.html#xml)|[JSON](/allele/implementation/examples/G102.html#json)|

Formal Definitions
------------------
