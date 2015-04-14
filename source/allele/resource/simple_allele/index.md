---
title: SimpleAllele
layout: resource
alias: simple allele, allele, variant, sequence variant, snv, amino acid variant, dna change, aa change
description: A representation of one of the multiple variant sequences at a contiguous region in a particular <a href="/allele/resource/reference_sequence/index.html">ReferenceSequence</a>.
related_page: /allele/conceptual/simple_allele
schema: /main/resources/clingen-xsd/simpleallele.xsd

---

Scope and Usage
---------------

Genetic variation is often represented with respect to an explicit reference sequence.  At a locus where variation exists in the population, there are multiple alleles which may include both the allele that occurs in the reference, as well as one or more alternate alleles.  Each one of these alleles (including the reference) would correspond to a single instance of a SimpleAllele.

SimpleAllele as here defined is similar to the SO term [sequence_variant](http://www.sequenceontology.org/browser/current_svn/term/SO:0001060), but where that definition describes a difference with respect to a sequence, SimpleAllele explicitly allows the reference allele, so that there would not be a difference with respect to the reference sequence; note that the reference allele is not guaranteed to be the minor allele in any population.

The term Simple means that the allele should either represent a contiguous section of the ReferenceSequence, or
the replacement of such a section with a new contiguous section (including an empty section for a deletion).  While it would be possible to represent two widely spaces SNPs as a SimpleAllele that reproduces the ReferenceSequence between them, this would not be the intended use; such cases should be handled through the use of a ComplexAllele.

This definition of SimpleAllele would allow for large deletions or insertions; it is left as an implementation decision whether there is a size limit above which the implementing system will no longer use this representation.

SimpleAllele is an abstract class: there are no instances of the base SimpleAllele class.  Instead, each concrete example of a SimpleAllele must be either a GenomicSimpleAllele, a TranscriptSimpleAllele, or a SimpleAminoAcidAllele.

Each SimpleAllele is the representation of an allele within a single sequence.  For example, if a variant occurs along a chromosome in a location that is covered the coding region of a transcript, there will be three different SimpleAlleles: One representing the allele in the context of the GenomeReferenceSequence, a second representing the allele in the context of the TranscriptReferenceSequence, and a third in the context of a AminoAcidReferenceSequence.  

Relationships between these multiple SimpleAlleles can happen at two levels: GenomicSimpleAllele and TranscriptSimpleAllele are related through the construct of each being related to the same CanonicalSimpleAllele.  However, a SimpleAminoAcidAllele will be directly related to a TranscriptSimpleAllele following a parallel construction with the relationship between the associated TranscriptReferenceSequence and the AminoAcidReferenceSequence.

[Move to canonical allele or somewhere higher up?]
Though the main use of SimpleAllele is to record alleles at observed variant sites in the human genome, use of the SimpleAllele model does not demand that an instantiated allele actually be observed.   Implementors may choose to use the model for different purposes; if a particular implementor demands that all entries to a database of SimpleAlleles represent observed variation, then it is incumbent upon that implementor to add documentation to that effect.

Context
-------

The SimpleAllele resource is described by the following attributes.

* identifier[]: The set of identifiers that describe the SimpleAllele
* canonicalAllele: The CanonicalAllele associated with the SimpleAllele
* sequenceType: The type of sequence referred to by the SimpleAllele (nucleotide/amino acid, etc)
* allele: HGVS expression representing the SimpleAllele
* primaryNucleotideChangeType: type of change if SimpleAllele represents a nucleotide change (insertion, deletion, etc.)
* ancillaryNucleotideChangeType[]: additional change types for nucleotide simple alleles for finer classification when desired.
* primaryAminoAcidChangeType: type of change if SimpleAllele represents an amino acid change (frameshift, etc)
* ancillaryAminoAcidChangeType[]: additional change types for amino acid simple alleles for finer classifcation when desired.
* ReferenceCoordinate: The coordinates of the allele relative to a ReferenceSequence
* AlleleName: Identifiers giving the allele a unique name, possible HGVS expressions, etc.

Resource Model
----------------

[![SimpleAllele Resource Diagram](/images/SimpleAlleleResource.svg){: .img-responsive}](/images/SimpleAlleleResource.svg)

Conceptual Model: [SimpleAllele](/allele/conceptual/simple_allele/index.html#conceptual-model)


Notes
-----

Search Parameters
-----------------

{:.table}
| name | type | description | related attribute |
|------|------|-------------|-------------------|
| _id  | token | the integer identifier of the simple allele | |


Formal Definitions
------------------


