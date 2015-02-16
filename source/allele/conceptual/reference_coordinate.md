---
title: ReferenceCoordinate
description: ReferenceCoordinate defines a location with respect to a <a href="reference_sequence.html">ReferenceSequence</a>.  

---

Synonyms
--------
Locus

Scope and Usage
---------------

A contiguous genetic change between individuals may be described as a difference in alleles at a given location.  That location, here called an ReferenceCoordinate, is described in relation to a particular [ReferenceSequence](reference_sequence.html), which provides the coordinate frame for determining position.

A [SimpleAllele](simple_allele.html) is defined with respect to an ReferenceCoordinate by further specifying the allele that occurs at this coordinate, where the allele may be the same as or different than the allele that occurs in the reference sequence.

There exist numerous schemes for the coding of coordinates (see below for choices).  For version 1 of the allele model, coordinates are defined using the alignment scheme.   The alignment scheme is based on the coordinates used in VCF files, with the first base in a [ReferenceSequence](reference_sequence.html) defined as position 1.  The start attribute is the position in the ReferenceSequence of the first base of the reference allele, and the end attribute is the start attribute + the length of the reference allele - 1.  With this definition, the reference allale is in fact computable from the start and end attributes, given the reference sequence.  

The ReferenceCoordinate is an abstract class.  Instances of ReferenceCoordinate must be either a [GenomicReferenceCoordinate](genomic_reference_coordinate.html), a [TranscriptReferenceCoordinate](transcript_reference_coordinate.html), or an [AminoAcidReferenceCoordinate](amino_acid_reference_coordinate.html).

### Discussion: Coordinate Numbering Methods

The Data Model Working Group considered three methods for the numbering of coordinates:

  1. The Alignment Method: Based on the numbering used in VCFs.
  2. The Variant Method: Based on the numbering used in HGVS expressions.
  3. The Interval Method: Based on numbering intervals rather than bases.

In the Alignment Method, the reference allele is defined as the subsequence that begins at the base numbered "start" and goes to the base numbered "end", both inclusive.  A single base will have equal start and end.   As in a VCF, insert or delete alleles will usually share the first base of the reference alleles, which is not actually part of the variable site, but is used to help locate the variable site.

In the Variant Method, the reference allele is not computable from the start and end positions, but is an integral part of the definition of the coordinate.  If the location is a range of bases, then start, end and ref are defined as in the alignment model.  However, if the interval between two bases is the location, then start is the position of the first base, end = start + 1, and ref is an empty string.  This method has the advantage that only variable bases are included in the definition of the alleles, but it has the disadvantage that two coordinates may have the same start and end, but in one case refer to a pair of bases, and in the other case refer to the interval between the two bases.

In the Interval Method, positions denote the intervals between bases, rather than referring to the bases themselves, with a position of 1 denoting the interval before the first base, 2 the interval between the first and second base, and so on.   With this counting, the reference allele is again computable as the bases that lie between the start and end intervals.  In the case of a single base reference allele, the end position will be start + 1.  If start = end = i, then the position is the interval before the i-th base.  Any SimpleAllele that has such a coordinate would therefore be an insertion.    The interval method has the advantages that only variant bases are included in the allele defintions, that the reference allele is completely computable, as well as consistency in the meaning of start and end.  Furthermore, the interval method is capable of representing the alleles of a snp and a deletion of the varying base using the same allele coordinate, which the alignment method cannot.  The disadvantage of the interval method is simply that it is not currently used in any standard formats, and may therefore prove confusing to implementors.   

The table below shows the differences in representation for reference coordinates in the methods described above.  Although Alt is not part of the coordinate, it is included here to illustrate the manner in which alleles would make use of the reference coordinates in different circumstances.

{:.table}
| Alignment | |     |     | Variant |   |     |     | Interval |  |     |     |
| Start | End | Ref | Alt | Start | End | Ref | Alt | Start | End | Ref | Alt |
|-------|-----|-----|-----|-------|-----|-----|-----|-------|-----|-----|-----|
| 100   | 100 | A   |  T  | 100   | 100 | A   | T   | 100   | 101 | A   | T   |
| 101   | 101 | T   |  C  | 101   | 101 | T   | C   | 101   | 102 | T   | C   |
| 100   | 101 | AT  |  A  | 101   | 101 | T   |     | 101   | 102 | T   |     |
| 100   | 102 | ATC |  A  | 101   | 102 | TC  |     | 101   | 103 | TC  |     |
| 100   | 100 | A   |  AT | 100   | 101 |     | T   | 101   | 101 |     | T   |
| 100   | 101 | AT  |  GC | 100   | 101 | AT  | GC  | 100   | 102 | AT  | GC  |


Exclusions and Limitations
--------------------------

Attributes 
----------

{:.table}
| Attribute Name | Attribute Type |
|----------------|----------------|
| identifier     | Identifier []  |
| start          | int            |
| end            | int            |
| refAllele      | String         |

identifier: ReferenceCoordinates may be assigned identifiers by databases such as dbSNP.   Multiple agencies may apply different identifiers over different time periods to refer to the sme identifier. The identifier may be shared across different ReferenceCoordinates, for instance those that are all grouped together under the same [CanonicalAllele](canonical_allele.html)

start: The start position of the reference allele, when the first base in the associated ReferenceSequence is numbered 1.

end: The position of the end base of the refAllele in the ReferenceSequence.

refAllele: The subsequence of the ReferenceSequence that goes from coordinates start to end (inclusive).  It is derivable from start and end, plus the ReferenceSequence.  However, it is kept in the ReferenceCoordinate as a convenience.

Related Entities
----------------

Particular subclasses will have a relationship with a given subclass of [ReferenceSequence](reference_sequence.html). See the subclasses for further information.
