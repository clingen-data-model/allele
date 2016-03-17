---
title: ConditionPenetrance
layout: conceptual
model: assertion
description: Penetrance is the degree to which pathogenic alleles cause a condition.

---

ACMG Variant Pathogenicity Guidelines
-------------------------------------

* [PS4]
* [PM2]
* [BS1]

Scope and Usage
---------------

The penetrance of a pathogenic allele is the ratio of people with that condition who have the allele to the total number of people with the allele.  The concept of penetrance reflects the fact that not every person with a pathogenic allele will have the corresponding condition.

While the concept of penetrance is clearly defined, practical difficulties arise in collecting the data necessary to calculate it.  For this reason, penetrance is usually defined as either "Complete", meaning that having a pathogenic variant will always lead to the condition, or "Incomplete", meaning that some fraction of people with the allele will not acquire the condition.   

In addition, penetrance may be complete, but only as patients age.  In this case, even though somebody with the allele will eventually have the condition, there will be patients that have the allele that have not yet acquired the condition.  Penetrance of this kind is called "Age-dependent" and is distinct from "Complete" and "Incomplete."

Penetrance should be defined at an allele level.  However, insufficient statistics, plus the observation that monogenic conditions tend to favor complete or incomplete penetrance mean that it is practially defined at the condition level.  The ConditionPenetrance allows for both Condition and Condition/Allele penetrance to be defined.
 
Attributes
----------
	Condition: 
	Allele: Canonical Allele
	Gene: 
	Penetrance: (Complete,Incomplete,Age-Dependent)

Examples
----------------

1. Variant alleles in BRCA1 are associated with hereditary breast cancer, but are incompletely penetrant.

		Condition: Hereditary Breast and ovarian cancer syndrome (Orpha145)
		Gene: BRCA1
		Penetrance: Incomplete

2. Heritable retinoblastoma is caused by changes to the RB1 gene.  Many (but not all) loss of function alleles show complete penetrance, while some in-frame or missense alleles can have incomplete penetrance.

		Condition: Hereditary Retinoblastoma (ORPHA35707)
		Allele:...
		Penetrance: Complete
		
		Condition: Hereditary Retinoblastoma (ORPHA35707)
		Allele:...
		Penetrance: Incomplete
