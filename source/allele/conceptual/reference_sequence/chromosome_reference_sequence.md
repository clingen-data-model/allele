---
title: ChromosomeReferenceSequence
description: A <a href="genomic_reference_sequence.html">GenomicReferenceSequence</a> describing the sequence of a full chromosome.

---

Scope and Usage
---------------

Each ChromosomeReferenceSequence contains the accession that can be used to look up the sequence for a chromosome.  This includes 

  - the autosome
  - sex chromosomes
  - the mitochondrial chromosome

Note that as with all [ReferenceSequences](index.html), the entity does not contain the sequence itself, only an accession that can be used to retreive the sequence as well as metadata about the sequence.

Exclusions and Limitations
--------------------------

In version v0.1, ChromosomeReferenceSequence must be primary assembly chromosome sequence.  Patches, unplaced sequences, and other sequences of genomic DNA are unsupported in v0.1.

Attributes
----------

{:.table}
| Attribute Name | Attribute Type |
|----------------|----------------|
| chr            | Code           |


chr: A short human-readable name for the chromosome.


Related Entities
----------------

{:.table}
| Relation Name     | Entity Type                              | Cardinality |
|-------------------|------------------------------------------|-------------|
| inReferenceGenome | [ReferenceGenome](reference_genome.html) | 0..*        |


inReferenceGenome: Particular versions of chromosomal sequences are often aggregated together and released as a version of the full [ReferenceGenome](reference_genome.html).  A particular ChromosomeReferenceSequence may be part of zero or more of these collections.
