package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.Element;

/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for CanonicalAlleleReplacementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CanonicalAlleleReplacementType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;attribute name="value" type="{http://org.clingen.dm.allele.v1}CanonicalAlleleReplacementType-list" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "CanonicalAlleleReplacementType")
public class CanonicalAlleleReplacementType extends Element
{

	@XmlAttribute (name = "value")
	protected CanonicalAlleleReplacementTypeList value;

	/**
	 * Gets the value of the value property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link CanonicalAlleleReplacementTypeList }
	 *     
	 */
	public CanonicalAlleleReplacementTypeList getValue()
	{
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link CanonicalAlleleReplacementTypeList }
	 *     
	 */
	public void setValue(CanonicalAlleleReplacementTypeList value)
	{
		this.value = value;
	}

}
