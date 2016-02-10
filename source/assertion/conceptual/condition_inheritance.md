---
title: ConditionInheritance
layout: conceptual
model: assertion
description: Captures the mode of interitance of a condition, possibly when modulated by a gene or allele.

---

ACMG Variant Pathogenicity Guidelines
-------------------------------------

* [PM2]
* [PM3]
* [PP1]
* [BS1]
* [BS2]
* [BS4]
* [BP2]

Scope and Usage
---------------

Hereditary conditions are passed through generations with different modes of inheritance.  Examples include autosomal dominant or recessive, and various forms of sex-linked inheritance.

The ConditionInheritance element makes an unambiguous statement about the inheritance mode of a condition.    This is only possible if the condition has an unambiguous mode of inheritance, either because it is monogenic, or if the inheritance mode is part of the definition of the condition.  If, however, the condition has multiple inheritance modes, it is possible to specify a gene or allele that narrows down the condition to a single mode of inheritance.

 
Attributes
----------
	Condition: 
	Gene: 
	Allele: Canonical Allele
	Mode of Inheritance: HPO Term

Examples
----------------

1. Huntington disease is autosomal dominant.  In OMIM, Huntington disease is a monogenic disease associated with the gene HTT. Because it is part of the definition of the condition, the gene is no specified here.

		Condition: Huntington Disease (OMIM 143100)
		Gene: HTT ?
		Mode of Inhertiance: HPO.AutosomalDominance

2. Megalencephaly is an orphanet term (ORPHA2477), which maps to two OMIM numbers with different modes of inheritance.   This element expresses the statement that Megalencephaly is autosomal recessive when it is associated with the gene TBC1D7.

		Condition: Megalencephaly (ORPHA2477)
		Gene: TBC1D7
		Mode of Inheritance: HPO.AutosomalRecessive

3. Autosomal dominant Emery-Dreifuss muscular dystrophy (EDMD2) is an orphanet term (ORPHA98853) that maps to multiple monogenic OMIM conditions with different genes, but all inherited in an autosomal dominant fashion.  The mode of inheritance is part of the definition of this condition, so even though the condition is not monogenic, no gene is required to specify the mode of inheritance.

		Condition: EDMD2 (ORPHA98853)
		Mode of Inhertiance: HPO.AutosomalDominant

4. Spinocerebellar ataxia comes in many types and can be due to multiple genes.  One gene, SPTBN2 can produce both autosomal dominant and autosomal recessive forms, depending on the particular allele.  These have two different OMIM numbers, 600224 and 615386.  The two OMIM numbers map to orphanet numbers, which can b grouped together under "Spinocerebellar ataxia with oculomotor anomaly" (ORPHA98693).  Two ConditionInheritance elements could exist:

		Condition: Spinocerebellar ataxia with oculomotor anomaly (ORPHA98693). 
		Gene: SPTBN2
		Allele: SPTBN2:C627X
		Mode of Inheritance: HPO.AutosomalDominant

		Condition: Spinocerebellar ataxia with oculomotor anomaly (ORPHA98693). 
		Gene: SPTBN2
		Allele: SPTBN2:R480W
		Mode of Inheritance: HPO.AutosomalRecessive

