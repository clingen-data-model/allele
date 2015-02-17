package org.clingen.dm.allele.v1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.Identifier;
import org.hl7.fhir.Resource;
import org.hl7.fhir.String;

/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Gene complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Device">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="symbol" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="alias" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "Gene", propOrder = {"identifier", "symbol", "name", "alias", "relatedReferenceSequence"})
public class Gene extends Resource
{

	@XmlElement (required = true)
	protected List<Identifier> identifier;
	protected String symbol;
	protected String name;
	protected List<String> alias;
	protected List<GeneRelatedReferenceSequence> relatedReferenceSequence;

	/**
	 * Gets the value of the identifier property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the identifier property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getIdentifier().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Identifier }
	 * 
	 * 
	 */
	public List<Identifier> getIdentifier()
	{
		if (identifier == null)
		{
			identifier = new ArrayList<Identifier>();
		}
		return this.identifier;
	}

	/**
	 * Gets the value of the symbol property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getSymbol()
	{
		return symbol;
	}

	/**
	 * Sets the value of the symbol property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setSymbol(String value)
	{
		this.symbol = value;
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
	 * Gets the value of the alias property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public List<String> getAlias()
	{
		return alias;
	}

	/**
	 * Gets the value of the relatedReferenceSequence property.
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
	 *    getRelatedReferenceSequence().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link GeneRelatedReferenceSequence }
	 */
	public List<GeneRelatedReferenceSequence> getRelatedReferenceSequence()
	{
		return relatedReferenceSequence;
	}

}
