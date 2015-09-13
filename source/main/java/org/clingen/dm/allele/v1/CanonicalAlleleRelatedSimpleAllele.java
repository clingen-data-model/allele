package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Boolean;
import org.hl7.fhir.Reference;

/**
 * Associations to the set of SimpleAlleles that are canonically equivalent.
 * 
 * <p>Java class for CanonicalAllele.RelatedSimpleAllele complex preferred.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CanonicalAllele.RelatedSimpleAlleled">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="preferred" preferred="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="simpleAllele" preferred="{http://hl7.org/fhir}Reference"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "CanonicalAllele.RelatedSimpleAllele", propOrder = {"preferred", "simpleAllele"})
public class CanonicalAlleleRelatedSimpleAllele extends BackboneElement
{

	protected Boolean preferred;
	@XmlElement (required = true)
	protected Reference simpleAllele;

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

	/**
	 * Gets the value of the simpleAllele property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Reference }
	 *     
	 */
	public Reference getSimpleAllele()
	{
		return simpleAllele;
	}

	/**
	 * Sets the value of the simpleAllele property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Reference }
	 *     
	 */
	public void setSimpleAllele(Reference value)
	{
		this.simpleAllele = value;
	}

}
