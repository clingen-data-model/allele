---
title: ancillary-nucleotide-change-type
description: This value set includes only the types associated with nucleotide allele instances.
source: Sequence Ontology
id: 23
usage: core
layout: model
model: allele

---

Scope and Usage
---------------

ancillaryNucleotideChangeType allows the use of an ancillary type which can be used to clarify and add depth to the [primary](primary_nucleotide_change_type.html) type observed.  This type also allows a single annotation using a term not included in the primary list.


ancillaryNucleotideChangeType:
------------------------

Currently constraint to be a child of [sequence_alteration](http://www.sequenceontology.org/browser/current_svn/term/SO:0001059) within the Sequence Ontology.  Accurate annotation of ancillary-nucleotide-change-type will not contain terms found in primary-nucleotide-change-type.


Examples:
---------

**ancillaryNucleotideChangeType:** (cardinality of 0..*)

* This attribute allows for a couple of possibilities.  
1. First to allow additional detail in describing the location of the feature related to the variant.
2. Second, it allows the uses of terms that may better describe the feature of intrest, not offered in the primary list.

###_The first case:_

{:.table}
| Type | Display Name | Code | 
|----------------|----------------|
| `primaryNucleotideChangeType` | `deletion` | [SO:0000159](http://www.sequenceontology.org/browser/current_svn/term/SO:0000159) |
| `ancillaryNucleotideChangeType` | `inversion` | [SO:1000036](http://www.sequenceontology.org/browser/current_svn/term/SO:1000036) |


{:.table}
| Type | Display Name | Code | 
|----------------|----------------|
| `primaryNucleotideChangeType` | `substitution` | [SO:1000002](http://www.sequenceontology.org/browser/current_svn/term/SO:1000002) |
| `ancillaryNucleotideChangeType` | `MNV` | [SO:0002007](http://www.sequenceontology.org/browser/current_svn/term/SO:0002007) |

This method offers two levels of annotated detail. The primaryNucleotideChangeType term enables higher-level grouping, and the ancillaryNucleotideChangeType offers additional specifics on the nature of the variant.

###_The second case:_

{:.table} 
| Type | Display Name | Code | 
|----------------|----------------| 
| `ancillaryNucleotideChangeType` | `deficient_intrachromosomal_transposition` | [SO:0000062](http://www.sequenceontology.org/browser/current_svn/term/SO:0000062) |


Exclusions and Limitations
--------------------------

Additional terms can be submitted for review via the sequence ontology [request a term]( http://sourceforge.net/p/song/term-tracker/)
