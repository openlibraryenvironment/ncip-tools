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
    "uniqueItemId",
    "uniqueUserIdOrAuthenticationInput",
    "uniqueRequestId"
})
@XmlRootElement(name = "UndoCheckOutItem")
public class UndoCheckOutItem {

    @XmlElement(name = "InitiationHeader", required = true)
    protected InitiationHeader initiationHeader;
    @XmlElement(name = "MandatedAction")
    protected MandatedAction mandatedAction;
    @XmlElement(name = "UniqueItemId", required = true)
    protected UniqueItemId uniqueItemId;
    @XmlElements({
        @XmlElement(name = "UniqueUserId", type = UniqueUserId.class),
        @XmlElement(name = "AuthenticationInput", type = AuthenticationInput.class)
    })
    protected List<Object> uniqueUserIdOrAuthenticationInput;
    @XmlElement(name = "UniqueRequestId")
    protected UniqueRequestId uniqueRequestId;

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
     * Gets the value of the uniqueRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueRequestId }
     *     
     */
    public UniqueRequestId getUniqueRequestId() {
        return uniqueRequestId;
    }

    /**
     * Sets the value of the uniqueRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueRequestId }
     *     
     */
    public void setUniqueRequestId(UniqueRequestId value) {
        this.uniqueRequestId = value;
    }

}
