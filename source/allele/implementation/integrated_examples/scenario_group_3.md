---
title: III. Deletion/Insertion/Duplication/Frameshift Alleles
layout: model
model: allele

---

Discrepancies  in Indel Nomenclature
---
Due to different nomenclature guidelines (left versus right justification), a deletion or insertion Canonical Allele may have multiple contextual allele expressions on a single reference sequence.
For example, the deltaF508 variant in CFTR is the most common CF-causing variant. This variant results in an inframe deletion of a phenylalanine (Phe/F) at position p.508. 

| Reference   	| Coorindates   	| Deleted Nucleotides   	|
|---	|---	|---	|---	|---	|
| NC_000007.13 (GRCh37)  	| g.117199645_117199647delTCT   	| TCT   	|
| NC_000007.14 (GRCh38)   	| g.117559591_117559593delTCT   	| TCT   	|
| NC_000007.13 (GRCh37)  	| g.117199646_117199648delCTT   	| CTT   	|
| NC_000007.14 (GRCh38)   	| g.117559592_117559594delCTT   	| CTT   	|
| NM_000492.3   	| c.1520_1522delTCT   	| TCT   	|
| NM_000492.3   	| c.1521_1523delCTT   	| CTT   	|
| NP_000483.3   	| p.Phe508del   	|    	|

Although this Canonical Allele has multiple expressions on the same reference (such as c.1520_1522delTCT and c.1521_1523delCTT), all describe the same Canonical Allele.


Deletions with varying impact size depending on reference
---
| Reference   	| Coorindates   	| # of Deleted Nucleotides   	|
|---	|---	|---	|---	|---	|
| NC_000010.10 (GRCh37)  	| g.50701279_50708585del   	| 7306   	|
| NM_000124.2   	| c.1684_1705del   	| 21   	|

Based on the mRNA coordinates, this variant results in a deletion of 21 nucleotides with a predicted frameshift impact: p.Arg562LeufsX2. However, in actuality, this deletion spans an intron resulting in 7306 deleted nucleotides.
