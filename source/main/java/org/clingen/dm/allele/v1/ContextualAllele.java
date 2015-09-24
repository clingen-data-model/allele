package org.clingen.dm.allele.v1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Resource;
import org.hl7.fhir.String;

/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for ContextualAllele complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextualAllele">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="canonicalAllele" type="{http://hl7.org/fhir}Reference" maxOccurs="1" minOccurs="0"/>
 *         &lt;element name="contextualAlleleType" type="{http://org.clingen.dm.allele.v1}ContextualAlleleType"/>
 *         &lt;element name="allele" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="primaryNucleotideChangeType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="ancillaryNucleotideChangeType" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="primaryAminoAcidChangeType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="ancillaryAminoAcidChangeType" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="alleleName" type="{http://org.clingen.dm.allele.v1}ContextualAllele.AlleleName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="referenceCoordinate" type="{http://org.clingen.dm.allele.v1}ContextualAllele.ReferenceCoordinate" maxOccurs="1" minOccurs="0"/>
 *         &lt;element name="related" type="{http://org.clingen.dm.allele.v1}ContextualAllele.Related" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "ContextualAllele", propOrder = {"identifier", "canonicalAllele", "contextualAlleleType", "allele",
												"primaryNucleotideChangeType", "ancillaryNucleotideChangeType",
												"primaryAminoAcidChangeType", "ancillaryAminoAcidChangeType",
												"alleleName", "referenceCoordinate", "related"})
public class ContextualAllele extends Resource
{

	protected List<Identifier> identifier;
	protected Reference canonicalAllele;
	@XmlElement (required = true)
	protected ContextualAlleleType contextualAlleleType;
	protected String allele;
	protected CodeableConcept primaryNucleotideChangeType;
	protected List<CodeableConcept> ancillaryNucleotideChangeType;
	protected CodeableConcept primaryAminoAcidChangeType;
	protected List<CodeableConcept> ancillaryAminoAcidChangeType;
	protected List<ContextualAlleleName> alleleName;
	protected ContextualAlleleReferenceCoordinate referenceCoordinate;
	protected List<ContextualAlleleRelated> related;

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
	 * Gets the value of the canonicalAllele property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Reference }
	 *     
	 */
	public Reference getCanonicalAllele()
	{
		return canonicalAllele;
	}

	/**
	 * Sets the value of the canonicalAllele property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Reference }
	 *     
	 */
	public void setCanonicalAllele(Reference value)
	{
		this.canonicalAllele = value;
	}

	/**
	 * Gets the value of the contextualAlleleType property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ContextualAlleleType }
	 *     
	 */
	public ContextualAlleleType getContextualAlleleType()
	{
		return contextualAlleleType;
	}

	/**
	 * Sets the value of the contextualAlleleType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ContextualAlleleType }
	 *     
	 */
	public void setContextualAlleleType(ContextualAlleleType value)
	{
		this.contextualAlleleType = value;
	}

	/**
	 * Gets the value of the allele property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getAllele()
	{
		return allele;
	}

	/**
	 * Sets the value of the allele property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setAllele(String value)
	{
		this.allele = value;
	}

	/**
	 * Gets the value of the primaryNucleotideChangeType property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link CodeableConcept }
	 *     
	 */
	public CodeableConcept getPrimaryNucleotideChangeType()
	{
		return primaryNucleotideChangeType;
	}

	/**
	 * Sets the value of the primaryNucleotideChangeType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link CodeableConcept }
	 *     
	 */
	public void setPrimaryNucleotideChangeType(CodeableConcept value)
	{
		this.primaryNucleotideChangeType = value;
	}

	/**
	 * Gets the value of the ancillaryNucleotideChangeType property.
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
	 *    getAncillaryNucleotideChangeType().add(newItem);
	 * </pre>
	 * s
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CodeableConcept }
	 */
	public List<CodeableConcept> getAncillaryNucleotideChangeType()
	{
		return ancillaryNucleotideChangeType;
	}

	/**
	 * Gets the value of the primaryAminoAcidChangeType property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link CodeableConcept }
	 *     
	 */
	public CodeableConcept getPrimaryAminoAcidChangeType()
	{
		return primaryAminoAcidChangeType;
	}

	/**
	 * Sets the value of the primaryAminoAcidChangeType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link CodeableConcept }
	 *     
	 */
	public void setPrimaryAminoAcidChangeType(CodeableConcept value)
	{
		this.primaryAminoAcidChangeType = value;
	}

	/**
	 * Gets the value of the ancillaryAminoAcidChangeType property.
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
	 *    getAncillaryAminoAcidChangeType().add(newItem);
	 * </pre>
	 * s
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CodeableConcept }
	 */
	public List<CodeableConcept> getAncillaryAminoAcidChangeType()
	{
		return ancillaryAminoAcidChangeType;
	}

	
	/**
	 * Gets the value of the allele name property.
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
	 *    getAlleleName().add(newItem);
	 * </pre>
	 * s
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ContextualAlleleName }
	 */
	public List<ContextualAlleleName> getAlleleName()
	{
		return alleleName;
	}

	/**
	 * Gets the value of the related property.
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
	 *    getRelated().add(newItem);
	 * </pre>
	 * s
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ContextualAlleleRelated }
	 */
	public List<ContextualAlleleRelated> getRelated()
	{
		return related;
	}
}
