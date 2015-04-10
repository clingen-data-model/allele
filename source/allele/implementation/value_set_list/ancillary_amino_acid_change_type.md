---
title: ancillary-amino-acid-change-type
description: This value set includes only the types associated with simple amino acid alleles.
source: Sequence Ontology
id: 25
usage: core
---


Scope and Usage
---------------

ancillaryAminoAcidChangeType allows for the use of additional amino acid types which can be used to clarify and add depth to the [primary-amino-acid-change-type](primary-amino-acid-change-type.html).  Additionally, this type allows a single annotation using a term not included in the primary list.

Additionally ancillaryAminoAcidChangeType can be used to annotate types experimentally discovered or derived with annotation tools such as [VAT](http://www.yandell-lab.org/software/vaast.html), [SnpEff](http://snpeff.sourceforge.net/) or [ANNOVAR](http://www.openbioinformatics.org/annovar/).

ancillaryAminoAcidChangeType List
----------------------------------

Currently constraint to be a child of [sequence_variant](http://www.sequenceontology.org/browser/current_svn/term/SO:0001060) within the Sequence Ontology.


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


##_Annotation tools examples:_

{:.table} 
| Type | SO Name | Tool | Code[SO] | 
|------|----------|-----|----------|
| `ancillaryAminoAcidChangeType` | `conserved_intergenic_variant` | [SnpEff](http://snpeff.sourceforge.net/) | [SO:0002017](http://www.sequenceontology.org/browser/current_svn/term/SO:0002017) |
| `ancillaryAminoAcidChangeType` | `stop_retained_variant` | [VAT](http://www.yandell-lab.org/software/vaast.html) | [SO:0001567](http://www.sequenceontology.org/browser/current_svn/term/SO:0001567) |
| `ancillaryAminoAcidChangeType` | `upstream_gene_variant` | [ANNOVAR](http://www.openbioinformatics.org/annovar/) | [SO:0001631](http://www.sequenceontology.org/browser/current_svn/term/SO:0001631) |


Exclusions and Limitations
--------------------------

Additional terms can be submitted for review via the sequence ontology [request a term]( http://sourceforge.net/p/song/term-tracker/)

