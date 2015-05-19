---
title: canonical-allele-type
description: Codes providing the type of CanonicalAllele
source: Internal
id: 1
usage: core
---

This value set is defined by the ClinGen Data Modeling WG (Allele Domain).

__Summary__

{:.table-condensed}
| Code System URL:  | http://clingen.org/model/allele/canonical-allele-type |
| Value Set URL:  | http://clingen.org/model/allele/vs/canonical-allele-type |
| Definition: | Codes providing the type of a canonical allele |

<br/>
Formal value Set definition : [XML](/allele/main/resources/value-sets/canonical-allele-type.xml) or [JSON](/allele/main/resources/value-sets/canonical-allele-type.json).

This value set contains 2 concepts

### CanonicalAlleleType
Codes providing the type of a canonical allele

This value set defines its own terms in the system http://clingen.org/model/allele/canonical-allele-type

{:.table .table-bordered .table-condensed}
|Code|Display|Definition|
|----|-------|----------|
| simple-nucleotide | `simple-nucleotide`|The type of the canonical allele is nucleotide. All associated simple/canonical alleles are genomic or transcript based.|
| simple-amino-acid | `simple-amino-acid`|The type of the canonical allele is amino-acid. All associated simple/canonical alleles are amino acid based.|
| simple-combined | `simple-combined` | The type of canonical allele is a combined set of both nucleotide and amino-acid alleles. |
| complex-nucleotide | `complex-nucleotide`|The type of the canonical allele is nucleotide. All associated complex/canonical alleles are genomic or transcript based.|
| complex-amino-acid | `complex-amino-acid`|The type of the canonical allele is amino-acid. All associated complex/canonical alleles are amino acid based.|
| complex-combined | `complex-combined` | The type of canonical allele is a combined set of both nucleotide and amino-acid alleles. |


<br/>
This value set is used in the following places:

* [CanonicalAllele.canonicalAlleleType](/allele/resource/canonical_allele/index.html) Required