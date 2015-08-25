package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for AlleleInstanceTypeList-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlleleInstanceTypeList-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="genomic"/>
 *     &lt;enumeration value="transcript"/>
 *     &lt;enumeration value="amino-acid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "AlleleInstanceTypeList-list")
@XmlEnum
public enum AlleleInstanceTypeList
{

	/**
	 * A genomic nucleotide sequence.
	 * 
	 */
	@XmlEnumValue ("genomic")
	GENOMIC("genomic"),

	/**
	 * A transcript nucleotide sequence.
	 * 
	 */
	@XmlEnumValue ("transcript")
	TRANSCRIPT("transcript"),

	/**
	 * A transcript nucleotide sequence.
	 * 
	 */
	@XmlEnumValue ("amino-acid")
	AMINO_ACID("amino acid");
	private final java.lang.String value;

	AlleleInstanceTypeList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static AlleleInstanceTypeList fromValue(java.lang.String v)
	{
		for (AlleleInstanceTypeList c : AlleleInstanceTypeList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
