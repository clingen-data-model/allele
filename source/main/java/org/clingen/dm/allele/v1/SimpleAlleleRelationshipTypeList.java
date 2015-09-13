package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for SimpleAlleleRelationshipType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SimpleAlleleRelationshipType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="amino-acid-effect"/>
 *     &lt;enumeration value="transcript-allele-cause"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "SimpleAlleleRelationshipType-list")
@XmlEnum
public enum SimpleAlleleRelationshipTypeList
{

	/**
	 * The target SimpleAllele is the effect of this SimpleAllele (e.g. the target amino-acid allele is the effect of a given transcript allele).
	 * 
	 */
	@XmlEnumValue ("amino-acid-effect")
	AMINO_ACID_EFFECT("amino acid effect"),

	/**
	 * The target SimpleAllele is the cause of this SimpleAllele (e.g. the transcript allele is the cause of a given amino-acid allele).
	 * 
	 */
	@XmlEnumValue ("transcript-allele-cause")
	TRANSCRIPT_ALLELE_CAUSE("transcript allele cause");
	private final java.lang.String value;

	SimpleAlleleRelationshipTypeList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static SimpleAlleleRelationshipTypeList fromValue(java.lang.String v)
	{
		for (SimpleAlleleRelationshipTypeList c : SimpleAlleleRelationshipTypeList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
