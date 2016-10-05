---
title: contextual-allele-relationship-type
description: The classification of relationships between two contextual alleles.
source: RO/Internal
id: 3
usage: core
layout: model
model: allele
---

This value set uses codes provided by the Relationship Ontology (RO) which are further defined by the ClinGen Data Modeling WG (Allele Domain).  Definitions use by RO are still valid in relation to our model.

__Summary__

{:.table-condensed}
| Code System URL:| http://clingen.org/model/allele/contextual-allele-relationship-type |
| Value Set URL:| http://clingen.org/model/allele/vs/contextual-allele-relationship-type |
| Definition: | Type Relationships used for ContextualAllele. |


Formal value Set definition: [XML]() or [JSON]().

The value set contains 3 concepts

##ContextualAlleleRelationshipType

Relational classification to catalog two contextual alleles (e.g. nucleotide allele, NM\_007294.3(BRCA1):c.5297T>G "has the protein effect" NP\_009225.1(BRCA1):p.Ile1766Ser).

{:.table .table-bordered .table-condensed}
|Code|Display|Definition|
| [RO:0003001](http://www.obobrowser.org/browser/public_ro/term/RO:0003001) | `produced_by` | Describes the relationship between an AminoAcidContextualAllele  and a NucleotideContextualAllele. |
| [RO:0003000](http://www.obobrowser.org/browser/public_ro/term/RO:0003000) | `produces` | Describes the relationship between a NucleotideContextualAllele and an AminoAcidContextualAllele.|
| [RO:0002514](http://www.obobrowser.org/browser/public_ro/term/RO:0002514) | `sequentially_related_to` | Describes the relationship between two representations of a ContextualAllele. |

