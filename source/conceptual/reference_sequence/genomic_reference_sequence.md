---
title: GenomicReferenceSequence
layout: conceptual
model: allele
description: A <a href="/conceptual/reference_sequence.html">ReferenceSequence</a> describing full or partial chromosomal DNA.

---

Scope and Usage
---------------

The individual characters of a GenomicReferenceSequence are the four DNA nucleotides: A,G,T,C.   GenomicReferenceSequence is abstract.  Instances are one of:

  - [ChromosomeReferenceSequence](chromosome_reference_sequence.html), used for full chromosomal sequences (including mitochondrial chromosomes)
  - [GeneReferenceSequence](gene_reference_sequence.html), used for standard contiguous regions chromosomomes that bound genes.

The purpose of this abstract class is to provide a target for [GenomicAlleleReferenceCoordinate](genomic_allele_reference_coordinate.html).

Exclusions and Limitations
--------------------------

In version 0.1, GenomicReferenceSequence must be primary assembly chromosome sequence.  Patches, unplaced sequences, and other sequences of genomic DNA are unsupported in 1.0.

Attributes
----------

No attributes beyond those inherited from [ReferenceSequence](reference_sequence.html)
