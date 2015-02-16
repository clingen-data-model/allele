---
title: SimpleAminoAcidAllele
description: A SimpleAlllele that uses a AminoAcidReferenceSequence as its ReferenceSequence.

---

Scope and Usage
---------------

See also: [SimpleAllele](simple_allele.html)

SimpleAminoAcidAllele represents an allele at a variant location on a single version of a chromosome.  For each different chromosome version, a new SimpleAminoAcidAllele would be created, and these would be aggregated at the CanonicalSimpleAllele level, along with any TranscriptSimpleAlleles.

Attributes
--------------------

When describing observations a concise and interoperable method is required to reduce ambiguity as well as clarify the semantics of nature language and biological meaning. The use of a formal, stable ontological structure allows highly detailed descriptions as well as a logically ordered interrelationship between concepts.

{:.table}
| Attribute Name | Attribute Type | Cardinality |
|----------------|----------------|-------------|
| aminoAcidChangeType |  String  |    0..1     |

aminoAcidChangeType: A controlled vocabulary term used to describe an observed amino acid change.  Currently constraint to be a child of [gene_variant](http://www.sequenceontology.org/browser/current_svn/term/SO:0001564) within the Sequence Ontology.  These values can be experimentally discovered or derived with annotation tools such as [SnpEff](http://snpeff.sourceforge.net/) or [VAAST](http://www.yandell-lab.org/software/vaast.html).

Exclusions and Limitations
--------------------------

Version 1.0 of the Data Model does not offer a direct relationship between records or annotations described at the SimpleNucleotideAllele level to SimpleAminoAcidAllele, however given correct reference, sequence and transcript information this can be computationally derived.


