---
title: CanonicalAllele
iri: "/allele/resource/canonical_allele"
data_file: "resource/canonical_allele"
layout: resource
model: allele
related_terms: allele identity, measure set, normalized variant identity
description: One of a set of coexisting sequence variants.
definition: The canonical representation of a set of equivalent sequence variants.
sequence_ontology: SO:0001023
related_page_title: CanonicalAllele
related_page_url: /allele/conceptual/canonical_allele
schema: "/main/resources/clingen-xsd/canonicalallele.xsd"

---

Scope and Usage
---------------

A CanonicalAllele is a reference to a sequence change, independent of any particular representation relative to a ReferenceSequence. Since alleles are represented as a change (or no change) relative to a ReferenceSequence, a CanonicalAllele is composed of potentially multiple such representations (ContextualAlleles) that correspond to the same CanonicalAllele. One ContextualAllele is selected as the preferred representation of a CanonicalAllele


Resource Model
----------------

[![CanonicalAllele Resource Diagram](/images/CanonicalAlleleResource.svg){: .img-responsive}](/images/CanonicalAlleleResource.svg)

Related Conceptual Entities: [CanonicalAllele](/allele/conceptual/canonical_allele/index.html), [SimpleCanonicalAllele](/allele/conceptual/canonical_allele/simple_canonical_allele.html), [SimpleNucleotideCanonicalAllele](/allele/conceptual/canonical_allele/simple_nucleotide_canonical_allele.html), [SimpleAminoAcidCanonicalAllele](/allele/conceptual/canonical_allele/simple_amino_acid_canonical_allele.html), [ComplexCanonicalAllele](/allele/conceptual/canonical_allele/complex_canonical_allele.html), [ComplexNucleotideCanonicalAllele](/allele/conceptual/canonical_allele/complex_nucleotide_canonical_allele.html), [ComplexAminoAcidCanonicalAllele](/allele/conceptual/canonical_allele/complex_amino_acid_canonical_allele.html)

Notes
-----



