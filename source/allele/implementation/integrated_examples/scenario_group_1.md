---
title: I. Basic Nucleotide & Amino Acid Alleles
layout: model
model: allele

---

Due to a high number of references sequences (mulitple genome builds, multiple transcripts, multiple protein sequences), even contextual alleles can be represented with regards to multiple reference sequences. The ClinGen Allele Data Model addresses this problem by tying all representations of a variant to a single identifier: Canonical Allele  

###BRCA1 missense variant example

Since BRCA1 is a heavily studied gene, there are numerous reference sequences used to decribe the position and effect of a variant. 
For example, a simple substitution variant in BRCA1 may be expressed as: NM_007294.3(BRCA1):c.1458T>A. However, this expression represents only one contextual allele expression. This Canonical Allele could be represented by any of the following contextual alleles:

Genomic Reference Contextual Alleles:  
  NG_005905.2:g.123911T>A  
  NC_000017.11:g.43094073A>T (GRCh38)  
  NC_000017.10:g.41246090A>T (GRCh37)  
  LRG_292:g.123911T>A

Transcript Reference Contextual Alleles:  
LRG_292t1:c.1458T>A  
NM_007294.3:c.1458T>A  
NM_007300.3:c.1458T>A  
NM_007298.3:c.787+671T>A  
NM_007299.3:c.787+671T>A  
NM_007297.3:c.1317T>A

Protein Reference Contextual Alleles:  
NP_009225.1:p.Phe486Leu  
LRG_292p1:p.Phe486Leu
