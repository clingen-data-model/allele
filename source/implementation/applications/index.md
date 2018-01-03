---
title: Allele Registry
layout: model
model: allele

---

###The Implementators
The Allele Registry is a service being developed by the ClinGenDB group under the direction of [Aleksandar Milosavljevic, PhD](http://www.clinicalgenome.org/about/people/staff/aleksandar-milosavljevic/){:target="other"} at the [Baylor College of Medicine](https://www.bcm.edu/){:target="other"}. It is the first project within the ClinGen ecosystem to implement a service on the work produced by the ClinGen [Data Modeling WG](http://www.clinicalgenome.org/about/working-groups/data-model/){:target="other"}, specifically the Allele Model v0.1(beta). In actuality, this project will serve as the reference implementation of the Allele model, and as such, the model will remain in "beta" until the project is released for use. 

###Knowledge Curation Requirement
The Allele Registry is being developed initially to support the needs of the Sequence Variant Curation project being developed by the ClinGen group under the direction of [J. Michael Cherry, PhD](http://www.clinicalgenome.org/about/people/staff/j-michael-cherry-phd/){:target="other"} at the [Cherry Lab, Stanford University](http://cherrylab.stanford.edu/){:target="other"}. In addition to the Sequence Variant Curation application, this group is also developing ClinGen applications for Gene Curation, Structural Variant Curation and Actionability Curation.  The Sequence Variant Curation application is the first project to progress to a point where it requires a service to lookup and register sequence variant representations found by curators during the process of curating literature containing citable evidence to support the downstream process of developing a system to enable clinical domain expert groups to sign off on variant-disease assertions using evidence from all available sources in the community not the least of which is contained in unstructured publications. This expert based clinical assertion process is a core component in the roadmap to achieving the goals of ClinGen.

[![ClinGenDB-Curation Interface](http://datamodel.clinicalgenome.org/images/clingendb_curation_interface.png){: .img-responsive}](http://datamodel.clinicalgenome.org/images/clingendb_curation_interface.png)

###What is the ClinGenDB Infrastructure?
The allele registry is planned for implementation within the ClinGenDB using the [Genboree](http://genboree.org/site/){:target="alleleregistry"} infrastructure.  The Baylor development team is working with the DMWG Allele model to establish the document models needed to support the five resources; [CanonicalAllele](/resource/canonical_allele/index.html), [ContextualAllele](/resource/contextual_allele/index.html), [ReferenceSequence](/resource/reference_sequence/index.html), [Gene](/resource/gene/index.html), and [Provenance](/resource/provenance/index.html).

ClinGenDB may be considered a specialized version of the Genboree infrastructure. Specialized infrastructure has been developed on top of Genboree to create ClinGenDB.  The Baylor team has documentation on the [ClinGenDB Infrastructure](https://ncbiconfluence.ncbi.nlm.nih.gov/display/CLIN/ClinGenDB+Infrastructure){:target="other"} available in the internal ClinGen Confluence Site.  If you are interested in further details, please contact <clingen@clinicalgenome.org>. For a general technical details on the Genboree infrastructure please refer to the Genboree [site](http://genboree.org/site){:target="alleleregistry"}. 

###Requesting Access
The Allele Registry has not been released at this time. The current development environment is very active and may deviate from the documented model until such time as the we approach a stable release where we can synchronize both the Allele Model and Allele Registry documentation notes.

The gain access to the preliminary Allele Models in the ClinGenDB development environment, complete the steps below:

1. Establish Genboree credentials (user name and password) at [Genboree registration](http://genboree.org/java-bin/regform.jsp){:target="alleleregistry"}. This is the Genboree central login management system.
2. Using the credentials from step 1, login to [Genboree login](http://genboree.org/genboreeKB/login){:target="alleleregistry"} and logout. This establishes a resource needed by ClinGenDB.
3. After completing steps 1 and 2, send the email address used for registration in step 1 to <Ronak.Patel@bcm.edu>. Indicate your involvement with ClinGenDB in your email request and use the subject line "Requesting access to Allele Model".

###Exploring the Allele Model in ClinGenDB
The following is an informal set of internal instructions and links for members of the DMWG team to begin exploring the Allele Model that is under preliminary development in ClinGenDB. The information is provided here for convenience to those members and users that wish to have preliminary access.  It is our intention to update this documentation after the Allele Registry is released or after any significant development occur which may impact the instructions below.

{: .small}
>There are four resource document models: Gene, ReferenceSequence, ContextualAllele and CanonicalAllele uploaded into <genboree.org/genboreKB/>. Please note that the official Allele Registry is planned to be hosted on <clingenkb.org>, with similar structure, for 24x7 accessibility. With your login and passwd, you should be able to see <http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels>. If not please let me know.
>
>The redmine project where all the four collections are hosted can be found [here](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels).
>
>To go to four collections corresponding to four resources, use these links
>
>* [Gene_0.3](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=Gene_0.3){:target="alleleregistry"}
>* [ReferenceSequence_0.3](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=ReferenceSequence_0.3){:target="alleleregistry"}
>* [ContextualAllele_0.3](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=ContextualAllele_0.3){:target="alleleregistry"}
>* [CanonicalAllele_0.3](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=CanonicalAllele_0.3){:target="alleleregistry"}
>
><br/>
>Alternatively, collections can be accessed/switched using the pull down menu on left. 
>
>The documents can be searched in the search bar in the right side (look [here](http://genboree.org/genboreeKB/projects/genboreekb-introduction/wiki/Finding_a_Document){:target="alleleregistry"} for a hint). For additional information on document operations via the user interface please refer to the [Genboree Wiki](http://genboree.org/genboreeKB/projects/genboreekb-introduction/wiki){:target="alleleregistry"}. 
>
>Initially, the following subset of [Allele Model Examples](/implementation/examples/index.html) have been created in these collections
>
>{:.table .table-bordered .table-condensed}
>| Collection | Example Documents | 
>|----------------|----------------|
>| [Gene_0.3](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=Gene_0.3){:target="alleleregistry"} | [G101-ILK](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=Gene_0.3&doc=G101){:target="alleleregistry"}<br/> [G102-BRCA1](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=Gene_0.3&doc=G102){:target="alleleregistry"} |
>| [ReferenceSequence_0.3](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=ReferenceSequence_0.3){:target="alleleregistry"} | [RS201-NM_001014794.2-ILK](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=ReferenceSequence_0.3&doc=RS201&docVersion=){:target="alleleregistry"}<br/> [RS202-NC_000011.9-b37](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=ReferenceSequence_0.3&doc=RS202&docVersion=){:target="alleleregistry"}<br/>[RS203-NC_000011.10-b38](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=ReferenceSequence_0.3&doc=RS203&docVersion=){:target="alleleregistry"} |
>| [ContextualAllele_0.3](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=ContextualAllele_0.3){:target="alleleregistry"} | [SA301-NM_001014794.2-ILK-c.448+14A>G-b37](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=ContextualAllele_0.3&doc=SA301){:target="alleleregistry"}<br/>[SA302-NM_001014794.2-ILK-c.448+13A>G-b38](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=ContextualAllele_0.3&doc=SA302){:target="alleleregistry"}<br/>[SA303-NC_000011.9-g.6630034A>G-b37](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=ContextualAllele_0.3&doc=SA303){:target="alleleregistry"}<br/>[SA304-NC_000011.10-g.6608803A>G-b38](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=ContextualAllele_0.3&doc=SA304){:target="alleleregistry"} |
>| [CanonicalAllele_0.3](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=CanonicalAllele_0.3){:target="alleleregistry"} | [CA401-NM_001014794.2-c.448+13A>G](http://genboree.org/genboreeKB/genboree_kbs?project_id=allelemodels&coll=CanonicalAllele_0.3&doc=CA401){:target="alleleregistry"} |
>
>The Collection are in 
genbKB:       alleleModels3 
genbgroup:  myScratchForGenbreeKB. 
>
>This information should be sufficient to use scripts in <https://github.com/clinvar/apidemo/> for accessing documents through API. Please also see documents in NCBI confluence for [ClinGenDB introduction](https://ncbiconfluence.ncbi.nlm.nih.gov/display/CLIN/ClinGenDB+Infrastructure){:target="alleleregistry"}. 





