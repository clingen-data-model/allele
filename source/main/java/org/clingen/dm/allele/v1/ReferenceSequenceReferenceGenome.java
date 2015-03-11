package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.String;

/**
 * ReferenceSequence participation in Reference Genomes.
 * 
 * <p>Java class for ReferenceSequence.ReferenceGenome complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceSequence.ReferenceGenome">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "ReferenceSequence.ReferenceGenome", propOrder = {"identifier", "name"})
public class ReferenceSequenceReferenceGenome extends BackboneElement
{

	protected Identifier identifier;
	protected String name;

	/**
	 * Gets the value of the identifier property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Identifier }
	 *     
	 */
	public Identifier getIdentifier()
	{
		return identifier;
	}

	/**
	 * Sets the value of the identifier property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Identifier }
	 *     
	 */
	public void setIdentifier(Identifier value)
	{
		this.identifier = value;
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

}
