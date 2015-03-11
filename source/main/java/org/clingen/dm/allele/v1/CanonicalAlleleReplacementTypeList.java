package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for CanonicalAlleleReplacementType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CanonicalAlleleReplacementType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="replaced-by"/>
 *     &lt;enumeration value="replaced-with"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "CanonicalAlleleReplacementType-list")
@XmlEnum
public enum CanonicalAlleleReplacementTypeList
{

	/**
	 * The target CanonicalAllele is replaced-by this CanonicalAllele.
	 * 
	 */
	@XmlEnumValue ("replaced-by")
	REPLACED_BY("replaced-by"),

	/**
	 * The target CanonicalAllele is replaced-with this CanonicalAllele.
	 * 
	 */
	@XmlEnumValue ("replaced-with")
	REPLACED_WITH("replaced-with");
	private final java.lang.String value;

	CanonicalAlleleReplacementTypeList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static CanonicalAlleleReplacementTypeList fromValue(java.lang.String v)
	{
		for (CanonicalAlleleReplacementTypeList c : CanonicalAlleleReplacementTypeList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
