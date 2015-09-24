package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Integer;
import org.hl7.fhir.Reference;

/**
 * The Reference coordinate for a ContextualAllele. This is the locus relative to a single ReferenceSequence (genomic|transcript|amino acid).
 * 
 * <p>Java class for ContextualAllele.ReferenceCoordinate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextualAllele.ReferenceCoordinate.Position">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="index" type="{http://hl7.org/fhir}int"/>
 *         &lt;element name="externalOffsetLength" type="{http://hl7.org/fhir}int" maxOccurs="1" minOccurs="0"/>
 *         &lt;element name="externalOffsetDirection" type="{http://org.clingen.dm.allele.v1}ContextualAlleleExternalOffsetDirection" maxOccurs="1" minOccurs="0"/>
 *         &lt;element name="externalGenomicReferenceSequence" type="{http://hl7.org/fhir}Reference" maxOccurs="1" minOccurs="0"/>
 *         &lt;element name="externalGenomicPositionIndex" type="{http://hl7.org/fhir}int" maxOccurs="1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "ContextualAllele.ReferenceCoordinate.Position", propOrder = {"index",
																	"externalOffsetLength",
																	"externalOffsetDirection",
																	"externalGenomicReferenceSequence",
																	"externalGenomicPositionIndex"})
public class ContextualAlleleReferenceCoordinatePosition extends BackboneElement
{
	@XmlElement (required = true)
	protected Integer index;
	protected Integer externalOffsetLength;
	protected ContextualAlleleExternalOffsetDirection externalOffsetDirection;
	protected Reference externalGenomicReferenceSequence;
	protected Integer externalGenomicPositionIndex;

	/**
	 * Gets the value of the index property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Integer }
	 *     
	 */
	public Integer getIndex()
	{
		return index;
	}

	/**
	 * Sets the value of the index property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Integer }
	 *     
	 */
	public void setIndex(Integer value)
	{
		this.index = value;
	}
	
	/**
	 * Gets the value of the externalOffsetLength property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Integer }
	 *     
	 */
	public Integer getExternalOffsetLength()
	{
		return externalOffsetLength;
	}

	/**
	 * Sets the value of the externalOffsetLength property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Integer }
	 *     
	 */
	public void setExternalOffsetLength(Integer value)
	{
		this.externalOffsetLength = value;
	}
	/**
	 * Gets the value of the externalOffsetDirection property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ContextualAlleleExternalOffsetDirection }
	 *     
	 */
	public ContextualAlleleExternalOffsetDirection getExternalOffsetDirection()
	{
		return externalOffsetDirection;
	}

	/**
	 * Sets the value of the externalOffsetDirection property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ContextualAlleleExternalOffsetDirection }
	 *     
	 */
	public void setExternalOffsetDirection(ContextualAlleleExternalOffsetDirection value)
	{
		this.externalOffsetDirection = value;
	}
	
	/**
	 * Gets the value of the externalGenomicReferenceSequence property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Reference }
	 *     
	 */
	public Reference getExternalGenomicReferenceSequence()
	{
		return externalGenomicReferenceSequence;
	}

	/**
	 * Sets the value of the externalGenomicReferenceSequence property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Reference }
	 *     
	 */
	public void setExternalGenomicReferenceSequence(Reference value)
	{
		this.externalGenomicReferenceSequence = value;
	}
	
	/**
	 * Gets the value of the externalGenomicPositionIndex property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Integer }
	 *     
	 */
	public Integer getExternalGenomicPositionIndex()
	{
		return externalGenomicPositionIndex;
	}

	/**
	 * Sets the value of the externalGenomicPositionIndex property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Integer }
	 *     
	 */
	public void setExternalGenomicPositionIndex(Integer value)
	{
		this.externalGenomicPositionIndex = value;
	}
}
