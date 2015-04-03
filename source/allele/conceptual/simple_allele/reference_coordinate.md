---
title: ReferenceCoordinate
description: ReferenceCoordinate defines a location with respect to a <a href="../reference_sequence/index.html">ReferenceSequence</a>.  

---

Synonyms
--------
Locus

Scope and Usage
---------------

A contiguous genetic change between individuals may be described as a difference in alleles at a given location.  That location, here called an ReferenceCoordinate, is described in relation to a particular [ReferenceSequence](index.html), which provides the coordinate frame for determining position.

A [SimpleAllele](simple_allele.html) is defined with respect to an ReferenceCoordinate by further specifying the allele that occurs at this coordinate, where the allele may be the same as or different than the allele that occurs in the reference sequence.

There exist numerous schemes for the coding of coordinates (see below for choices).  For version 1 of the allele model, coordinates are defined using the interval scheme.   The interval scheme numbers the intervals between elements of the sequence, with the first base occurring after the interval numbered 1.  In this scheme, the sequence elements bounded the start and end intervals constitute the coordinate.  The end position is therefore always computable as start + length of the reference allele.

The ReferenceCoordinate is an abstract class.  Instances of ReferenceCoordinate must be either a [GenomicReferenceCoordinate](genomic_reference_coordinate.html), a [TranscriptReferenceCoordinate](transcript_reference_coordinate.html), or an [AminoAcidReferenceCoordinate](amino_acid_reference_coordinate.html).


___NEEDS TO BE REWRITTEN BASED ON 1-Based, 0-Based numbering discussion (And moved to its own page to be referenced here and elsewhere)___

### Discussion: Coordinate Numbering Methods

The Data Model Working Group considered three methods for the numbering of coordinates:

  1. The Alignment Method: Based on the numbering used in VCFs.
  2. The Variant Method: Based on the numbering used in HGVS expressions.
  3. The Interval Method: Based on numbering intervals rather than bases.

In the Alignment Method, the reference allele is defined as the subsequence that begins at the base numbered "start" and goes to the base numbered "end", both inclusive.  A single base will have equal start and end.   As in a VCF, insert or delete alleles will usually share the first base of the reference alleles, which is not actually part of the variable site, but is used to help locate the variable site.

In the Variant Method, the reference allele is not computable from the start and end positions, but is an integral part of the definition of the coordinate.  If the location is a range of bases, then start, end and ref are defined as in the alignment model.  However, if the interval between two bases is the location, then start is the position of the first base, end = start + 1, and ref is an empty string.  This method has the advantage that only variable bases are included in the definition of the alleles, but it has the disadvantage that two coordinates may have the same start and end, but in one case refer to a pair of bases, and in the other case refer to the interval between the two bases.

In the Interval Method, positions denote the intervals between bases, rather than referring to the bases themselves, with a position of 1 denoting the interval before the first base, 2 the interval between the first and second base, and so on.   With this counting, the reference allele is again computable as the bases that lie between the start and end intervals.  In the case of a single base reference allele, the end position will be start + 1.  If start = end = i, then the position is the interval before the i-th base.  Any SimpleAllele that has such a coordinate would therefore be an insertion.    The interval method has the advantages that only variant bases are included in the allele definitions, that the reference allele is completely computable, as well as consistency in the meaning of start and end.  Furthermore, the interval method is capable of representing the alleles of a snp and a deletion of the varying base using the same allele coordinate, which the alignment method cannot.  The disadvantage of the interval method is simply that it is not currently used in any standard formats, and may therefore prove confusing to implementors.   

The table below shows the differences in representation for reference coordinates in the methods described above.  Although Alt is not part of the coordinate, it is included here to illustrate the manner in which alleles would make use of the reference coordinates in different circumstances.

[![Variant Numbering Diagram](/images/variant_numbering_examples.png){: .img-responsive}](/images/variant_numbering_examples.png)

{:.table .table-condensed .small}
|    |HGVS    |>>>>|Alignment|-Method|<<<<<<<<|>>>>|Variant|-Method|<<<<|>>>>|Interval|-Method|<<<<|
|    |        | Start | End | Ref | Alt| Start | End | Ref|Alt|Start|End|Ref|Alt|
|:---|--------|-------|-----|-----|-----|---|---|---|---|---|---|---|---|
|1   |g.100A>T| 100 | 100 | A | T |100|100|A|T|100|101|A|T|
|2 |g.101delT|100|101|AT|A|101|101|T|-|101|102|T|-|
|3|g.103_104delTC|102|104|GTC|G|103|104|TC|-|103|105|TC|-|
|4|g.107_108delTC|105|108|GTTC|GT|107|108|TC|-|107|109|TC|-|
|5|g.109_110insT|109|109|A|AT|109|110|-|T|110|110|-|T|
|6|g.111_112insTAA|111|111|G|GTAA|111|112|-|TAA|112|112|-|TAA|
|7|g.114_115insATT|112|114|GTC|GTCATT|114|115|-|ATT|115|115|-|ATT|
|8a|g.117_118delCA<br>or g.117_118[2]|116|118|TCA|T|117|118|CA|-|117|119|CA|-|
|8b|g.119_120delCA<br>or g.119_120[2]|116|120|TCACA|TCA|119|120|CA|-|119|121|CA|-|
|8c|g.121_122delCA<br>or g.120_121[2]*|116|122|TCACACA|TCACA|121|122|CA|-|121|123|CA|-|
|9|g.123G=|123|123|G|G|123|123|G|G|123|124|G|G|
|10a|g.124_125insC<br>or g.125dupC|124|124|A|AC|124|125|-|C|125|125|-|C|
|10b|g.125_126insC<br>or g.126dupC|125|126|C|CC|125|126|-|C|126|126|-|C|
|10c|g.126_127insC<br>or g.127dupC|126|126|C|CC|126|127|-|C|127|127|-|C|
|10d|g.126[3]*<br>or g.125[3] or g.124[3]|126|126|C|CC|126|127|-|C|127|127|-|C|


Exclusions and Limitations
--------------------------

Attributes 
----------

{:.table}
| Attribute Name | Attribute Type |
|----------------|----------------|
| identifier     | Identifier []  |
| convention     | Code           |       
| start          | int            |
| end            | int            |
| refAllele      | String         |

identifier: ReferenceCoordinates may be assigned identifiers by databases such as dbSNP.   Multiple agencies may apply different identifiers over different time periods to refer to the same identifier. The identifier may be shared across different ReferenceCoordinates, for instance those that are all grouped together under the same [CanonicalAllele](canonical_allele.html)

convention: ___TBD___

start: The start position of the reference allele, when the first base in the associated ReferenceSequence is numbered 1.

end: The position of the end base of the refAllele in the ReferenceSequence.

refAllele: The subsequence of the ReferenceSequence that goes from coordinates start to end (inclusive).  It is derivable from start and end, plus the ReferenceSequence.  However, it is kept in the ReferenceCoordinate as a convenience.

Related Entities
----------------

Particular subclasses will have a relationship with a given subclass of [ReferenceSequence](../reference_sequence/index.html). See the subclasses for further information.
