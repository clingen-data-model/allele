---
title: TranscriptReferenceCoordinate 
layout: conceptual
model: allele
description: TranscriptReferenceCoordinate defines a location with respect to a <a href="../reference_sequence/transcript_reference_sequence.html">TranscriptReferenceSequence</a>.  A TranscriptReferenceCoordinate can be defined for both exonic positions, which are part of the transcript, and intronic positions, which are not.

---

Scope and Usage
---------------

[ReferenceCoordinate](reference_coordinate.html) represents a particular continguous location at which different alleles may be defined with [AlleleInstance](allele_instance.html).  TranscriptReferenceCoordinate is a [ReferenceCoordinate](reference_coordinate.html) where the underlying reference sequence is a [TranscriptReferenceSequence](../reference_sequence/transcript_reference_sequence.html).

TranscriptReferenceCoordinates may refer to either exonic or intronic locations. Because exonic locations are in the [TranscriptReferenceSequence](../reference_sequence/transcript_reference_sequence.html), the coordinate may be defined as described in [ReferenceCoordinate](reference_coordinate.html).

However, intronic locations are not part of the [TranscriptReferenceSequence](../reference_sequence/transcript_reference_sequence.html), and cannot be simply described using a start and end.  In HGVS, intronic variants are described in a transcript by using two integers.  The first is a location in the transcript, which is supposed to be the first or last base in an exon.  The second number is a coordinate into the intron from that location.  This assumes an alignment of this transcript to a particular [GenomicReferenceSequence](genomic_reference_sequence.html).  There may be multiple such alignments to multiple [GenomicReferenceSequences](genomic_reference_sequence.html), though this is not modeled in HGVS expressions.

TranscriptReferenceCoordinate uses a similar system to refer to intronic positions.  Each TranscriptReferenceCoordinate may have one references to an [intronOffset](intron_offset.html) entity.  The intronOffset entity contains two integer attributes, which are the intronic offsets that are added to the start and end coordinates of the TranscriptReferenceCoordinate.   In addition, the IntronicCoordinate contains a reference to the particular [GenomicReferenceSequence](genomic_reference_sequence.html) where the transcript was mapped.

If an allele occurs in an intron, the allele does not occur in the transcript, but in a genomic sequence; the relation to this sequence is managed by intronOffset.  Note that the transcript may be mapped to multiple genomic sequences.  Rather than allow a multiplicity of intronOffsets for a single TranscriptAlleleInstance, we allow only one.  Each mapping is represented by the creation of a new TranscriptAlleleInstance with that mapping via a single intronOffset.  These TranscriptAlleleInstances are then aggregated at the SimpleCanonicalAllele level.

Exclusions and Limitations
--------------------------

The relationship between the transcript and the genomic sequence to which it is mapped is partially modeled, the details of the mapping are not modeled.  In other words, for intronic coordinates, using only the data modeled here, it will be impossible to calculate the reference allele.

Attributes
----------

When describing observations a concise and interoperable method is required to reduce ambiguity as well as clarify the semantics of nature language and biological meaning. The use of a formal, stable ontological structure allows highly detailed descriptions as well as a logically ordered interrelationship between concepts.

{:.table}
| Attribute Name | Attribute Type | Cardinality |
|----------------|----------------|-------------|
| [primaryTranscriptRegionType](/allele/value_set_list/primary_transcript_region_type.html) | Code | 0..1 |
| [ancillaryTranscriptRegionType](/allele/value_set_list/ancillary_transcript_region_type.html) | Code | 0..* |

Related Entities 
----------------

{:.table}
| Relationship Name | Entity Type | Cardinality |
|-------------------|-------------|-------------|
| intronOffset | [IntronOffset](intron_offset.html) | 0..* |

intronOffset: These entities are used to represent coordinates that occur in intronic sequences.   See above for details.  Fully exonic coordinates will not have any intronOffset relationships.  An intron offset will have at least one, and may have more than one, representing mappings of the transcript to different [GenomicReferenceSequences](../reference_sequence/genomic_reference_sequence.html).