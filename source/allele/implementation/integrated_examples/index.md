---
title: Integrated Examples
---

Introduction
---

When creating a central repository for genomic variants, it is critical to ensure that any representation of the same allele be recognized as such. An allele may be represented multiple ways for a variety of reasons such as use of historical versus standardized nomenclature or use of different reference sequences.  The ClinGen Allele Data Model v0.1 addresses this by tying all representation of an allele to a single identifier, referred to as the [CanonicalAllele](/allele/conceptual/canonical_allele/index.html).

In practice, a clinician may review a genetic test report for Gaucher disease which describes a variant in the GBA gene, c.1226A>G (N409S), using the standardized description in Human Genome Variation Society (HGVS) nomenclature. Historically, and throughout the literature however, this allele was referred to as N370S.  If the clinician makes this connection, he or she will use N409S and N370S interchangeably as they search literature or variant databases for information on this variant. However, making this connection between representations of the same allele is often not straightforward.  Therefore, a consistent method for doing so is needed.  For this reason, the ClinGen Allele Data Model v0.1 instituted the [CanonicalAllele](/allele/conceptual/canonical_allele/index.html) to serve as the connection between different representations of the same allele.  

