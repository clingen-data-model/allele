---
title: AlleleInstance
layout: conceptual
model: allele
description: A representation of one of the multiple variant sequences at a contiguous region in a particular <a href="/allele/conceptual/reference_sequence/index.html">ReferenceSequence</a>.
related_page_title: AlleleInstance
related_page_url: /allele/resource/allele_instance

---

Scope and Usage
---------------

Genetic variation, say in a population, is usually represented with respect to an explicit reference sequence.  At a locus where variation exists in the population, there are multiple alleles (subsequences), which may include both the allele that occurs in the reference, as well as one or more alternate alleles.  Each one of these alleles (including the reference) would correspond to a single unique occurrence of an AlleleInstance.

AlleleInstance as here defined is similar to the SO term [sequence_variant](http://www.sequenceontology.org/browser/current_svn/term/SO:0001060), but where that definition describes a difference with respect to a sequence, AlleleInstance explicitly allows the reference allele, so that there would not be a difference with respect to the reference sequence; note that the reference allele is not guaranteed to be the minor allele in any population.

The term AlleleInstance means that the allele should either represent a contiguous section of the ReferenceSequence, or
the replacement of such a section with a new contiguous section (including an empty section for a deletion).  While it would be possible to represent two widely spaced SNPs as an AlleleInstance that reproduces the ReferenceSequence between them, this would not be the intended use; such cases should be handled through the use of a ComplexCanonicalAllele.

This definition of AlleleInstance would allow for large deletions or insertions; it is left as an implementation decision whether there is a size limit above which the implementing system will no longer use this representation.

AlleleInstance is an abstract class: there are no instances of the base AlleleInstance class.  Instead, each concrete example of an AlleleInstance must be either a GenomicAlleleInstance, a TranscriptAlleleInstance, or a AminoAcidAlleleInstance.

Each AlleleInstance is the representation of an allele within a single sequence.  For example, if a variant occurs along a chromosome in a location that is covered by the coding region of a transcript, there will be three different AlleleInstances: One representing the allele in the context of the GenomeReferenceSequence, a second representing the allele in the context of the TranscriptReferenceSequence, and a third in the context of an AminoAcidReferenceSequence.  

Relationships between these multiple AlleleInstances can happen at two levels: GenomicAlleleInstance and TranscriptAlleleInstance are related through the construct of each being related to the same SimpleCanonicalAllele.  However, a AminoAcidAlleleInstance will be directly related to a TranscriptAlleleInstance following a parallel construction with the relationship between the associated TranscriptReferenceSequence and the AminoAcidReferenceSequence.

####Observed v. Derived
Though the main use of AlleleInstance is to record alleles at observed variant sites in the human genome, use of the AlleleInstance model does not demand that an instantiated allele actually be observed.   Implementers may choose to use the model for different purposes; if a particular implementer demands that all entries to a database of AlleleInstances represent observed variation, then it is incumbent upon that implementer to add documentation to that effect.

Exclusions and Limitations
--------------------------

AlleleInstance as presently defined may be a poor choice for representing large insertions or deletions, as the reference and alternate alleles are stored in full.

AlleleInstance is not capable of representing the uncertainty of starting or ending coordinates of a variant.

Conceptual Model
----------------

[![AlleleInstance Conceptual Diagram](/images/AlleleInstanceConceptual.svg){: .img-responsive}](/images/AlleleInstanceConceptual.svg)

Resource Model: [AlleleInstance](/allele/resource/allele_instance/index.html#resource-model)
