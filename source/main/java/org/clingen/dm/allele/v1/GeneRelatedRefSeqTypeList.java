package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for GeneRelatedRefSeqType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeneRelatedRefSeqType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="gene"/>
 *     &lt;enumeration value="transcript"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "GeneRelatedRefSeqType-list")
@XmlEnum
public enum GeneRelatedRefSeqTypeList
{

	/**
	 * The target refseq is a genomice representatio of the entire gene (e.g. NG_xxx.x or LRG_293).
	 * 
	 */
	@XmlEnumValue ("gene")
	GENE("gene"),

	/**
	 * This refseq is a transcript refseq for a gene (e.g. NM_xxx.x LRG_293t1, etc).
	 * 
	 */
	@XmlEnumValue ("transcript")
	TRANSCRIPT("transcript");
	private final java.lang.String value;

	GeneRelatedRefSeqTypeList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static GeneRelatedRefSeqTypeList fromValue(java.lang.String v)
	{
		for (GeneRelatedRefSeqTypeList c : GeneRelatedRefSeqTypeList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
