---
title: SimpleGenomicAllele
layout: conceptual
model: allele
description: A SimpleAllele that uses a <a href="genomic_reference_coordinate.html">GenomicReferenceCoordinate</a> as its <a href="reference_coordinate.html">ReferenceCoordinate</a>.

---

Scope and Usage
---------------

see also: [AlleleInstance](allele_instance.html)

SimpleGenomicAllele represents an allele at a location on a [GenomicReferenceCoordinate](genomic_reference_coordinate.html).  For each different [GenomicReferenceSequence](../reference_sequence/genomic_reference_sequence.html), a new SimpleGenomicAllele would be created, and these would be aggregated at the [SimpleCanonicalAllele](simple_canonical_allele.html) level, along with any SimpleGenomicAlleles.


Attributes
----------

None beyond those of [NucleotideAlleleInstance](nucleotide_allele_instance.html)

Exclusions and Limitations
--------------------------

