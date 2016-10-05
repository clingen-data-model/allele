---
title: primary-amino-acid-change-type
description: This value set includes only the types associated with amino acid allele instances.
source: Sequence Ontology
id: 24
usage: core
layout: model
model: allele

---

Scope and Usage
---------------

This value set can be used in conjunction with the [ancillary-amino-acid-change-type](ancillary_amino_acid_change_type.html), which can provide optional detail associated to the PrimaryAminoAcidChangeType.

PrimaryAminoAcidChangeType:
----------------------------------

Annotations done using the primaryAminoAcidChangeType attribute are restricted to one of the following terms provided.  Any term used outside this list would be considered invalid for this attribute.

{:.table}
| Code | Display Name |
|----------------|----------------|
[SO:0001819](http://www.sequenceontology.org/browser/current_svn/term/SO:0001819) | synonymous_variant
[SO:0001587](http://www.sequenceontology.org/browser/current_svn/term/SO:0001587) | stop_gained |
[SO:0001578](http://www.sequenceontology.org/browser/current_svn/term/SO:0001578) | stop_lost |
[SO:0002012](http://www.sequenceontology.org/browser/current_svn/term/SO:0002012) | start_lost |
[SO:0001583](http://www.sequenceontology.org/browser/current_svn/term/SO:0001583) | missense_variant |
[SO:0001589](http://www.sequenceontology.org/miso/current_svn/term/SO:0001589)    | frameshift_variant |
[SO:0001823](http://www.sequenceontology.org/browser/current_svn/term/SO:0001823) | conservative_inframe_insertion |
[SO:0001824](http://www.sequenceontology.org/browser/current_svn/term/SO:0001824) | disruptive_inframe_insertion |
[SO:0001825](http://www.sequenceontology.org/browser/current_svn/term/SO:0001825) | conservative_inframe_deletion |
[SO:0001826](http://www.sequenceontology.org/browser/current_svn/term/SO:0001826) | disruptive_inframe_deletion |

Example
-------

**PrimaryAminoAcidChangeType:** (cardinality of 1)

{:.table}
| Type | Display Name | Code |
|----------------|----------------|
| `primaryAminoAcidChangeType` | `stop_gained` | [SO:0001587](http://www.sequenceontology.org/browser/current_svn/term/SO:0001587) |


