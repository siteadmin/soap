//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.18 at 10:59:00 AM EST 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Kalapuyan.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Kalapuyan">
 *   &lt;restriction base="{}cs">
 *     &lt;enumeration value="x-KAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Kalapuyan")
@XmlEnum
public enum Kalapuyan {

    @XmlEnumValue("x-KAL")
    X_KAL("x-KAL");
    private final String value;

    Kalapuyan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Kalapuyan fromValue(String v) {
        for (Kalapuyan c: Kalapuyan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
