---
title: Coordinate Numbering 
description: The explanation and background behind the decisions made to represent allele reference coordinates using a zero-based interval approach.
 
---

The Data Model Working Group considered three methods for the numbering of coordinates:

  1. The Alignment Method: Based on the numbering used in [VCF](http://samtools.github.io/hts-specs/VCFv4.2.pdf).
  2. The Variant Method: Based on the numbering used in [HGVS expressions](http://www.hgvs.org/mutnomen/disc.html).
  3. The Interval Method: Based on numbering intervals as in [BED files](https://genome.ucsc.edu/FAQ/FAQformat.html#format1).

In the Alignment Method, the reference allele is defined as the subsequence that begins at the base numbered "start" and goes to the base numbered "end", both inclusive.  A single base will have equal start and end.   As in a VCF, insert or delete alleles will usually share the first base of the reference alleles, which is not actually part of the variable site, but is used to help locate the variable site.

In the Variant Method, the reference allele is not computable from the start and end positions, but is an integral part of the definition of the coordinate.  If the location is a range of bases, then start, end and ref are defined as in the alignment model.  However, if the interval between two bases is the location, then start is the position of the first base, end = start + 1, and ref is an empty string.  This method has the advantage that only variable bases are included in the definition of the alleles, but it has the disadvantage that two coordinates may have the same start and end, but in one case refer to a pair of bases, and in the other case refer to the interval between the two bases.

In the Interval Method, often called zero-based counting, positions denote the intervals between bases, rather than referring to the bases themselves, with a position of 0 denoting the interval before the first base, 1 the interval between the first and second base, and so on.   With this counting, the reference allele is again computable as the bases that lie between the start and end intervals.  In the case of a single base reference allele, the end position will be start + 1.  If start = end = i, then the position is the interval after the i-th base.  Any SimpleAllele that has such a coordinate would therefore be an insertion.    The interval method has the advantages that only variant bases are included in the allele definitions, that the reference allele is completely computable, as well as consistency in the meaning of start and end.  Furthermore, the interval method is capable of representing the alleles of a snp and a deletion of the varying base using the same allele coordinate, which the alignment method cannot.

The table below shows the differences in representation for reference coordinates in the methods described above.  Although Alt is not part of the coordinate, it is included here to illustrate the manner in which alleles would make use of the reference coordinates in different circumstances.

[![Variant Numbering Diagram](/images/variant_numbering_examples.png){: .img-responsive}](/images/variant_numbering_examples.png)

{:.table .table-condensed .small}
|    |HGVS    |>>>>|Alignment|-Method|<<<<<<<<|>>>>|Variant|-Method|<<<<|>>>>|Interval|-Method|<<<<|
|    |        | Start | End | Ref | Alt| Start | End | Ref|Alt|Start|End|Ref|Alt|
|:---|--------|-------|-----|-----|-----|---|---|---|---|---|---|---|---|
|1   |g.100A>T| 100 | 100 | A | T |100|100|A|T|99|100|A|T|
|2 |g.101delT|100|101|AT|A|101|101|T|-|100|101|T|-|
|3|g.103_104delTC|102|104|GTC|G|103|104|TC|-|102|103|TC|-|
|4|g.107_108delTC|105|108|GTTC|GT|107|108|TC|-|106|108|TC|-|
|5|g.109_110insT|109|109|A|AT|109|110|-|T|109|109|-|T|
|6|g.111_112insTAA|111|111|G|GTAA|111|112|-|TAA|111|111|-|TAA|
|7|g.114_115insATT|112|114|GTC|GTCATT|114|115|-|ATT|114|114|-|ATT|
|8a|g.117_118delCA<br>or g.117_118[2]|116|118|TCA|T|117|118|CA|-|116|118|CA|-|
|8b|g.119_120delCA<br>or g.119_120[2]|116|120|TCACA|TCA|119|120|CA|-|118|120|CA|-|
|8c|g.121_122delCA<br>or g.120_121[2]*|116|122|TCACACA|TCACA|121|122|CA|-|120|122|CA|-|
|9|g.123G=|123|123|G|G|123|123|G|G|122|123|G|G|
|10a|g.124_125insC<br>or g.125dupC|124|124|A|AC|124|125|-|C|124|124|-|C|
|10b|g.125_126insC<br>or g.126dupC|125|126|C|CC|125|126|-|C|125|125|-|C|
|10c|g.126_127insC<br>or g.127dupC|126|126|C|CC|126|127|-|C|126|126|-|C|
|10d|g.126[3]*<br>or g.125[3] or g.124[3]|126|126|C|CC|126|127|-|C|126|126|-|C|
