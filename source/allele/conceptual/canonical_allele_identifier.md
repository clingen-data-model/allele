---
title: CanonicalAlleleIdentifier
---

Definition
----------

The identifier given to a CanonicalAllele by a given Canonicalizer.

Scope and Usage
---------------

Because the Allele Data Model does not specify the rules for canonicalization, different canonicalizing authorities may create different canonical ids for the same abstract CanonicalAllele.

A given CanonicalAllele can have zero or more (1 or more?) CanonicalAlleleIdentifiers denoting its canonical identifier and the system that granted that identifier.

See CanonicalAllele.

Exclusions and Limitations:
---------------------------

CanonicalAlleleIdentifier can only be used for identifiers granted by a canonicalizing authority.  Historic names, HGVS expressions, and other non-canonical representations of an allele are not appropriate uses of CanonicalAlleleIdentifier.  For identifiers of this type, see AlleleName.
