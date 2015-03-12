---
title: ancillary-transcript-region-type
description: This value set includes only the transcript associated regions that is associated with a transcript simple allele reference coordinate.
source: Sequence Ontology
id: TBD
usage: core
---

A controlled vocabulary term used to describe a single effected transcript feature. Currently constraint to be a child of [transcript_region](http://www.sequenceontology.org/browser/current_svn/term/SO:0000833) within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools such as [VAT](http://www.yandell-lab.org/software/vaast.html) or [SnpEff](http://snpeff.sourceforge.net/) as well as tools which operate on [GFF3 files](http://www.sequenceontology.org/resources/gff3.html)

We have curated a list of primary Sequence Ontology terms to be used when annotating regionType.  Use of this list allow grouping of regions at a higher level, enriching the ability to preform logic and algorithm based operation across larger groups of region types.

Additionally, we allow the use of an ancillary type that can be used to clarify the primary type observed.  This type also allows a single annotation using a term not included in the primary list.

Each of the ValueSets dealing with [CodeableConcepts](http://www.hl7.org/implement/standards/fhir/datatypes.html#CodeableConcept) are separated into two sections that focus on different levels of detail, demonstrated in the below examples.


Sequence Ontology (SO) Codes
-------------------------

{:.table}
| SO Name | Code[ID] | 
|----------------|----------------|
| exon | [SO:0000147](http://www.sequenceontology.org/browser/current_svn/term/SO:0000147) |
| intron | [SO:0000188](http://www.sequenceontology.org/browser/current_svn/term/SO:0000188) |
| splice_site | [SO:0000162](http://www.sequenceontology.org/browser/current_svn/term/SO:0000162) |
| five_prime_UTR | [SO:0000204](http://www.sequenceontology.org/browser/current_svn/term/SO:0000204) |
| three_prime_UTR | [SO:0000205](http://www.sequenceontology.org/browser/current_svn/term/SO:0000205) |
| transcription_start_site | [SO:0000315](http://www.sequenceontology.org/browser/current_svn/term/SO:0000315) |
| transcription_end_site | [SO:0000616](http://www.sequenceontology.org/browser/current_svn/term/SO:0000616) |


ancillaryRegionType List
------------------------

In cases where additional or clarifying terms are needed a child of [transcript_region]( http://www.sequenceontology.org/browser/current_svn/term/SO:0000833) may be used and if a term is need it can be submitted for review via the sequence ontology [request a term]( http://sourceforge.net/p/song/term-tracker/).


Examples
--------

**ancillaryRegionType:** (cardinality of 0..*)

* This attribute allows for a couple of possibilities.  
1. First to allow additional detail in describing the location of the feature related to the variant.
2. Second, it allows the uses of terms that may better describe the feature of intrest, not offered in the primary list.

_The first possibility:_

{:.table}
| Type | SO Name | Code[ID] | 
|----------------|----------------|
| `primaryRegionType` | `exon` | [SO:0000147](http://www.sequenceontology.org/browser/current_svn/term/SO:0000147) |
| `ancillaryRegionType` | `three_prime_coding_exon` | [SO:0000202](http://www.sequenceontology.org/browser/current_svn/term/SO:0000202) |

This method offers two levels of annotated detail.  The primaryRegionType term enables higher-level grouping, and the ancillaryRegionType offers additional specifics on the nature of the variant. 

_The second possibility:_

{:.table}
| Type | SO Name | Code[ID] | 
|----------------|----------------|
| `ancillaryRegionType` | `pseudogenic_exon` | [SO:0000507](http://www.sequenceontology.org/browser/current_svn/term/SO:0000507) |






