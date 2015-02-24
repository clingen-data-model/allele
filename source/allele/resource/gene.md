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

Resource Content
----------------

![Gene](/images/Gene.svg)

    <gene>
		<identifier></identifier>
		<symbol></symbol>
		<name></name>
		<aliasSymbol>
			<symbol></symbol>
		</aliasSymbol>
	<gene>
	
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

Formal Definitions
------------------
