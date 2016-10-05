---
title: primary-nucleotide-change-type
description: This value set includes only the types associated with nucleotide allele instances.
source: Sequence Ontology
id: 22
usage: core
layout: model
model: allele

---


Scope and Usage
---------------

This value set can be used in conjunction with the [ancillary-nucleotide-change-type](ancillary_nucleotide_change_type.html), which can provide optional detail associated to the PrimaryNucleotideChangeType.


PrimaryNucleotideChangeType:
---------------------------

Annotations done using the primaryNucleotideChangeType attribute are restricted to one of the following terms provided.  Any term used outside this list would be considered invalid for this attribute.

{:.table}
| Code | Display Name |
|----------------|----------------|
[SO:0000159](http://www.sequenceontology.org/browser/current_svn/term/SO:0000159) | deletion|
[SO:0000667](http://www.sequenceontology.org/browser/current_svn/term/SO:0000667) | insertion |
[SO:1000036](http://www.sequenceontology.org/browser/current_svn/term/SO:1000036) | inversion |
[SO:0000199](http://www.sequenceontology.org/browser/current_svn/term/SO:0000199) | translocation |
[SO:1000032](http://www.sequenceontology.org/browser/current_svn/term/SO:1000032) | indel |
[SO:0001019](http://www.sequenceontology.org/browser/current_svn/term/SO:0001019) | copy_number_variation |
[SO:1000002](http://www.sequenceontology.org/browser/current_svn/term/SO:1000002) | substitution |
[SO:000000]() | no_sequence_alteration |


Examples:
--------

**primaryNucleotideChangeType:** (cardinality of 1)

{:.table}
| Type | Display Name | Code | 
|----------------|----------------|
| `primaryNucleotideChangeType`| `substitution` | [SO:1000002](http://www.sequenceontology.org/browser/current_svn/term/SO:1000002) |

{:.table}
| Type | Display Name | Code | 
|----------------|----------------|
| `primaryNucleotideChangeType` | `no_sequence_alteration` | [SO:000000]() |


