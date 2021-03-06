//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.18 at 10:59:00 AM EST 
//


package oasis.names.tc.ebxml_regrep.xsd.cms._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.ExtrinsicObjectType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.RegistryObjectListType;
import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryRequestType;


/**
 * Base type for all Content Management Service requests.
 * 
 * <p>Java class for ContentManagementServiceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentManagementServiceRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0}RegistryRequestType">
 *       &lt;sequence>
 *         &lt;element name="OriginalContent" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectListType"/>
 *         &lt;element name="InvocationControlFile" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ExtrinsicObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentManagementServiceRequestType", propOrder = {
    "originalContent",
    "invocationControlFile"
})
@XmlSeeAlso({
    ValidateContentRequest.class,
    CatalogContentRequest.class
})
public class ContentManagementServiceRequestType
    extends RegistryRequestType
{

    @XmlElement(name = "OriginalContent", required = true)
    protected RegistryObjectListType originalContent;
    @XmlElement(name = "InvocationControlFile")
    protected List<ExtrinsicObjectType> invocationControlFile;

    /**
     * Gets the value of the originalContent property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectListType }
     *     
     */
    public RegistryObjectListType getOriginalContent() {
        return originalContent;
    }

    /**
     * Sets the value of the originalContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectListType }
     *     
     */
    public void setOriginalContent(RegistryObjectListType value) {
        this.originalContent = value;
    }

    /**
     * Gets the value of the invocationControlFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invocationControlFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvocationControlFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtrinsicObjectType }
     * 
     * 
     */
    public List<ExtrinsicObjectType> getInvocationControlFile() {
        if (invocationControlFile == null) {
            invocationControlFile = new ArrayList<ExtrinsicObjectType>();
        }
        return this.invocationControlFile;
    }

}
