package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for AlleleInstanceExternalOffsetDirection-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlleleInstanceExternalOffsetDirection-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="+"/>
 *     &lt;enumeration value="-"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "AlleleInstanceExternalOffsetDirection-list")
@XmlEnum
public enum AlleleInstanceExternalOffsetDirectionList
{

	/**
	 * The offset direction for the AlleleInstance is in the positive or plus direction.
	 * 
	 */
	@XmlEnumValue ("+")
	PLUS("+"),

	/**
	 * The offset direction for the AlleleInstance is in the negative or minus direction.
	 * 
	 */
	@XmlEnumValue ("-")
	MINUS("-");

	private final java.lang.String value;

	AlleleInstanceExternalOffsetDirectionList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static AlleleInstanceExternalOffsetDirectionList fromValue(java.lang.String v)
	{
		for (AlleleInstanceExternalOffsetDirectionList c : AlleleInstanceExternalOffsetDirectionList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
