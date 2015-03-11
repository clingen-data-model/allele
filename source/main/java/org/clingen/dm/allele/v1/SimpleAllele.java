package org.clingen.dm.allele.v1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Resource;
import org.hl7.fhir.ResourceReference;
import org.hl7.fhir.String;

/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for SimpleAllele complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleAllele">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="canonicalAllele" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="1" minOccurs="0"/>
 *         &lt;element name="sequenceClass" type="{http://org.clingen.dm.allele.v1}ReferenceSequenceClass"/>
 *         &lt;element name="nucleotideSequenceClass" type="{http://org.clingen.dm.allele.v1}ReferenceSequenceNucleotideClass"/>
 *         &lt;element name="allele" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="nucleotideChangeType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="aminoAcidChangeType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="alleleName" type="{http://org.clingen.dm.allele.v1}SimpleAllele.AlleleName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="referenceCoordinate" type="{http://org.clingen.dm.allele.v1}SimpleAllele.ReferenceCoordinate" maxOccurs="1" minOccurs="0"/>
 *         &lt;element name="related" type="{http://org.clingen.dm.allele.v1}SimpleAllele.Related" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "SimpleAllele", propOrder = {"identifier", "canonicalAllele", "sequenceClass",
												"nucleotideSequenceClass", "allele", "nucleotideChangeType",
												"aminoAcidChangeType", "alleleName", "referenceCoordinate", "related"})
public class SimpleAllele extends Resource
{

	protected List<Identifier> identifier;
	protected ResourceReference canonicalAllele;
	@XmlElement (required = true)
	protected ReferenceSequenceClass sequenceClass;
	protected ReferenceSequenceNucleotideClass nucleotideSequenceClass;
	protected String allele;
	protected CodeableConcept nucleotideChangeType;
	protected CodeableConcept aminoAcidChangeType;
	protected List<SimpleAlleleName> alleleName;
	protected SimpleAlleleReferenceCoordinate referenceCoordinate;
	protected List<SimpleAlleleRelated> related;

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
	 *     {@link ResourceReference }
	 *     
	 */
	public ResourceReference getCanonicalAllele()
	{
		return canonicalAllele;
	}

	/**
	 * Sets the value of the canonicalAllele property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ResourceReference }
	 *     
	 */
	public void setCanonicalAllele(ResourceReference value)
	{
		this.canonicalAllele = value;
	}

	/**
	 * Gets the value of the sequenceClass property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ReferenceSequenceClass }
	 *     
	 */
	public ReferenceSequenceClass getSequenceClass()
	{
		return sequenceClass;
	}

	/**
	 * Sets the value of the sequenceClass property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ReferenceSequenceClass }
	 *     
	 */
	public void setSequenceClass(ReferenceSequenceClass value)
	{
		this.sequenceClass = value;
	}

	/**
	 * Gets the value of the nucleotideSequenceClass property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ReferenceSequenceNucleotideClass }
	 *     
	 */
	public ReferenceSequenceNucleotideClass getNucleotideSequenceClass()
	{
		return nucleotideSequenceClass;
	}

	/**
	 * Sets the value of the nucleotideSequenceClass property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ReferenceSequenceNucleotideClass }
	 *     
	 */
	public void setNucleotideSequenceClass(ReferenceSequenceNucleotideClass value)
	{
		this.nucleotideSequenceClass = value;
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
	 * {@link SimpleAlleleName }
	 */
	public List<SimpleAlleleName> getAlleleName()
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
	 * {@link SimpleAlleleRelated }
	 */
	public List<SimpleAlleleRelated> getRelated()
	{
		return related;
	}
}
