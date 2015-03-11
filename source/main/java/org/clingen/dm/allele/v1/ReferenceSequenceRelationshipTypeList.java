package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ReferenceSequenceRelationshipType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferenceSequenceRelationshipType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="translates-to"/>
 *     &lt;enumeration value="translates-from"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "ReferenceSequenceRelationshipType-list")
@XmlEnum
public enum ReferenceSequenceRelationshipTypeList
{

	/**
	 * The target ReferenceSequence is amino acid of this ReferenceSequence (e.g. NP_xxxx.x for NM_xxxxx.x).
	 * 
	 */
	@XmlEnumValue ("translates-to")
	TRANSLATES_TO("translates-to"),

	/**
	 * The target ReferenceSequence is the transcript from which this amino-acid ReferenceSequence value is associated (e.g. NM_xxxxx.x for NP_xxxxx.x).
	 * 
	 */
	@XmlEnumValue ("translates-from")
	TRANSLATES_FROM("translates-from");
	private final java.lang.String value;

	ReferenceSequenceRelationshipTypeList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static ReferenceSequenceRelationshipTypeList fromValue(java.lang.String v)
	{
		for (ReferenceSequenceRelationshipTypeList c : ReferenceSequenceRelationshipTypeList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
