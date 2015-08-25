package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for AlleleInstanceRelationshipType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlleleInstanceRelationshipType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="amino-acid-effect"/>
 *     &lt;enumeration value="transcript-allele-cause"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "AlleleInstanceRelationshipType-list")
@XmlEnum
public enum AlleleInstanceRelationshipTypeList
{

	/**
	 * The target AlleleInstance is the effect of this AlleleInstance (e.g. the target amino-acid allele is the effect of a given transcript allele).
	 * 
	 */
	@XmlEnumValue ("amino-acid-effect")
	AMINO_ACID_EFFECT("amino acid effect"),

	/**
	 * The target AlleleInstance is the cause of this AlleleInstance (e.g. the transcript allele is the cause of a given amino-acid allele).
	 * 
	 */
	@XmlEnumValue ("transcript-allele-cause")
	TRANSCRIPT_ALLELE_CAUSE("transcript allele cause");
	private final java.lang.String value;

	AlleleInstanceRelationshipTypeList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static AlleleInstanceRelationshipTypeList fromValue(java.lang.String v)
	{
		for (AlleleInstanceRelationshipTypeList c : AlleleInstanceRelationshipTypeList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
