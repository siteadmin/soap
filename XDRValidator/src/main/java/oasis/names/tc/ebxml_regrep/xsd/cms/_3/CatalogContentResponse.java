//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.18 at 10:59:00 AM EST 
//


package oasis.names.tc.ebxml_regrep.xsd.cms._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectListType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:cms:3.0}ContentManagementServiceResponseType">
 *       &lt;sequence>
 *         &lt;element name="CatalogedContent" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "catalogedContent"
})
@XmlRootElement(name = "CatalogContentResponse")
public class CatalogContentResponse
    extends ContentManagementServiceResponseType
{

    @XmlElement(name = "CatalogedContent", required = true)
    protected RegistryObjectListType catalogedContent;

    /**
     * Gets the value of the catalogedContent property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectListType }
     *     
     */
    public RegistryObjectListType getCatalogedContent() {
        return catalogedContent;
    }

    /**
     * Sets the value of the catalogedContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectListType }
     *     
     */
    public void setCatalogedContent(RegistryObjectListType value) {
        this.catalogedContent = value;
    }

}
