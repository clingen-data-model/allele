---
title: ExternalPosition 
layout: conceptual
model: allele
description: ExternalPosition defines one end of a <a href="../reference_coordinate.html">ReferenceCoordinate</a> as a location that is external to the corresponding <a href="../reference_sequence.html">ReferenceSequence</a>.  ExternalPosition is used to define coordinates for intronic alleles with respect to a transcript.

---

Scope and Usage
---------------

See [TranscriptReferenceCoordinate](transcript_reference_coordinate.html) for details on the Scope and Usage of ExternalPosition.


Exclusions and Limitations
--------------------------

The relationship between the transcript and the genomic sequence to which it is mapped is partially modeled, the details of the mapping are not modeled.  

Attributes
----------

{:.table}
| Attribute Name | Attribute Type | Cardinality |
|----------------|----------------|-------------|
|   offsetLength |     int        |       1     |
|   offsetDirection |     Code        |       1     |
|   genomicIndex    |     int        |       1     |

offsetLength: intronic offset of the Position. Used in coordination with the index attribute of the [Position](position.html).  This is the distance into the intron from the location of the index in the TranscriptReferenceSequence.

offsetDirection: Declares whether the intron is to the 5-prime or 3-prime direction of the Position index.

genomicIndex: the index of this position in the given GenomicReferenceSequence.

Related Entities 
----------------

{:.table}
| Relationship Name | Entity Type | Cardinality |
|-------------------|-------------|-------------|
|   genomicReferenceSequence    |     [GenomicReferenceSequence](genomic_reference_sequence.html)        |       1     |

genomicReferenceSequence: A GenomicReferenceSequence to which this transcript has been mapped.

