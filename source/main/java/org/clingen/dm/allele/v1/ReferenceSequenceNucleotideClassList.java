package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ReferenceSequenceNucleotideClass-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferenceSequenceNucleotideClass-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="genomic"/>
 *     &lt;enumeration value="transcript"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "ReferenceSequenceNucleotideClass-list")
@XmlEnum
public enum ReferenceSequenceNucleotideClassList
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
	TRANSCRIPT("transcript");
	private final java.lang.String value;

	ReferenceSequenceNucleotideClassList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static ReferenceSequenceNucleotideClassList fromValue(java.lang.String v)
	{
		for (ReferenceSequenceNucleotideClassList c : ReferenceSequenceNucleotideClassList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
