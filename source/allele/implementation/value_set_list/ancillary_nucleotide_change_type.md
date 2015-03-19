---
title: ancillary-nucleotide-change-type
description: This value set includes only the types associated with simple nucleotide alleles.
source: Sequence Ontology
id: TBD
usage: core
---

Currently constraint to be a child of [sequence_alteration](http://www.sequenceontology.org/browser/current_svn/term/SO:0001059) within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools as [VAT](http://www.yandell-lab.org/software/vaast.html), [SnpEff](http://snpeff.sourceforge.net/) or [ANNOVAR](http://www.openbioinformatics.org/annovar/).


Scope and Usage
---------------

We have curated a list of [primary](primary_nucleotide_change_type.html) Sequence Ontology terms to be used when annotating nucleotides changes.  Use of this list allow grouping of types at a higher level, enriching the ability to preform logic and algorithm based operation across larger collections.

Additionally, we allow the use of an ancillary type which can be used to clarify and add depth to the primary type observed.  This type also allows a single annotation using a term not included in the primary list.

ancillaryNucleotideChangeType List
------------------------

In cases where additional or clarifying terms are needed a child of sequence_alteration may be used and if a term is need it can be submitted for review via the sequence ontology [request a term]( http://sourceforge.net/p/song/term-tracker/).


Examples:
---------

**ancillaryNucleotideChangeType:** (carnality of 1)

* This attribute allows for a couple of possibilities.  
1. First to allow additional detail in describing the location of the feature related to the variant.
2. Second, it allows the uses of terms that may better describe the feature of intrest, not offered in the primary list.

###_The first case:_

{:.table}
| Type | SO Name | Code[ID] | 
|----------------|----------------|
| `primaryNucleotideChangeType` | `deletion` | [SO:0000159](http://www.sequenceontology.org/browser/current_svn/term/SO:0000159) |
| `ancillaryNucleotideChangeType` | `deficient_inversion` | [SO:1000171](http://www.sequenceontology.org/browser/current_svn/term/SO:1000171) |

{:.table}
| Type | SO Name | Code[ID] | 
|----------------|----------------|
| `primaryNucleotideChangeType` | `substitution` | [SO:1000002](http://www.sequenceontology.org/browser/current_svn/term/SO:1000002) |
| `ancillaryNucleotideChangeType` | `MNV` | [SO:0002007](http://www.sequenceontology.org/browser/current_svn/term/SO:0002007) |

This method offers two levels of annotated detail. The primaryNucleotideChangeType term enables higher-level grouping, and the ancillaryNucleotideChangeType offers additional specifics on the nature of the variant.

###_The second case:_

{:.table} 
| Type | SO Name | Code[ID] | 
|----------------|----------------| 
| `ancillaryNucleotideChangeType` | `deficient_intrachromosomal_transposition` | [SO:0000062](http://www.sequenceontology.org/browser/current_svn/term/SO:0000062) |