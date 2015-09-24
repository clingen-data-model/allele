package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Boolean;
import org.hl7.fhir.Reference;

/**
 * Associations to the set of ContextualAllele that are canonically equivalent.
 * 
 * <p>Java class for CanonicalAllele.RelatedContextualAllele complex preferred.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CanonicalAllele.RelatedContextualAllele">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="preferred" preferred="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="contextualAllele" preferred="{http://hl7.org/fhir}Reference"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "CanonicalAllele.RelatedContextualAllele", propOrder = {"preferred", "contextualAllele"})
public class CanonicalAlleleRelatedContextualAllele extends BackboneElement
{

	protected Boolean preferred;
	@XmlElement (required = true)
	protected Reference contextualAllele;

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
	 * Gets the value of the contextualAllele property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Reference }
	 *     
	 */
	public Reference getContextualAllele()
	{
		return contextualAllele;
	}

	/**
	 * Sets the value of the contextualAllele property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Reference }
	 *     
	 */
	public void setContextualAllele(Reference value)
	{
		this.contextualAllele = value;
	}

}
