---
title: AminoAcidReferenceCoordinate
layout: conceptual
model: allele
description: AminoAcidReferenceCoordinate defines a location with respect to an <a href="../reference_sequence/amino_acid_reference_sequence.html">AminoAcidReferenceSequence</a>.  

---

Scope and Usage
---------------

[ReferenceCoordinate](reference_coordinate.html) represents a particular contiguous location at which different alleles may be defined with [ContextualAllele](contextual_allele.html).  AminoAcidReferenceCoordinate is a [ReferenceCoordinate](reference_coordinate.html) where the underlying reference sequence is an [AminoAcidReferenceSequence](../reference_sequence/amino_acid_reference_sequence.html)

Attributes 
----------

None beyond those provided by [ReferenceCoordinate](reference_coordinate.html).

Related Entities
----------------

{:.table}
|  Relation Name | Entity Type | Cardinality |
|----------------|-------------|-------------|
| referenceSequence | [AminoAcidReferenceSequence](../reference_sequence/amino_acid_reference_sequence.html) | 1 |

referenceSequence: points to the [AminoAcidReferenceSequence](../reference_sequence/amino_acid_reference_sequence.html)  on which this AminoAcidReferenceCoordinate is located.
