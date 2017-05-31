---
title: AminoAcidContextualAllele
layout: conceptual
model: allele
description: A ContextualAllele that uses a AminoAcidReferenceSequence as its ReferenceSequence.

---

Scope and Usage
---------------

See also: [ContextualAllele](contextual_allele.html)

AminoAcidContextualAllele represents an allele at a variant location on a single version of an amino acid sequence.  For each different sequence version, a new AminoAcidContextualAllele would be created, and these would be aggregated at the SimpleCanonicalAllele level.

Attributes
--------------------

When describing observations a concise and interoperable method is required to reduce ambiguity as well as clarify the semantics of nature language and biological meaning. The use of a formal, stable ontological structure allows highly detailed descriptions as well as a logically ordered interrelationship between concepts.

{:.table}
| Attribute Name | Attribute Type | Cardinality |
|----------------|----------------|-------------|
| [primaryAminoAcidChangeType](/implementation/value_set_list/primary_amino_acid_change_type.html) | Code | 0..1 |
| [ancillaryAminoAcidChangeType](/implementation/value_set_list/ancillary_amino_acid_change_type.html) | Code | 0..* |


Exclusions and Limitations
--------------------------

Version 0.1 of the Data Model does not offer a direct relationship between records or annotations described at the NucleotideContextualAllele level to AminoAcidContextualAllele, however given correct reference, sequence and transcript information this can be computationally derived.
