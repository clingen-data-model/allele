package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Boolean;
import org.hl7.fhir.Reference;

/**
 * The replacement canonical alleles and the replacement type.
 * 
 * <p>Java class for CanonicalAllele.Replacement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CanonicalAllele.Replacement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="replacementType" type="{http://org.clingen.dm.allele.v1}CanonicalAlleleReplacementType" minOccurs="0"/>
 *         &lt;element name="split" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="target" type="{http://org.clingen.dm.allele.v1}Reference"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * s
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "CanonicalAllele.Replacement", propOrder = {"replacementType", "split", "target"})
public class CanonicalAlleleReplacement extends BackboneElement
{

	protected CanonicalAlleleReplacementType replacementType;
	@XmlElement (required = true)
	protected Boolean split;
	protected Reference target;

	/**
	 * Gets the value of the replacementType property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link CanonicalAlleleReplacementType }
	 *     
	 */
	public CanonicalAlleleReplacementType getReplacementType()
	{
		return replacementType;
	}

	/**
	 * Sets the value of the replacementType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link CanonicalAlleleReplacementType }
	 *     
	 */
	public void setReplacementType(CanonicalAlleleReplacementType value)
	{
		this.replacementType = value;
	}

	/**
	 * Gets the value of the split property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Boolean }
	 *     
	 */
	public Boolean getSplit()
	{
		return split;
	}

	/**
	 * Sets the value of the split property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Boolean }
	 *     
	 */
	public void setSplit(Boolean value)
	{
		this.split = value;
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
