---
title: primary-amino-acid-change-type
description: This value set includes only the types associated with simple amino acid alleles.
source: Sequence Ontology
id: TBD
usage: core
---

Scope and Usage
---------------

We have curated a list of primary Sequence Ontology terms to be used when annotating PrimaryAminoAcidChangeType.  This list is specifically developed to describe SimpleAminoAcidAllele observations.  Use of this list allow grouping of amino acid changes at a higher level, enriching the ability to preform logic and algorithm based operation across larger groups of amino acid change types.

This value set can be used in conjunction with the [ancillary-amino-acid-change-type](ancillary_amino_acid_change_type.html), which can provide optional detail associated to the PrimaryAminoAcidChangeType.

PrimaryAminoAcidChangeType:
----------------------------------

Annotations done using the primaryAminoAcidChangeType attribute are restricted to one of the following terms provided.  Any term used outside this list would be considered invalid for this attribute.

{:.table}
| SO Name | Code[SO] | 
|----------------|----------------|
| synonymous_variant | [SO:0001819](http://www.sequenceontology.org/browser/current_svn/term/SO:0001819) 
| stop_gained | [SO:0001587](http://www.sequenceontology.org/browser/current_svn/term/SO:0001587) |
| stop_lost | [SO:0001578](http://www.sequenceontology.org/browser/current_svn/term/SO:0001578) |
| start_lost | [SO:0002012](http://www.sequenceontology.org/browser/current_svn/term/SO:0002012) |
| missense_variant | [SO:0001583](http://www.sequenceontology.org/browser/current_svn/term/SO:0001583) |
| frameshift_truncation | [SO:0001910](http://www.sequenceontology.org/browser/current_svn/term/SO:0001910) |
| frameshift_elongation | [SO:0001909](http://www.sequenceontology.org/browser/current_svn/term/SO:0001909) |
| conservative_inframe_insertion | [SO:0001823](http://www.sequenceontology.org/browser/current_svn/term/SO:0001823) |
| disruptive_inframe_insertion | [SO:0001824](http://www.sequenceontology.org/browser/current_svn/term/SO:0001824) |
| conservative_inframe_deletion | [SO:0001825](http://www.sequenceontology.org/browser/current_svn/term/SO:0001825) |
| disruptive_inframe_deletion | [SO:0001826](http://www.sequenceontology.org/browser/current_svn/term/SO:0001826) |

Example
-------

**PrimaryAminoAcidChangeType:** (cardinality of 1)

{:.table}
| Type | SO Name | Code[SO] | 
|----------------|----------------|
| `primaryAminoAcidChangeType` | `stop_gained` | [SO:0001587](http://www.sequenceontology.org/browser/current_svn/term/SO:0001587) |


