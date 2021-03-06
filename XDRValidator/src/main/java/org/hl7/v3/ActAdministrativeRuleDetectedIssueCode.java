//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.18 at 10:59:00 AM EST 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActAdministrativeRuleDetectedIssueCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActAdministrativeRuleDetectedIssueCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="KEY205"/>
 *     &lt;enumeration value="KEY204"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActAdministrativeRuleDetectedIssueCode")
@XmlEnum
public enum ActAdministrativeRuleDetectedIssueCode {

    @XmlEnumValue("KEY205")
    KEY_205("KEY205"),
    @XmlEnumValue("KEY204")
    KEY_204("KEY204");
    private final String value;

    ActAdministrativeRuleDetectedIssueCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActAdministrativeRuleDetectedIssueCode fromValue(String v) {
        for (ActAdministrativeRuleDetectedIssueCode c: ActAdministrativeRuleDetectedIssueCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
