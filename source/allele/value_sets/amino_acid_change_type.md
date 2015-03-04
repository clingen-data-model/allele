---
title: aminoAcidChangeType
description: ValueSets for SimpleAminoAcidAllele 
---

Scope and Usage
---------------

A controlled vocabulary term used to describe the resulting effect a nucleotideChangeType can have at the amino acid level.  Currently constraint to be a child of [sequence_variant](http://www.sequenceontology.org/browser/current_svn/term/SO:0001060) within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools such as [VAT](http://www.yandell-lab.org/software/vaast.html), [SnpEff](http://snpeff.sourceforge.net/) or [ANNOVAR](http://www.openbioinformatics.org/annovar/)

We have curated a list of exclusive Sequence Ontology terms to be used when annotating aminoAcidChangeType.  Use of this list allow grouping of change types at a higher level, enriching the ability to preform logic and algorithm based operation across larger groups of amino acid change types.

Additionally, we allow the use of an auxiliary type that can be used to clarify the exclusive type observed.  This type also allows a single annotation using a term not included in the exclusive list.

Each of the ValueSets dealing with [CodeableConcepts](http://www.hl7.org/implement/standards/fhir/datatypes.html#CodeableConcept) are separated into two sections that focus on different levels of detail, demonstrated in the below examples.


exclusiveAminoAcidChangeType List
----------------------------------

{:.table}
| SO Name | SO ID | 
|----------------|----------------|
| 3_prime_UTR_variant | [SO:0001624](http://www.sequenceontology.org/browser/current_svn/term/SO:0001624) |
| 5_prime_UTR_variant | [SO:0001623](http://www.sequenceontology.org/miso/current_svn/term/SO:0001623) |
| frameshift_variant | [SO:0001589](http://www.sequenceontology.org/browser/current_svn/term/SO:0001589) |
| synonymous_variant | [SO:0001819](http://www.sequenceontology.org/browser/current_svn/term/SO:0001819) 
| nonsynonymous_variant | [SO:0001992](http://www.sequenceontology.org/browser/current_svn/term/SO:0001992) 
| stop_gained | [SO:0001587](http://www.sequenceontology.org/browser/current_svn/term/SO:0001587) |
| stop_lost | [SO:0001578](http://www.sequenceontology.org/browser/current_svn/term/SO:0001578) |
| stop_retained_variant | [SO:0001567](http://www.sequenceontology.org/browser/current_svn/term/SO:0001567) 
| inframe_variant | [SO:0001650](http://www.sequenceontology.org/browser/current_svn/term/SO:0001650)
| coding_sequence_variant | [SO:0001580](http://www.sequenceontology.org/browser/current_svn/term/SO:0001580) |
| missense_variant | [SO:0001583](http://www.sequenceontology.org/browser/current_svn/term/SO:0001583) |
| exon_variant | [SO:0001791](http://www.sequenceontology.org/browser/current_svn/term/SO:0001791) |
| intron_variant | [SO:0001627](http://www.sequenceontology.org/browser/current_svn/term/SO:0001627) |
| gene_variant | [SO:0001564](http://www.sequenceontology.org/browser/current_svn/term/SO:0001564) |
| intergenic_variant | [SO:0001628](http://www.sequenceontology.org/browser/current_svn/term/SO:0001628) |
| sequence_variant | [SO:0001060](http://www.sequenceontology.org/browser/current_svn/term/SO:0001060) |
| splice_region_variant | [SO:0001630](http://www.sequenceontology.org/browser/current_svn/term/SO:0001630) |
| splice_acceptor_variant | [SO:0001574](http://www.sequenceontology.org/browser/current_svn/term/SO:0001574) |
| splice_donor_variant | [SO:0001575](http://www.sequenceontology.org/browser/current_svn/term/SO:0001575) |
| transcript_variant | [SO:0001576](http://www.sequenceontology.org/browser/current_svn/term/SO:0001576) |


ancillaryAminoAcidChangeType List
---------------------------------

In cases where additional or clarifying terms are needed a child of [sequence_variant](http://www.sequenceontology.org/browser/current_svn/term/SO:0001060) may be used and if a term is need it can be submitted for review via the sequence ontology [request a term]( http://sourceforge.net/p/song/term-tracker/).


Example
-------

**exclusiveAminoAcidChangeType:** (carnality of 1)

* Annotations done using the exclusiveAminoAcidChangeType attribute are restricted to one of the following terms provided.  Any term used outside this list would be considered invalid for this attribute.

{:.table}
| Type | SO Name | Code[ID] | 
|----------------|----------------|
| `exclusiveAminoAcidChangeType` | `stop_gained` | [SO:0001587](http://www.sequenceontology.org/browser/current_svn/term/SO:0001587) |

**ancillaryAminoAcidChangeType:** (carnality of 0..*)

* This attribute allows for a couple of possibilities.  
1. First to allow additional detail in describing the resulting effect a given variant has.
2. Second, it allows the uses of terms that may better describe the feature of intrest, not offered in the exclusive list.

_The first possibility:_

{:.table}
| Type | SO Name | Code[ID] | 
|----------------|----------------|
| `exclusiveRegionType` | `frameshift_variant` | [SO:0001589](http://www.sequenceontology.org/browser/current_svn/term/SO:0001589) |
| `ancillaryRegionType` | `frameshift_elongation` | [SO:0000202](http://www.sequenceontology.org/browser/current_svn/term/SO:0000202) |

This method offers two levels of annotated detail.  The exclusiveRegionType term enables higher-level grouping, and the ancillaryRegionType offers additional specifics on the nature of the variant. 

_The second possibility:_

{:.table}
| Type | SO Name | Code[ID] | 
|----------------|----------------|
| `ancillaryRegionType` | `non_coding_transcript_variant` | [SO:SO:0001619](http://www.sequenceontology.org/browser/current_svn/term/SO:0001619) |


