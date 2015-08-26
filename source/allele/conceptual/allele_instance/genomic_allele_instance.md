---
title: GenomicAlleleInstance
layout: conceptual
model: allele
description: An AlleleInstance that uses a <a href="genomic_reference_coordinate.html">GenomicReferenceCoordinate</a> as its <a href="reference_coordinate.html">ReferenceCoordinate</a>.

---

Scope and Usage
---------------

see also: [AlleleInstance](allele_instance.html)

GenomicAlleleInstance represents an allele at a location on a [GenomicReferenceCoordinate](genomic_reference_coordinate.html).  For each different [GenomicReferenceSequence](../reference_sequence/genomic_reference_sequence.html), a new GenomicAlleleInstance would be created, and these would be aggregated at the [SimpleCanonicalAllele](simple_canonical_allele.html) level, along with any GenomicAlleleInstances.


Attributes
----------

None beyond those of [NucleotideAlleleInstance](nucleotide_allele_instance.html)

Exclusions and Limitations
--------------------------

