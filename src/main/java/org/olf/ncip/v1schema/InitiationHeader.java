//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.08 at 10:19:21 AM BST 
//


package org.olf.ncip.v1schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fromSystemId",
    "fromSystemAuthentication",
    "fromAgencyId",
    "fromAgencyAuthentication",
    "onBehalfOfAgency",
    "toSystemId",
    "toAgencyId",
    "applicationProfileType"
})
@XmlRootElement(name = "InitiationHeader")
public class InitiationHeader {

    @XmlElement(name = "FromSystemId")
    protected FromSystemId fromSystemId;
    @XmlElement(name = "FromSystemAuthentication")
    protected FromSystemAuthentication fromSystemAuthentication;
    @XmlElement(name = "FromAgencyId", required = true)
    protected FromAgencyId fromAgencyId;
    @XmlElement(name = "FromAgencyAuthentication")
    protected FromAgencyAuthentication fromAgencyAuthentication;
    @XmlElement(name = "OnBehalfOfAgency")
    protected OnBehalfOfAgency onBehalfOfAgency;
    @XmlElement(name = "ToSystemId")
    protected ToSystemId toSystemId;
    @XmlElement(name = "ToAgencyId", required = true)
    protected ToAgencyId toAgencyId;
    @XmlElement(name = "ApplicationProfileType")
    protected ApplicationProfileType applicationProfileType;

    /**
     * Gets the value of the fromSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link FromSystemId }
     *     
     */
    public FromSystemId getFromSystemId() {
        return fromSystemId;
    }

    /**
     * Sets the value of the fromSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromSystemId }
     *     
     */
    public void setFromSystemId(FromSystemId value) {
        this.fromSystemId = value;
    }

    /**
     * Gets the value of the fromSystemAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link FromSystemAuthentication }
     *     
     */
    public FromSystemAuthentication getFromSystemAuthentication() {
        return fromSystemAuthentication;
    }

    /**
     * Sets the value of the fromSystemAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromSystemAuthentication }
     *     
     */
    public void setFromSystemAuthentication(FromSystemAuthentication value) {
        this.fromSystemAuthentication = value;
    }

    /**
     * Gets the value of the fromAgencyId property.
     * 
     * @return
     *     possible object is
     *     {@link FromAgencyId }
     *     
     */
    public FromAgencyId getFromAgencyId() {
        return fromAgencyId;
    }

    /**
     * Sets the value of the fromAgencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromAgencyId }
     *     
     */
    public void setFromAgencyId(FromAgencyId value) {
        this.fromAgencyId = value;
    }

    /**
     * Gets the value of the fromAgencyAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link FromAgencyAuthentication }
     *     
     */
    public FromAgencyAuthentication getFromAgencyAuthentication() {
        return fromAgencyAuthentication;
    }

    /**
     * Sets the value of the fromAgencyAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromAgencyAuthentication }
     *     
     */
    public void setFromAgencyAuthentication(FromAgencyAuthentication value) {
        this.fromAgencyAuthentication = value;
    }

    /**
     * Gets the value of the onBehalfOfAgency property.
     * 
     * @return
     *     possible object is
     *     {@link OnBehalfOfAgency }
     *     
     */
    public OnBehalfOfAgency getOnBehalfOfAgency() {
        return onBehalfOfAgency;
    }

    /**
     * Sets the value of the onBehalfOfAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnBehalfOfAgency }
     *     
     */
    public void setOnBehalfOfAgency(OnBehalfOfAgency value) {
        this.onBehalfOfAgency = value;
    }

    /**
     * Gets the value of the toSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link ToSystemId }
     *     
     */
    public ToSystemId getToSystemId() {
        return toSystemId;
    }

    /**
     * Sets the value of the toSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToSystemId }
     *     
     */
    public void setToSystemId(ToSystemId value) {
        this.toSystemId = value;
    }

    /**
     * Gets the value of the toAgencyId property.
     * 
     * @return
     *     possible object is
     *     {@link ToAgencyId }
     *     
     */
    public ToAgencyId getToAgencyId() {
        return toAgencyId;
    }

    /**
     * Sets the value of the toAgencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToAgencyId }
     *     
     */
    public void setToAgencyId(ToAgencyId value) {
        this.toAgencyId = value;
    }

    /**
     * Gets the value of the applicationProfileType property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationProfileType }
     *     
     */
    public ApplicationProfileType getApplicationProfileType() {
        return applicationProfileType;
    }

    /**
     * Sets the value of the applicationProfileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationProfileType }
     *     
     */
    public void setApplicationProfileType(ApplicationProfileType value) {
        this.applicationProfileType = value;
    }

}
