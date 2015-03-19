---
title: primary-amino-acid-change-type
description: This value set includes only the types associated with simple amino acid alleles.
source: Sequence Ontology
id: TBD
usage: core
---

Scope and Usage
---------------

A controlled vocabulary term used to describe the resulting effect a nucleotideChangeType can have at the amino acid level.  Currently constraint to be a child of [sequence_variant](http://www.sequenceontology.org/browser/current_svn/term/SO:0001060) within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools such as [VAT](http://www.yandell-lab.org/software/vaast.html), [SnpEff](http://snpeff.sourceforge.net/) or [ANNOVAR](http://www.openbioinformatics.org/annovar/).

We have curated a list of Sequence Ontology terms to be used when annotating SimpleAllele aminoAcidChangeType.  Use of this list allows grouping of change types at a higher level, enriching the ability to preform logic and algorithm based operation across larger groups of amino acid change types.

This value set can be used in conjunction with the [ancillary-amino-acid-change-type](ancillary_amino_acid_change_type.html), which can provide optional detail associated to the primary-amino-acid-change-type.

primary-amino-acid-change-type
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
| regulatory_region_variant | [SO:0001566](http://www.sequenceontology.org/browser/current_svn/term/SO:0001566) |
| amino_acid_substitution | [SO:0001606](http://www.sequenceontology.org/browser/current_svn/term/SO:0001606) |


Example
-------

**AminoAcidChangeType:** (cardinality of 1)

* Annotations done using the aminoAcidChangeType attribute are restricted to one of the following terms provided.  Any term used outside this list would be considered invalid for this attribute.

{:.table}
| Type | SO Name | Code[ID] | 
|----------------|----------------|
| `primaryAminoAcidChangeType` | `stop_gained` | [SO:0001587](http://www.sequenceontology.org/browser/current_svn/term/SO:0001587) |


