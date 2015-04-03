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
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="2"/>
 *     &lt;enumeration value="3"/>
 *     &lt;enumeration value="4"/>
 *     &lt;enumeration value="5"/>
 *     &lt;enumeration value="6"/>
 *     &lt;enumeration value="7"/>
 *     &lt;enumeration value="8"/>
 *     &lt;enumeration value="9"/>
 *     &lt;enumeration value="10"/>
 *     &lt;enumeration value="11"/>
 *     &lt;enumeration value="12"/>
 *     &lt;enumeration value="13"/>
 *     &lt;enumeration value="14"/>
 *     &lt;enumeration value="15"/>
 *     &lt;enumeration value="16"/>
 *     &lt;enumeration value="17"/>
 *     &lt;enumeration value="18"/>
 *     &lt;enumeration value="19"/>
 *     &lt;enumeration value="20"/>
 *     &lt;enumeration value="21"/>
 *     &lt;enumeration value="22"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="MT"/>
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
    @XmlEnumValue("1")
    CHR_1("1"),

    /**
     * Chromsome 2
     * 
     */
    @XmlEnumValue("2")
    CHR_2("2"),

    /**
     * Chromsome 3
     * 
     */
    @XmlEnumValue("3")
    CHR_3("3"),

    /**
     * Chromsome 4
     * 
     */
    @XmlEnumValue("4")
    CHR_4("4"),

    /**
     * Chromsome 5
     * 
     */
    @XmlEnumValue("5")
    CHR_5("5"),

    /**
     * Chromsome 6
     * 
     */
    @XmlEnumValue("6")
    CHR_6("6"),

    /**
     * Chromsome 7
     * 
     */
    @XmlEnumValue("7")
    CHR_7("7"),

    /**
     * Chromsome 8
     * 
     */
    @XmlEnumValue("8")
    CHR_8("8"),

    /**
     * Chromsome 9
     * 
     */
    @XmlEnumValue("9")
    CHR_9("9"),

    /**
     * Chromsome 10
     * 
     */
    @XmlEnumValue("10")
    CHR_10("10"),

    /**
     * Chromsome 11
     * 
     */
    @XmlEnumValue("11")
    CHR_11("11"),

    /**
     * Chromsome 12
     * 
     */
    @XmlEnumValue("12")
    CHR_12("12"),

    /**
     * Chromsome 13
     * 
     */
    @XmlEnumValue("13")
    CHR_13("13"),

    /**
     * Chromsome 14
     * 
     */
    @XmlEnumValue("14")
    CHR_14("14"),

    /**
     * Chromsome 15
     * 
     */
    @XmlEnumValue("15")
    CHR_15("15"),

    /**
     * Chromsome 16
     * 
     */
    @XmlEnumValue("16")
    CHR_16("16"),

    /**
     * Chromsome 17
     * 
     */
    @XmlEnumValue("17")
    CHR_17("17"),

    /**
     * Chromsome 18
     * 
     */
    @XmlEnumValue("18")
    CHR_18("18"),

    /**
     * Chromsome 19
     * 
     */
    @XmlEnumValue("19")
    CHR_19("19"),

    /**
     * Chromsome 20
     * 
     */
    @XmlEnumValue("20")
    CHR_20("20"),

    /**
     * Chromsome 21
     * 
     */
    @XmlEnumValue("21")
    CHR_21("21"),

    /**
     * Chromsome 22
     * 
     */
    @XmlEnumValue("22")
    CHR_22("22"),

    /**
     * Chromsome X
     * 
     */
    @XmlEnumValue("X")
    CHR_X("X"),

    /**
     * Chromsome Y
     * 
     */
    @XmlEnumValue("Y")
    CHR_Y("Y"),

    /**
     * Chromsome MT
     * 
     */
    @XmlEnumValue("MT")
    CHR_MT("MT");
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
