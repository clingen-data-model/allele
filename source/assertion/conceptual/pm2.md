---
title: ACMG2015-PM2
layout: conceptual
model: assertion
description: Absent from controls.
criteria set: ACMG2015
indication: Pathogenic
strength: Moderate

---

Data Elements
-------------

* [Population Frequency]
* [Condition Inheritance]

Rule Statement
--------------

PM2: Absent from conrols (or at extremely low frequency if recessie) in Exome Sequencing Project, 1000 Genomes Project or Exome Aggregation Consortium.

Scope and Usage
---------------

Absence of a variant from a large control population offers only moderate evidence of pathogenicity, since many rare or private variants are benign.  Furthermore, it is possible for a recessive disease allele to be present at a low level in a control population.  The exact cutoff frequency value for recessive conditions is up to implementors, and may be condition specific.  
 
Examples
----------------

1. Allele is absent from 1000 genomes, providing moderate evidence of pathogenicity.  The inheritance (and even the condition) need not be specified.

RuleApplication
 Criterion: ACMG2015-PM2
 Evidence: PopFreq1
/RuleApplication

PopFreq
 ID: PopFreq1
 Allele: 
 Pop:
 Frequency: 0.0
/PopFreq

2. Allele is not absent from 1000 genomes, and has a frequency that is high enough that the mode of inheritance is irrelevant - this node does not give moderate evidence of pathogenicity.

RuleApplication
 Criterion: ACMG2015-PM2
 Evidence: PopFreq1
/RuleApplication

PopFreq
 ID: PopFreq1
 Allele: 
 Pop:
 Frequency: 0.3
/PopFreq

3. Allele is not absent from 1000 genomes, but the frequency is very low.  This provides moderate evidence of pathogenicity for a condition that has a recessive mode of inheritance.

RuleApplication
 Criterion: ACMG2015-PM2
 Evidence: PopFreq2, DI1
/RuleApplication

PopFreq
 ID: PopFreq2
 Allele: 
 Pop:
 Frequency: 0.0001
/PopFreq

DiseaseInheritance
  ID: DI1
  Condition: Cond1
  ModeOfInheritance: HPO.Recessive
/DiseaseInheritance

