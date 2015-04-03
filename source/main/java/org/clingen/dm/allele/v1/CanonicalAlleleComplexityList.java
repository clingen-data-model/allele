package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for CanonicalAlleleComplexity-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CanonicalAlleleComplexity-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="simple"/>
 *     &lt;enumeration value="complexity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "CanonicalAlleleComplexity-list")
@XmlEnum
public enum CanonicalAlleleComplexityList
{

	/**
	 * The target CanonicalAllele complexity is simple.
	 * 
	 */
	@XmlEnumValue ("simple")
	SIMPLE("simple"),

	/**
	 * The target CanonicalAllele complexity is complex.
	 * 
	 */
	@XmlEnumValue ("complex")
	COMPLEX("complex");
	private final java.lang.String value;

	CanonicalAlleleComplexityList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static CanonicalAlleleComplexityList fromValue(java.lang.String v)
	{
		for (CanonicalAlleleComplexityList c : CanonicalAlleleComplexityList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
