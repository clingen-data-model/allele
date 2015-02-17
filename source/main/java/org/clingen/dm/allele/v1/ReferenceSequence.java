package org.clingen.dm.allele.v1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * &lt;complexType name="Device">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier"/>
 *         &lt;element name="sequenceType" type="{http://hl7.org/fhir}ReferenceSequenceType"/>
 *         &lt;element name="chromosome" type="{http://hl7.org/fhir}ReferenceSequenceChromosome" minOccurs="0"/>
 *         &lt;element name="genomicSubType" type="{http://hl7.org/fhir}ReferenceSequenceGenomicSubType" minOccurs="0"/>
 *         &lt;element name="codingRegionOffset" type="{http://hl7.org/fhir}int minOccurs="0""/>
 *         &lt;element name="gene" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="1" minOccurs="0"/>
 *         &lt;element name="referenceGenome" type="{http://hl7.org/fhir}ReferenceSequence.ReferenceGenome" maxOccurs="1" minOccurs="0"/>
 *         &lt;element name="related" type="{http://hl7.org/fhir}ReferenceSequence.Related" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "ReferenceSequence", propOrder = {"identifier", "sequenceType", "chromosome", "genomicSubType",
													"codingRegionOffset", "gene", "referenceGenome", "related"})
public class ReferenceSequence extends Resource
{

	@XmlElement (required = true)
	protected Identifier identifier;
	@XmlElement (required = true)
	protected ReferenceSequenceType sequenceType;
	protected ReferenceSequenceChromosome chromosome;
	protected ReferenceSequenceGenomicSubType genomicSubType;
	protected Integer codingRegionOffset;
	protected ResourceReference gene;
	protected List<ReferenceSequenceRelated> related;
	protected ReferenceSequenceReferenceGenome referenceGenome;

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
	 * Gets the value of the sequenceType property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ReferenceSequenceType }
	 *     
	 */
	public ReferenceSequenceType getSequenceType()
	{
		return sequenceType;
	}

	/**
	 * Sets the value of the sequenceType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ReferenceSequenceType }
	 *     
	 */
	public void setSequenceType(ReferenceSequenceType value)
	{
		this.sequenceType = value;
	}

	/**
	 * Gets the value of the chromosome property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ReferenceSequenceChromosome }
	 *     
	 */
	public ReferenceSequenceChromosome getChromosome()
	{
		return chromosome;
	}

	/**
	 * Sets the value of the chromosome property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ReferenceSequenceChromosome }
	 *     
	 */
	public void setChromosome(ReferenceSequenceChromosome value)
	{
		this.chromosome = value;
	}

	/**
	 * Gets the value of the genomicSubType property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ReferenceSequenceGenomicSubType }
	 *     
	 */
	public ReferenceSequenceGenomicSubType getGenomicSubType()
	{
		return genomicSubType;
	}

	/**
	 * Sets the value of the genomicSubType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ReferenceSequenceGenomicSubType }
	 *     
	 */
	public void setGenomicSubType(ReferenceSequenceGenomicSubType value)
	{
		this.genomicSubType = value;
	}

	/**
	 * Gets the value of the codingRegionOffset property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link int }
	 *     
	 */
	public Integer getCodingRegionOffset()
	{
		return codingRegionOffset;
	}

	/**
	 * Sets the value of the codingRegionOffset property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link int }
	 *     
	 */
	public void setCodingRegionOffset(Integer value)
	{
		this.codingRegionOffset = value;
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
