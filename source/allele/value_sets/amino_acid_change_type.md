---
title: aminoAcidChangeType
description: ValueSet for SimpleAminoAcidAllele 
---

Scope and Usage
---------------

aminoAcidChangeType: A controlled vocabulary term used to describe the resulting effect a nucleotideChangeType can have at the amino acid level.  Currently constraint to be a child of [coding_sequence_variant](http://www.sequenceontology.org/browser/current_svn/term/SO:0001580) within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools such as [SnpEff](http://snpeff.sourceforge.net/) or [VAT](http://www.yandell-lab.org/software/vaast.html).


Exclusive List
--------------
We have curated a list of prefered Sequence Ontology terms to be used when annotating aminoAcidChangeType

{:.table}
| SO Name | SO ID | 
|----------------|----------------|
| synonymous_variant | [SO:0001819](http://www.sequenceontology.org/browser/current_svn/term/SO:0001819) |
| frameshift_elongation | [SO:0001909](http://www.sequenceontology.org/browser/current_svn/term/SO:0001909) |
| frameshift_truncation | [SO:0001910](http://www.sequenceontology.org/browser/current_svn/term/SO:0001910) |
| inframe_indel | [SO:0001820](http://www.sequenceontology.org/browser/current_svn/term/SO:0001820) |
| nonsynonymous_variant | [SO:0001992](http://www.sequenceontology.org/browser/current_svn/term/SO:0001992) |
| missense_variant | [SO:0001583](http://www.sequenceontology.org/browser/current_svn/term/SO:0001583) |
| stop_gained | [SO:0001587](http://www.sequenceontology.org/browser/current_svn/term/SO:0001587) |
| stop_lost | [SO:0001578](http://www.sequenceontology.org/browser/current_svn/term/SO:0001578) |


Auxiliary List
------------------

Although the majority of transcript regions can be encompassed by using the exclusive list there may be instances where a more specific term is appropriate
e.g. [five_prime_cis_splice_site
]( http://www.sequenceontology.org/browser/current_svn/term/SO:0000163) vs. [splice_site](http://www.sequenceontology.org/browser/current_svn/term/SO:0000162) or unrepresented terms are needed. In those cases any term which is a child of [transcript_region]( http://www.sequenceontology.org/browser/current_svn/term/SO:0000833) may be used and if a term is need it can be submitted for review via the sequence ontology [request a term]( http://sourceforge.net/p/song/term-tracker/)




