---
title: regionType
description: ValueSet of TranscriptReferenceCoordinate
---

Scope and Usage
---------------

regionType: A controlled vocabulary term used to describe a single effected transcript feature. Currently constraint to be a child of [transcript_region](http://www.sequenceontology.org/browser/current_svn/term/SO:0000833) within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools such as [SnpEff](http://snpeff.sourceforge.net/) or [VAAST](http://www.yandell-lab.org/software/vaast.html) as well as tools which operate on [GFF3 files](http://www.sequenceontology.org/resources/gff3.html)


Exclusive List
--------------
We have curated a list of prefered Sequence Ontology terms to be used when annotating regionType

{:.table}
| SO Name | SO ID | 
|----------------|----------------|
| exon | [SO:0000147](http://www.sequenceontology.org/browser/current_svn/term/SO:0000147) |
| intron | [SO:0000188](http://www.sequenceontology.org/browser/current_svn/term/SO:0000188) |
| splice_region | [SO:0001902](http://www.sequenceontology.org/browser/current_svn/term/SO:0001902) |
| five_prime_UTR | [SO:0000204](http://www.sequenceontology.org/browser/current_svn/term/SO:0000204) |
| three_prime_UTR | [SO:0000205](http://www.sequenceontology.org/browser/current_svn/term/SO:0000205) |
| transcription_start_site | [SO:0000315](http://www.sequenceontology.org/browser/current_svn/term/SO:0000315) |
| transcription_end_site | [SO:0000616](http://www.sequenceontology.org/browser/current_svn/term/SO:0000616) |


Supplementary List
------------------

Although the majority of transcript regions can be encompassed by using the exclusive list there may be instances where a more specific term is appropriate
e.g. [five_prime_cis_splice_site
]( http://www.sequenceontology.org/browser/current_svn/term/SO:0000163) vs. [splice_region](http://www.sequenceontology.org/browser/current_svn/term/SO:0001902) or unrepresented terms are needed. In those cases any term which is a child of [transcript_region]( http://www.sequenceontology.org/browser/current_svn/term/SO:0000833) may be used and if a term is need it can be submitted for review via the sequence ontology [request a term]( http://sourceforge.net/p/song/term-tracker/)




