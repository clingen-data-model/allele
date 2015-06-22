package org.clingen.dm.allele.v1;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Integer;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Resource;
import org.hl7.fhir.String;

/**
 * If the element is present, it must have either a @value, an @id, or
 * extensions
 * 
 * <p>
 * Java class for ReferenceSequence complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceSequence">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" maxOccurs="1" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0" maxOccurs="unbounded"/>
 *         &lt;element name="referenceSequenceType" type="{http://org.clingen.dm.allele.v1}ReferenceSequenceType" minOccurs="0"/>
 *         &lt;element name="chromosome" type="{http://org.clingen.dm.allele.v1}ReferenceSequenceChromosome" minOccurs="0"/>
 *         &lt;element name="cdsStart" type="{http://hl7.org/fhir}int" minOccurs="0"/>
 *         &lt;element name="cdsEnd" type="{http://hl7.org/fhir}int" minOccurs="0"/>
 *         &lt;element name="gene" type="{http://hl7.org/fhir}Reference" maxOccurs="1" minOccurs="0"/>
 *         &lt;element name="referenceGenome" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="1" minOccurs="0"/>
 *         &lt;element name="related" type="{http://org.clingen.dm.allele.v1}ReferenceSequence.Related" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceSequence", propOrder = { "version", "identifier",
		"referenceSequenceType", "chromosome", "cdsStart", "cdsEnd", "gene",
		"referenceGenome", "related" })
public class ReferenceSequence extends Resource {

	protected String version;
	protected List<Identifier> identifier;
	@XmlElement(required = true)
	protected ReferenceSequenceType referenceSequenceType;
	protected ReferenceSequenceChromosome chromosome;
	protected Integer cdsStart;
	protected Integer cdsEnd;
	protected Reference gene;
	protected CodeableConcept referenceGenome;
	protected List<ReferenceSequenceRelated> related;

	/**
	 * Gets the value of the version property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the value of the version property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersion(String value) {
		this.version = value;
	}

	/**
	 * Gets the value of the identifier property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the identifier property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getIdentifier().add(newItem);
	 * </pre>
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Identifier }
	 */
	public List<Identifier> getIdentifier() {
		return identifier;
	}

	/**
	 * Gets the value of the referenceSequenceType property.
	 * 
	 * @return possible object is {@link ReferenceSequenceType }
	 * 
	 */
	public ReferenceSequenceType getGenomicSequenceClass() {
		return referenceSequenceType;
	}

	/**
	 * Sets the value of the referenceSequenceType property.
	 * 
	 * @param value
	 *            allowed object is {@link ReferenceSequenceType }
	 * 
	 */
	public void setReferenceSequenceType(ReferenceSequenceType value) {
		this.referenceSequenceType = value;
	}

	/**
	 * Gets the value of the chromosome property.
	 * 
	 * @return possible object is {@link ReferenceSequenceChromosome }
	 * 
	 */
	public ReferenceSequenceChromosome getChromosome() {
		return chromosome;
	}

	/**
	 * Sets the value of the chromosome property.
	 * 
	 * @param value
	 *            allowed object is {@link ReferenceSequenceChromosome }
	 * 
	 */
	public void setChromosome(ReferenceSequenceChromosome value) {
		this.chromosome = value;
	}

	/**
	 * Gets the value of the CDS start property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCdsStart() {
		return cdsStart;
	}

	/**
	 * Sets the value of the CDS start property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCdsStart(Integer value) {
		this.cdsStart = value;
	}

	/**
	 * Gets the value of the CDS end property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCdsEnd() {
		return cdsEnd;
	}

	/**
	 * Sets the value of the CDS end property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCdsEnd(Integer value) {
		this.cdsEnd = value;
	}

	/**
	 * Gets the value of the gene property.
	 * 
	 * @return possible object is {@link Reference }
	 * 
	 */
	public Reference getGene() {
		return gene;
	}

	/**
	 * Sets the value of the gene property.
	 * 
	 * @param value
	 *            allowed object is {@link Reference }
	 * 
	 */
	public void setGene(Reference value) {
		this.gene = value;
	}

	/**
	 * Gets the value of the referenceGenome property.
	 * 
	 * @return possible object is {@link CodeableConcept }
	 * 
	 */
	public CodeableConcept getReferenceGenome() {
		return referenceGenome;
	}

	/**
	 * Sets the value of the referenceGenome property.
	 * 
	 * @param value
	 *            allowed object is {@link CodeableConcept }
	 * 
	 */
	public void setReferenceGenome(CodeableConcept value) {
		this.referenceGenome = value;
	}

	/**
	 * Gets the value of the related (refseq) property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the relatedReferenceSequence property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRelated().add(newItem);
	 * </pre>
	 * 
	 * s
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ReferenceSequenceRelated }
	 */
	public List<ReferenceSequenceRelated> getRelated() {
		return related;
	}

}
