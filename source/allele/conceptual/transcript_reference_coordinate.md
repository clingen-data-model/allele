---
title: TranscriptReferenceCoordinate 
description: TranscriptReferenceCoordinate defines a location with respect to a <a href="transcript_reference_sequence.html">TranscriptReferenceSequence</a>.  A TranscriptReferenceCoordinate can be defined for both exonic positions, which are part of the transcript, and intronic positions, which are not.

---

Scope and Usage
---------------

[ReferenceCoordinate](reference_coordinate.html) representts a particular continguous location at which different alleles may be defined with [SimpleAllele](simple_allele.html).  TranscriptReferenceCoordinate is a [ReferenceCoordinate](reference_coordinate.html) where the underlying reference sequence is a [TranscriptReferenceSequence](transcript_reference_sequence.html).

TranscriptReferenceCoordinates may refer to either exonic or intronic locations. Because exonic locations are in the [TranscriptReferenceSequence](transcript_reference_sequence.html), the coordinate may be defined as described in [ReferenceCoordinate](reference_coordinate.html).

However, intronic locations are not part of the [TranscriptReferenceSequence](transcript_reference_sequence.html), and cannot be simply described using a start and end.  In HGVS, intronic variants are described in a transcript by using two integers.  The first is a location in the transcript, which is supposed to be the first or last base in an exon.  The second number is a coordinate into the intron from that location.  This assumes an alignment of this transcript to a particular [GenomicReferenceSequence](genomic_reference_sequence.html).  There may be multiple such alignments to multiple [GenomicReferenceSequences](genomic_reference_sequence.html), though this is not modeled in HGVS expressions.

TranscriptReferenceCoordinate uses a similar system to refer to intronic positions.  Each TranscriptReferenceCoordinate may have one or more references to an IntronicCoordinate entity.  The IntronicCoordinate entity contains two integer attributes, which are the intronic offsets that are added to the start and end coordinates of the TranscriptReferenceCoordinate.   In addition, the IntronicCoordinate contains a reference to the particular [GenomicReferenceSequence](genomic_reference_sequence.html) where the transcript was mapped.


Examples
--------

The following table illustrates how exonic and intronic coordinates are represented based on the following sequence:

ACTgcactaCA
123      45

In this example, uppercase bases represent exonic sequence, and lowercase sequences represent intronic bases.  In the table, lowercase and uppercase is used to aid in undestanding, but the actual data would not include this information. The numbering is transcript-based, which will therefore not include the intronic bases.    Start and End are defined using the alignment method discussed in [ReferenceCoordinate](reference_coordinate.html).

offsetStart and offsetEnd are understood to be attributes of a related IntronicCoordinate.  If both values are empty in the table, then no such related entity exists.

| Example Type | start | end | ref | offsetStart | offsetEnd |
|--------------|-------|-----|-----|-------------|-----------|
| Exonic       |   2   |  2  |  C  |             |           |
| Intronic Left |  3   |  3  |  c  |      2      |     2     |
| Intronic Right |  4   |  4  |  t  |      -2      |     -2     |
| Intronic Long |  3   |  3  |  cac  |      2      |     4     |
| Spanning     |  2    |  3  |  CTgc |             |     2    |

Exclusions and Limitations
--------------------------

The relationship between the transcript and the genomic sequence to which it is mapped is partially modeled, the details of the mapping are not modeled.  In other words, for intronic coordinates, using only the data modeled here, it will beimpossible to calculate the reference allele.

Attributes
----------

When describing observations a concise and interoperable method is required to reduce ambiguity as well as clarify the semantics of nature language and biological meaning. The use of a formal, stable ontological structure allows highly detailed descriptions as well as a logically ordered interrelationship between concepts.

A controlled vocabulary term used to describe an observed transcript feature.  These values can be experimentally discovered or derived with annotation tools such as [SnpEff](http://snpeff.sourceforge.net/) or [VAAST](http://www.yandell-lab.org/software/vaast.html).

{:.table}
| Attribute Name | Attribute Type | Cardinality |
|----------------|----------------|-------------|
|   regionType   |     String     |    0..1     |

regionType: A controlled vocabulary term used to describe a single effected transcript feature. Currently constraint to be a child of [transcript_region](http://www.sequenceontology.org/browser/current_svn/term/SO:0000833) within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools such as [SnpEff](http://snpeff.sourceforge.net/) or [VAAST](http://www.yandell-lab.org/software/vaast.html).


Related Entities 
----------------

{:.table}
| Relationship Name | Entity Type | Cardinality |
|-------------------|-------------|-------------|
| intronicCoordinate | [IntronicCoordinate](intronic_coordinate.html) | 0..* |

intronicCoordinate: These entities are used to represent coordinates that occur in intronic sequences.   See above for details.  Fully exonic coordinates will not have any intronicCoordinate relationships.  An intronic coordinate will have at least one, and may have more than one, representing mappings of the transcript to different [GenomicReferenceSequences](genomic_reference_sequence.html).
