---
title: ancillary-amino-acid-change-type
description: This value set includes only the types associated with simple amino acid alleles.
source: Sequence Ontology
id: TBD
usage: core
---


Scope and Usage
---------------

A controlled vocabulary term used to describe the resulting effect a nucleotideChangeType can have at the amino acid level.  Currently constraint to be a child of [sequence_variant](http://www.sequenceontology.org/browser/current_svn/term/SO:0001060) within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools such as [VAT](http://www.yandell-lab.org/software/vaast.html), [SnpEff](http://snpeff.sourceforge.net/) or [ANNOVAR](http://www.openbioinformatics.org/annovar/).

We have curated a list of Sequence Ontology terms to be used when annotating SimpleAllele aminoAcidChangeType.  Use of this list allows grouping of change types at a higher level, enriching the ability to preform logic and algorithm based operation across larger groups of amino acid change types.


ancillaryAminoAcidChangeType List
----------------------------------

In cases where additional or clarifying terms are needed a child of sequence_variant may be used and if a term is need it can be submitted for review via the sequence ontology request a term.


Examples:
---------

**ancillaryAminoAcidChangeType:** (carnality of 0..*)

* This attribute allows for a couple of possibilities.  
1. First to allow additional detail in describing the location of the feature related to the variant.
2. Second, it allows the uses of terms that may better describe the feature of intrest, not offered in the primary list.

###_The first case:_

{:.table} 
| Type | SO Name | Code[ID] | 
|----------------|----------------| 
| `primaryAminoAcidChangeType` | `inframe_variant` | [SO:0001650](http://www.sequenceontology.org/browser/current_svn/term/SO:0001650) |
| `ancillaryAminoAcidChangeType` | `inframe_deletion` | [SO:0001822](http://www.sequenceontology.org/browser/current_svn/term/SO:0001822) |

{:.table} 
| Type | SO Name | Code[ID] | 
|----------------|----------------| 
| `primaryAminoAcidChangeType` | `coding_sequence_variant` | [SO:0001580](http://www.sequenceontology.org/browser/current_svn/term/SO:0001580) |
| `ancillaryAminoAcidChangeType` | `terminator_codon_variant` | [SO:0001590](http://www.sequenceontology.org/miso/current_svn/term/SO:0001590) |

{:.table} 
| Type | SO Name | Code[ID] | 
|----------------|----------------| 
| `primaryAminoAcidChangeType` | `intergenic_variant` | [SO:0001628](http://www.sequenceontology.org/browser/current_svn/term/SO:0001628) |
| `ancillaryAminoAcidChangeType` | `downstream_gene_variant` | [SO:0001632](http://www.sequenceontology.org/miso/current_svn/term/SO:0001632) |


This method offers two levels of annotated detail. The primaryAminoAcidChangeType term enables higher-level grouping, and the ancillaryAminoAcidChangeType offers additional specifics on the nature of the variant.


###_The second case:_

{:.table} 
| Type | SO Name | Code[ID] | 
|----------------|----------------| 
| `ancillaryAminoAcidChangeType` | `rare_amino_acid_variant` | [SO:0002008](http://www.sequenceontology.org/browser/current_svn/term/SO:0002008) |





