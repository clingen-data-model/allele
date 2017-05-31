---
title: canonical-allele-type
description: Codes providing the type of CanonicalAllele
source: Internal
id: 1
usage: core
layout: model
model: allele

---

This value set is defined by the ClinGen Data Modeling WG (Allele Domain).

__Summary__

{:.table-condensed}
| Code System URL:  | http://clingen.org/model/allele/canonical-allele-type |
| Value Set URL:  | http://clingen.org/model/allele/vs/canonical-allele-type |
| Definition: | Codes providing the type of a canonical allele |

<br/>
Formal value Set definition : [XML](/source/main/resources/value-sets/canonical-allele-type.xml) or [JSON](/source/main/resources/value-sets/canonical-allele-type.json).

This value set contains 2 concepts

### CanonicalAlleleType
Codes providing the type of a canonical allele

This value set defines its own terms in the system http://clingen.org/model/allele/canonical-allele-type

{:.table .table-bordered .table-condensed}
Code| Display |Definition
----|---------|
nucleotide|nucleotide|The type of the canonical allele is nucleotide. All associated alleles are genomic or transcript based.
amino-acid|amino-acid|The type of the canonical allele is amino-acid. All associated alleles are amino acid based.

<br/>
This value set is used in the following places:

* [CanonicalAllele.canonicalAlleleType](/resource/canonical_allele/index.html) Required
