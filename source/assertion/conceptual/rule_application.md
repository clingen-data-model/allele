---
title: RuleApplication
layout: conceptual
model: assertion
description: Models the application of a single rule to a set of data

---


Scope and Usage
---------------

Criteria, such as a single ACMG rule, are tested against a set of data and found to be either satisfied or not.  Each rule that is satisfied provides evidence about some value such as pathogenicity.

The particular set of evidence that must be used will be dependent upon a rule, but all of the evidence will be Entities, since each will have a provenance.
 
Attributes
----------

Really, this would look like the prov bundles that we came up with for BA1, this is just another way to represent that. Obviously we have to decide what is the most clear represtentaiton and make everything fit that.

	Criterion: Criteria (e.g. ACMG2015-PM2)
	Satisfied: boolean
	Evidence: *Entity
	(other stuff about who did the application & when)

Examples
----------------

See pages for ACMG rules for specific examples of use.
