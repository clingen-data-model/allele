---
title: GeneReferenceSequence
layout: conceptual
model: allele
description: A <a href="genomic_reference_sequence.html">GenomicReferenceSequence</a> describing the sequence of a chromosomal segment containing a gene, such as those created by LRG or RefSeqGene.

---

Scope and Usage
---------------

One approach to normalization and canonicalization of alleles is to define a standard consensus sequence that will be fixed over time, and which includes all elements related to a particular gene, including exons, introns, and regulatory elements.    Alleles may the be defined on this fixed sequence, and mapped from it to multiple versions of the [ChromosomeReferenceSequence](chromosome_reference_sequence.html) and [TranscriptReferenceSequence](transcript_reference_sequence.html).

The GeneReferenceSequence manages the accessions that are provided by groups such as LRG or RefSeqGene for this purpose.
 
Attributes
----------

None, beyond those provided by [GenomicReferenceSequence](genomic_reference_sequence.html).


Related Entities
----------------

{:.table}
| Relation Name     | Entity Type                              | Cardinality |
|-------------------|------------------------------------------|-------------|
| sequenceOf | [Gene](gene.html) | 1        |


sequenceOf: The GeneReferenceSequence must be the sequence of exactly one [Gene](gene.html)
