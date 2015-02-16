---
title: SimpleNucleotideAllele
description: A SimpleAlllele that uses a SimpleNucleotideAllele as its ReferenceSequence.
---


Scope and Usage
---------------

See also [SimpleAllele](simple_allele.html)

A variant allele representation at a specific nucleotide.  This can represent an observation at a single SimpleGenomicAllele or a single SimpleTranscriptAllele.

Attributes
--------------------

When describing observations a concise and interoperable method is required to reduce ambiguity as well as clarify the semantics of nature language and biological meaning. The use of a formal, stable ontological structure allows highly detailed descriptions as well as a logically ordered interrelationship between concepts.

{:.table}
| Attribute Name | Attribute Type | Cardinality |
|----------------|----------------|-------------|
| nucleotideChangeType |  String  |    0..1     |

nucleotideChangeType: A controlled vocabulary term used to describe observed nucleotide alteration, including the characterization of no_alteration.  Currently constraint to be a child of allele_postion within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools such as [SnpEff](http://snpeff.sourceforge.net/) or [VAAST](http://www.yandell-lab.org/software/vaast.html).

Exclusions and Limitations
--------------------------

Version 1.0 of the Data Model does not offer a direct relationship between records or annotations described at the SimpleNucleotideAllele level to SimpleAminoAcidAllele, however given correct reference, sequence and transcript information this can be computationally derived.


