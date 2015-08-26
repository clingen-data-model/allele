---
title: ancillary-amino-acid-change-type
description: This value set includes only the types associated with amino acid allele instances.
source: Sequence Ontology
id: 25
usage: core
layout: model
model: allele

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

**ancillaryAminoAcidChangeType:** (cardinality of 0..*)

* This attribute allows for a couple of possibilities.  
1. First to allow additional detail in describing the location of the feature related to the variant.
2. Second, it allows the uses of terms that may better describe the feature of intrest, not offered in the primary list.

###_The first case:_

{:.table} 
| Type | Display Name | Code | 
|----------------|----------------| 
| `primaryAminoAcidChangeType` | `frameshift_variant` | [SO:0001589](http://www.sequenceontology.org/miso/current_svn/term/SO:0001589)|
| `ancillaryAminoAcidChangeType` | `frameshift_elongation` | [SO:0001909](http://www.sequenceontology.org/browser/current_svn/term/SO:0001909) |

{:.table} 
| Type | Display Name | Code | 
|----------------|----------------| 
| `primaryAminoAcidChangeType` | `missense_variant` | [SO:0001580](http://www.sequenceontology.org/browser/current_svn/term/SO:0001583) |
| `ancillaryAminoAcidChangeType` | `non_conservative_missense_variant` | [SO:0001586](http://www.sequenceontology.org/browser/current_svn/term/SO:0001586) |


This method offers two levels of annotated detail. The primaryAminoAcidChangeType term enables higher-level grouping, and the ancillaryAminoAcidChangeType offers additional specifics on the nature of the variant.


###_The second case:_

{:.table} 
| Type | Display Name | Code | 
|----------------|----------------| 
| `ancillaryAminoAcidChangeType` | `rare_amino_acid_variant` | [SO:0002008](http://www.sequenceontology.org/browser/current_svn/term/SO:0002008) |


##_Annotation tools examples:_

{:.table} 
| Type | Display Name | Tool | Code | 
|------|----------|-----|----------|
| `ancillaryAminoAcidChangeType` | `conserved_intergenic_variant` | [SnpEff](http://snpeff.sourceforge.net/) | [SO:0002017](http://www.sequenceontology.org/browser/current_svn/term/SO:0002017) |
| `ancillaryAminoAcidChangeType` | `stop_retained_variant` | [VAT](http://www.yandell-lab.org/software/vaast.html) | [SO:0001567](http://www.sequenceontology.org/browser/current_svn/term/SO:0001567) |
| `ancillaryAminoAcidChangeType` | `upstream_gene_variant` | [ANNOVAR](http://www.openbioinformatics.org/annovar/) | [SO:0001631](http://www.sequenceontology.org/browser/current_svn/term/SO:0001631) |


Exclusions and Limitations
--------------------------

Additional terms can be submitted for review via the sequence ontology [request a term]( http://sourceforge.net/p/song/term-tracker/)


