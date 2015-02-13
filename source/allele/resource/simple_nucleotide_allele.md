---
title: SimpleNucleotideAllele
description: Resources
---

Definition
--------------------

A controlled vocabulary term used to describe observed nucleotide alteration, including the characterization of no_alteration.  These values can be experimentally discovered or derived with annotation tools such as [SnpEff](http://snpeff.sourceforge.net/) or [VAAST](http://www.yandell-lab.org/software/vaast.html).


# *changeType:*

Scope and Usage
--------------------

When describing observations a concise and interoperable method is required to reduce ambiguity as well as clarify the semantics of nature language and biological meaning. The use of a formal, stable ontological structure allows highly detailed descriptions as well as a logically ordered interrelationship between concepts.

Currently the [Sequence Ontology](http://www.sequenceontology.org/) is used as the preferred standard to define our [ValueSet](http://www.hl7.org/implement/standards/fhir/valueset.html) and [CodeableConcepts](http://www.hl7.org/implement/standards/fhir/datatypes.html#CodeableConcept), although any formal ontology which describes biological sequence annotations can fulfill these conditions.

Below is examples of usage based on the [FHIR specification](http://hl7.org/implement/standards/fhir/).

### *Resource(ValueSet)*

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



### *CodeableConcept*

    <changeType>
        <coding>
            <code value="S0:?"/>
            <display value="alelle_position"/>
        </coding>
        <text value="A sequence alteration where the length of the change in the variant is the same as that of the reference."/>
    </changeType>



