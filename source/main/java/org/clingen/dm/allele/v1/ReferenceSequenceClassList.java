package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ReferenceSequenceClass-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferenceSequenceClass-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="nucleotide"/>
 *     &lt;enumeration value="amino acid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "ReferenceSequenceClass-list")
@XmlEnum
public enum ReferenceSequenceClassList
{

	/**
	 * A nucleotide reference sequence.
	 * 
	 */
	@XmlEnumValue ("nucleotide")
	NUCLEOTIDE("nucleotide"),

	/**
	 * An amino acid reference sequence.
	 * 
	 */
	@XmlEnumValue ("amino acid")
	AMINO_ACID("amino acid");
	private final java.lang.String value;

	ReferenceSequenceClassList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static ReferenceSequenceClassList fromValue(java.lang.String v)
	{
		for (ReferenceSequenceClassList c : ReferenceSequenceClassList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
