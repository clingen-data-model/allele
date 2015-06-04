---
title: Release Management 
description: The process for versioning the conceptual models and associated resources within the ClinGen Data Model.
layout: home
 
---

Overview
--------

The Data Model working group is releasing the data model in stages, with some aspects of the model developed before others. The Allele model is in a pre-release status, while the Assertion model is in conceptual development (there is no page on this site for it presently). We will prioritize our work according to the needs of the ClinGen project as set by the steering committee.

At this time we recommend caution when basing implementations on this data model, as there is not yet a stable (final) release of any aspect of the model.

Allele model
------------

The [allele model](/allele) is in pre-release status. The structure of the conceptual model has been stable for several iterations, although variables have changed. The [Allele Registry](/allele/implementation/applications) is being built as a first implementation of this model. As a consequence, significant aspects of this model can change as new requirements and weaknesses are discovered during implementation.

It is recommended that you use this model as a guide if you are implementing projects that require structured allelic data within the context of the ClinGen project, as this will be the standard for projects across the consortium. Understand, however, that there will likely be a requirement to change aspects of your code to conform with the model as it evolves.

Assertion model
---------------

This model is in early conceptual stages and is not yet ready for publication and distribution within ClinGen. We will share the model on this site when it has been developed to the extent that a reference implementation can be built around it.
