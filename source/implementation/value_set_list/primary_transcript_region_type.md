---
title: primary-transcript-region-type
description: This value set includes only the transcript associated regions that is associated with a transcript allele instance reference coordinate. 
source: Sequence Ontology
id: 20
usage: core
layout: model
model: allele

---

Scope and Usage
---------------

This value set can be used in conjunction with the [ancillary-transcript-region-type](ancillary_transcript_region_type.html), which provides additional detail to the primaryTranscriptRegionType.  

primaryTranscriptRegionType:
---------------------------------

Annotations done using the primaryTranscriptRegionType attribute are restricted to one of the following terms provided.  Any term used outside this list would be considered invalid for this attribute.

{:.table}
| Code | Display Name |
|--------|----------|
[SO:0000316](http://www.sequenceontology.org/browser/current_svn/term/SO:0000316) | CDS |
[SO:0000191](http://www.sequenceontology.org/browser/current_svn/term/SO:0000191)| interior_intron |
[SO:0000507](http://www.sequenceontology.org/browser/current_svn/term/SO:0000507) | pseudogenic_exon |
[SO:0000162](http://www.sequenceontology.org/browser/current_svn/term/SO:0000162) | splice_site |
[SO:0000204](http://www.sequenceontology.org/browser/current_svn/term/SO:0000204) | five_prime_UTR |
[SO:0000205](http://www.sequenceontology.org/miso/current_svn/term/SO:0000205) | three_prime_UTR |

This value set is used in the following places:

* [ContextualAllele.ReferenceCoordinate.primaryTranscriptRegionType (Resource)](/resource/contextual_allele)
* [TranscriptReferenceCoordinate.primaryTranscriptRegionType (Conceptual)](/conceptual/contextual_allele/transcript_reference_coordinate.html)

Examples:
---------

**primaryTranscriptRegionType:** (cardinality of 1..*)

{:.table}
| Type | Display Name | Code | 
|----------------|----------------|
| `primaryTranscriptRegionType` | `CDS` | [SO:0000316](http://www.sequenceontology.org/browser/current_svn/term/SO:0000316) |

{:.table}
| Type | Display Name | Code | 
|----------------|----------------|
| `primaryTranscriptRegionType` | `splice_site` | [SO:0000162](http://www.sequenceontology.org/browser/current_svn/term/SO:0000162) |


{:.table}
| Type | Display Name | Code | 
|----------------|----------------|
| `primaryTranscriptRegionType` | `CDS` | [SO:0000316](http://www.sequenceontology.org/browser/current_svn/term/SO:0000316) |
| `primaryTranscriptRegionType` | `interior_intron` | [SO:0000191](http://www.sequenceontology.org/browser/current_svn/term/SO:0000191) |
| `primaryTranscriptRegionType` | `splice_site` | [SO:0000162](http://www.sequenceontology.org/browser/current_svn/term/SO:0000162) |





