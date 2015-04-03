---
title: primary-nucleotide-change-type
description: This value set includes only the types associated with simple nucleotide alleles.
source: Sequence Ontology
id: 22
usage: core
---


Scope and Usage
---------------

We have curated a list of primary Sequence Ontology terms to be used when annotating PrimaryNucleotideChangeType.  This list is specifically developed to describe SimpleAllele nucleotide observations.  Use of this list allow grouping of sequence alterations at a higher level, enriching the ability to preform logic and algorithm based operation across larger groups of sequence types.

This value set can be used in conjunction with the [ancillary-nucleotide-change-type](ancillary_nucleotide_change_type.html), which can provide optional detail associated to the PrimaryNucleotideChangeType.


PrimaryNucleotideChangeType:
---------------------------

Annotations done using the primaryNucleotideChangeType attribute are restricted to one of the following terms provided.  Any term used outside this list would be considered invalid for this attribute.

{:.table}
| SO Name | Code[SO] | 
|----------------|----------------|
| deletion | [SO:0000159](http://www.sequenceontology.org/browser/current_svn/term/SO:0000159) |
| insertion | [SO:0000667](http://www.sequenceontology.org/browser/current_svn/term/SO:0000667) |
| inversion | [SO:1000036](http://www.sequenceontology.org/browser/current_svn/term/SO:1000036) |
| translocation | [SO:0000199](http://www.sequenceontology.org/browser/current_svn/term/SO:0000199) |
| indel | [SO:1000032](http://www.sequenceontology.org/browser/current_svn/term/SO:1000032) |
| copy_number_variation | [SO:0001019](http://www.sequenceontology.org/browser/current_svn/term/SO:0001019) |
| substitution | [SO:1000002](http://www.sequenceontology.org/browser/current_svn/term/SO:1000002) |
| no_sequence_alteration | [SO:000000]() |


Examples:
--------

**primaryNucleotideChangeType:** (cardinality of 1)

{:.table}
| Type | SO Name | Code[SO] | 
|----------------|----------------|
| `primaryNucleotideChangeType` | `deletion` | [SO:0000159](http://www.sequenceontology.org/browser/current_svn/term/SO:0000159) |

{:.table}
| Type | SO Name | Code[SO] | 
|----------------|----------------|
| `primaryNucleotideChangeType` | `no_sequence_alteration` | [SO:000000]() |


