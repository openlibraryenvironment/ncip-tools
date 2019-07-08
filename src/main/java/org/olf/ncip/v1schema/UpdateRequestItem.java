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
    "uniqueUserIdOrAuthenticationInputOrUniqueItemIdOrRequestTypeOrUniqueRequestId",
    "deleteRequestFields",
    "addRequestFields",
    "itemElementType",
    "userElementType"
})
@XmlRootElement(name = "UpdateRequestItem")
public class UpdateRequestItem {

    @XmlElement(name = "InitiationHeader", required = true)
    protected InitiationHeader initiationHeader;
    @XmlElement(name = "MandatedAction")
    protected MandatedAction mandatedAction;
    @XmlElements({
        @XmlElement(name = "UniqueUserId", required = true, type = UniqueUserId.class),
        @XmlElement(name = "AuthenticationInput", required = true, type = AuthenticationInput.class),
        @XmlElement(name = "UniqueItemId", required = true, type = UniqueItemId.class),
        @XmlElement(name = "RequestType", required = true, type = RequestType.class),
        @XmlElement(name = "UniqueRequestId", required = true, type = UniqueRequestId.class)
    })
    protected List<Object> uniqueUserIdOrAuthenticationInputOrUniqueItemIdOrRequestTypeOrUniqueRequestId;
    @XmlElement(name = "DeleteRequestFields")
    protected DeleteRequestFields deleteRequestFields;
    @XmlElement(name = "AddRequestFields")
    protected AddRequestFields addRequestFields;
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
     * Gets the value of the uniqueUserIdOrAuthenticationInputOrUniqueItemIdOrRequestTypeOrUniqueRequestId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniqueUserIdOrAuthenticationInputOrUniqueItemIdOrRequestTypeOrUniqueRequestId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniqueUserIdOrAuthenticationInputOrUniqueItemIdOrRequestTypeOrUniqueRequestId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueUserId }
     * {@link AuthenticationInput }
     * {@link UniqueItemId }
     * {@link RequestType }
     * {@link UniqueRequestId }
     * 
     * 
     */
    public List<Object> getUniqueUserIdOrAuthenticationInputOrUniqueItemIdOrRequestTypeOrUniqueRequestId() {
        if (uniqueUserIdOrAuthenticationInputOrUniqueItemIdOrRequestTypeOrUniqueRequestId == null) {
            uniqueUserIdOrAuthenticationInputOrUniqueItemIdOrRequestTypeOrUniqueRequestId = new ArrayList<Object>();
        }
        return this.uniqueUserIdOrAuthenticationInputOrUniqueItemIdOrRequestTypeOrUniqueRequestId;
    }

    /**
     * Gets the value of the deleteRequestFields property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteRequestFields }
     *     
     */
    public DeleteRequestFields getDeleteRequestFields() {
        return deleteRequestFields;
    }

    /**
     * Sets the value of the deleteRequestFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteRequestFields }
     *     
     */
    public void setDeleteRequestFields(DeleteRequestFields value) {
        this.deleteRequestFields = value;
    }

    /**
     * Gets the value of the addRequestFields property.
     * 
     * @return
     *     possible object is
     *     {@link AddRequestFields }
     *     
     */
    public AddRequestFields getAddRequestFields() {
        return addRequestFields;
    }

    /**
     * Sets the value of the addRequestFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddRequestFields }
     *     
     */
    public void setAddRequestFields(AddRequestFields value) {
        this.addRequestFields = value;
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
