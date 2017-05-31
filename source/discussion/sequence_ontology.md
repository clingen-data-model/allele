---
title: Sequence Ontology
description: The Sequence Ontology is a set of terms and relationships used to describe the features and attributes of biological sequence.
layout: model
model: allele

---

The [Sequence Ontology](http://www.sequenceontology.org/index.html) (SO) is an ontology used to describe biological sequences through the use of standardized vocabulary and internodal relationships.  In addition to the power of controlled terms, SO offers grouping at multiple levels, enriching the ability to preform logic and algorithm based operations across large groups of features, types, and effects.  Furthermore, adding SO as a core requirement will allow us to avoid the semantics of natural language, and the imperfection of free-text description.

###The Data Model's use of SO.

For the ClinGen Data Model (DM) we have attempted to use SO terms whenever possible to describe many aspect of our model including: sequences, features, alterations, amino acids, and amino acid changes.

Our [ValueSets](/implementation/value_set_list) relating to sequence annotation allows knowledge to be captured on two levels: *Primary* and *Ancillary* types.  Primary types allow the highest level of description while Ancillary types include the ability to add necessary biological meaning and record [variant effects](/implementation/value_set_list/ancillary_amino_acid_change_type.html) if desired.

### Ontologies use for term definitions.
Additionally, we use SO and [The Relations Ontology (RO)](http://www.obofoundry.org/cgi-bin/detail.cgi?id=ro) terms when available to standardized other aspects of the model including [reference-types](/implementation/value_set_list/reference_sequence_type.html) and [inter-model relationships](/implementation/value_set_list/contextual_allele_relationship_type.html).
