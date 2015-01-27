---
title: SimpleAllele
---

Definition
----------

A particular choice of the multiple variant sequences at a contiguous region in a particular ReferenceSequence.

Scope and Usage
---------------

Genetic variation, say in a population, is usually represented with respect to an explicit reference sequence.  At a locus where variation exists in the population, there are multiple alleles (subseqeunces), which may include both the allele that occurs in the reference, as well as one or more alternate alleles.  Each one of these alleles (including the reference) would correspond to a single instance of a SimpleAllele.

SimpleAllele as here defined is similar to the SO term sequence_variant (SO:0001060), but where that definition describes a difference with respect to a sequence, SimpleAllele explicitly allows the reference allele, so that there would not be a difference with respect to the reference sequence; note that the reference allele is not guaranteed to be the minor allele in any population.

The term Simple means that the allele should either represent a contiguous section of the ReferenceSequence, or
the replacement of such a section with a new contiguous section (including an empty section for a deletion).  While it would be possible to represent two widely spaces SNPs as a SimpleAllele that reproduces the ReferenceSequence between them, this would not be the intended use; such cases should be handled through the use of a ComplexAllele.

This definition of SimpleAllele would allow for large deletions or insertions; it is left as an implementation decision whether there is a size limit above which the implementing system will no longer use this representation.

SimpleAllele is an abstract class: there are no instances of the base SimpleAllele class.  Instead, each concrete example of a SimpleAllele must be either a GenomicSimpleAllele, a TranscriptSimpleAllele, or a ProteinSimpleAllele.

Each SimpleAllele is the representation of an allele within a single sequence.  For example, if a variant occurs along a chromosome in a location that is covered the coding region of a transcript, there will be three different SimpleAlleles: One representing the allele in the context of the GenomeReferenceSequence, a second representing the allele in the context of the TranscriptReferenceSequence, and a third in the context of a ProteinReferenceSequence.  

Relationships between these multiple SimpleAlleles can happen at two levels: GenomicSimpleAllele and TranscriptSimpleAllele are related through the construct of each being related to the same CanonicalSimpleAllele.  However, a ProteinSimpleAllele will be directly related to a TranscriptSimpleAllele following a parallel construction with the relationship between the associated TranscriptReferenceSequence and the ProteinReferenceSequence.

[Move to canonical allele or somewhere higher up?]
Though the main use of SimpleAllele is to record alleles at observed variant sites in the human genome, use of the SimpleAllele model does not demand that an instantiated allele actually be observed.   Implementors may choose to use the model for different purposes; if a particular implementor demands that all entries to a database of SimpleAlleles represent observed variation, then it is incumbent upon that implementor to add documentation to that effect.

Exclusions and Limitations
--------------------------

SimpleAllele as presently defined may be a poor choice for representing large insertions or deletions, as the reference and alternate alleles are stored in full.

SimpleAllele is not capable of representing the uncertainty of starting or ending coordinates of a variant.
