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
    "uniqueItemIdOrUniqueBibliographicIdOrUniqueRequestId",
    "requestType",
    "requestScopeType",
    "shippingInformation",
    "earliestDateNeeded",
    "needBeforeDate",
    "pickupExpiryDate",
    "dateOfUserRequest",
    "dateAvailable",
    "itemOptionalFields",
    "userOptionalFields"
})
@XmlRootElement(name = "ItemRequested")
public class ItemRequested {

    @XmlElement(name = "InitiationHeader", required = true)
    protected InitiationHeader initiationHeader;
    @XmlElement(name = "UniqueUserId", required = true)
    protected UniqueUserId uniqueUserId;
    @XmlElements({
        @XmlElement(name = "UniqueItemId", required = true, type = UniqueItemId.class),
        @XmlElement(name = "UniqueBibliographicId", required = true, type = UniqueBibliographicId.class),
        @XmlElement(name = "UniqueRequestId", required = true, type = UniqueRequestId.class)
    })
    protected List<Object> uniqueItemIdOrUniqueBibliographicIdOrUniqueRequestId;
    @XmlElement(name = "RequestType", required = true)
    protected RequestType requestType;
    @XmlElement(name = "RequestScopeType", required = true)
    protected RequestScopeType requestScopeType;
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
     * Gets the value of the uniqueItemIdOrUniqueBibliographicIdOrUniqueRequestId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniqueItemIdOrUniqueBibliographicIdOrUniqueRequestId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniqueItemIdOrUniqueBibliographicIdOrUniqueRequestId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueItemId }
     * {@link UniqueBibliographicId }
     * {@link UniqueRequestId }
     * 
     * 
     */
    public List<Object> getUniqueItemIdOrUniqueBibliographicIdOrUniqueRequestId() {
        if (uniqueItemIdOrUniqueBibliographicIdOrUniqueRequestId == null) {
            uniqueItemIdOrUniqueBibliographicIdOrUniqueRequestId = new ArrayList<Object>();
        }
        return this.uniqueItemIdOrUniqueBibliographicIdOrUniqueRequestId;
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
