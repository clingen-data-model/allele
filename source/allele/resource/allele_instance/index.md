---
title: AlleleInstance
layout: resource
model: allele
related_terms: allele instance, allele, variant, sequence variant, snv, amino acid variant, dna change, aa change
description: A representation of one of the multiple variant sequences at a contiguous region in a particular <a href="/allele/resource/reference_sequence/index.html">ReferenceSequence</a>.
related_page_title: AlleleInstance
related_page_url: /allele/conceptual/allele_instance
schema: /main/resources/clingen-xsd/alleleinstance.xsd

---

Scope and Usage
---------------

Genetic variation is often represented with respect to an explicit reference sequence.  At a locus where variation exists in the population, there exist both the allele that occurs in the reference as well as one or more alternate alleles.  Each one of these alleles (including the reference) is represented by a distinct instance of AlleleInstance.

AlleleInstance as here defined is similar to the SO term [sequence_variant](http://www.sequenceontology.org/browser/current_svn/term/SO:0001060), but where that definition describes a difference with respect to a sequence, AlleleInstance explicitly allows the reference allele to be represented. Note that the reference allele is not guaranteed to be the minor allele in any population.

A AlleleInstance should either represent a contiguous section of the ReferenceSequence, or the replacement of such a section with a new contiguous section (including an empty section forr a deletion).  While it would be possible to represent two widely spaced SNPs as a AlleleInstance that reproduces the ReferenceSequence between them, this is not the intended use; such cases should be handled through the use of a ComplexAllele.

This definition of AlleleInstance allows for large deletions or insertions; it is left as an implementation decision whether there is a size limit above which the implementing system will no longer use this representation.

Each AlleleInstance is the representation of an allele within a single sequence.  For example, if a variant occurs within the coding region of a transcript, three different AlleleInstances will be used to represent the same variant: one representing the allele in the context of the ReferenceSequence for the genome, a second representing the allele in the context of the ReferenceSequence for the transcript, and a third in the context of the ReferenceSequence for the amino acid chain.


Resource Model
----------------

[![AlleleInstance Resource Diagram](/images/AlleleInstanceResource.svg){: .img-responsive}](/images/AlleleInstanceResource.svg)

Related Resources: [ReferenceSequence](/allele/resource/reference_sequence/index.html), [CanonicalAllele](/allele/resource/canonical_allele/index.html)


Definitions & Bindings
------------------

{:.h4-definition}
### AlleleInstance

{:.dl-horizontal .dl-definition}
Definition
: Resource representing one of the multiple variant sequences at a contiguous region in a particular ReferenceSequence.

Control
: 1..1


{:.h4-definition}
#### AlleleInstance.identifier

{:.dl-horizontal .dl-definition}
Definition
: The set of Identifiers used to name this AlleleInstance. May be as simple as a set of one single Identifier distinguishing the AlleleInstance in the implementing system, or may expansively include the name of all AlleleInstances in all implementing systems.

Type
: Identifier

Control
: 0..*

{:.h4-definition}
#### AlleleInstance.canonicalAllele

{:.dl-horizontal .dl-definition}
Definition
: The CanonicalAllele resource to which this AlleleInstance maps.

Type
: CanonicalAllele

Control
: 0..1

{:.h4-definition}
#### AlleleInstance.alleleInstanceType

{:.dl-horizontal .dl-definition}
Definition
: Type of allele instance, as defined by the type of transcript the allele is mapped on.

Binding
: AlleleInstanceType [allele-instance-types](/allele/implementation/value_set_list/allele_instance_type.html)

Type
: Code

Control
: 0..1

{:.h4-definition}
#### AlleleInstance.allele

{:.dl-horizontal .dl-definition}
Definition
: The nucleotide or amino acid sequence that is defined for this allele at the reference coordinates.  This is typically associated with the 'ALT' value in a VCF representation of a variant.

Control
: 0..1

Type
: string

{:.h4-definition}
#### AlleleInstance.primaryNucleotideChangeType

{:.dl-horizontal .dl-definition}
Definition
: Describes the change that occurs within a nucleotide allele instance.

Control
: 0..1

Binding
: PrimaryNucleotideChangeType [primary-nucleotide-change-types](/allele/implementation/value_set_list/primary_nucleotide_change_type.html)

Type
: Code

Requirements
: Required (and allowed) only if the AlleleInstance maps to a nucleotide sequence.

{:.h4-definition}
#### AlleleInstance.ancillaryNucleotideChangeType

{:.dl-horizontal .dl-definition}
Definition
: Additional descriptors that can be applied to describe the change effected by the allele.

Control
: 0..*

Binding
: AncillaryNucleotideChangeType [ancillary-nucleotide-change-types](/allele/implementation/value_set_list/ancillary_nucleotide_change_type.html)

Type
: Code

Requirements
: Optional, permitted only if the AlleleInstance maps to a nucleotide sequence.

{:.h4-definition}
#### AlleleInstance.primaryAminoAcidChangeType

{:.dl-horizontal .dl-definition}
Definition
: Describes the change that occurs within an amino acid.

Binding
: PrimaryAminoAcidChangeType [primary-amino-acid-change-types](/allele/implementation/value_set_list/primary_amino_acid_change_type.html)

Type
: Code

Control
: 0..1

Requirements
: Required (and allowed) only if the AlleleInstance describes an allele on an amino acid reference sequence.

{:.h4-definition}
#### AlleleInstance.ancillaryAminoAcidChangeType

{:.dl-horizontal .dl-definition}
Definition
: One of the set of allowable [ancillary-amino-acid-change-types](/allele/implementation/value_set_list/ancillary_amino_acid_change_type.html). Allowed only if the AlleleInstance describes an allele on an amino acid reference sequence.

Type
: Code

Control
: 0..1

{:.h4-definition}
### AlleleInstance.referenceCoordinate

{:.dl-horizontal .dl-definition}
Definition
: The genetic loci of the variant.

Control
: 1

{:.h4-definition}
#### AlleleInstance.referenceCoordinate.identifier

{:.dl-horizontal .dl-definition}
Definition
: The set of Identifiers used to name this ReferenceCoordinate. May be as simple as a set of one single Identifier distinguishing the ReferenceCoordinate in the implementing system, or may expansively include the name of all ReferenceCoordinates in all implementing systems.

Type
: Identifier

Control
: 1..*

{:.h4-definition}
#### AlleleInstance.referenceCoordinate.referenceSequence

{:.dl-horizontal .dl-definition}
Definition
: The [ReferenceSequence](/allele/resource/reference_sequence) resource on which the ReferenceCoordinate (and, by extention, the AlleleInstance is mapped.

Type
: ReferenceSequence

Control
: 1

{:.h4-definition}
#### AlleleInstance.referenceCoordinate.start

{:.dl-horizontal .dl-definition}
Definition
: The starting position of the reference coordinate. NOTE: The data model defines a [0-based coordinate numbering system](/allele/coordinate_numbering.html) as described above.

Type
: integer

Control
: 1

{:.h4-definition}
#### AlleleInstance.referenceCoordinate.end

{:.dl-horizontal .dl-definition}
Definition
: The end position of the reference coordinate. Note that the data model defines a 0-based coordinate system as described above.

Type
: integer

Control
: 1

{:.h4-definition}
#### AlleleInstance.referenceCoordinate.refAllele

{:.dl-horizontal .dl-definition}
Definition
: The string of nucleotides or amino acids at this reference coordinate on the related reference genome. This is typically associated with the 'REF' value in a VCF representation of a variant.

Type
: string

Control
: 0..1

{:.h4-definition}
#### AlleleInstance.referenceCoordinate.primaryTranscriptRegionType

{:.dl-horizontal .dl-definition}
Definition
: One of the set of allowable [primary-transcript-region-types](/allele/implementation/value_set_list/primary_transcript_region_type.html)

Type
: Code

Control
: 0..1

{:.h4-definition}
#### AlleleInstance.referenceCoordinate.ancillaryTranscriptRegionType

{:.dl-horizontal .dl-definition}
Definition
: One of the set of allowable [ancillary-transcript-region-types](/allele/implementation/value_set_list/ancillary_transcript_region_type.html)

Type
: Code

Control
: 0..1

{:.h4-definition}
#### AlleleInstance.referenceCoordinate.intronOffsetStart

{:.dl-horizontal .dl-definition}
Definition
: The start of the ReferenceCoordinate relative to the transcript coordinate. Required when the coordinate is described as an offset relative to an exonic transcript (should only apply to ReferenceCoordinates of type interior\_intron described relative to a ReferenceSequence of type transcript\_reference\_sequence).

Type
: integer

Control
: 0..1

{:.h4-definition}
#### AlleleInstance.referenceCoordinate.intronOffsetEnd

{:.dl-horizontal .dl-definition}
Definition
: The end of the ReferenceCoordinate relative to the transcript coordinate. Requirements are the same as for intronOffsetStart.

Type
: integer

Control
: 0..1

{:.h4-definition}
#### AlleleInstance.referenceCoordinate.intronOffsetDirection

{:.dl-horizontal .dl-definition}
Definition
: The direction of the ReferenceCoordinate relative to the transcript coordinate. Requirements are the same as for intronOffsetStart.

Type
: Code

Control
: 0..1

{:.h4-definition}
### AlleleInstance.alleleName

{:.dl-horizontal .dl-definition}
defintion
: The name given to the allele by a naming organization (i.e. an HGVS expression)

Control
: 0..*

{:.h4-definition}
#### AlleleInstance.alleleName.nameType

{:.dl-horizontal .dl-definition}
Definition
: One of the set of allowable [allele-instance-name-types](/allele/implementation/value_set_list/allele_instance_name_type.html)

Type
: Code

Control
: 1

{:.h4-definition}
#### AlleleInstance.alleleName.legacy

{:.dl-horizontal .dl-definition}
Definition
: Flag set if the name is deprecated or no longer used in the relevant allele naming system. Default is false.

Type
: boolean

Control
: 0..1

{:.h4-definition}
#### AlleleInstance.alleleName.preferred

{:.dl-horizontal .dl-definition}
Definition
: Flag set if the name is the preferred name for this allele in the implementing system.

Type
: boolean

Control
: 0..1

{:.h4-definition}
### AlleleInstance.related

{:.dl-horizontal .dl-definition}
definition
: Other, related allele instances, for example, the AlleleInstance that represents the amino acid change caused by a nucleotide allele instance, and vice-versa.

Control
: 0..*

{:.h4-definition}
#### AlleleInstance.related.relatedType

{:.dl-horizontal .dl-definition}
Definition
: One of the allowable set of relationship types in [allele-instance-relationship-type](/allele/implementation/value_set_list/allele_instance_relationship_type.html)

Type
: Code

Control
: 1

{:.h4-definition}
#### AlleleInstance.related.target

{:.dl-horizontal .dl-definition}
Definition
: The AlleleInstance described in the relationship.

Type
: AlleleInstance

Control
: 1

