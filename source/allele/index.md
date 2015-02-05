---
title: allele model
---

Definition
----------

This model contains a set of model objects and interfaces to describe an immutable genetic allele, independent of any given reference sequence (a [CanonicalAllele](canonical_allele.html)).

Scope and Usage
---------------

This version of the model allows one to describe simple sequence variants.  In order to utilize this model, a service allowing one to reconcile a description of an allele relative to a given sequence to a [CanonicalAllele](canonical_allele.html) must exist.

Exclusions and Limitations
--------------------------

Large scale deletions and duplications (including copy number variation) are out of scope in this version of the model.

