---
title: ContextualAllele
layout: resource
model: allele
related_terms: contextual allele, allele, variant, sequence variant, snv, amino acid variant, dna change, aa change
description: A representation of one of the multiple variant sequences at a contiguous region in a particular <a href="/resource/reference_sequence/index.html">ReferenceSequence</a>.
related_page_title: ContextualAllele
related_page_url: /conceptual/contextual_allele
schema: /main/resources/clingen-xsd/contextualallele.xsd

---

Scope and Usage
---------------

Genetic variation is often represented with respect to an explicit reference sequence.  At a locus where variation exists in the population, there exist both the allele that occurs in the reference as well as one or more alternate alleles.  Each one of these alleles (including the reference) is represented by a distinct instance of ContextualAllele.

ContextualAllele as here defined is similar to the SO term [sequence_variant](http://www.sequenceontology.org/browser/current_svn/term/SO:0001060), but where that definition describes a difference with respect to a sequence, ContextualAllele explicitly allows the reference allele to be represented. Note that the reference allele is not guaranteed to be the minor allele in any population.

A ContextualAllele should either represent a contiguous section of the ReferenceSequence, or the replacement of such a section with a new contiguous section (including an empty section forr a deletion).  While it would be possible to represent two widely spaced SNPs as a ContextualAllele that reproduces the ReferenceSequence between them, this is not the intended use; such cases should be handled through the use of a ComplexAllele.

This definition of ContextualAllele allows for large deletions or insertions; it is left as an implementation decision whether there is a size limit above which the implementing system will no longer use this representation.

Each ContextualAllele is the representation of an allele within a single sequence.  For example, if a variant occurs within the coding region of a transcript, three different ContextualAlleles will be used to represent the same variant: one representing the allele in the context of the ReferenceSequence for the genome, a second representing the allele in the context of the ReferenceSequence for the transcript, and a third in the context of the ReferenceSequence for the amino acid chain.


Resource Model
----------------

[![ContextualAllele Resource Diagram](/images/ContextualAlleleResource.svg){: .img-responsive}](/images/ContextualAlleleResource.svg)

Related Resources: [ReferenceSequence](/resource/reference_sequence/index.html), [CanonicalAllele](/resource/canonical_allele/index.html)


Definitions & Bindings
------------------

{:.h4-definition}
### ContextualAllele

{:.dl-horizontal .dl-definition}
Definition
: Resource representing one of the multiple variant sequences at a contiguous region in a particular ReferenceSequence.

Control
: 1..1


{:.h4-definition}
#### ContextualAllele.identifier

{:.dl-horizontal .dl-definition}
Definition
: The set of Identifiers used to name this ContextualAllele. May be as simple as a set of one single Identifier distinguishing the ContextualAllele in the implementing system, or may expansively include the name of all ContextualAlleles in all implementing systems.

Type
: Identifier

Control
: 0..*

{:.h4-definition}
#### ContextualAllele.canonicalAllele

{:.dl-horizontal .dl-definition}
Definition
: The CanonicalAllele resource to which this ContextualAllele maps.

Type
: CanonicalAllele

Control
: 0..1

{:.h4-definition}
#### ContextualAllele.contextualAlleleType

{:.dl-horizontal .dl-definition}
Definition
: Type of contextual allele, as defined by the type of transcript the allele is mapped on.

Binding
: ContextualAlleleType [contextual-allele-types](/implementation/value_set_list/contextual_allele_type.html)

Type
: Code

Control
: 0..1

{:.h4-definition}
#### ContextualAllele.allele

{:.dl-horizontal .dl-definition}
Definition
: The nucleotide or amino acid sequence that is defined for this allele at the reference coordinates.  This is typically associated with the 'ALT' value in a VCF representation of a variant.

Control
: 0..1

Type
: string

{:.h4-definition}
#### ContextualAllele.primaryNucleotideChangeType

{:.dl-horizontal .dl-definition}
Definition
: Describes the change that occurs within a nucleotide contextual allele.

Control
: 0..1

Binding
: PrimaryNucleotideChangeType [primary-nucleotide-change-types](/implementation/value_set_list/primary_nucleotide_change_type.html)

Type
: Code

Requirements
: Required (and allowed) only if the ContextualAllele maps to a nucleotide sequence.

{:.h4-definition}
#### ContextualAllele.ancillaryNucleotideChangeType

{:.dl-horizontal .dl-definition}
Definition
: Additional descriptors that can be applied to describe the change effected by the allele.

Control
: 0..*

Binding
: AncillaryNucleotideChangeType [ancillary-nucleotide-change-types](/implementation/value_set_list/ancillary_nucleotide_change_type.html)

Type
: Code

Requirements
: Optional, permitted only if the ContextualAllele maps to a nucleotide sequence.

{:.h4-definition}
#### ContextualAllele.primaryAminoAcidChangeType

{:.dl-horizontal .dl-definition}
Definition
: Describes the change that occurs within an amino acid.

Binding
: PrimaryAminoAcidChangeType [primary-amino-acid-change-types](/implementation/value_set_list/primary_amino_acid_change_type.html)

Type
: Code

Control
: 0..1

Requirements
: Required (and allowed) only if the ContextualAllele describes an allele on an amino acid reference sequence.

{:.h4-definition}
#### ContextualAllele.ancillaryAminoAcidChangeType

{:.dl-horizontal .dl-definition}
Definition
: One of the set of allowable [ancillary-amino-acid-change-types](/implementation/value_set_list/ancillary_amino_acid_change_type.html). Allowed only if the ContextualAllele describes an allele on an amino acid reference sequence.

Type
: Code

Control
: 0..1

{:.h4-definition}
### ContextualAllele.referenceCoordinate

{:.dl-horizontal .dl-definition}
Definition
: The genetic loci of the allele.

Control
: 1

{:.h4-definition}
#### ContextualAllele.referenceCoordinate.identifier

{:.dl-horizontal .dl-definition}
Definition
: The set of Identifiers used to name this ReferenceCoordinate. May be as simple as a set of one single Identifier distinguishing the ReferenceCoordinate in the implementing system, or may expansively include the name of all ReferenceCoordinates in all implementing systems.

Type
: Identifier

Control
: 1..*

{:.h4-definition}
#### ContextualAllele.referenceCoordinate.referenceSequence

{:.dl-horizontal .dl-definition}
Definition
: The [ReferenceSequence](/resource/reference_sequence) resource on which the ReferenceCoordinate (and, by extention, the ContextualAllele is mapped.

Type
: ReferenceSequence

Control
: 1

{:.h4-definition}
#### ContextualAllele.referenceCoordinate.refAllele

{:.dl-horizontal .dl-definition}
Definition
: The string of nucleotides or amino acids at this reference coordinate on the related reference genome. This is typically associated with the 'REF' value in a VCF representation of a variant.

Type
: string

Control
: 0..1

{:.h4-definition}
#### ContextualAllele.referenceCoordinate.primaryTranscriptRegionType

{:.dl-horizontal .dl-definition}
Definition
: One of the set of allowable [primary-transcript-region-types](/implementation/value_set_list/primary_transcript_region_type.html)

Type
: Code

Control
: 0..1

{:.h4-definition}
#### ContextualAllele.referenceCoordinate.ancillaryTranscriptRegionType

{:.dl-horizontal .dl-definition}
Definition
: One of the set of allowable [ancillary-transcript-region-types](/implementation/value_set_list/ancillary_transcript_region_type.html)

Type
: Code

Control
: 0..1

{:.h4-definition}
#### ContextualAllele.referenceCoordinate.start

{:.dl-horizontal .dl-definition}
Definition
: The starting position of the reference coordinate. NOTE: The data model defines a [0-based coordinate numbering system](/coordinate_numbering.html) as described above.

Type
: Position

Control
: 1

{:.h4-definition}
#### ContextualAllele.referenceCoordinate.end

{:.dl-horizontal .dl-definition}
Definition
: The end position of the reference coordinate. Note that the data model defines a 0-based coordinate system as described above.

Type
: Position

Control
: 1



{:.h4-definition}
#### Position

{:.dl-horizontal .dl-definition}
Definition
: Information needed to locate one end of a ReferenceCoordinate. 

Control
: 1..1

{:.h4-definition}
#### Position.index

{:.dl-horizontal .dl-definition}
Definition
: A zero-based position within the ReferenceCoordinate

Type
: integer

Control
: 1..1

{:.h4-definition}
#### Position.externalOffsetLength

{:.dl-horizontal .dl-definition}
Definition
: The zero-based position of an intronic location as counted from the index attribute.

Type
: integer

Control
: 0..1


{:.h4-definition}
#### Position.externalOffsetDirection

{:.dl-horizontal .dl-definition}
Definition
: The direction of the ReferenceCoordinate relative to the transcript coordinate. 

Type
: Code

Control
: 0..1

{:.h4-definition}
#### Position.externalGenomicReferenceSequence

{:.dl-horizontal .dl-definition}
Definition
: For an intronic position in a ReferenceCoordinate defined on a transcript, the externalGenomicReferenceSequence is a genomic sequence to which the transcript is mapped.

Type
: GenomicReferenceSequence

Control
: 0..1

{:.h4-definition}
#### Position.externalGenomicPositionIndex

{:.dl-horizontal .dl-definition}
Definition
: For an intronic position in a ReferenceCoordinate defined on a transcript, the corresponding position on the defined externalGenomicReferenceSequence.

Type
: integer

Control
: 0..1



{:.h4-definition}
### ContextualAllele.alleleName

{:.dl-horizontal .dl-definition}
defintion
: The name given to the allele by a naming organization (i.e. an HGVS expression)

Control
: 0..*

{:.h4-definition}
#### ContextualAllele.alleleName.nameType

{:.dl-horizontal .dl-definition}
Definition
: One of the set of allowable [contextual-allele-name-types](/implementation/value_set_list/contextual_allele_name_type.html)

Type
: Code

Control
: 1

{:.h4-definition}
#### ContextualAllele.alleleName.legacy

{:.dl-horizontal .dl-definition}
Definition
: Flag set if the name is deprecated or no longer used in the relevant allele naming system. Default is false.

Type
: boolean

Control
: 0..1

{:.h4-definition}
#### ContextualAllele.alleleName.preferred

{:.dl-horizontal .dl-definition}
Definition
: Flag set if the name is the preferred name for this allele in the implementing system.

Type
: boolean

Control
: 0..1

{:.h4-definition}
### ContextualAllele.related

{:.dl-horizontal .dl-definition}
definition
: Other, related contextual alleles, for example, the ContextualAllele that represents the amino acid change caused by a nucleotide contextual allele, and vice-versa.

Control
: 0..*

{:.h4-definition}
#### ContextualAllele.related.relatedType

{:.dl-horizontal .dl-definition}
Definition
: One of the allowable set of relationship types in [contextual-allele-relationship-type](/implementation/value_set_list/contextual_allele_relationship_type.html)

Type
: Code

Control
: 1

{:.h4-definition}
#### ContextualAllele.related.target

{:.dl-horizontal .dl-definition}
Definition
: The ContextualAllele described in the relationship.

Type
: ContextualAllele

Control
: 1

