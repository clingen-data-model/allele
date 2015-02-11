---
title: ReferenceGenome
description: A collection of sequences (often chromosomes) taken as the standard for a given organism and genome assembly.
sequence_ontology: "SO:0001505"

---

Scope and Usage
---------------

A reference genome is a standard collection of sequences, grouped together and versioned.    Any change to these sequences must create a new Reference Genome.  Note that multiple Reference Genomes can be associated with the same Genome Reference Sequence.

Exclusions and Limitations
--------------------------

Reference Genomes such as GRCh38 contain several types of sequences: chromosomes, patches, unplaced DNA, etc.   In the current model, a Reference Genome will only contain full chromosomal sequences (including mitochondrial sequence).

Examples
--------
GRCh37.p1
hg17

Alias
-----

Assembly,
