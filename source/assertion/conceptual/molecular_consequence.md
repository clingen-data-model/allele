---
title: Molecular Consequence
layout: conceptual
model: assertion
description: 
---


ACMG Variant Pathogenicity Guidelines
-------------------------------------
* [PVS1]
* [PS1]
* [PM4]
* [BP7]
* [BP1]
* [PP2]
* [PM5]
* [BP3]

Scope and Usage
---------------

Molecular consequence combines PrimaryAminoAcidChange and PrimaryTranscriptRegionType into a single value for the molecular consequence of a TranscriptContextualAllele.  If the allele is in a coding region, then the PrimaryAminoAcidChange is used, and if it is not, then the PrimaryTranscriptRegionType is used.   In addition, an allele can be stated to cause a loss of function.  This allows, for instance, a stop-gain allele in the final codon of a CDS to be marked as not causing LOF.

Attributes
----------
    TranscriptContextualAllele
    consequence: MolecularConsequenceType
    lossOfFunction: (yes, no, maybe?)
    explanation: string

Examples
--------
