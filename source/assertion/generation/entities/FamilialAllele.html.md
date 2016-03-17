---
title: Familial Allele
layout: conceptual
model: assertion
description: 
---


ACMG Variant Pathogenicity Guidelines
-------------------------------------
* [PS2]
* [PM6]
* [BS4]
* [PP1]

Scope and Usage
---------------

Attributes
----------
    count: int(0,1,2),Optional
    Allele: CanonicalAllele,Required
    parent: ControlledTerm(confirmed paternal, unconfirmed paternal, confirmed maternal, unconfirmed maternal),Required
    tested: boolean,Required

Examples
--------
