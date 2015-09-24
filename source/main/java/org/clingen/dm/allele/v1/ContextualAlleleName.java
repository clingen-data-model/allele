package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Boolean;
import org.hl7.fhir.String;

/**
 * The name or names of the contextualAllele it is associated with.
 * 
 * <p>Java class for ContextualAllele.AlleleName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextualAllele.AlleleName">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="nameType" type="{http://org.clingen.dm.allele.v1}ContextualAlleleNameType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="legacy" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="preferred" type="{http://hl7.org/fhir}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "ContextualAllele.AlleleName", propOrder = {"nameType", "name", "legacy", "preferred"})
public class ContextualAlleleName extends BackboneElement
{

	protected ContextualAlleleNameType nameType;
	@XmlElement (required = true)
	protected String name;
	protected Boolean legacy;
	protected Boolean preferred;

	/**
	 * Gets the value of the nameType property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ContextualAlleleNameType }
	 *     
	 */
	public ContextualAlleleNameType getNameType()
	{
		return nameType;
	}

	/**
	 * Sets the value of the nameType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ContextualAlleleNameType }
	 *     
	 */
	public void setNameType(ContextualAlleleNameType value)
	{
		this.nameType = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setName(String value)
	{
		this.name = value;
	}

	/**
	 * Gets the value of the legacy property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Boolean }
	 *     
	 */
	public Boolean getLegacy()
	{
		return legacy;
	}

	/**
	 * Sets the value of the legacy property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Boolean }
	 *     
	 */
	public void setLegacy(Boolean value)
	{
		this.legacy = value;
	}

	/**
	 * Gets the value of the preferred property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Boolean }
	 *     
	 */
	public Boolean getPreferred()
	{
		return preferred;
	}

	/**
	 * Sets the value of the preferred property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Boolean }
	 *     
	 */
	public void setPreferred(Boolean value)
	{
		this.preferred = value;
	}
}
