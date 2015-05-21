---
title: ClinGen Data Model
layout: home

---

[ClinGen](http://clinicalgenome.org) is an NIH-funded resource centered on clinically-relevant genomic alleles.  The goal of the ClinGen project is to enhance patient care through:

   * Sharing of clinically-relevant genomic data
   * Expert curation, creating knowledge from genomic data 
   * Machine learning on genomic data to discover new clinical relevance.


The effectiveness of curation, analysis, and sharing is dependent upon the degree to which the structure of data and the meanings of terms can be agreed upon.  When data is transmitted from one system to another, both systems must agree on what that data means, and the format in which it is transmitted.

The ClinGen [Data Model Working Group](http://clinicalgenome.org/about/working-groups/data-model/) was formed in order to:

   * Develop a core conceptual model and data dictionary for the purposes of informing all other WG related activities with respect to data structure and content
   * Provide a common and consistent set of definitions around the core concepts, attributes and terminology throughout the ClinGen domain
   * Provide consistent representation of the information housed in the ClinGen resources to the public. 

The process by which the Data Model Working Group is approaching this set of goals is to:

   * Define small useful data subsets to model
   * For each such domain, create a conceptual data model and data dictionary to describe it.
   * Use the conceptual model to define a resource model that can be used as the basis for a messaging serialization
   * Create documentation and examples explaining the use of the conceptual and resource models.

This site documents the models created by the Data Model Working Group.  Following the links for each model listed below will lead to the documentation for that model. Note that the model is in pre-release status, caution is advised when building software based on the model (see [release management](/release_management.html))

[Allele Model](allele/): Models the concepts of allele, reference and sequence.
