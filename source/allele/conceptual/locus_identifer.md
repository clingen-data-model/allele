---
title: LocusIdentifer
description: A stable identifier for a contiguous region in a set of related ReferenceSequences.

---

Scope and Usage
---------------

A simple locus is a contiguous region of a ReferenceSequence.  Different versions of a ReferenceSequence will denote a particular locus using different coordinates, but the same locus may be referred to using a canonicalized locus identifier.  One such identifier is an rs identifier from dbSNP.  As reference sequences are updated, the same rs identifier is used to refer to the same locus, though its coordinates will change across version.

LocusIdentifier is associated with SimpleCanonicalAllele rather than CanonicalAllele, because the locus being described is a contiguous region.


