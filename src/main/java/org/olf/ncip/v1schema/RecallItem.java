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
    "desiredDateDue",
    "shippingInformation",
    "itemElementType",
    "userElementType"
})
@XmlRootElement(name = "RecallItem")
public class RecallItem {

    @XmlElement(name = "InitiationHeader", required = true)
    protected InitiationHeader initiationHeader;
    @XmlElement(name = "MandatedAction")
    protected MandatedAction mandatedAction;
    @XmlElement(name = "UniqueItemId", required = true)
    protected UniqueItemId uniqueItemId;
    @XmlElement(name = "DesiredDateDue")
    protected DesiredDateDue desiredDateDue;
    @XmlElement(name = "ShippingInformation")
    protected ShippingInformation shippingInformation;
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
     * Gets the value of the desiredDateDue property.
     * 
     * @return
     *     possible object is
     *     {@link DesiredDateDue }
     *     
     */
    public DesiredDateDue getDesiredDateDue() {
        return desiredDateDue;
    }

    /**
     * Sets the value of the desiredDateDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesiredDateDue }
     *     
     */
    public void setDesiredDateDue(DesiredDateDue value) {
        this.desiredDateDue = value;
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
