---
title: ProteinSimpleAllele
description: A SimpleAlllele that uses a ProteinReferenceSequence as its ReferenceSequence.

---

Scope and Usage
---------------

See also: [SimpleAllele](simple_allele.html)

ProteinSimpleAllele represents an allele at a variant location on a single version of a chromosome.  For each different chromosome version, a new ProteinSimpleAllele would be created, and these would be aggregated at the CanonicalSimpleAllele level, along with any TranscriptSimpleAlleles.
