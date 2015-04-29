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
