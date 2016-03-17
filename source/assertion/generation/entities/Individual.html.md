---
title: Individual
layout: conceptual
model: assertion
description: 
---


ACMG Variant Pathogenicity Guidelines
-------------------------------------
* [BS2]

Scope and Usage
---------------

Attributes
----------
    caseFor: Condition,0..N
    hasAllele: CanonicalAllele,0..N
    hasFamilyHistory: Condition,0..N
    doesNotHaveAllele: CanonicalAllele,0..N
    familialAllele: Familal Allele,0..N
    phase: phasedAllele,0..N
    hasNoFamilyHistory: Condition,0..N
    controlFor: Condition,0.N
    healthyControl: boolean,Optional
    ID: ID,Required

Examples
--------
