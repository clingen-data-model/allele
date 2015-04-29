---
title: II. Coordinate Numbering Disparities
---

1. Intron Offset Effected by Reference Genome Version Update
---

In this scenario, we will demonstrate how an intronic position for a [CanonicalAllele](/allele/conceptual/canonical_allele/index.html) will change coordinates when moving from build 37 to 38.

(More explanation of the issue here)

Example Artifact Dependency Tree
- CanonicalAllele
  - SimpleAllele
    - ReferenceSequence
      - Gene
  - SimpleAllele 
    - ReferenceSequence
      - Gene


2. Reference Genome Build Errors
Previous versions of genome builds 
For example, position NM_001134363.2:c.2303 maps to Chr10:112572458 on GRCh37 and Chr10:110812700 on GRCh38. 
