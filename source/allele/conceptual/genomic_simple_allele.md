---
title: GenomicSimpleAllele
description: A SimpleAlllele that uses a GenomeReferenceSequence as its ReferenceSequence.

---

Scope and Usage
---------------

See also: [SimpleAllele](simple_allele.html)

GenomicSimpleAllele represents an allele at a variant location on a single version of a chromosome.  For each different chromosome version, a new GenomicSimpleAllele would be created, and these would be aggregated at the CanonicalSimpleAllele level, along with any TranscriptSimpleAlleles.
