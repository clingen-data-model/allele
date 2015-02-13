---
title: AminoAcidReferenceSequence
description: A [ReferenceSequence](reference_sequence.html) representing the sequence of amino acids making up a polypeptide.
sequence_ontology: "SO:0000104"

---

Scope and Usage
---------------

An AminoAcidReferenceSequence is used to denote the particular sequence of amino acids resulting from the translation of a [TranscriptReferenceSequence](transcript_reference_sequence.html).

Exclusions and Limitations
--------------------------

An arbitrary sequence of amino acids that is not the result of translating a particular [TranscriptReferenceSequence](transcript_reference_sequence.html) is not allowed.

Attributes
----------

None, beyond those provide by the superclass [ReferenceSequence](reference_sequence.html)

Related Entities
----------------

| Relation Name | Entity Type | Cardinality |
|---------------|-------------|-------------|
| isTranslationOf | [TranscriptReferenceSequence](transcript_reference_sequence.html) | 1..* |

isTranslationOf: references the [TranscriptReferenceSequence](transcript_reference_sequence.html) that, when translated, produces this AminoAcidReferenceSequence.  It is possible to have more than one isTranslationOf relations due to degeneracy, but this is rare.
