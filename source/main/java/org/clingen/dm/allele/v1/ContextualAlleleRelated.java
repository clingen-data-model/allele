package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Reference;

/**
 * Associations to other ContextualAlleles.
 * 
 * <p>Java class for ContextualAllele.Related complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextualAllele.Related">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="relatedType" type="{http://org.clingen.dm.allele.v1}ContextualAlleleRelationshipType" minOccurs="0"/>
 *         &lt;element name="target" type="{http://hl7.org/fhir}Reference"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "ContextualAllele.Related", propOrder = {"relatedType", "target"})
public class ContextualAlleleRelated extends BackboneElement
{

	protected ContextualAlleleRelationshipType relatedType;
	@XmlElement (required = true)
	protected Reference target;

	/**
	 * Gets the value of the relatedType property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ContextualAlleleRelationshipType }
	 *     
	 */
	public ContextualAlleleRelationshipType getRelatedType()
	{
		return relatedType;
	}

	/**
	 * Sets the value of the relatedType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ContextualAlleleRelationshipType }
	 *     
	 */
	public void setRelatedType(ContextualAlleleRelationshipType value)
	{
		this.relatedType = value;
	}

	/**
	 * Gets the value of the target property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Reference }
	 *     
	 */
	public Reference getTarget()
	{
		return target;
	}

	/**
	 * Sets the value of the target property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Reference }
	 *     
	 */
	public void setTarget(Reference value)
	{
		this.target = value;
	}

}
