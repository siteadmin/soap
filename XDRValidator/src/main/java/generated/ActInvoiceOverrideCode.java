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
 * <p>Java class for ActInvoiceOverrideCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInvoiceOverrideCode">
 *   &lt;restriction base="{}cs">
 *     &lt;enumeration value="COVGE"/>
 *     &lt;enumeration value="PYRDELAY"/>
 *     &lt;enumeration value="EFORM"/>
 *     &lt;enumeration value="FAX"/>
 *     &lt;enumeration value="GFTH"/>
 *     &lt;enumeration value="LATE"/>
 *     &lt;enumeration value="MANUAL"/>
 *     &lt;enumeration value="ORTHO"/>
 *     &lt;enumeration value="OOJ"/>
 *     &lt;enumeration value="PAPER"/>
 *     &lt;enumeration value="PIE"/>
 *     &lt;enumeration value="REFNR"/>
 *     &lt;enumeration value="REPSERV"/>
 *     &lt;enumeration value="UNRELAT"/>
 *     &lt;enumeration value="VERBAUTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActInvoiceOverrideCode")
@XmlEnum
public enum ActInvoiceOverrideCode {

    COVGE,
    PYRDELAY,
    EFORM,
    FAX,
    GFTH,
    LATE,
    MANUAL,
    ORTHO,
    OOJ,
    PAPER,
    PIE,
    REFNR,
    REPSERV,
    UNRELAT,
    VERBAUTH;

    public String value() {
        return name();
    }

    public static ActInvoiceOverrideCode fromValue(String v) {
        return valueOf(v);
    }

}
