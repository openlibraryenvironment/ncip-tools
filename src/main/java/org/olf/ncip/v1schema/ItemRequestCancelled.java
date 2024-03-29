//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.08 at 10:19:21 AM BST 
//


package org.olf.ncip.v1schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "initiationHeader",
    "uniqueUserId",
    "uniqueItemIdOrUniqueRequestId",
    "requestType",
    "requestScopeType",
    "fiscalTransactionInformation",
    "itemOptionalFields",
    "userOptionalFields"
})
@XmlRootElement(name = "ItemRequestCancelled")
public class ItemRequestCancelled {

    @XmlElement(name = "InitiationHeader", required = true)
    protected InitiationHeader initiationHeader;
    @XmlElement(name = "UniqueUserId", required = true)
    protected UniqueUserId uniqueUserId;
    @XmlElements({
        @XmlElement(name = "UniqueItemId", required = true, type = UniqueItemId.class),
        @XmlElement(name = "UniqueRequestId", required = true, type = UniqueRequestId.class)
    })
    protected List<Object> uniqueItemIdOrUniqueRequestId;
    @XmlElement(name = "RequestType", required = true)
    protected RequestType requestType;
    @XmlElement(name = "RequestScopeType")
    protected RequestScopeType requestScopeType;
    @XmlElement(name = "FiscalTransactionInformation")
    protected FiscalTransactionInformation fiscalTransactionInformation;
    @XmlElement(name = "ItemOptionalFields")
    protected ItemOptionalFields itemOptionalFields;
    @XmlElement(name = "UserOptionalFields")
    protected UserOptionalFields userOptionalFields;

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
     * Gets the value of the uniqueItemIdOrUniqueRequestId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniqueItemIdOrUniqueRequestId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniqueItemIdOrUniqueRequestId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueItemId }
     * {@link UniqueRequestId }
     * 
     * 
     */
    public List<Object> getUniqueItemIdOrUniqueRequestId() {
        if (uniqueItemIdOrUniqueRequestId == null) {
            uniqueItemIdOrUniqueRequestId = new ArrayList<Object>();
        }
        return this.uniqueItemIdOrUniqueRequestId;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequestType(RequestType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the requestScopeType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestScopeType }
     *     
     */
    public RequestScopeType getRequestScopeType() {
        return requestScopeType;
    }

    /**
     * Sets the value of the requestScopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestScopeType }
     *     
     */
    public void setRequestScopeType(RequestScopeType value) {
        this.requestScopeType = value;
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

    /**
     * Gets the value of the itemOptionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link ItemOptionalFields }
     *     
     */
    public ItemOptionalFields getItemOptionalFields() {
        return itemOptionalFields;
    }

    /**
     * Sets the value of the itemOptionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemOptionalFields }
     *     
     */
    public void setItemOptionalFields(ItemOptionalFields value) {
        this.itemOptionalFields = value;
    }

    /**
     * Gets the value of the userOptionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link UserOptionalFields }
     *     
     */
    public UserOptionalFields getUserOptionalFields() {
        return userOptionalFields;
    }

    /**
     * Sets the value of the userOptionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserOptionalFields }
     *     
     */
    public void setUserOptionalFields(UserOptionalFields value) {
        this.userOptionalFields = value;
    }

}
