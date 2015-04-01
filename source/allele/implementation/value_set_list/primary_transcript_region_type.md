---
title: primary-transcript-region-type
description: This value set includes only the transcript associated regions that is associated with a transcript simple allele reference coordinate. 
source: Sequence Ontology
id: TBD
usage: core
---

Scope and Usage
---------------

We have curated a list of primary Sequence Ontology terms to be used when annotating primaryTranscriptRegionType.  This list is specifically developed to describe transcript region types associated with SimpleAllele observations.  Use of this list allow grouping of transcript regions at a higher level, enriching the ability to preform logic and algorithm based operation across larger groups of region types.

This value set can be used in conjunction with the [ancillary-transcript-region-type](ancillary_transcript_region_type.html), which provides additional detail to the primaryTranscriptRegionType.  

primaryTranscriptRegionType:
---------------------------------

Annotations done using the primaryRegionType attribute are restricted to one of the following terms provided.  Any term used outside this list would be considered invalid for this attribute.

{:.table}
| SO Name | Code[SO] | 
|--------|----------|
| CDS | [SO:0000316](http://www.sequenceontology.org/browser/current_svn/term/SO:0000316) |
| interior_intron | [SO:0000191](http://www.sequenceontology.org/browser/current_svn/term/SO:0000191)|
| pseudogenic_exon | [SO:0000507](http://www.sequenceontology.org/browser/current_svn/term/SO:0000507) |
| splice_site | [SO:0000162](http://www.sequenceontology.org/browser/current_svn/term/SO:0000162) |
| five_prime_UTR | [SO:0000204](http://www.sequenceontology.org/browser/current_svn/term/SO:0000204) |
| three_prime_UTR | [SO:0000205](http://www.sequenceontology.org/miso/current_svn/term/SO:0000205) |

This value set is used in the following places:

* [SimpleAllele.ReferenceCoordinate.primaryTranscriptRegionType (Resource)](/allele/resource/simple_allele)
* [TranscriptReferenceCoordinate.primaryRegionType (Conceptual)](/allele/conceptual/simple_allele/transcript_reference_coordinate.html)

Examples:
---------

**primaryRegionType:** (cardinality of 1..*)

{:.table}
| Type | SO Name | Code[SO] | 
|----------------|----------------|
| `primaryRegionType` | `CDS` | [SO:0000316](http://www.sequenceontology.org/browser/current_svn/term/SO:0000316) |

{:.table}
| Type | SO Name | Code[SO] | 
|----------------|----------------|
| `primaryRegionType` | `splice_site` | [SO:0000162](http://www.sequenceontology.org/browser/current_svn/term/SO:0000162) |


{:.table}
| Type | SO Name | Code[SO] | 
|----------------|----------------|
| `primaryRegionType` | `CDS` | [SO:0000316](http://www.sequenceontology.org/browser/current_svn/term/SO:0000316) |
| `primaryRegionType` | `interior_intron` | [SO:0000191](http://www.sequenceontology.org/browser/current_svn/term/SO:0000191) |
| `primaryRegionType` | `splice_site` | [SO:0000162](http://www.sequenceontology.org/browser/current_svn/term/SO:0000162) |





