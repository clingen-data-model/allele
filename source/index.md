---
title: Allele Model
model: allele
layout: model
alias: allele/discussion/

---


Introduction
------------

The purpose of the Allele Data Model is to provide a referenceable entity that represents the choice of particular allele at a site of genetic variation.  This entity should be resilient to updates in reference sequences, while containing sufficient information to uniquely specify the allele.

Status
------

The Allele model is in pre-release status. While the overall structure of the model is stable, variables and codes are likely to change as a first implementation is built (the [Allele Registry](implementation/applications/)). Use caution when building software based on this model (see [release management](/releases.html)).

Scope and Usage
---------------

An allele is here defined as one of a particular choice of sequences that may occur at a set of locations in a given sequence.   

Once an allele is defined and given a stable identifier, statements may be made about this allele.  For instance:

  * Person X contains 2 copies of allele A
  * The frequency of allele A in population P is 0.2
  * Allele A is likely pathogenic for condition C

The purpose of the Allele Model is not to make any of these statements, but to provide the entity about which any of these statements could be made.  Modeling the statements about alleles will be the subject of future work, specifically models involving individuals, populations, and assertions.

In the allele model, different representations of the same allele, such as the same change on different versions of a reference, or on different transcripts, are aggregated together into a CanonicalVariant.  The allele model does not define the rules that are used to perform this canonicalization, but does model metadata about canonicalization.

One feature of canonicalization that differs from common usage is that alleles on amino acid sequences are canonicalized separately from alleles on nucleic acid sequences.  Alleles that are aggregated into the same CanonicalAllele are assumed to be identical.  However, because of degeneracy, multiple nucleic acid alleles, which would not be canonically the same, may give rise to the same amino acid allele.  Therefore, we separate amino acid alleles from nucleic acid alleles for the purposes of canonicalization.

In addition to (contiguous) allele instances , the allele model can be used to represent sets of allele instances that all occur in cis with one another.  These complex alleles can be used to represent haplotypes such as pharmacogenomic star alleles.

Conceptual and Resource Models
------------------------------

The fundamental representation of the allele model is a conceptual model defined in UML.  This conceptual model represents a fine-grained attempt to capture the relevant entities and attributes related to alleles.  Furthermore, the conceptual model is implementation-independent.  The same conceptual model should be adaptable, for instance, to either a relational schema or a document model.

Physical models typically simplify the conceptual model to allow for more practical implementations.  Concepts such as inheritance and normalization, while useful in defining concepts, may hinder implementation.  While physical models simplify the conceptual model, they derive from the conceptual model; updates to the allele model consist of first modeling the change at the conceptual level, and then pushing those changes down to the physical models.

While multiple physical models are definable, we specify a particular document resource model, which is meant to be the particular model used in communication within the ClinGen project.  Implementers will therefore be most specifically interested in the resource model, but we advise that Implementers pay close attention to the conceptual model that underlies it.


Exclusions and Limitations
--------------------------

Allele Model v0.1(beta) does not model structural variants such as large duplications, translocations or copy number variation.


The Allele Model v0.1(beta) is dependent on the existence of one or more canonicalization methods that 

  1. Aggregate allele instances and 
  2. Can recognize that a new allele instance should be aggregated into a known canonical allele.

However, the allele model does not specify the algorithm used to perform this canonicalization.

The resource model given is one possible physical implementation derived from the conceptual model.  While other models, such as a relational model may also be derived, they are not provided within the allele model v0.1(beta).


