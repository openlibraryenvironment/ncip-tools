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
    "initiationHeader",
    "uniqueUserId",
    "fiscalTransactionInformation"
})
@XmlRootElement(name = "UserFiscalTransactionCreated")
public class UserFiscalTransactionCreated {

    @XmlElement(name = "InitiationHeader", required = true)
    protected InitiationHeader initiationHeader;
    @XmlElement(name = "UniqueUserId", required = true)
    protected UniqueUserId uniqueUserId;
    @XmlElement(name = "FiscalTransactionInformation", required = true)
    protected FiscalTransactionInformation fiscalTransactionInformation;

    /**
     * Gets the value of the initiationHeader property.
     * 
     * @return
     *     possible object is
     *     {@link InitiationHeader }
     *     
     */
    public InitiationHeader getInitiationHeader() {
        return initiationHeader;
    }

    /**
     * Sets the value of the initiationHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitiationHeader }
     *     
     */
    public void setInitiationHeader(InitiationHeader value) {
        this.initiationHeader = value;
    }

    /**
     * Gets the value of the uniqueUserId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueUserId }
     *     
     */
    public UniqueUserId getUniqueUserId() {
        return uniqueUserId;
    }

    /**
     * Sets the value of the uniqueUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueUserId }
     *     
     */
    public void setUniqueUserId(UniqueUserId value) {
        this.uniqueUserId = value;
    }

    /**
     * Gets the value of the fiscalTransactionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FiscalTransactionInformation }
     *     
     */
    public FiscalTransactionInformation getFiscalTransactionInformation() {
        return fiscalTransactionInformation;
    }

    /**
     * Sets the value of the fiscalTransactionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiscalTransactionInformation }
     *     
     */
    public void setFiscalTransactionInformation(FiscalTransactionInformation value) {
        this.fiscalTransactionInformation = value;
    }

}
