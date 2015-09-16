---
title: NucleotideAlleleInstance
layout: conceptual
model: allele
description: An AlleleInstance that uses a NucleotideAlleleInstance as its ReferenceSequence.
---


Scope and Usage
---------------

See also [AlleleInstance](allele_instance.html)

A variant allele representation at a specific nucleotide.  This can represent an observation at a single GenomicAlleleInstance or a single TranscriptAlleleInstance.

NucleotideAlleleInstance is an abstract class, so any NucleotideAlleleInstance must be either a GenomicAlleleInstance or a TranscriptAlleleInstance.

The point of this class is to facilitate aggregation between GenomicAlleleInstance and TranscriptAlleleInstance at the CanonicalVariant level.

Attributes
--------------------

When describing observations a concise and interoperable method is required to reduce ambiguity as well as clarify the semantics of nature language and biological meaning. The use of a formal, stable ontological structure allows highly detailed descriptions as well as a logically ordered interrelationship between concepts.

{:.table}
| Attribute Name | Attribute Type | Cardinality |
|----------------|----------------|-------------|
| [primaryNucleotideChangeType](/allele/value_set_list/primary_nucleotide_change_type.html) | Code | 0..1 |
| [ancillaryNucleotideChangeType](/allele/value_set_list/ancillary_nucleotide_change_type.html) | Code | 0..* |

Exclusions and Limitations
--------------------------

Version 0.1 of the Data Model does not offer a direct relationship between records or annotations described at the NucleotideAlleleInstance level to AminoAcidAlleleInstance, however given correct reference, sequence and transcript information this can be computationally derived.


