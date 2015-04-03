package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for CanonicalAlleleType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CanonicalAlleleType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="nucleotide"/>
 *     &lt;enumeration value="amino acid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "CanonicalAlleleType-list")
@XmlEnum
public enum CanonicalAlleleTypeList
{

	/**
	 * A nucleotide canonical allele.
	 * 
	 */
	@XmlEnumValue ("nucleotide")
	NUCLEOTIDE("nucleotide"),

	/**
	 * An amino acid canonical allele.
	 * 
	 */
	@XmlEnumValue ("amino-acid")
	AMINO_ACID("amino acid");
	private final java.lang.String value;

	CanonicalAlleleTypeList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static CanonicalAlleleTypeList fromValue(java.lang.String v)
	{
		for (CanonicalAlleleTypeList c : CanonicalAlleleTypeList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
