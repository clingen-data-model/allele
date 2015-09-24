package org.clingen.dm.allele.v1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.Boolean;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Resource;
import org.hl7.fhir.String;

/**
 * If the element is present, it must have either a @value, an @id, or
 * extensions
 * 
 * <p>
 * Java class for CanonicalAllele complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CanonicalAllele">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" maxOccurs="1" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedIdentifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="active" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="canonicalAlleleType" type="{http://org.clingen.dm.allele.v1}CanonicalAlleleType" minOccurs="1" maxOccurs="1"/>
 *         &lt;element name="complexity" type="{http://org.clingen.dm.allele.v1}CanonicalAlleleComplexity" minOccurs="1" maxOccurs="1"/>
 *         &lt;element name="replacement" type="{http://org.clingen.dm.allele.v1}CanonicalAllele.Replacement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedContextualAllele" type="{http://org.clingen.dm.allele.v1}CanonicalAllele.RelatedContextualAllele" maxOccurs="unbounded" minOccurs="1"/>
 *         &lt;element name="nested" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="composite" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "CanonicalAllele", propOrder = {"version", "identifier", "relatedIdentifier", "active",
													"canonicalAlleleType", "complexity", "replacement",
													"relatedContextualAllele", "nested", "composite"})
public class CanonicalAllele extends Resource
{

	protected String version;
	protected List<Identifier> identifier;
	protected List<Identifier> relatedIdentifier;
	protected Boolean active;
	@XmlElement (required = true)
	protected CanonicalAlleleType canonicalAlleleType;
	protected CanonicalAlleleComplexity complexity;
	protected List<CanonicalAlleleReplacement> replacement;
	protected List<CanonicalAlleleRelatedContextualAllele> relatedContextualAllele;
	protected List<Reference> nested;
	protected List<Reference> composite;

	/**
	 * Gets the value of the version property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getVersion()
	{
		return version;
	}

	/**
	 * Sets the value of the version property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setVersion(String value)
	{
		this.version = value;
	}

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
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Identifier }
	 */
	public List<Identifier> getIdentifier()
	{
		return identifier;
	}

	/**
	 * Gets the value of the relatedIdentifier property.
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
	 *    getRelatedIdentifier().add(newItem);
	 * </pre>
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Identifier }
	 */
	public List<Identifier> getRelatedIdentifier()
	{
		return relatedIdentifier;
	}

	/**
	 * Gets the value of the active property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Boolean }
	 *     
	 */
	public Boolean getActive()
	{
		return active;
	}

	/**
	 * Sets the value of the active property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Boolean }
	 *     
	 */
	public void setActive(Boolean value)
	{
		this.active = value;
	}

	/**
	 * Gets the value of the canonicalAlleleType property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link CanonicalAlleleType }
	 *     
	 */
	public CanonicalAlleleType getCanonicalAlleleType()
	{
		return canonicalAlleleType;
	}

	/**
	 * Sets the value of the canonicalAlleleType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link CanonicalAlleleType }
	 *     
	 */
	public void setCanonicalAlleleType(CanonicalAlleleType value)
	{
		this.canonicalAlleleType = value;
	}

	/**
	 * Gets the value of the complexity property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link CanonicalAlleleComplexity }
	 *     
	 */
	public CanonicalAlleleComplexity getComplexity()
	{
		return complexity;
	}

	/**
	 * Sets the value of the complexity property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link CanonicalAlleleComplexity }
	 *     
	 */
	public void setComplexity(CanonicalAlleleComplexity value)
	{
		this.complexity = value;
	}

	/**
	 * Gets the value of the replacement name property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the alleleName property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getReplacement().add(newItem);
	 * </pre>
	 * s
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CanonicalAlleleReplacement }
	 */
	public List<CanonicalAlleleReplacement> getReplacement()
	{
		return replacement;
	}

	/**
	 * Gets the value of the relatedContextualAllele property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the alleleName property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getRelatedContextualAllele().add(newItem);
	 * </pre>
	 * s
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CanonicalAlleleRelatedContextualAllele }
	 */
	public List<CanonicalAlleleRelatedContextualAllele> getRelatedContextualAllele()
	{
		return relatedContextualAllele;
	}

	/**
	 * Gets the value of the nested property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the nested property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getNested().add(newItem);
	 * </pre>
	 * s
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Reference }
	 */
	public List<Reference> getNested()
	{
		return nested;
	}

	/**
	 * Gets the value of the composite property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the nested property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getComposite().add(newItem);
	 * </pre>
	 * s
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Reference }
	 */
	public List<Reference> getComposite()
	{
		return composite;
	}

}
