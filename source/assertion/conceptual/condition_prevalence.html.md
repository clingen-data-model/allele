---
title: ConditionPrevalence
layout: conceptual
model: assertion
description: Captures the prevalence of a condition, possibly when modulated by a gene or allele.

---

ACMG Variant Pathogenicity Guidelines
-------------------------------------

* [PS4]
* [PM2]
* [BS1]

Scope and Usage
---------------

Prevalence indicates the rate of occurrence of a particular condition in a particular population.

Gene or Allele may be specified to further limit the condition.  If used, the prevalence value indicates the fraction of people in the given population that have the condition due to the gene or allele; the gene or the allele simply further specifies the condition.   It is not the fraction of people with the condition that have it due to the given gene or allele.  In other words, the denominator is still the full population, not the fraction that has the condition.  Note that in the case of an allele-specific prevalence, the prevalence is not the population frequency of the allele unless the condition is fully penetrant.
 
Attributes
----------
	Condition: 
	Gene:  Gene
	Allele: Canonical Allele
	Population: Population
	PrevalenceLowerBound: float
	EstimatedPrevalence: float
	PrevalenceUpperBound: float

Examples
----------------

1. Ehlers-Danlos Syndrome with Progressive Kyphoscoliosis, Myopathy, and Hearing Loss (EDSKMH), (OMIM 614557) is a rare monogenic condition.  Prevalence does not have a measurable lower bound, and the upper bound is not known to be population dependent.

		Condition: EDSKMH (OMIM 614557)
		UpperBound: 1e-6

2. Tay-Sachs disease is an autosomal recessive disease that has a low prevalence in the overall US population, but has an increased prevalence in several populations (Ashkenazi Jews and Cajuns).

		Condition: Tay-Sachs (ORPHA845)
		Population: UnitedStates
		EstimatedPrevalence: 1/320,000
		
		Condition: Tay-Sachs (ORPHA845)
		Population: Ashkenazi Jewish
		EstimatedPrevalence: 1/3500

3. Need example: prevalence modulated by gene, allele (allele might be tough, gene should be doable?)


