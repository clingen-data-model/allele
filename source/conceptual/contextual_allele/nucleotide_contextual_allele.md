---
title: NucleotideContextualAllele
layout: conceptual
model: allele
description: A ContextualAllele that uses a NucleotideReferenceSequence as its ReferenceSequence.
---


Scope and Usage
---------------

See also [ContextualAllele](contextual_allele.html)

A variant allele representation on a specific nucleotide sequence.  This can represent an observation at a single GenomicContextualAllele or a single TranscriptContextualAllele.

NucleotideContextualAllele is an abstract class, so any NucleotideContextualAllele must be either a GenomicContextualAllele or a TranscriptContextualAllele.

The purpose of this class is to facilitate aggregation between GenomicContextualAllele and TranscriptContextualAllele at the CanonicalAllele level.

Attributes
--------------------

When describing observations a concise and interoperable method is required to reduce ambiguity as well as clarify the semantics of nature language and biological meaning. The use of a formal, stable ontological structure allows highly detailed descriptions as well as a logically ordered interrelationship between concepts.

{:.table}
| Attribute Name | Attribute Type | Cardinality |
|----------------|----------------|-------------|
| [primaryNucleotideChangeType](/value_set_list/primary_nucleotide_change_type.html) | Code | 0..1 |
| [ancillaryNucleotideChangeType](/value_set_list/ancillary_nucleotide_change_type.html) | Code | 0..* |

Exclusions and Limitations
--------------------------

Version 0.1 of the Data Model does not offer a direct relationship between records or annotations described at the NucleotideContextualAllele level to AminoAcidContextualAllele, however given correct reference, sequence and transcript information this can be computationally derived.
