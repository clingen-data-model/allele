---
title: ReferenceCoordinate
layout: conceptual
model: allele
description: ReferenceCoordinate defines a location with respect to a <a href="../reference_sequence/index.html">ReferenceSequence</a>.  

---

Synonyms
--------
Locus

Scope and Usage
---------------

A contiguous genetic change between individuals may be described as a difference in alleles at a given location.  That location, here called an ReferenceCoordinate, is described in relation to a particular [ReferenceSequence](index.html), which provides the coordinate frame for determining position.

A [ContextualAllele](contextual_allele.html) is defined with respect to an ReferenceCoordinate by further specifying the allele that occurs at this coordinate, where the allele may be the same as or different than the allele that occurs in the reference sequence.

There exist numerous schemes for the coding of coordinates (see below for choices).  In this allele model, coordinates are defined using a zero-based interval scheme.   The interval scheme numbers the intervals between elements of the sequence, with the first base occurring after the interval numbered 0.  In this scheme, the sequence elements bounded the start and end intervals constitute the coordinate.  The end position is therefore always computable as start + length of the reference allele. See [this discussion](../../discussion/coordinate_numbering.html) for further details on coordinate numbering.

ReferenceCoordinate represents the coordinate of a region on a ReferenceSequence; the start and end of that region are each represented by an instance of the [Position](position.html) class, which will point to a specific interval between consecutive bases.

The ReferenceCoordinate is an abstract class.  Instances of ReferenceCoordinate must be either a [GenomicReferenceCoordinate](genomic_reference_coordinate.html), a [TranscriptReferenceCoordinate](transcript_reference_coordinate.html), or an [AminoAcidReferenceCoordinate](amino_acid_reference_coordinate.html).


Exclusions and Limitations
--------------------------

Attributes 
----------

{:.table}
| Attribute Name | Attribute Type |
|----------------|----------------|
| identifier     | Identifier []  |
| start          | Position       |
| end            | Position       |
| refAllele      | String         |

identifier: ReferenceCoordinates may be assigned identifiers by databases such as dbSNP.   Multiple agencies may apply different identifiers over different time periods to refer to the same identifier. The identifier may be shared across different ReferenceCoordinates, for instance those that are all grouped together under the same [CanonicalAllele](canonical_allele.html)

start: The position of the beginning (in the 5-prime sense) of the region specified by this Reference Coordinate.

end: The position of the the 3-prime end of the region specified by this Reference Coordinate.

refAllele: The subsequence of the ReferenceSequence that goes from coordinates start to end (inclusive).  It is derivable from start and end, plus the ReferenceSequence.  However, it is kept in the ReferenceCoordinate as a convenience.

Related Entities
----------------

Particular subclasses will have a relationship with a given subclass of [ReferenceSequence](../reference_sequence/index.html). See the subclasses for further information.
