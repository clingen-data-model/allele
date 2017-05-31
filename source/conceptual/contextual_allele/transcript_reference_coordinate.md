---
title: TranscriptReferenceCoordinate
layout: conceptual
model: allele
description: TranscriptReferenceCoordinate defines a location with respect to a <a href="../reference_sequence/transcript_reference_sequence.html">TranscriptReferenceSequence</a>.  A TranscriptReferenceCoordinate can be defined for both exonic positions, which are part of the transcript, and intronic positions, which are not.

---

Scope and Usage
---------------

[ReferenceCoordinate](reference_coordinate.html) represents a particular continguous location at which different alleles may be defined with [ContextualAllele](contextual_allele.html).  TranscriptReferenceCoordinate is a [ReferenceCoordinate](reference_coordinate.html) where the underlying reference sequence is a [TranscriptReferenceSequence](../reference_sequence/transcript_reference_sequence.html).

TranscriptReferenceCoordinates may refer to either exonic or intronic locations. Because exonic locations are in the [TranscriptReferenceSequence](../reference_sequence/transcript_reference_sequence.html), the coordinate may be defined as described in [ReferenceCoordinate](reference_coordinate.html).

However, intronic locations are not part of the [TranscriptReferenceSequence](../reference_sequence/transcript_reference_sequence.html), and cannot be simply described using a start and end.  In HGVS, intronic variants are described in a transcript by using two integers.  The first is a location in the transcript, which is supposed to be the first or last base in an exon.  The second number is a coordinate into the intron from that location.  This assumes an alignment of this transcript to a particular [GenomicReferenceSequence](genomic_reference_sequence.html).  There may be multiple such alignments to multiple [GenomicReferenceSequences](genomic_reference_sequence.html), though this is not modeled in HGVS expressions.

TranscriptReferenceCoordinate uses a similar system to refer to intronic positions.  Each TranscriptReferenceCoordinate, like any ReferenceCoordinate, has two Position elements, one for each end of the coordinate.  Each of these Positions may be either an InternalPosition (for an exonic Position) or an ExternalPosition (for an intronicPosition).  An ExternalPosition entity contains two integer attributes, which are the position in the transcript of the intron/exon boundary (called the index), and the distance into the intron (the offsetDirection).   In addition, the ExternalPosition contains a reference to a [GenomicReferenceSequence](genomic_reference_sequence.html) where the transcript was mapped.

If an allele occurs in an intron, the allele does not occur in the transcript, but in a genomic sequence; the relation to this sequence is managed by ExternalPosition.  Note that the transcript may be mapped to multiple genomic sequences.  Rather than allow a multiplicity of start and ends for a single TranscriptContextualAllele, we allow only one.  Each mapping is represented by the creation of a new TranscriptContextualAllele with its start and end corresponding to that specific mapping.  These TranscriptContextualAlleles are then aggregated at the SimpleCanonicalAllele level.

Exclusions and Limitations
--------------------------

The relationship between the transcript and the genomic sequence to which it is mapped is partially modeled, the details of the mapping are not modeled.  In other words, for intronic coordinates, using only the data modeled here, it will be impossible to calculate the reference allele.

Attributes
----------

When describing observations a concise and interoperable method is required to reduce ambiguity as well as clarify the semantics of nature language and biological meaning. The use of a formal, stable ontological structure allows highly detailed descriptions as well as a logically ordered interrelationship between concepts.

{:.table}
| Attribute Name | Attribute Type | Cardinality |
|----------------|----------------|-------------|
| [primaryTranscriptRegionType](/value_set_list/primary_transcript_region_type.html) | Code | 0..1 |
| [ancillaryTranscriptRegionType](/value_set_list/ancillary_transcript_region_type.html) | Code | 0..* |

Related Entities
----------------

The TranscriptReferenceCoordinate inherits both the start and end entities from ReferenceCoordinate(reference_coordinate.html).  However, unlike other ReferenceCoordinates, the start and end of a TranscriptReferenceCoordinate can be either an InternalPosition or an ExternalPosition.
