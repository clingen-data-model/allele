---
title: canonical-allele-complexity
description: Codes providing the multiplicity of simple to canonical allele relationships.
source: Internal
id: 8
usage: core
layout: model
model: allele

---

This is a value set defined by the ClinGen Data Modeling WG (Allele Domain).

__Summary__

{:.table-condensed}
| Code System URL:  | http://clingen.org/model/allele/canonical-allele-complexity |
| Value Set URL:  | http://clingen.org/model/allele/vs/canonical-allele-complexity |
| Definition: | Codes providing the complexity of a canonical allele |

<br/>
Formal value Set definition : [XML](/main/resources/value-sets/canonical-allele-complexity.xml) or [JSON](/main/resources/value-sets/canonical-allele-complexity.json).

This value set contains 2 concepts.

{:.table .table-bordered .table-condensed}
|Code|Display|Definition|
|----|-------|----------|
| simple | `simple`| A canonical allele that is defined as an aggregation of equivalent ContextualAlleles.|
| complex | `complex` | A canonical allele that is a composition of multiple CanonicalAlleles; a haplotype. |

