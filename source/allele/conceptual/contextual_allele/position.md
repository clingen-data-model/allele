---
title: Position
layout: conceptual
model: allele
description: Position defines one end of a <a href="../reference_coordinate.html">ReferenceCoordinate</a>.  

---

Scope and Usage
---------------

ReferenceCoordinate(reference_coordinate.html) represents the coordinate of a region on a ReferenceSequence; the start and end of that region are each represented by a Position, which will point to a specific interval between consecutive bases.  

Position is an abstract class with two subclasses: [InternalPosition](internal_position.html), and [ExternalPosition](external_position).   InternalPosition is the most common, used when the Position is within the ReferenceSequence.  ExternalPosition is used only when the position is with respect to the ReferenceSequence but is not actually part of the ReferenceSequence.  This situation occurs when a position lies within an intron, but the position is defined with respect to a TranscriptReferenceSequence.   ExternalPosition can only be used in conjuction with TranscriptReferenceSequence.

If the ReferenceCoordinate that owns a Position is a GenomicReferenceCoordinate, or an AminoAcidReferenceCoordinate, the Position must be an instance of InternalPosition.  If the ReferenceCoordinate that owns a Position is a TranscriptReferenceCoordinate, the Position may be either an InternalPosition or an ExternalPosition.  It is possible that a TranscriptReferenceCoordinate may contain one InternalPosition and one ExternalPosition, if the coordinate covers an intron/exon boundary.

Exclusions and Limitations
--------------------------

Attributes 
----------

{:.table}
| Attribute Name | Attribute Type |
|----------------|----------------|
| index          | Integer        |

index: The 0-based index of the inter-base interval pointed to by this position.  See [this discussion](../../discussion/coordinate_numbering.html) for further details on coordinate numbering.


Related Entities
----------------
Subclasses InternalPosition and ExternalPosition.
