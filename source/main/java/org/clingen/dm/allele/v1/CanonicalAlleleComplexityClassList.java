package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for CanonicalAlleleComplexityClass-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CanonicalAlleleComplexityClass-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="simple"/>
 *     &lt;enumeration value="complexity"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "CanonicalAlleleComplexityClass-list")
@XmlEnum
public enum CanonicalAlleleComplexityClassList
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

	CanonicalAlleleComplexityClassList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static CanonicalAlleleComplexityClassList fromValue(java.lang.String v)
	{
		for (CanonicalAlleleComplexityClassList c : CanonicalAlleleComplexityClassList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
