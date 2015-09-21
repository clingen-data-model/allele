---
title: TranscriptContextualAllele
layout: conceptual
model: allele
description: A ContextualAllele that uses a TranscriptReferenceSequence as its ReferenceSequence.

---

Scope and Usage
---------------

see also: [ContextualAllele](contextual_allele.html)

TranscriptContextualAllele represents an allele at a variant location on a single version of a transcript.  For each different transcript or version, a new TranscriptContextualAllele would be created, and these would be aggregated at the SimpleCanonicalAllele level, along with any GenomicContextualAlleles.

While TranscriptContextualAllele is defined with respect to a TranscriptReferenceSequence, the allele does not necessarily lie within the TranscriptReferenceSequence itself.  For instance, intronic variants can be defined with respect to a transcript sequence, even though they are not part of the sequence.   It would also be appropriate to represent a variant upstream or downstream of a transcript using a TranscriptContextualAllele in this fashion.


Attributes
----------

When describing observations a concise and interoperable method is required to reduce ambiguity as well as clarify the semantics of nature language and biological meaning. The use of a formal, stable ontological structure allows highly detailed descriptions as well as a logically ordered interrelationship between concepts.

{:.table}
| Attribute Name | Attribute Type | Cardinality |
|----------------|----------------|-------------|
|   identifier   | Identifier[]   |    0..*     |
|   allele   | String   |    1    |

regionType: A controlled vocabulary term used to describe a single effected transcript feature. Currently constraint to be a child of [transcript_region](http://www.sequenceontology.org/browser/current_svn/term/SO:0000833) within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools such as [SnpEff](http://snpeff.sourceforge.net/) or [VAT](http://www.yandell-lab.org/software/vaast.html).


Exclusions and Limitations
--------------------------

TranscriptContextualAlleles are identified with GenomicContextualAlleles via an alignment of a transcript to a chromosome.  The details of this alignment are not modeled.  See further comments in SimpleCanonicalAllele for difficulties that may therefore arise.

For TranscriptContextualAlleles that are not part of the TranscriptReferenceSequence, such as intronic alleles, the alignment is actually an implicit part of the allele definition, as the coordinates of the allele may vary with details of the alignment.  It is therefore strongly suggested that a consistent set of alignments be used in any implementation of this model.
