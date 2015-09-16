---
title: GenomicContextualAllele
layout: conceptual
model: allele
description: A ConceptualAllele that uses a <a href="genomic_reference_coordinate.html">GenomicReferenceCoordinate</a> as its <a href="reference_coordinate.html">ReferenceCoordinate</a>.

---

Scope and Usage
---------------

see also: [ContextualAllele](contextual_allele.html)

GenomicContextualAllele represents an allele at a location on a [GenomicReferenceCoordinate](genomic_reference_coordinate.html).  For each different [GenomicReferenceSequence](../reference_sequence/genomic_reference_sequence.html), a new GenomicContextualAllele  would be created, and these would be aggregated at the [SimpleCanonicalAllele](simple_canonical_allele.html) level, along with any TranscriptContextualAlleles.


Attributes
----------

None beyond those of [NucleotideContextualAllele](nucleotide_contextual_allele.html)

Exclusions and Limitations
--------------------------

