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
    "accrualDate",
    "fiscalTransactionInformation"
})
@XmlRootElement(name = "AccountDetails")
public class AccountDetails {

    @XmlElement(name = "AccrualDate", required = true)
    protected AccrualDate accrualDate;
    @XmlElement(name = "FiscalTransactionInformation", required = true)
    protected FiscalTransactionInformation fiscalTransactionInformation;

    /**
     * Gets the value of the accrualDate property.
     * 
     * @return
     *     possible object is
     *     {@link AccrualDate }
     *     
     */
    public AccrualDate getAccrualDate() {
        return accrualDate;
    }

    /**
     * Sets the value of the accrualDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccrualDate }
     *     
     */
    public void setAccrualDate(AccrualDate value) {
        this.accrualDate = value;
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