package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.ResourceReference;

/**
 * Associations to other SimpleAlleles.
 * 
 * <p>Java class for SimpleAllele.Related complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleAllele.Related">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://org.clingen.dm.allele.v1}SimpleAlleleRelationshipType" minOccurs="0"/>
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
@XmlType (name = "SimpleAllele.Related", propOrder = {"type", "target"})
public class SimpleAlleleRelated extends BackboneElement
{

	protected SimpleAlleleRelationshipType type;
	@XmlElement (required = true)
	protected ResourceReference target;

	/**
	 * Gets the value of the type property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link SimpleAlleleRelationshipType }
	 *     
	 */
	public SimpleAlleleRelationshipType getType()
	{
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link SimpleAlleleRelationshipType }
	 *     
	 */
	public void setType(SimpleAlleleRelationshipType value)
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
