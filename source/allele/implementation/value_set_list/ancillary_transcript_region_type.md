---
title: ancillary-transcript-region-type
description: This value set includes only the transcript associated regions that is associated with a transcript allele instance reference coordinate.
source: Sequence Ontology
id: 21
usage: core
layout: model
model: allele

---

Scope and Usage
---------------

ancillaryTranscriptRegionType allows for the use of additional region types which can be used to clarify and add depth to the [primary-transcript-region-type](primary-transcript-region-type.html).  Additionally, this type allows a single annotation using a term not included in the primary list.

ancillaryTranscriptRegionType:
------------------------

This type is currently constraint to be a child of [transcript_region](http://www.sequenceontology.org/browser/current_svn/term/SO:0000833) within the Sequence Ontology.  Accurate annotation of ancillary-transcript-region-type will not contain terms found in primary-transcript-region-type.

Examples:
--------

**ancillaryTranscriptRegionType:** (cardinality of 0..*)

* This attribute allows for a couple of possibilities.  
1. First to allow additional detail in describing the location of the feature related to the variant.
2. Second, it allows the uses of terms that may better describe the feature of interest, not offered in the primary list.


###_The first case:_

{:.table}
| Type | Display Name | Code | 
|----------------|----------------|
| `primaryTranscriptRegionType` | `CDS` | [SO:0000316](http://www.sequenceontology.org/browser/current_svn/term/SO:0000316) |
| `ancillaryTranscriptRegionType` | `transcription_start_site` | [SO:0000315](http://www.sequenceontology.org/browser/current_svn/term/SO:0000315) |


_More examples:_

{:.table}
| Type | Display Name | Code | 
|----------------|----------------|
| `primaryTranscriptRegionType` | `splice_site` | [SO:0000162](http://www.sequenceontology.org/browser/current_svn/term/SO:0000162) |
| `ancillaryTranscriptRegionType` | `three_prime_cis_splice_site` | [SO:0000164](http://www.sequenceontology.org/browser/current_svn/term/SO:0000164) |

{:.table}
| Type | Display Name | Code | 
|----------------|----------------|
| `primaryTranscriptRegionType` | `five_prime_UTR` | [SO:0000204](http://www.sequenceontology.org/browser/current_svn/term/SO:0000204) |
| `ancillaryTranscriptRegionType` | `upstream_AUG_codon` | [SO:000063](http://www.sequenceontology.org/browser/current_svn/term/SO:0000630) |

These methods offers two levels of annotated detail.  The primaryTranscriptRegionType term enables higher-level grouping, and the ancillaryTranscriptRegionType offers additional specifics on the nature and location of the variant.


###_The second case:_

{:.table}
| Type | Display Name | Code | 
|----------------|----------------|
| `ancillaryTranscriptRegionType` | `promoter` | [SO:0000167](http://www.sequenceontology.org/browser/current_svn/term/SO:0000167) |

{:.table}
| Type | Display Name | Code | 
|----------------|----------------|
| `ancillaryTranscriptRegionType` | `cryptic_splice_site` | [SO:0001533](http://www.sequenceontology.org/browser/current_svn/term/SO:0001533) |

Exclusions and Limitations
--------------------------

Additional terms can be submitted for review via the sequence ontology [request a term]( http://sourceforge.net/p/song/term-tracker/)


