---
title: TranscriptReferenceSequence
layout: conceptual
model: allele
description: A ReferenceSequence for the cDNA of a transcript.
sequence_ontology: "SO:0000673"

---

Scope and Usage
---------------

Genomic DNA is transcribed to RNA, but it is most common for transcripts to be recorded in databases using their complimentary DNA (cDNA) sequences. Therefore, the individual characters of a TranscriptReferenceSequence are the four DNA nucleotides: A,G,T,C.  

A TranscriptReferenceSequence may correspond to either a coding or non-coding transcript.  If the transcript is coding, the TranscriptReferenceSequence will link to a [AminoAcidReferenceSequence](amino_acid_reference_sequence.html).  

TranscriptReferenceSequences may correspond to any transcribed sequence including, but not limited to a gene transcript, a pseudogene transcript, an alternately spliced transcript, a noncoding RNA, or a computationally discovered transcript.

Attributes
----------

{:.table}
| Attribute Name | Attribute Type |
|----------------|----------------|
| codingRegionOffset | int        |

codingRegionOffset: For transcripts that contain a coding region, codingRegionOffset specifies the index of the transcript sequence at which the coding region begins.  It therefore provides a way to transfer between coding coordinates and transcript coordinates.

Related Entities
----------------

{:.table}
| Relation Name | Entity Type |
|---------------|-------------|
| translation   | [AminoAcidReferenceSequence](amino_acid_reference_sequence.html) |

translation: For coding transcripts, the [AminoAcidReferenceSequence](amino_acid_reference_sequence.html) that results in translation of the coding region. 
