---
title: nucleotideChangeType
description: ValueSet of SimpleNucleotideAllele
---

Scope and Usage
---------------

nucleotideChangeType: A controlled vocabulary term used to describe observed nucleotide alteration, including the characterization of no_alteration.  Currently constraint to be a child of sequence_position within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools such as [SnpEff](http://snpeff.sourceforge.net/) or [VAAST](http://www.yandell-lab.org/software/vaast.html).


Exclusive List
--------------
We have curated a list of prefered Sequence Ontology terms to be used when annotating nucleotideChangeType

{:.table}
| SO Name | SO ID | 
|----------------|----------------|
| deletion | [SO:0000159](http://www.sequenceontology.org/browser/current_svn/term/SO:0000159) |
| insertion | [SO:0000667](http://www.sequenceontology.org/browser/current_svn/term/SO:0000667) |
| indel | [SO:1000032](http://www.sequenceontology.org/browser/current_svn/term/SO:1000032) |
| inversion | [SO:1000036](http://www.sequenceontology.org/browser/current_svn/term/SO:1000036) |
| substitution | [SO:1000002](http://www.sequenceontology.org/browser/current_svn/term/SO:1000002) |
| translocation | [SO:0000199](http://www.sequenceontology.org/browser/current_svn/term/SO:0000199) |
| copy_number_variation | [SO:0001019](http://www.sequenceontology.org/browser/current_svn/term/SO:0001019) |
| no_alteration | SO:000000 |


Supplementary List
------------------

Although the majority of nucleotide changes will be represent by using the exclusive list there may be instances where more specific or unrepresented terms are needed.  In those cases any term which is a child of [sequence_postion]() may be used and if a term is need it can be submitted for review via the sequence ontology [request a term]( http://sourceforge.net/p/song/term-tracker/).


