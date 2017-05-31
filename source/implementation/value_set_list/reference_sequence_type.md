---
title: reference-sequence-type
description: Codes providing the type of a reference sequence
source: Sequence Ontology
id: 5
usage: core
layout: model
model: allele
---

This value set uses codes provided by the Sequence Ontology (SO).


__Summary__

{:.table-condensed}
| Code System URL:  | http://clingen.org/model/allele/reference-sequence-type |
| Value Set URL:  | http://clingen.org/model/allele/vs/reference-sequence-type |
| Definition: | Codes providing the type of a reference sequence |

<br/>
Formal value Set definition : [XML](/main/resources/value-sets/canonical-allele-type.xml) or [JSON](/main/resources/value-sets/canonical-allele-type.json).

This value set defines its own codes:

This value set contains 2 concepts

### ReferenceSequenceType
Codes providing the type of a reference sequence

This value set defines its own terms in the system http://clingen.org/model/allele/reference-sequence-type

{:.table .table-bordered .table-condensed}
|Code|Display|Definition|
|----|-------|----------|
|[SO:0000673](http://www.sequenceontology.org/browser/current_svn/term/SO:0000673)|`transcript`| An RNA synthesized on a DNA or RNA template by an RNA polymerase. |
|[SO:0000704](http://www.sequenceontology.org/browser/current_svn/term/SO:0000704) |`gene`|A region (or regions) that includes all of the sequence elements necessary to encode a functional transcript.|
|[SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340)|`chromosome`|Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication.|
|[SO:0001237](http://www.sequenceontology.org/browser/current_svn/term/SO:0001237)|`amino_acid`|A sequence feature that corresponds to a single amino acid residue in a polypeptide.|


<br/>
This value set is used in the following places:

* [ReferenceSequence.referenceSequenceType](/resource/reference_sequence/index.html) Required
