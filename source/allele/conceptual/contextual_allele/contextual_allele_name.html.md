---
title: ContextualAlleleName
layout: conceptual
model: allele
description: A human readable, non-canonical name for a ContextualAllele.

---

Scope and Usage
---------------

Canonicalization produces a stable identifier for an allele, but historically many identifiers have been used for alleles, such as dbSNP identifiers (with allele) or HGVS expressions. AlleleName provides a way to attach these types of names to an allele.

For display purposes, one AlleleName may be designated as preferred by an implementing system. The method chosen by a system is not required to fill any particular requirements. Nor is it required that the preferred name, or algorithm for choosing the preferred name be stable; preferred names may change at the implementers discretion, for instance if a reference sequence is updated to a new version.


Exclusions and Limitations
--------------------------

Names based on a canonicalization scheme may be listed as AlleleNames, but in that case will be redundant with the CanonicalAlleleIdentifier.

In general, because AlleleName will not be based on a canonicalization, there is no guarantee that two different Alleles do not share an AlleleName. Therefore, implementers must not assume that two Alleles sharing an AlleleName are both part of the same CanonicalAllele.
