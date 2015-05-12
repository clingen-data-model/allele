package org.clingen.dm.allele.v1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Integer;
import org.hl7.fhir.Reference;
import org.hl7.fhir.String;

/**
 * The Reference coordinate for a SimpleAlle. This is the locus relative to a single ReferenceSequence (genomic|transcript|amino acid).
 * 
 * <p>Java class for SimpleAllele.ReferenceCoordinate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleAllele.ReferenceCoordinate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="referenceSequence" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="start" type="{http://hl7.org/fhir}int"/>
 *         &lt;element name="end" type="{http://hl7.org/fhir}int"/>
 *         &lt;element name="refAllele" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="primaryTranscriptRegionType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="ancillaryTranscriptRegionType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0" maxOccurs="unbounded"/>
 *         &lt;element name="intronOffsetStart" type="{http://hl7.org/fhir}int"/>
 *         &lt;element name="intronOffsetEnd" type="{http://hl7.org/fhir}int"/>
 *         &lt;element name="intronOffsetDirection" type="{http://org.clingen.dm.allele.v1}SimpleAlleleIntronOffsetDirection"/>
 *         &lt;element name="intronOffsetGenomicCoordinate" type="{http://org.clingen.dm.allele.v1}SimpleAllele.ReferenceCoordinate"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "SimpleAllele.ReferenceCoordinate", propOrder = {"identifier", "referenceSequence", "start", "end",
																	"refAllele", "primaryTranscriptRegionType",
																	"ancillaryTranscriptRegionType",
																	"intronOffsetStart", "intronOffsetEnd",
																	"intronOffsetDirection",
																	"intronOffsetGenomicCoordinate"})
public class SimpleAlleleReferenceCoordinate extends BackboneElement
{

	protected List<Identifier> identifier;
	@XmlElement (required = true)
	protected Reference referenceSequence;
	protected Integer start;
	protected Integer end;
	protected String refAllele;
	protected CodeableConcept primaryTranscriptRegionType;
	protected List<CodeableConcept> ancillaryTranscriptRegionType;
	protected Integer intronOffsetStart;
	protected Integer intronOffsetEnd;
	protected SimpleAlleleIntronOffsetDirection intronOffsetDirection;
	protected SimpleAlleleReferenceCoordinate intronOffsetGenomicCoordinate;

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
	 * Gets the value of the referenceSequence property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Reference }
	 *     
	 */
	public Reference getReferenceSequence()
	{
		return referenceSequence;
	}

	/**
	 * Sets the value of the referenceSequence property.
	 * 
	 * @param referenceSequence
	 *     allowed object is
	 *     {@link Reference }
	 *     
	 */
	public void setReferenceSequence(Reference value)
	{
		this.referenceSequence = value;
	}

	/**
	 * Gets the value of the start property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Integer }
	 *     
	 */
	public Integer getStart()
	{
		return start;
	}

	/**
	 * Sets the value of the start property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Integer }
	 *     
	 */
	public void setStart(Integer value)
	{
		this.start = value;
	}

	/**
	 * Gets the value of the end property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Integer }
	 *     
	 */
	public Integer getEnd()
	{
		return end;
	}

	/**
	 * Sets the value of the end property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Integer }
	 *     
	 */
	public void setEnd(Integer value)
	{
		this.end = value;
	}

	/**
	 * Gets the value of the refAllele property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getRefAllele()
	{
		return refAllele;
	}

	/**
	 * Sets the value of the refAllele property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setRefAllele(String value)
	{
		this.refAllele = value;
	}

	/**
	 * Gets the value of the primaryTranscriptRegionType property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link CodeableConcept }
	 *     
	 */
	public CodeableConcept getPrimaryTranscriptRegionType()
	{
		return primaryTranscriptRegionType;
	}

	/**
	 * Sets the value of the primaryTranscriptRegionType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link CodeableConcept }
	 *     
	 */
	public void setPrimaryTranscriptRegionType(CodeableConcept value)
	{
		this.primaryTranscriptRegionType = value;
	}

	/**
	 * Gets the value of the ancillaryTranscriptRegionType property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the ancillaryRegionType property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getAncillaryTranscriptRegionType().add(newItem);
	 * </pre>
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link CodeableConcept }
	 */
	public List<CodeableConcept> getAncillaryTranscriptRegionType()
	{
		return ancillaryTranscriptRegionType;
	}

	/**
	 * Gets the value of the intronOffsetStart property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Integer }
	 *     
	 */
	public Integer getIntronOffsetStart()
	{
		return intronOffsetStart;
	}

	/**
	 * Sets the value of the intronOffsetStart property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Integer }
	 *     
	 */
	public void setIntronOffsetStart(Integer value)
	{
		this.intronOffsetStart = value;
	}

	/**
	 * Gets the value of the intronOffsetEnd property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Integer }
	 *     
	 */
	public Integer getIntronOffsetEnd()
	{
		return intronOffsetEnd;
	}

	/**
	 * Sets the value of the intronOffsetEnd property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Integer }
	 *     
	 */
	public void setIntronOffsetEnd(Integer value)
	{
		this.intronOffsetEnd = value;
	}

	/**
	 * Gets the value of the intronOffsetDirection property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link SimpleAlleleIntronOffsetDirection }
	 *     
	 */
	public SimpleAlleleIntronOffsetDirection getIntronOffsetDirection()
	{
		return intronOffsetDirection;
	}

	/**
	 * Sets the value of the intronOffsetDirection property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link SimpleAlleleIntronOffsetDirection }
	 *     
	 */
	public void setIntronOffsetDirection(SimpleAlleleIntronOffsetDirection value)
	{
		this.intronOffsetDirection = value;
	}

	/**
	 * Gets the value of the intronOffsetGenomicCoordinate property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link SimpleAlleleReferenceCoordinate }
	 *     
	 */
	public SimpleAlleleReferenceCoordinate getIntronOffsetGenomicCoordinate()
	{
		return intronOffsetGenomicCoordinate;
	}

	/**
	 * Sets the value of the intronOffsetGenomicCoordinate property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link SimpleAlleleReferenceCoordinate }
	 *     
	 */
	public void setIntronOffsetGenomicCoordinate(SimpleAlleleReferenceCoordinate value)
	{
		this.intronOffsetGenomicCoordinate = value;
	}

}
