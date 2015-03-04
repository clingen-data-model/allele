---
title: nucleotideChangeType
description: ValueSets for SimpleNucleotideAllele
---

Scope and Usage
---------------

A controlled vocabulary term used to describe observed nucleotide alteration, including the characterization of no_sequence_alteration.  Currently constraint to be a child of [sequence_position]() within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools as [VAT](http://www.yandell-lab.org/software/vaast.html), [SnpEff](http://snpeff.sourceforge.net/) or [ANNOVAR](http://www.openbioinformatics.org/annovar/).

We have curated a list of exclusive Sequence Ontology terms to be used when annotating nucleotideChangeType.  Use of this list allow grouping of sequence alterations at a higher level, enriching the ability to preform logic and algorithm based operation across larger groups of sequence types.

Additionally, we allow the use of an auxiliary type that can be used to clarify the exclusive type observed.  This type also allows a single annotation using a term not included in the exclusive list.

Each of the ValueSets dealing with [CodeableConcepts](http://www.hl7.org/implement/standards/fhir/datatypes.html#CodeableConcept) are separated into two sections that focus on different levels of detail, demonstrated in the below examples.


exclusiveNucleotideChangeType List
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


auxiliaryNucleotideChangeType List
------------------

In cases where additional or clarifying terms are needed a child of [sequence_postion]() may be used and if a term is need it can be submitted for review via the sequence ontology [request a term]( http://sourceforge.net/p/song/term-tracker/).

Examples
--------

**exclusiveNucleotideChangeType:** (carnality of 1)

* Annotations done using the exclusiveNucleotideChangeType attribute are restricted to one of the following terms provided.  Any term used outside this list would be considered invalid for this attribute.

{:.table}
| Type | SO Name | Code[ID] | 
|----------------|----------------|
| `exclusiveNucleotideChangeType` | `deletion` | [SO:0000159](http://www.sequenceontology.org/browser/current_svn/term/SO:0000159) |


**ancillaryNucleotideChangeType:** (carnality of 0..*)

* This attribute allows for a couple of possibilities.  
1. First to allow additional detail in describing an observed sequence alteration.
2. Second, it allows the uses of terms that may better describe the alteration of intrest, not offered in the exclusive list.

_The first possibility:_

{:.table}
| Type | SO Name | Code[ID] | 
|----------------|----------------|
| `exclusiveNucleotideChangeType` | `substitution` | [SO:1000002](http://www.sequenceontology.org/browser/current_svn/term/SO:1000002) |
| `auxiliaryNucleotideChangeType` | `SNP` | [SO:0000694](http://www.sequenceontology.org/browser/current_svn/term/SO:0000694) |

This method offers two levels of annotated detail.  The exclusiveNucleotideChangeType term enables higher-level grouping, and the ancillaryNucleotideChangeType offers additional specifics on the nature of the variant. 

_The second possibility:_

{:.table}
| Type | SO Name | Code[ID] | 
|----------------|----------------|
| `auxiliaryNucleotideChangeType` | `complex_structural_alteration` | [SO:0001784](http://www.sequenceontology.org/browser/current_svn/term/SO:0001784) |




