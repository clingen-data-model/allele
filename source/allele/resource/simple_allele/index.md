---
title: SimpleAllele
layout: resource
alias: simple allele, allele, variant, sequence variant, snv, amino acid variant, dna change, aa change
description: A representation of one of the multiple variant sequences at a contiguous region in a particular <a href="/allele/resource/reference_sequence/index.html">ReferenceSequence</a>.
related_page_title: SimpleAllele
related_page_url: /allele/conceptual/simple_allele
schema: /main/resources/clingen-xsd/simpleallele.xsd

---

Scope and Usage
---------------

Genetic variation is often represented with respect to an explicit reference sequence.  At a locus where variation exists in the population, there exist both the allele that occurs in the reference as well as one or more alternate alleles.  Each one of these alleles (including the reference) is represented by a distinct instance of SimpleAllele.

SimpleAllele as here defined is similar to the SO term [sequence_variant](http://www.sequenceontology.org/browser/current_svn/term/SO:0001060), but where that definition describes a difference with respect to a sequence, SimpleAllele explicitly allows the reference allele to be represented. Note that the reference allele is not guaranteed to be the minor allele in any population.

A SimpleAllele should either represent a contiguous section of the ReferenceSequence, or the replacement of such a section with a new contiguous section (including an empty section forr a deletion).  While it would be possible to represent two widely spaced SNPs as a SimpleAllele that reproduces the ReferenceSequence between them, this is not the intended use; such cases should be handled through the use of a ComplexAllele.

This definition of SimpleAllele allows for large deletions or insertions; it is left as an implementation decision whether there is a size limit above which the implementing system will no longer use this representation.

Each SimpleAllele is the representation of an allele within a single sequence.  For example, if a variant occurs within the coding region of a transcript, three different SimpleAlleles will be used to represent the same variant: one representing the allele in the context of the ReferenceSequence for the genome, a second representing the allele in the context of the ReferenceSequence for the transcript, and a third in the context of the ReferenceSequence for the amino acid chain.

### Discussion: Coordinate Numbering Methods

The Data Model Working Group considered three methods for the numbering of coordinates:

  1. The Alignment Method: Based on the numbering used in [VCF](http://samtools.github.io/hts-specs/VCFv4.2.pdf).
  2. The Variant Method: Based on the numbering used in [HGVS expressions](http://www.hgvs.org/mutnomen/disc.html).
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

Resource Model
----------------

[![SimpleAllele Resource Diagram](/images/SimpleAlleleResource.svg){: .img-responsive}](/images/SimpleAlleleResource.svg)

Related Resources: [ReferenceSequence](/allele/resource/reference_sequence/index.html), [CanonicalAllele](/allele/resource/canonical_allele/index.html)


Definitions & Bindings
------------------

{:.h4-definition}
### SimpleAllele

{:.dl-horizontal .dl-definition}
Definition
: TODO

{:.h4-definition}
#### SimpleAllele.identifier

{:.dl-horizontal .dl-definition}
Definition
: The set of Identifiers used to name this SimpleAllele. May be as simple as a set of one single Identifier distinguishing the SimpleAllele in the implementing system, or may expansively include the name of all SimpleAlleles in all implementing systems.

{:.h4-definition}
#### SimpleAllele.canonicalAllele

{:.dl-horizontal .dl-definition}
Definition
: The CanonicalAllele resource to which this SimpleAllele maps.

{:.h4-definition}
#### SimpleAllele.simpleAlleleType

{:.dl-horizontal .dl-definition}
Definition
: One of the set of allowable [simple-allele-types](/allele/implementation/value_set_list/simple_allele_type.html) as defined in the data model.

{:.h4-definition}
#### SimpleAllele.allele

{:.dl-horizontal .dl-definition}
Definition
:The nucleotide or amino acid sequence that is defined for this allele at the reference coordinates.  This is typically associated with the 'ALT' value in a VCF representation of a variant. 

{:.h4-definition}
#### SimpleAllele.primaryNucleotideChangeType

{:.dl-horizontal .dl-definition}
Definition
: One of the set of allowable [primary-nucleotide-change-types](/allele/implementation/value_set_list/primary_nucleotide_change_type.html). Required (and allowed) only if the SimpleAllele describes an allele on a nucleotide reference sequence.

{:.h4-definition}
#### SimpleAllele.ancillaryNucleotideChangeType

{:.dl-horizontal .dl-definition}
Definition
: One of the set of allowable [ancillary-nucleotide-change-types](/allele/implementation/value_set_list/ancillary_nucleotide_change_type.html). Allowed only if the SimpleAllele describes an allele on a nucleotide reference sequence.

{:.h4-definition}
#### SimpleAllele.primaryAminoAcidChangeType

{:.dl-horizontal .dl-definition}
Definition
: One of the set of allowable [primary-amino-acid-change-types](/allele/implementation/value_set_list/primary_amino_acid_change_type.html). Required (and allowed) only if the SimpleAllele describes an allele on an amino acid reference sequence.

{:.h4-definition}
#### SimpleAllele.ancillaryAminoAcidChangeType

{:.dl-horizontal .dl-definition}
defintion
: One of the set of allowable [ancillary-amino-acid-change-types](/allele/implementation/value_set_list/ancillary_amino_acid_change_type.html). Allowed only if the SimpleAllele describes an allele on an amino acid reference sequence.

{:.h4-definition}
### SimpleAllele.referenceCoordinate

{:.dl-horizontal .dl-definition}
Definition
: TODO

{:.h4-definition}
#### SimpleAllele.referenceCoordinate.identifier

{:.dl-horizontal .dl-definition}
Definition
: The set of Identifiers used to name this ReferenceCoordinate. May be as simple as a set of one single Identifier distinguishing the ReferenceCoordinate in the implementing system, or may expansively include the name of all ReferenceCoordinates in all implementing systems.

{:.h4-definition}
#### SimpleAllele.referenceCoordinate.referenceSequence

{:.dl-horizontal .dl-definition}
Definition
: The [ReferenceSequence](/allele/resource/reference_sequence) resource on which the ReferenceCoordinate (and, by extention, the SimpleAllele is mapped.

{:.h4-definition}
#### SimpleAllele.referenceCoordinate.start

{:.dl-horizontal .dl-definition}
Definition
: The starting position of the reference coordinate. NOTE: The data model defines a [0-based coordinate numbering system](/allele/coordinate_numbering.html) as described above.

{:.h4-definition}
#### SimpleAllele.referenceCoordinate.end

{:.dl-horizontal .dl-definition}
Definition
: The end position of the reference coordinate. Note that the data model defines a 0-based coordinate system as described above.

{:.h4-definition}
#### SimpleAllele.referenceCoordinate.refAllele

{:.dl-horizontal .dl-definition}
Definition
: The string of nucleotides or amino acids at this reference coordinate on the related reference genome. This is typically associated with the 'REF' value in a VCF representation of a variant. 

{:.h4-definition}
#### SimpleAllele.referenceCoordinate.primaryTranscriptRegionType

{:.dl-horizontal .dl-definition}
definition
: One of the set of allowable [primary-transcript-region-types](/allele/implementation/value_set_list/primary_transcript_region_type.html)

{:.h4-definition}
#### SimpleAllele.referenceCoordinate.ancillaryTranscriptRegionType

{:.dl-horizontal .dl-definition}
definition
: One of the set of allowable [ancillary-transcript-region-types](/allele/implementation/value_set_list/ancillary_transcript_region_type.html)

{:.h4-definition}
#### SimpleAllele.referenceCoordinate.intronOffsetStart

{:.dl-horizontal .dl-definition}
definition
: The start of the ReferenceCoordinate relative to the transcript coordinate. Required when the coordinate is described as an offset relative to an exonic transcript (should only apply to ReferenceCoordinates of type interior\_intron described relative to a ReferenceSequence of type transcript\_reference\_sequence).

{:.h4-definition}
#### SimpleAllele.referenceCoordinate.intronOffsetEnd

{:.dl-horizontal .dl-definition}
definition
: The end of the ReferenceCoordinate relative to the transcript coordinate. Requirements are the same as for intronOffsetStart.

{:.h4-definition}
#### SimpleAllele.referenceCoordinate.intronOffsetDirection

{:.dl-horizontal .dl-definition}
Definition
: The direction of the ReferenceCoordinate relative to the transcript coordinate. Requirements are the same as for intronOffsetStart.

{:.h4-definition}
### SimpleAllele.alleleName

{:.dl-horizontal .dl-definition}
Definition
: TODO

{:.h4-definition}
#### SimpleAllele.alleleName.nameType

{:.dl-horizontal .dl-definition}
Definition
: One of the set of allowable [simple-allele-name-types](/allele/implementation/value_set_list/simple_allele_name_type.html)

{:.h4-definition}
#### SimpleAllele.alleleName.legacy

{:.dl-horizontal .dl-definition}
Definition
: Flag set if the name is deprecated or no longer used in the relevant allele naming system.

{:.h4-definition}
#### SimpleAllele.alleleName.preferred

{:.dl-horizontal .dl-definition}
Definition
: Flag set if the name is the preferred name for this allele in the implementing system.

{:.h4-definition}
### SimpleAllele.related

{:.dl-horizontal .dl-definition}
Definition
: TODO

{:.h4-definition}
#### SimpleAllele.related.relatedType

{:.dl-horizontal .dl-definition}
Definition
: One of the allowable set of relationship types in [simple-allele-relationship-type](/allele/implementation/value_set_list/simple_allele_relationship_type.html)

{:.h4-definition}
#### SimpleAllele.related.target

{:.dl-horizontal .dl-definition}
Definition
: The SimpleAllele described in the relationship.


