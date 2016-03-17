---
title: ReferenceGenome
layout: conceptual
model: allele
description: A collection of sequences (often chromosomes) taken as the standard for a given organism and genome assembly.
sequence_ontology: "SO:0001505"

---

Scope and Usage
---------------

A Reference Genome is a standard collection of sequences, grouped together and versioned.    Any change to these sequences must create a new Reference Genome.  Note that multiple Reference Genomes can be associated with the same Genome Reference Sequence.

Exclusions and Limitations
--------------------------

Reference Genomes such as GRCh38 contain several types of sequences: chromosomes, patches, unplaced DNA, etc.   In the current model, a Reference Genome will only contain full chromosomal sequences (including mitochondrial sequence).

Examples
--------
GRCh37.p1

hg17

Alias
-----

Genome Assembly

Attributes
----------

{:.table}
| Attribute Name | Attribute Type |
|----------------|----------------|
| name           | String         |
| identifier     | Identifier[]   |


name: A human readable string assigned by the implementing system to describe the ReferenceGenome.  It should be taken from the label of one of the associated Identifiers.

identifier: ReferenceGenomes are compiled by agencies such as NCBI, and are assigned labels by those agencies (such as GRCh37.1).  The identifiers collect these names along with the agency that granted them.  Note that each ReferenceGenome may be assigned different names by different agencies (e.g. GRCh37.1 and hg19).

RelatedEntities
---------------

{:.table}
| Relation Name | Entity Type | Cardinality |
|---------------|-------------|-------------|
| containsChromosome | [ChromosomeReferenceSequence](chromosome_reference_sequence.html) | 1..* |

containsChromosome:  points to the set of [ChromsomeReferenceSequences](chromosome_reference_sequence.html) that are aggregated together to form the ReferenceGenome.
