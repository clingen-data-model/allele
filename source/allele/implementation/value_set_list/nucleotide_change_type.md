---
title: nucleotide-change-type
description: This value set includes only the types associated with simple nucleotide alleles.
source: Sequence Ontology
id: TBD
usage: core
---

Scope and Usage
---------------

A controlled vocabulary term used to describe observed nucleotide alteration, including the characterization of no_sequence_alteration.  Currently constraint to be a child of [sequence_position]() within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools as [VAT](http://www.yandell-lab.org/software/vaast.html), [SnpEff](http://snpeff.sourceforge.net/) or [ANNOVAR](http://www.openbioinformatics.org/annovar/).

We have curated a list of primary Sequence Ontology terms to be used when annotating nucleotideChangeType.  Use of this list allow grouping of sequence alterations at a higher level, enriching the ability to preform logic and algorithm based operation across larger groups of sequence types.

Each of the ValueSets dealing with [CodeableConcepts](http://www.hl7.org/implement/standards/fhir/datatypes.html#CodeableConcept) are separated into two sections that focus on different levels of detail, demonstrated in the below examples.


primary-nucleotide-change-type list
--------------

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


Examples
--------

**primaryNucleotideChangeType:** (cardinality of 1)

* Annotations done using the primaryNucleotideChangeType attribute are restricted to one of the following terms provided.  Any term used outside this list would be considered invalid for this attribute.

{:.table}
| Type | SO Name | Code[ID] | 
|----------------|----------------|
| `primaryNucleotideChangeType` | `deletion` | [SO:0000159](http://www.sequenceontology.org/browser/current_svn/term/SO:0000159) |




