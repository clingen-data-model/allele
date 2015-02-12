---
title: TranscriptSimpleAllele
description: A SimpleAlllele that uses a TranscriptReferenceSequence as its ReferenceSequence.

---

Scope and Usage
---------------

see also: [SimpleAllele](simple_allele.html)

TranscriptSimpleAllele represents an allele at a variant location on a single version of a transcript.  For each different transcript or version, a new TranscriptSimpleAllele would be created, and these would be aggregated at the CanonicalSimpleAllele level, along with any GenomicSimpleAlleles.

While TranscriptSimpleAllele is defined with respect to a TranscriptReferenceSequence, the allele does not necessarily lie within the TranscriptReferenceSequence itself.  For instance, intronic variants can be defined with respect to a transcript sequence, even though they are not part of the sequence.   It would also be appropriate to represent a variant upstream or downstream of a transcript using a TranscriptSimpleAllele in this fashion.

Exclusions and Limitations
--------------------------

TranscriptSimpleAlleles are identified with GenomicSimpleAlleles via an alignment of a transcript to a chromosome.  The details of this alignment are not modeled.  See further comments in CanonicalSimpleAllele for difficulties that may therefore arise.

For TranscriptSimpleAlleles that are not part of the TranscriptReferenceSequence, such as intronic alleles, the alignment is actually an implicit part of the allele definition, as the coordinates of the allele may vary with details of the alignment.  It is therefore strongly suggested that a consistent set of alignments be used in any implementation of this model.
