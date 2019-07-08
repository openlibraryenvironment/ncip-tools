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
    "uniqueUserId",
    "uniqueItemId",
    "requestType",
    "requestScopeType",
    "requestStatusType",
    "shippingInformation",
    "earliestDateNeeded",
    "needBeforeDate",
    "pickupExpiryDate",
    "dateOfUserRequest",
    "dateAvailable",
    "acknowledgedFeeAmount"
})
@XmlRootElement(name = "AddRequestFields")
public class AddRequestFields {

    @XmlElement(name = "UniqueUserId")
    protected UniqueUserId uniqueUserId;
    @XmlElement(name = "UniqueItemId")
    protected UniqueItemId uniqueItemId;
    @XmlElement(name = "RequestType")
    protected RequestType requestType;
    @XmlElement(name = "RequestScopeType")
    protected RequestScopeType requestScopeType;
    @XmlElement(name = "RequestStatusType")
    protected RequestStatusType requestStatusType;
    @XmlElement(name = "ShippingInformation")
    protected ShippingInformation shippingInformation;
    @XmlElement(name = "EarliestDateNeeded")
    protected EarliestDateNeeded earliestDateNeeded;
    @XmlElement(name = "NeedBeforeDate")
    protected NeedBeforeDate needBeforeDate;
    @XmlElement(name = "PickupExpiryDate")
    protected PickupExpiryDate pickupExpiryDate;
    @XmlElement(name = "DateOfUserRequest")
    protected DateOfUserRequest dateOfUserRequest;
    @XmlElement(name = "DateAvailable")
    protected DateAvailable dateAvailable;
    @XmlElement(name = "AcknowledgedFeeAmount")
    protected AcknowledgedFeeAmount acknowledgedFeeAmount;

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
     * Gets the value of the uniqueItemId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueItemId }
     *     
     */
    public UniqueItemId getUniqueItemId() {
        return uniqueItemId;
    }

    /**
     * Sets the value of the uniqueItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueItemId }
     *     
     */
    public void setUniqueItemId(UniqueItemId value) {
        this.uniqueItemId = value;
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
     * Gets the value of the requestStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestStatusType }
     *     
     */
    public RequestStatusType getRequestStatusType() {
        return requestStatusType;
    }

    /**
     * Sets the value of the requestStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStatusType }
     *     
     */
    public void setRequestStatusType(RequestStatusType value) {
        this.requestStatusType = value;
    }

    /**
     * Gets the value of the shippingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingInformation }
     *     
     */
    public ShippingInformation getShippingInformation() {
        return shippingInformation;
    }

    /**
     * Sets the value of the shippingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingInformation }
     *     
     */
    public void setShippingInformation(ShippingInformation value) {
        this.shippingInformation = value;
    }

    /**
     * Gets the value of the earliestDateNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link EarliestDateNeeded }
     *     
     */
    public EarliestDateNeeded getEarliestDateNeeded() {
        return earliestDateNeeded;
    }

    /**
     * Sets the value of the earliestDateNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarliestDateNeeded }
     *     
     */
    public void setEarliestDateNeeded(EarliestDateNeeded value) {
        this.earliestDateNeeded = value;
    }

    /**
     * Gets the value of the needBeforeDate property.
     * 
     * @return
     *     possible object is
     *     {@link NeedBeforeDate }
     *     
     */
    public NeedBeforeDate getNeedBeforeDate() {
        return needBeforeDate;
    }

    /**
     * Sets the value of the needBeforeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeedBeforeDate }
     *     
     */
    public void setNeedBeforeDate(NeedBeforeDate value) {
        this.needBeforeDate = value;
    }

    /**
     * Gets the value of the pickupExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link PickupExpiryDate }
     *     
     */
    public PickupExpiryDate getPickupExpiryDate() {
        return pickupExpiryDate;
    }

    /**
     * Sets the value of the pickupExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupExpiryDate }
     *     
     */
    public void setPickupExpiryDate(PickupExpiryDate value) {
        this.pickupExpiryDate = value;
    }

    /**
     * Gets the value of the dateOfUserRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DateOfUserRequest }
     *     
     */
    public DateOfUserRequest getDateOfUserRequest() {
        return dateOfUserRequest;
    }

    /**
     * Sets the value of the dateOfUserRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOfUserRequest }
     *     
     */
    public void setDateOfUserRequest(DateOfUserRequest value) {
        this.dateOfUserRequest = value;
    }

    /**
     * Gets the value of the dateAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link DateAvailable }
     *     
     */
    public DateAvailable getDateAvailable() {
        return dateAvailable;
    }

    /**
     * Sets the value of the dateAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAvailable }
     *     
     */
    public void setDateAvailable(DateAvailable value) {
        this.dateAvailable = value;
    }

    /**
     * Gets the value of the acknowledgedFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedFeeAmount }
     *     
     */
    public AcknowledgedFeeAmount getAcknowledgedFeeAmount() {
        return acknowledgedFeeAmount;
    }

    /**
     * Sets the value of the acknowledgedFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedFeeAmount }
     *     
     */
    public void setAcknowledgedFeeAmount(AcknowledgedFeeAmount value) {
        this.acknowledgedFeeAmount = value;
    }

}
