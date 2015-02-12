---
title: GeneIdentifier
description: A name for a gene granted by a recognized naming agency such as NCBI or HGNC

---

Scope and Usage
---------------

Names are given to genes by public organizations, and these names are then shared among the scientific community.  The fact that there are multiple naming organizations, plus the existence of historical names means that there will potentially be different names for the same gene.

GeneIdentifier tracks the name given to gene, along with the agency that produced the name.  Because the same name could be given to different genes by different agencies, the (agency, name) pair must be used to compare GeneIdentifiers.

Exclusions and Limitations
--------------------------

Over time, naming agencies may deprecate a name in favor of a new name.   When this occurs, a GeneIdentifier with the old name is marked as invalid, and should no longer be used for either identification or display purposes.  However, other than via the inclusion of a new GeneIdentifier with the new name, the current data model does not track the history of GeneIdentifiers.
