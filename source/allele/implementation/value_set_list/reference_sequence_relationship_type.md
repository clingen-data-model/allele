---
title: reference-sequence-relationship-type
description: The relationship classification between an amino acid and transcript references.
source: Internal/RO
id: 6
usage: core
layout: model
model: allele
---

This is a value set defined by the ClinGen Data Modeling WG (Allele Domain) using known RO terms.

__Summary__

{:.table-condensed}
| Code System URL:| http://clingen.org/model/allele/reference-sequence-relationship-type |
| Value Set URL:| http://clingen.org/model/allele/vs/reference-sequence-relationship-type |
| Definition: | Relationships used for reference-sequence-relationship-type|


Formal value Set definition: [XML]() or [JSON]().

The value set contains 2 concepts

##ReferenceSequenceRelationshipType

Type relationship between a TranscriptReferenceSequence and a AminoAcidReferenceSequence.

{:.table .table-bordered .table-condensed}
| Code | Display |Definition|
| [RO:0001000](http://www.obobrowser.org/browser/public_ro/term/RO:0001000) | `derives_from` | `amino_acid` reference with one or more known transcript references |
| [RO:0001001](http://www.obobrowser.org/browser/public_ro/term/RO:0001001) | `derives_into` | A `transcript` reference with one known amino_acid reference |

