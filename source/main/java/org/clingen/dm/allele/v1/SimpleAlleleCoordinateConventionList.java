package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for SimpleAlleleCoordinateConvention-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SimpleAlleleCoordinateConvention-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="one based"/>
 *     &lt;enumeration value="zero based"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "SimpleAlleleCoordinateConvention-list")
@XmlEnum
public enum SimpleAlleleCoordinateConventionList
{

	/**
	 * The one-based convention, bases are indexed and start at 1. (@see <a http://alternateallele.blogspot.com/2012/03/genome-coordinate-cheat-sheet.html">one base</a>)
	 * Used by UCSC(genome browser & BLAT), NCBI, Ensembl, GFF, VCF.
	 * NOTE: considered better for human viewing.
	 */
	@XmlEnumValue ("one based")
	ONE_BASED("one based"),

	/**
	 * The zero-based (aka zero-space) convention, spaces are indexed and start at 0. (@see <a http://alternateallele.blogspot.com/2012/03/genome-coordinate-cheat-sheet.html">zero space</a>)
	 * Used by BED, UCSC(table browser & annotation files).
	 * NOTE: considered better for computability.
	 */
	@XmlEnumValue ("zero based")
	ZERO_BASED("zero based");

	private final java.lang.String value;

	SimpleAlleleCoordinateConventionList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static SimpleAlleleCoordinateConventionList fromValue(java.lang.String v)
	{
		for (SimpleAlleleCoordinateConventionList c : SimpleAlleleCoordinateConventionList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
