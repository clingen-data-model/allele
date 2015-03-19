---
title: ancillary-transcript-region-type
description: This value set includes only the transcript associated regions that is associated with a transcript simple allele reference coordinate.
source: Sequence Ontology
id: TBD
usage: core
---

Controlled vocabulary terms used to describe a single effected transcript feature. Currently constraint to be a child of [transcript_region](http://www.sequenceontology.org/browser/current_svn/term/SO:0000833) within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools such as [VAT](http://www.yandell-lab.org/software/vaast.html) or [SnpEff](http://snpeff.sourceforge.net/) as well as tools which operate on [GFF3 files](http://www.sequenceontology.org/resources/gff3.html)

Scope and Usage
---------------

We have curated a list of [primary](primary_transcript_region_type.html) Sequence Ontology terms to be used when annotating regionType.  Use of this list allow grouping of regions at a higher level, enriching the ability to preform logic and algorithm based operation across larger groups of region types.

Additionally, we allow the use of an ancillary type which can be used to clarify and add depth to the primary type observed.  This type also allows a single annotation using a term not included in the primary list.

ancillaryRegionType List
------------------------

In cases where additional, clarifying or terms not found in the [primary-transcript-region-type](primary_transcript_region_type.html) are needed a child of [transcript_region]( http://www.sequenceontology.org/browser/current_svn/term/SO:0000833) may be used.  Additionally, terms can be submitted for review via the sequence ontology [request a term]( http://sourceforge.net/p/song/term-tracker/).


Examples:
--------

**ancillaryRegionType:** (cardinality of 0..*)

* This attribute allows for a couple of possibilities.  
1. First to allow additional detail in describing the location of the feature related to the variant.
2. Second, it allows the uses of terms that may better describe the feature of intrest, not offered in the primary list.


###_The first case:_

{:.table}
| Type | SO Name | Code[SO] | 
|----------------|----------------|
| `primaryRegionType` | `CDS` | [SO:0000316](http://www.sequenceontology.org/browser/current_svn/term/SO:0000316) |
| `ancillaryRegionType` | `transcription_start_site` | [SO:0000315](http://www.sequenceontology.org/browser/current_svn/term/SO:0000315) |


_More examples:_

{:.table}
| Type | SO Name | Code[SO] | 
|----------------|----------------|
| `primaryRegionType` | `splice_site` | [SO:0000162](http://www.sequenceontology.org/browser/current_svn/term/SO:0000162) |
| `ancillaryRegionType` | `three_prime_cis_splice_site` | [SO:0000164](http://www.sequenceontology.org/browser/current_svn/term/SO:0000164) |

{:.table}
| Type | SO Name | Code[SO] | 
|----------------|----------------|
| `primaryRegionType` | `exon` | [SO:0000147](http://www.sequenceontology.org/browser/current_svn/term/SO:0000147) |
| `ancillaryRegionType` | `interior_exon` | [SO:0000201](http://www.sequenceontology.org/browser/current_svn/term/SO:0000201) |


These methods offers two levels of annotated detail.  The primaryRegionType term enables higher-level grouping, and the ancillaryRegionType offers additional specifics on the nature and location of the variant.


###_The second case:_

{:.table}
| Type | SO Name | Code[ID] | 
|----------------|----------------|
| `ancillaryRegionType` | `promoter` | [SO:0000167](http://www.sequenceontology.org/browser/current_svn/term/SO:0000167) |

{:.table}
| Type | SO Name | Code[ID] | 
|----------------|----------------|
| `ancillaryRegionType` | `cryptic_splice_site` | [SO:0001533](http://www.sequenceontology.org/browser/current_svn/term/SO:0001533) |




