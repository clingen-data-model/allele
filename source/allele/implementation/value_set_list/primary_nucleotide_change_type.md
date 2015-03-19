---
title: primary-nucleotide-change-type
description: This value set includes only the types associated with simple nucleotide alleles.
source: Sequence Ontology
id: TBD
usage: core
---

A controlled vocabulary term used to describe observed nucleotide alteration, including the characterization of no_sequence_alteration.  Currently constraint to be a child of [sequence_alteration](http://www.sequenceontology.org/miso/current_svn/term/SO:0001059) within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools as [VAT](http://www.yandell-lab.org/software/vaast.html), [SnpEff](http://snpeff.sourceforge.net/) or [ANNOVAR](http://www.openbioinformatics.org/annovar/).

Scope and Usage
---------------

We have curated a list of primary Sequence Ontology terms to be used when annotating nucleotideChangeType.  Use of this list allow grouping of sequence alterations at a higher level, enriching the ability to preform logic and algorithm based operation across larger groups of sequence types.

This value set can be used in conjunction with the [ancillary-nucleotide-change-type](ancillary_nucleotide_change_type.html), which can provide optional detail associated to the primary-nucleotide-change-type.


primary-nucleotide-change-type list
--------------

Using the fhir specification our list of [CodeableConcepts](http://www.hl7.org/implement/standards/fhir/datatypes.html#CodeableConcept) ValueSets:


{:.table}
| SO Name | SO ID | 
|----------------|----------------|
| deletion | [SO:0000159](http://www.sequenceontology.org/browser/current_svn/term/SO:0000159) |
| insertion | [SO:0000667](http://www.sequenceontology.org/browser/current_svn/term/SO:0000667) |
| inversion | [SO:1000036](http://www.sequenceontology.org/browser/current_svn/term/SO:1000036) |
| structural_alteration | [SO:0001785](http://www.sequenceontology.org/browser/current_svn/term/SO:0001785) |
| translocation | [SO:0000199](http://www.sequenceontology.org/browser/current_svn/term/SO:0000199) |
| indel | [SO:1000032](http://www.sequenceontology.org/browser/current_svn/term/SO:1000032) |
| copy_number_variation | [SO:0001019](http://www.sequenceontology.org/browser/current_svn/term/SO:0001019) |
| substitution | [SO:1000002](http://www.sequenceontology.org/browser/current_svn/term/SO:1000002) |
| no_sequence_alteration | [SO:000000]() |


Examples:
--------

**primaryNucleotideChangeType:** (cardinality of 1)

* Annotations done using the primaryNucleotideChangeType attribute are restricted to one of the following terms provided.  Any term used outside this list would be considered invalid for this attribute.

{:.table}
| Type | SO Name | Code[SO] | 
|----------------|----------------|
| `primaryNucleotideChangeType` | `deletion` | [SO:0000159](http://www.sequenceontology.org/browser/current_svn/term/SO:0000159) |

{:.table}
| Type | SO Name | Code[SO] | 
|----------------|----------------|
| `primaryNucleotideChangeType` | `no_sequence_alteration` | [SO:000000]() |


