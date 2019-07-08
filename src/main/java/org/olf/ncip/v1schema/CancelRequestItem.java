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
    "mandatedAction",
    "uniqueUserIdOrAuthenticationInput",
    "uniqueItemIdOrUniqueRequestId",
    "requestType",
    "requestScopeType",
    "itemElementType",
    "userElementType"
})
@XmlRootElement(name = "CancelRequestItem")
public class CancelRequestItem {

    @XmlElement(name = "InitiationHeader", required = true)
    protected InitiationHeader initiationHeader;
    @XmlElement(name = "MandatedAction")
    protected MandatedAction mandatedAction;
    @XmlElements({
        @XmlElement(name = "UniqueUserId", required = true, type = UniqueUserId.class),
        @XmlElement(name = "AuthenticationInput", required = true, type = AuthenticationInput.class)
    })
    protected List<Object> uniqueUserIdOrAuthenticationInput;
    @XmlElements({
        @XmlElement(name = "UniqueItemId", required = true, type = UniqueItemId.class),
        @XmlElement(name = "UniqueRequestId", required = true, type = UniqueRequestId.class)
    })
    protected List<Object> uniqueItemIdOrUniqueRequestId;
    @XmlElement(name = "RequestType", required = true)
    protected RequestType requestType;
    @XmlElement(name = "RequestScopeType")
    protected RequestScopeType requestScopeType;
    @XmlElement(name = "ItemElementType")
    protected List<ItemElementType> itemElementType;
    @XmlElement(name = "UserElementType")
    protected List<UserElementType> userElementType;

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
     * Gets the value of the mandatedAction property.
     * 
     * @return
     *     possible object is
     *     {@link MandatedAction }
     *     
     */
    public MandatedAction getMandatedAction() {
        return mandatedAction;
    }

    /**
     * Sets the value of the mandatedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatedAction }
     *     
     */
    public void setMandatedAction(MandatedAction value) {
        this.mandatedAction = value;
    }

    /**
     * Gets the value of the uniqueUserIdOrAuthenticationInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniqueUserIdOrAuthenticationInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniqueUserIdOrAuthenticationInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueUserId }
     * {@link AuthenticationInput }
     * 
     * 
     */
    public List<Object> getUniqueUserIdOrAuthenticationInput() {
        if (uniqueUserIdOrAuthenticationInput == null) {
            uniqueUserIdOrAuthenticationInput = new ArrayList<Object>();
        }
        return this.uniqueUserIdOrAuthenticationInput;
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
     * Gets the value of the itemElementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemElementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemElementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemElementType }
     * 
     * 
     */
    public List<ItemElementType> getItemElementType() {
        if (itemElementType == null) {
            itemElementType = new ArrayList<ItemElementType>();
        }
        return this.itemElementType;
    }

    /**
     * Gets the value of the userElementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userElementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserElementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserElementType }
     * 
     * 
     */
    public List<UserElementType> getUserElementType() {
        if (userElementType == null) {
            userElementType = new ArrayList<UserElementType>();
        }
        return this.userElementType;
    }

}