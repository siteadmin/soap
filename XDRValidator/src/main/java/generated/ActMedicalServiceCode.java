//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.18 at 10:59:00 AM EST 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActMedicalServiceCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMedicalServiceCode">
 *   &lt;restriction base="{}cs">
 *     &lt;enumeration value="ALC"/>
 *     &lt;enumeration value="CARD"/>
 *     &lt;enumeration value="CHR"/>
 *     &lt;enumeration value="DNTL"/>
 *     &lt;enumeration value="DRGRHB"/>
 *     &lt;enumeration value="GENRL"/>
 *     &lt;enumeration value="MED"/>
 *     &lt;enumeration value="OBS"/>
 *     &lt;enumeration value="ONC"/>
 *     &lt;enumeration value="PALL"/>
 *     &lt;enumeration value="PED"/>
 *     &lt;enumeration value="PHAR"/>
 *     &lt;enumeration value="PHYRHB"/>
 *     &lt;enumeration value="PSYCH"/>
 *     &lt;enumeration value="SURG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActMedicalServiceCode")
@XmlEnum
public enum ActMedicalServiceCode {

    ALC,
    CARD,
    CHR,
    DNTL,
    DRGRHB,
    GENRL,
    MED,
    OBS,
    ONC,
    PALL,
    PED,
    PHAR,
    PHYRHB,
    PSYCH,
    SURG;

    public String value() {
        return name();
    }

    public static ActMedicalServiceCode fromValue(String v) {
        return valueOf(v);
    }

}
