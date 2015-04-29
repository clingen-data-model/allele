---
title: II. Coordinate Numbering Disparities
---

1. ILK Intron Offset Effected by Reference Genome Version Update
    
    In this scenario, we will demonstrate how an intronic position for a [CanonicalAllele](/allele/conceptual/canonical_allele/index.html) will change coordinates when moving from build 37 to 38.
    
    (More explanation of the issue here)
    
    Example Artifact Dependency Tree
    
    - CanonicalAllele
        - SimpleAllele1
            - ReferenceSequence
                - Gene
        - SimpleAllele2
            - ReferenceSequence
                - Gene


2. Reference Genome Build Errors
Versions of genome builds may vary in which allele is called the reference allele as previous genome builds often incorporated a minor allele as the reference allele.   
|Reference Build  |Reference Allele |  
|NM_001134363.2:c.2303  | C |  
|Chr10:112572458; GRCh37 | G |   
|Chr10:110812700; GRCh38  | C | 

Build GRCh37 references a minor allele (G) thus this position has been updated in GRCh38 to reference the major allele (C). The following simple allele expresssions all accurately describe the C allele at this position:

Genomic Reference Simple Alleles:  
  NG_021177.1:g.173304G>C  
  LRG_382:g.173304G>C 
  NC_000010.10:g.112572458G>C (GRCh37)  
  NC_000010.11:g.110812700C= (GRCh38)  
  (note that GRCh37 describes this Canonical Allele as a substitution variant while GRCh38 describes this Canonical Allele as as the reference allele - both are descrbing a C allele at this position)

mRNA Transcript Reference Simple Alleles:  
NM_001134363.1:c.2303G>C 
NM_001134363.2:c.2303C=  
(note that different versions of the same mRNA transcript also describe the C allele as either a substitution or the reference allele)

Protein Reference Simple Alleles:  
NP_001127835.1:p.Trp768Ser  
NP_001127835.2:p.Ser768=  
(Note that different versions of the same protein reference associate the C alelle as either a missense change or the reference residue)  
