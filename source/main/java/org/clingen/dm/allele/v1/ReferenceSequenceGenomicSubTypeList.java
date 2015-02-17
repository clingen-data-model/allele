package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ReferenceSequenceGenomicSubType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferenceSequenceGenomicSubType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="chromosome"/>
 *     &lt;enumeration value="mitochondrial"/>
 *     &lt;enumeration value="gene"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "ReferenceSequenceGenomicSubType-list")
@XmlEnum
public enum ReferenceSequenceGenomicSubTypeList
{

	/**
	 * A chromsomal genomic reference sequence.
	 * 
	 */
	@XmlEnumValue ("chromsome")
	CHROMOSOME("chromosome"),

	/**
	 * A mitochondrial reference sequence.
	 * 
	 */
	@XmlEnumValue ("mitochondrial")
	MITOCHONDRIAL("mitochondrial"),

	/**
	 * An amino acid reference sequence.
	 * 
	 */
	@XmlEnumValue ("gene")
	GENEs("gene");
	private final java.lang.String value;

	ReferenceSequenceGenomicSubTypeList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static ReferenceSequenceGenomicSubTypeList fromValue(java.lang.String v)
	{
		for (ReferenceSequenceGenomicSubTypeList c : ReferenceSequenceGenomicSubTypeList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
