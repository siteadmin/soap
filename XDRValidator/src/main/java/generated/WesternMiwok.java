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
 * <p>Java class for WesternMiwok.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WesternMiwok">
 *   &lt;restriction base="{}cs">
 *     &lt;enumeration value="x-CSI"/>
 *     &lt;enumeration value="x-LMW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WesternMiwok")
@XmlEnum
public enum WesternMiwok {

    @XmlEnumValue("x-CSI")
    X_CSI("x-CSI"),
    @XmlEnumValue("x-LMW")
    X_LMW("x-LMW");
    private final String value;

    WesternMiwok(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WesternMiwok fromValue(String v) {
        for (WesternMiwok c: WesternMiwok.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
