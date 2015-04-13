---
title: SimpleAminoAcidAllele
description: A SimpleAlllele that uses a AminoAcidReferenceSequence as its ReferenceSequence.

---

Scope and Usage
---------------

See also: [SimpleAllele](simple_allele.html)

SimpleAminoAcidAllele represents an allele at a variant location on a single version of a chromosome.  For each different chromosome version, a new SimpleAminoAcidAllele would be created, and these would be aggregated at the CanonicalSimpleAllele level, along with any TranscriptSimpleAlleles.

Attributes
--------------------

When describing observations a concise and interoperable method is required to reduce ambiguity as well as clarify the semantics of nature language and biological meaning. The use of a formal, stable ontological structure allows highly detailed descriptions as well as a logically ordered interrelationship between concepts.

{:.table}
| Attribute Name | Attribute Type | Cardinality |
|----------------|----------------|-------------|
| [primaryAminoAcidChangeType](primary_amino_acid_change_type.html) | Code | 0..1 |
| [ancillaryAminoAcidChangeType](ancillary_amino_acid_change_type.html) | Code | 0..* |


Exclusions and Limitations
--------------------------

Version 0.1 of the Data Model does not offer a direct relationship between records or annotations described at the SimpleNucleotideAllele level to SimpleAminoAcidAllele, however given correct reference, sequence and transcript information this can be computationally derived.


