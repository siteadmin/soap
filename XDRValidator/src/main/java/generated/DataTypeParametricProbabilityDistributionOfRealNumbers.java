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
 * <p>Java class for DataTypeParametricProbabilityDistributionOfRealNumbers.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeParametricProbabilityDistributionOfRealNumbers">
 *   &lt;restriction base="{}cs">
 *     &lt;enumeration value="PPD&lt;REAL>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeParametricProbabilityDistributionOfRealNumbers")
@XmlEnum
public enum DataTypeParametricProbabilityDistributionOfRealNumbers {

    @XmlEnumValue("PPD<REAL>")
    PPD_REAL("PPD<REAL>");
    private final String value;

    DataTypeParametricProbabilityDistributionOfRealNumbers(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeParametricProbabilityDistributionOfRealNumbers fromValue(String v) {
        for (DataTypeParametricProbabilityDistributionOfRealNumbers c: DataTypeParametricProbabilityDistributionOfRealNumbers.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
