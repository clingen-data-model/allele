---
title: NucleotideSimpleAllele
description: A SimpleAllele that uses a DNA-based ReferenceSequence

---

Scope and Usage
---------------

NucleotideSimpleAllele is an abstract class, so any NucleotideSimpleAllele must be either a GenomicSimpleAllele or a TranscriptSimpleAllele.

The point of this class is to facilitate aggregation between GenomicSimpleAllele and TranscriptSimpleAllele at the CanonicalVariant level.
