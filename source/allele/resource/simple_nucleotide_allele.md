---
title: SimpleNucleotideAllele
description: Resource
---

Scope and Usage
--------------------

Currently the [Sequence Ontology](http://www.sequenceontology.org/) is used as the preferred standard to define our [ValueSet](http://www.hl7.org/implement/standards/fhir/valueset.html) and [CodeableConcepts](http://www.hl7.org/implement/standards/fhir/datatypes.html#CodeableConcept), although any formal ontology which describes biological sequence annotations can fulfill these conditions.

Below is examples of usage based on the [FHIR specification](http://hl7.org/implement/standards/fhir/).

### Resource(ValueSet)

    <ValueSet xmlns="http://hl7.org/fhir">
        <identifier value="SO:?"/>
        <version value="2.5.2"/>
        <name value="child of allele_position."/>
        <publisher value="Sequence Ontology"/>
        <telecom>
            <system value="url"/>
            <value value="http://www.sequenceontology.org/about/contacts.html"/>
        </telecom>
        <status value="active"/>
        <description value="To facilitate the need to describe biological concepts in a concise controlled manner.  Designated to be a child of allele_position."/>
        <define.version value ="http://www.sequenceontology.org"/>
    </ValueSet>


### CodeableConcept

    <changeType>
        <coding>
            <code value="S0:1000002"/>
            <display value="substitution"/>
        </coding>
        <text value="A sequence alteration where the length of the change in the variant is the same as that of the reference."/>
    </changeType>
