package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for SimpleAlleleIntronOffsetDirection-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SimpleAlleleIntronOffsetDirection-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="+"/>
 *     &lt;enumeration value="-"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "SimpleAlleleIntronOffsetDirection-list")
@XmlEnum
public enum SimpleAlleleIntronOffsetDirectionList
{

	/**
	 * The offset direction for the SimpleAllele is in the positive or plus direction.
	 * 
	 */
	@XmlEnumValue ("+")
	PLUS("+"),

	/**
	 * The offset direction for the SimpleAllele is in the negative or minus direction.
	 * 
	 */
	@XmlEnumValue ("-")
	MINUS("-");

	private final java.lang.String value;

	SimpleAlleleIntronOffsetDirectionList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static SimpleAlleleIntronOffsetDirectionList fromValue(java.lang.String v)
	{
		for (SimpleAlleleIntronOffsetDirectionList c : SimpleAlleleIntronOffsetDirectionList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
