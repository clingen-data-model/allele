package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ReferenceSequenceGenomicClass-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferenceSequenceGenomicClass-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="chromosome"/>
 *     &lt;enumeration value="gene"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "ReferenceSequenceGenomicClass-list")
@XmlEnum
public enum ReferenceSequenceGenomicClassList
{

	/**
	 * A chromosomal genomic nucleotide sequence.
	 * 
	 */
	@XmlEnumValue ("chromsome")
	CHROMOSOME("chromosome"),

	/**
	 * A gene genomic nucleotide sequence.
	 * 
	 */
	@XmlEnumValue ("gene")
	GENE("gene");
	private final java.lang.String value;

	ReferenceSequenceGenomicClassList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static ReferenceSequenceGenomicClassList fromValue(java.lang.String v)
	{
		for (ReferenceSequenceGenomicClassList c : ReferenceSequenceGenomicClassList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
