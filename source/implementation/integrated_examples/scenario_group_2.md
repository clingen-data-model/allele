---
title: II. Coordinate Numbering Disparities
layout: model
model: allele

---

1. ILK Intron Offset Effected by Reference Genome Version Update
    
    In this scenario, we will demonstrate how an intronic position for a [CanonicalAllele](/conceptual/canonical_allele/index.html) will change coordinates when moving from build 37 to 38.

Often the reference allele is modified between genome builds, however occasionally a reference allele from one build is absent from another which impacts the corresponding coordinates used to describe an allele at a specific position. 

| Genome Build  	| C repeats  	| Genomic Coordinates  	| ILK NM_001014794.2 coorindates	|
|---	|---	|---	|---	|
| GRCh37  	| 5  	| Chr11:6630029-6630033  	| c.448+9_c.448+13  	|
| GRCh38  	| 4  	| Chr11:6608799-6608802  	| c.448+9_c.448+12  	|

To describe the Canonical Allele of four C nucleotide repeats, the following contextual allele expressions are valid:  

Genomic Reference Contextual Alleles:    
  NC_000011.9:g.6630033delC (GRCh37)   
  NC_000011.10:g.?????????? (GRCh38)   
 
mRNA Transcript Reference Contextual Alleles:    
NM_004517.2:c.448+13delC   
NM_004517.2:c.448+12_c.488+13CA (?????) (no change)   
(note that since mRNA references sequences do not include intronic nucleotides, this Canonical Allele can be represented as a deletion or no change on the same versioned transcript)

The differences in repeat length will also affect the coordinates for surrounding alleles. For example, an A allele is the reference allele immediately downstream of the C repeats. However, depending on which genome build is used, any variant at this A allele will have different coordinate representations in a single mRNA transcript. For exmaple, if the A reference allele immediatedly downstream of the C repeats is substituted with a T (A>T), the following mRNA transcript contextrual alleles  are valid:  
NM_004517.2:c.448+14A>T (with respect to GRCh37)   
NM_004517.2:c.448+13A>T (with respect to GRCh38)  

While the allele positions within the mRNA reference changes, both contextual alleles are describing the same Canonical Allele.

    
    (More explanation of the issue here)
    
    Example Artifact Dependency Tree
    
    - CanonicalAllele
        - Contextual Allele 1
            - ReferenceSequence
                - Gene
        - Contextual Allele 2
            - ReferenceSequence
                - Gene


2. Reference Genome Build Errors
Versions of genome builds may vary in which allele is called the reference allele as previous genome builds often incorporated a minor allele as the reference allele.   

| Reference Build & Coordinate   	| Reference Allele   	|
|---	|---	|---	|---	|---	|
| NM_001134363.2:c.2303   	| C   	|
| Chr10:112572458; GRCh37   	| G   	|
| Chr10:110812700; GRCh38   	| C   	|

Build GRCh37 references a minor allele (G) thus this position has been updated in GRCh38 to reference the major allele (C). The following contextual allele expresssions all accurately describe the C allele at this position:

Genomic Reference Contextual Alleles:  
  NG_021177.1:g.173304G>C  
  LRG_382:g.173304G>C   
  NC_000010.10:g.112572458G>C (GRCh37)    
  NC_000010.11:g.110812700C= (GRCh38)  
  (note that GRCh37 describes this Canonical Allele as a substitution variant while GRCh38 describes this Canonical Allele as as the reference allele - both are descrbing a C allele at this position)

mRNA Transcript Reference Contextual Alleles:  
NM_001134363.1:c.2303G>C   
NM_001134363.2:c.2303C=    
(note that different versions of the same mRNA transcript also describe the C allele as either a substitution or the reference allele)

Protein Reference Contextual Alleles:  
NP_001127835.1:p.Trp768Ser    
NP_001127835.2:p.Ser768=    
(Note that different versions of the same protein reference associate the C alelle as either a missense change or the reference residue)  
