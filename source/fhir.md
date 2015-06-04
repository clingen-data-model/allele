---
title: FHIR
layout: home

---

[Fast Healthcare Interoperability Resources](http://wiki.hl7.org/index.php?title=FHIR) is an HL7 resource model representing clinical concepts.   FHIR models core concepts, providing a system of resources that cover common situations.  Further, FHIR allows for extensions via profiles to cover more specialized situations.

FHIR represents an example of a well-documented resource model in a clinical domain, and a model in which there is significant community interest and involvement.   As such, the Data Model Working Group has used FHIR as a model in how to construct resources and documentation.  Further, several resources in the Allele model, such as Identifier, are based on analogous FHIR resources.

Integration of genomic data with medical records is a current topic of interest in both clinical genomic and medical informatics communities.  The ClinGen allele model is a suitable basis for constructing statments about measurement and interpretation of genomic alleles.   While integration between the Allele model and FHIR would be a benefit from this point of view, the Data Model Working Group has not constructed the Allele model as a FHIR extension.  Future versions of the Allele model may move in this direction.

If future versions are to acheive FHIR integration, several problems must be addressed.   First, FHIR profiles are not allowed to create new resource types, but only to modify the core resources.  Given the complexity of the Allele (and subsequent) data models in the ClinGen ecosystem, the Working Group found this to be a significant barrier.  Second, one of the core systems in ClinGen, the ClinGenDB, is being constructed based on the use of linked data, including the JSON-LD specification.  JSON-LD is a format that serializes RDF in a JSON message, bringing the promise of semantic web technologies to the ClinGen data.  However, the relationship between RDF and the FHIR-JSON serialization is still a working topic in the FHIR and JSON-LD commmunities, so the Working Group decided to let this topic mature further.
