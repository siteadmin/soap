//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.18 at 10:59:00 AM EST 
//


package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MCCI_MT000200UV01.Acknowledgement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MCCI_MT000200UV01.Acknowledgement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="typeCode" type="{urn:hl7-org:v3}CS"/>
 *         &lt;element name="expectedSequenceNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/>
 *         &lt;element name="messageWaitingNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/>
 *         &lt;element name="messageWaitingPriorityCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="targetMessage" type="{urn:hl7-org:v3}MCCI_MT000200UV01.TargetMessage"/>
 *         &lt;element name="acknowledgementDetail" type="{urn:hl7-org:v3}MCCI_MT000200UV01.AcknowledgementDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MCCI_MT000200UV01.Acknowledgement", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "typeCode",
    "expectedSequenceNumber",
    "messageWaitingNumber",
    "messageWaitingPriorityCode",
    "targetMessage",
    "acknowledgementDetail"
})
public class MCCIMT000200UV01Acknowledgement {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElement(required = true)
    protected CS typeCode;
    protected INT expectedSequenceNumber;
    protected INT messageWaitingNumber;
    protected CE messageWaitingPriorityCode;
    @XmlElement(required = true, nillable = true)
    protected MCCIMT000200UV01TargetMessage targetMessage;
    @XmlElement(nillable = true)
    protected List<MCCIMT000200UV01AcknowledgementDetail> acknowledgementDetail;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;

    /**
     * Gets the value of the realmCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realmCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealmCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CS }
     * 
     * 
     */
    public List<CS> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<CS>();
        }
        return this.realmCode;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setTypeId(II value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<II>();
        }
        return this.templateId;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setTypeCode(CS value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the expectedSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getExpectedSequenceNumber() {
        return expectedSequenceNumber;
    }

    /**
     * Sets the value of the expectedSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setExpectedSequenceNumber(INT value) {
        this.expectedSequenceNumber = value;
    }

    /**
     * Gets the value of the messageWaitingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getMessageWaitingNumber() {
        return messageWaitingNumber;
    }

    /**
     * Sets the value of the messageWaitingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setMessageWaitingNumber(INT value) {
        this.messageWaitingNumber = value;
    }

    /**
     * Gets the value of the messageWaitingPriorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getMessageWaitingPriorityCode() {
        return messageWaitingPriorityCode;
    }

    /**
     * Sets the value of the messageWaitingPriorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setMessageWaitingPriorityCode(CE value) {
        this.messageWaitingPriorityCode = value;
    }

    /**
     * Gets the value of the targetMessage property.
     * 
     * @return
     *     possible object is
     *     {@link MCCIMT000200UV01TargetMessage }
     *     
     */
    public MCCIMT000200UV01TargetMessage getTargetMessage() {
        return targetMessage;
    }

    /**
     * Sets the value of the targetMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCCIMT000200UV01TargetMessage }
     *     
     */
    public void setTargetMessage(MCCIMT000200UV01TargetMessage value) {
        this.targetMessage = value;
    }

    /**
     * Gets the value of the acknowledgementDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acknowledgementDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcknowledgementDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MCCIMT000200UV01AcknowledgementDetail }
     * 
     * 
     */
    public List<MCCIMT000200UV01AcknowledgementDetail> getAcknowledgementDetail() {
        if (acknowledgementDetail == null) {
            acknowledgementDetail = new ArrayList<MCCIMT000200UV01AcknowledgementDetail>();
        }
        return this.acknowledgementDetail;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nullFlavor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNullFlavor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNullFlavor() {
        if (nullFlavor == null) {
            nullFlavor = new ArrayList<String>();
        }
        return this.nullFlavor;
    }

}
