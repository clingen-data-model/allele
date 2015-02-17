package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceSequenceChromosome-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferenceSequenceChromosome-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="chr1"/>
 *     &lt;enumeration value="chr2"/>
 *     &lt;enumeration value="chr3"/>
 *     &lt;enumeration value="chr4"/>
 *     &lt;enumeration value="chr5"/>
 *     &lt;enumeration value="chr6"/>
 *     &lt;enumeration value="chr7"/>
 *     &lt;enumeration value="chr8"/>
 *     &lt;enumeration value="chr9"/>
 *     &lt;enumeration value="chr10"/>
 *     &lt;enumeration value="chr11"/>
 *     &lt;enumeration value="chr12"/>
 *     &lt;enumeration value="chr13"/>
 *     &lt;enumeration value="chr14"/>
 *     &lt;enumeration value="chr15"/>
 *     &lt;enumeration value="chr16"/>
 *     &lt;enumeration value="chr17"/>
 *     &lt;enumeration value="chr18"/>
 *     &lt;enumeration value="chr19"/>
 *     &lt;enumeration value="chr20"/>
 *     &lt;enumeration value="chr21"/>
 *     &lt;enumeration value="chr22"/>
 *     &lt;enumeration value="chrX"/>
 *     &lt;enumeration value="chrY"/>
 *     &lt;enumeration value="chrMT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferenceSequenceChromosome-list")
@XmlEnum
public enum ReferenceSequenceChromosomeList {


    /**
     * Chromsome 1
     * 
     */
    @XmlEnumValue("chr1")
    CHR_1("chr1"),

    /**
     * Chromsome 2
     * 
     */
    @XmlEnumValue("chr2")
    CHR_2("chr2"),

    /**
     * Chromsome 3
     * 
     */
    @XmlEnumValue("chr3")
    CHR_3("chr3"),

    /**
     * Chromsome 4
     * 
     */
    @XmlEnumValue("chr4")
    CHR_4("chr4"),

    /**
     * Chromsome 5
     * 
     */
    @XmlEnumValue("chr5")
    CHR_5("chr5"),

    /**
     * Chromsome 6
     * 
     */
    @XmlEnumValue("chr6")
    CHR_6("chr6"),

    /**
     * Chromsome 7
     * 
     */
    @XmlEnumValue("chr7")
    CHR_7("chr7"),

    /**
     * Chromsome 8
     * 
     */
    @XmlEnumValue("chr8")
    CHR_8("chr8"),

    /**
     * Chromsome 9
     * 
     */
    @XmlEnumValue("chr9")
    CHR_9("chr9"),

    /**
     * Chromsome 10
     * 
     */
    @XmlEnumValue("chr10")
    CHR_10("chr10"),

    /**
     * Chromsome 11
     * 
     */
    @XmlEnumValue("chr11")
    CHR_11("chr11"),

    /**
     * Chromsome 12
     * 
     */
    @XmlEnumValue("chr12")
    CHR_12("chr12"),

    /**
     * Chromsome 13
     * 
     */
    @XmlEnumValue("chr13")
    CHR_13("chr13"),

    /**
     * Chromsome 14
     * 
     */
    @XmlEnumValue("chr14")
    CHR_14("chr14"),

    /**
     * Chromsome 15
     * 
     */
    @XmlEnumValue("chr15")
    CHR_15("chr15"),

    /**
     * Chromsome 16
     * 
     */
    @XmlEnumValue("chr16")
    CHR_16("chr16"),

    /**
     * Chromsome 17
     * 
     */
    @XmlEnumValue("chr17")
    CHR_17("chr17"),

    /**
     * Chromsome 18
     * 
     */
    @XmlEnumValue("chr18")
    CHR_18("chr18"),

    /**
     * Chromsome 19
     * 
     */
    @XmlEnumValue("chr19")
    CHR_19("chr19"),

    /**
     * Chromsome 20
     * 
     */
    @XmlEnumValue("chr20")
    CHR_20("chr20"),

    /**
     * Chromsome 21
     * 
     */
    @XmlEnumValue("chr21")
    CHR_21("chr21"),

    /**
     * Chromsome 22
     * 
     */
    @XmlEnumValue("chr22")
    CHR_22("chr22"),

    /**
     * Chromsome X
     * 
     */
    @XmlEnumValue("chrX")
    CHR_X("chrX"),

    /**
     * Chromsome Y
     * 
     */
    @XmlEnumValue("chrY")
    CHR_Y("chrY"),

    /**
     * Chromsome MT
     * 
     */
    @XmlEnumValue("chrMT")
    CHR_MT("chrMT");
    private final java.lang.String value;

    ReferenceSequenceChromosomeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ReferenceSequenceChromosomeList fromValue(java.lang.String v) {
        for (ReferenceSequenceChromosomeList c: ReferenceSequenceChromosomeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
