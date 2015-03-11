---
title: IntronOffset 
description: IntronOffset is used in conjunction with a <a href="transcript_reference_coordinate.html">TranscriptReferenceCoordinate</a> to refer to an intronic location based on a <a href="transcript_reference_sequence.html">TranscriptReferenceSequence</a>.  

---

Scope and Usage
---------------

See [TranscriptReferenceCoordinate](transcript_reference_coordinate.html) for details on the Scope and Usage of IntronOffset.


Exclusions and Limitations
--------------------------

The relationship between the transcript and the genomic sequence to which it is mapped is partially modeled, the details of the mapping are not modeled.  In other words, for intronic coordinates, using only the data modeled here, it will beimpossible to calculate the reference allele.

Attributes
----------

{:.table}
| Attribute Name | Attribute Type | Cardinality |
|----------------|----------------|-------------|
|   offsetStart  |     int        |    0..1     |
|   offsetEnd    |     int        |    0..1     |

offsetStart: intronic offset of the start of the coordinate.  Used in coordnation with the start attribute of the [TranscriptReferenceCoordinate](transcript_reference_coordinate.html) to locate the beginning of the locus.  If the start of the locus is exonic, this attribute does not exist.

offsetEnd: intronic offset of the end of the coordinate.  Used in coordnation with the end attribute of the [TranscriptReferenceCoordinate](transcript_reference_coordinate.html) to locate the end of the locus.  If the end of the locus is exonic, this attribute does not exist.

Note that at least one of offsetStart and offsetEnd must exist.

Related Entities 
----------------

{:.table}
| Relationship Name | Entity Type | Cardinality |
|-------------------|-------------|-------------|
| startingTranscriptCoordinate | [TranscriptReferenceCoordinate](transcript_reference_coordinate.html) | 1 |
| intronicGenomicCoordinate | [GenomicReferenceCoordinate](genomic_reference_coordinate.html) | 1 |

startingTranscriptCoordinate: These entities are used to represent coordinates that occur in intronic sequences.   See above for details.  Fully exonic coordinates will not have any intronicCoordinate relationships.  An intronic coordinate will have at least one, and may have more than one, representing mappings of the transcript to different [GenomicReferenceSequences](../reference_sequence/genomic_reference_sequence.html).

intronicGenomicCoordinate: Intronic coordinates are actually genomic coordinates that are being defined with respect to a transcript for interpretive purposes.  intronicGenomicCoordinate is the IntronicCoordinate mapped to a particular [GenomicReferenceSequence](../reference_sequence/genomic_reference_sequence.html).
