package org.clingen.dm.allele.v1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Integer;
import org.hl7.fhir.Resource;
import org.hl7.fhir.ResourceReference;

/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for ReferenceSequence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceSequence">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier"/>
 *         &lt;element name="sequenceClass" type="{http://org.clingen.dm.allele.v1}ReferenceSequenceClass"/>
 *         &lt;element name="nucleotideSequenceClass" type="{http://org.clingen.dm.allele.v1}ReferenceSequenceNucleotideClass"/>
 *         &lt;element name="genomicSequenceClass" type="{http://org.clingen.dm.allele.v1}ReferenceSequenceGenomicClass" minOccurs="0"/>
 *         &lt;element name="chromosome" type="{http://org.clingen.dm.allele.v1}Chromosome" minOccurs="0"/>
 *         &lt;element name="cdsStart" type="{http://hl7.org/fhir}int" minOccurs="0"/>
 *         &lt;element name="cdsEnd" type="{http://hl7.org/fhir}int" minOccurs="0"/>
 *         &lt;element name="gene" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="1" minOccurs="0"/>
 *         &lt;element name="referenceGenome" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="1" minOccurs="0"/>
 *         &lt;element name="related" type="{http://org.clingen.dm.allele.v1}ReferenceSequence.Related" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "ReferenceSequence", propOrder = {"identifier", "sequenceClass", "nucleotideSequenceClass",
													"genomicSequenceClass", "chromosome", "cdsStart", "cdsEnd", "gene",
													"referenceGenome", "related"})
public class ReferenceSequence extends Resource
{

	@XmlElement (required = true)
	protected Identifier identifier;
	@XmlElement (required = true)
	protected ReferenceSequenceClass sequenceClass;
	protected ReferenceSequenceNucleotideClass nucleotideSequenceClass;
	protected ReferenceSequenceGenomicClass genomicSequenceClass;
	protected Chromosome chromosome;
	protected Integer cdsStart;
	protected Integer cdsEnd;
	protected ResourceReference gene;
	protected CodeableConcept referenceGenome;
	protected List<ReferenceSequenceRelated> related;

	/**
	 * Gets the value of the identifier property.
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Identifier }
	 * 
	 * 
	 */
	public Identifier getIdentifier()
	{
		return this.identifier;
	}

	/**
	 * Sets the value of the identifier property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Identifier }
	 *     
	 */
	public void setIdentifierl(Identifier value)
	{
		this.identifier = value;
	}

	/**
	 * Gets the value of the sequenceClass property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ReferenceSequenceClass }
	 *     
	 */
	public ReferenceSequenceClass getSequenceClass()
	{
		return sequenceClass;
	}

	/**
	 * Sets the value of the sequenceClass property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ReferenceSequenceClass }
	 *     
	 */
	public void setSequenceClass(ReferenceSequenceClass value)
	{
		this.sequenceClass = value;
	}

	/**
	 * Gets the value of the nucleotideSequenceClass property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ReferenceSequenceNucleotideClass }
	 *     
	 */
	public ReferenceSequenceNucleotideClass getNucleotideSequenceClass()
	{
		return nucleotideSequenceClass;
	}

	/**
	 * Sets the value of the nucleotideSequenceClass property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ReferenceSequenceNucleotideClass }
	 *     
	 */
	public void setNucleotideSequenceClass(ReferenceSequenceNucleotideClass value)
	{
		this.nucleotideSequenceClass = value;
	}

	/**
	 * Gets the value of the genomicSequenceClass property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ReferenceSequenceGenomicClass }
	 *     
	 */
	public ReferenceSequenceGenomicClass getGenomicSequenceClass()
	{
		return genomicSequenceClass;
	}

	/**
	 * Sets the value of the genomicSequenceClass property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ReferenceSequenceGenomicClass }
	 *     
	 */
	public void setGenomicSequenceClass(ReferenceSequenceGenomicClass value)
	{
		this.genomicSequenceClass = value;
	}

	/**
	 * Gets the value of the chromosome property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Chromosome }
	 *     
	 */
	public Chromosome getChromosome()
	{
		return chromosome;
	}

	/**
	 * Sets the value of the chromosome property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Chromosome }
	 *     
	 */
	public void setChromosome(Chromosome value)
	{
		this.chromosome = value;
	}

	/**
	 * Gets the value of the CDS start property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Integer }
	 *     
	 */
	public Integer getCdsStart()
	{
		return cdsStart;
	}

	/**
	 * Sets the value of the CDS start property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Integer }
	 *     
	 */
	public void setCdsStart(Integer value)
	{
		this.cdsStart = value;
	}

	/**
	 * Gets the value of the CDS end property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Integer }
	 *     
	 */
	public Integer getCdsEnd()
	{
		return cdsEnd;
	}

	/**
	 * Sets the value of the CDS end property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Integer }
	 *     
	 */
	public void setCdsEnd(Integer value)
	{
		this.cdsEnd = value;
	}

	/**
	 * Gets the value of the gene property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ResourceReference }
	 *     
	 */
	public ResourceReference getGene()
	{
		return gene;
	}

	/**
	 * Sets the value of the gene property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ResourceReference }
	 *     
	 */
	public void setGene(ResourceReference value)
	{
		this.gene = value;
	}

	/**
	 * Gets the value of the referenceGenome property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link CodeableConcept }
	 *     
	 */
	public CodeableConcept getReferenceGenome()
	{
		return referenceGenome;
	}

	/**
	 * Sets the value of the referenceGenome property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link CodeableConcept }
	 *     
	 */
	public void setReferenceGenome(CodeableConcept value)
	{
		this.referenceGenome = value;
	}

	/**
	 * Gets the value of the related (refseq) property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the relatedReferenceSequence property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getRelated().add(newItem);
	 * </pre>
	 * s
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ReferenceSequenceRelated }
	 */
	public List<ReferenceSequenceRelated> getRelated()
	{
		return related;
	}

}
