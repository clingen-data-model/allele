---
title: Releases
description: The process for versioning the conceptual models and associated resources within the ClinGen Data Model.
layout: home
 
---

{: .lead}
The Data Model working group is releasing the data model in stages, with some aspects of the model developed before others. Our work is prioritized according to the needs of the ClinGen project as set by the steering committee. Caution is recommended when basing implementations on this data model, as there is not yet a stable (final) release of any aspect of the model.

It is recommended that you use this model as a guide if you are implementing projects that require structured allelic data within the context of the ClinGen project, as this will be the standard for projects across the consortium. Understand, however, that there will likely be a requirement to change aspects of your code to conform with the model as it evolves.

[Development](http://datamodel.clinicalgenome.org/development)
-------------------

This is the current working version of the DMWG. As this is a work in progress, errors and inconsistencies are likely to exist.

#### Allele Model

The overall concept of the allele model is preserved from v0.1, however a few significant aspects have changed:

* SimpleAllele was renamed to ContextualAllele, and related entities were renamed appropriately. The term ContextualAllele better represents the concept behind the name, and is less overloaded.
* Intronic coordinates are no longer addressable without reference to a genomic reference sequence. Having this feature added significant complexity to the model for relatively little gain in expressiveness.

#### Assertion Model

Early conceptual work on the Assertion Model is in this version, however a complete and implementable verison of this model has not yet been developed.

[Version 0.1](http://datamodel.clinicalgenome.org/0.1)
---------------

##### August 5, 2015

#### Allele Model

This version represents the first complete iteration of the Allele model.
