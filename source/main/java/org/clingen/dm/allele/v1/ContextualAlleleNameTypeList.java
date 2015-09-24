package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ContextualAlleleNameType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContextualAlleleNameType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="hgvs-genomic"/>
 *     &lt;enumeration value="hgvs-mito"/>
 *     &lt;enumeration value="hgvs-cdna"/>
 *     &lt;enumeration value="hgvs-protein-1"/>
 *     &lt;enumeration value="hgvs-protein-3"/>
 *     &lt;enumeration value="hgvs-rna"/>
 *     &lt;enumeration value="hgvs-ncrna"/>
 *     &lt;enumeration value="ivs"/>
 *     &lt;enumeration value="custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "ContextualAlleleNameType-list")
@XmlEnum
public enum ContextualAlleleNameTypeList
{

	/**
	 * The name format for the ContextualAllele is HGVS genomic.
	 * 
	 */
	@XmlEnumValue ("hgvs-genomic")
	HGVS_GENOMIC("hgvs-genomic"),

	/**
	 * The name format for the ContextualAllele is HGVS mito.
	 * 
	 */
	@XmlEnumValue ("hgvs-mito")
	HGVS_MITO("hgvs-mito"),

	/**
	 * The name format for the ContextualAllele is HGVS cDNA.
	 * 
	 */
	@XmlEnumValue ("hgvs-cdna")
	HGVS_CDNA("hgvs-cdna"),

	/**
	 * The name format for the ContextualAllele is HGVS single letter protein.
	 * 
	 */
	@XmlEnumValue ("hgvs-protein-1")
	HGVS_PROTEIN_1("hgvs-protein-1"),

	/**
	 * The name format for the ContextualAllele is HGVS 3 letter protein.
	 * 
	 */
	@XmlEnumValue ("hgvs-protein-3")
	HGVS_PROTEIN_3("hgvs-protein-3"),

	/**
	 * The name format for the ContextualAllele is HGVS RNA.
	 * 
	 */
	@XmlEnumValue ("hgvs-rna")
	HGVS_RNA("hgvs-rna"),

	/**
	 * The name format for the ContextualAllele is HGVS ncRNA.
	 * 
	 */
	@XmlEnumValue ("hgvs-ncrna")
	HGVS_NCRNA("hgvs-ncrna"),

	/**
	 * The name format for the ContextualAllele is HGVS intervening-sequence IVS.
	 * 
	 */
	@XmlEnumValue ("ivs")
	IVS("ivs"),

	/**
	 * The name format for the ContextualAllele is custom.
	 * 
	 */
	@XmlEnumValue ("custom")
	CUSTOM("custom");
	private final java.lang.String value;

	ContextualAlleleNameTypeList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static ContextualAlleleNameTypeList fromValue(java.lang.String v)
	{
		for (ContextualAlleleNameTypeList c : ContextualAlleleNameTypeList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
