---
title: Integrated Examples
layout: model
model: allele

---

Introduction
---

When creating a central repository for genomic variants, it is critical to ensure that any representation of the same allele be recognized as such. An allele may be represented multiple ways for a variety of reasons such as use of historical versus standardized nomenclature or use of different reference sequences.  The ClinGen Allele Data Model v0.1 addresses this by tying all representation of an allele, referred to as [contextual alleles](/resource/contextual_allele/index.html), to a single identifier, referred to as the [CanonicalAllele](/resource/canonical_allele/index.html).

In practice, a clinician may review a genetic test report for Gaucher disease which describes a variant in the GBA gene, c.1226A>G (N409S), using the standardized description in Human Genome Variation Society (HGVS) nomenclature. Historically, and throughout the literature however, this allele was referred to as N370S.  If the clinician makes this connection, he or she will use N409S and N370S interchangeably as they search literature or variant databases for information on this variant. However, making this connection between representations of the same allele is often not straightforward.  Therefore, a consistent method for doing so is needed.  For this reason, the ClinGen Allele Data Model v0.1 instituted the [CanonicalAllele](/resource/canonical_allele/index.html) to serve as the connection between different representations of the same allele.  

The CanonicalAllele is especially important in the course of variant curation. When evidence is gathered on an allele, it will be collected from multiple sources - literature, laboratory data, variant databases, patient test reports etc. It is imperative to extract data on any contextual allele to ensure that all data on a single allele is aggregated appropriately under a CanonicalAllele.

 The following examples outline scenarios which highlight the value of a CanonicalAllele.

Example Scenarios
---

I. [Basic Nucleotide & Amino Acid Alleles](scenario_group_1.html)

  Several examples of baseline use cases that demonstrate the fundamental approaches to representing both nucleotide and amino acid contextual alleles. In addition, these examples highlight the many names and representations for a single "canonical" allele and how alternate reference coordinates along with their underlying reference sequences can create a very different set of representations.

II. [Coordinate Numbering Disparities](scenario_group_2.html)
  
  Genetic testing processes use a number of tools to align and call variants. In addition, other sources such as, downstream applications, literature curation, manufacturer's test kits, etc. may end up driving the final representation of the called variant.  All of these sources stem from some reference sequence. The reference sequences versions and sources can contain changes that have subtle but potentially significant impact on the coordinate portion of the represented allele.  These examples highlight several cases that may occur and how they would be organized in the allele model. 

III. [Frameshift Alleles](scenario_group_3.html)

  Here are several examples of frameshifting alleles and discussion about the various ways the underlying nucleotide changes relate.  


IV. [Complex Alleles](scenario_group_4.html)

  These complex allele scenarios demonstrate the basic design behind the idea of organizing multiple contextual alleles on the same copy of a chromosome as a single canonical allele concept. The most prevelant scenario whereby this concept is used is in the area of pharmacogenetics, specifically, the start allele representation.  Several examples of star alleles are provided for examination. 
