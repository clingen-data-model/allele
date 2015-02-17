package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.ResourceReference;

/**
 * Reference sequences that have definitive relationships to a Gene.
 * 
 * <p>Java class for Gene.RelatedReferenceSequence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Gene.RelatedReferenceSequence">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Gene.RelatedRefSeqType" minOccurs="0"/>
 *         &lt;element name="target" type="{http://hl7.org/fhir}ResourceReference"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "Gene.RelatedReferenceSequence", propOrder = {"type", "target"})
public class GeneRelatedReferenceSequence extends BackboneElement
{
	protected GeneRelatedRefSeqType type;
	@XmlElement (required = true)
	protected ResourceReference target;

	/**
	 * Gets the value of the type property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link GeneRelatedRefSeqType }
	 *     
	 */
	public GeneRelatedRefSeqType getType()
	{
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link GeneRelatedRefSeqType }
	 *     
	 */
	public void setType(GeneRelatedRefSeqType value)
	{
		this.type = value;
	}

	/**
	 * Gets the value of the target property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ResourceReference }
	 *     
	 */
	public ResourceReference getTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the target property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ResourceReference }
	 *     
	 */
	public void setTarget(ResourceReference value)
	{
		this.target = value;
	}

}
