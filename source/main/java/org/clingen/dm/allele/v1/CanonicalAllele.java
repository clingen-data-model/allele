package org.clingen.dm.allele.v1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.Boolean;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Resource;
import org.hl7.fhir.ResourceReference;

/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for CanonicalAllele complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CanonicalAllele">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="active" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="canonicalAlleleType" type="{http://org.clingen.dm.allele.v1}CanonicalAlleleType"/>
 *         &lt;element name="complexity" type="{http://org.clingen.dm.allele.v1}CanonicalAlleleComplexity"/>
 *         &lt;element name="replacement" type="{http://org.clingen.dm.allele.v1}CanonicalAllele.Replacement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedSimpleAllele" type="{http://org.clingen.dm.allele.v1}CanonicalAllele.RelatedSimpleAllele" maxOccurs="unbounded" minOccurs="1"/>
 *         &lt;element name="nested" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="composite" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "CanonicalAllele", propOrder = {"identifier", "active", "canonicalAlleleType", "complexity",
													"replacement", "relatedSimpleAllele", "nested", "composite"})
public class CanonicalAllele extends Resource
{

	protected Id id;
	protected String version;
	protected Meta meta;
	protected List<Identifier> identifier;
	protected Boolean active;
	@XmlElement (required = true)
	protected CanonicalAlleleType canonicalAlleleType;
	protected CanonicalAlleleComplexity complexity;
	protected List<CanonicalAlleleReplacement> replacement;
	protected List<CanonicalAlleleRelatedSimpleAllele> relatedSimpleAllele;
	protected List<ResourceReference> nested;
	protected ResourceReference composite;

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
	 * Gets the value of the relatedSimpleAllele property.
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
	 *    getRelatedSimpleAllele().add(newItem);
	 * </pre>
	 * s
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CanonicalAlleleRelatedSimpleAllele }
	 */
	public List<CanonicalAlleleRelatedSimpleAllele> getRelatedSimpleAllele()
	{
		return relatedSimpleAllele;
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
	 * {@link ResourceReference }
	 */
	public List<ResourceReference> getNested()
	{
		return nested;
	}

	/**
	 * Gets the value of the composite property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ResourceReference }
	 *     
	 */
	public ResourceReference getComposite()
	{
		return composite;
	}

	/**
	 * Sets the value of the composite property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ResourceReference }
	 *     
	 */
	public void setComposite(ResourceReference value)
	{
		this.composite = value;
	}
}
