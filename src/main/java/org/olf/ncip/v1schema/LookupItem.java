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
    "uniqueItemIdOrVisibleItemIdOrUniqueRequestId",
    "itemElementType",
    "currentBorrowerDesired",
    "currentRequestersDesired"
})
@XmlRootElement(name = "LookupItem")
public class LookupItem {

    @XmlElement(name = "InitiationHeader", required = true)
    protected InitiationHeader initiationHeader;
    @XmlElements({
        @XmlElement(name = "UniqueItemId", required = true, type = UniqueItemId.class),
        @XmlElement(name = "VisibleItemId", required = true, type = VisibleItemId.class),
        @XmlElement(name = "UniqueRequestId", required = true, type = UniqueRequestId.class)
    })
    protected List<Object> uniqueItemIdOrVisibleItemIdOrUniqueRequestId;
    @XmlElement(name = "ItemElementType", required = true)
    protected List<ItemElementType> itemElementType;
    @XmlElement(name = "CurrentBorrowerDesired")
    protected CurrentBorrowerDesired currentBorrowerDesired;
    @XmlElement(name = "CurrentRequestersDesired")
    protected CurrentRequestersDesired currentRequestersDesired;

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
     * Gets the value of the uniqueItemIdOrVisibleItemIdOrUniqueRequestId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniqueItemIdOrVisibleItemIdOrUniqueRequestId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniqueItemIdOrVisibleItemIdOrUniqueRequestId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueItemId }
     * {@link VisibleItemId }
     * {@link UniqueRequestId }
     * 
     * 
     */
    public List<Object> getUniqueItemIdOrVisibleItemIdOrUniqueRequestId() {
        if (uniqueItemIdOrVisibleItemIdOrUniqueRequestId == null) {
            uniqueItemIdOrVisibleItemIdOrUniqueRequestId = new ArrayList<Object>();
        }
        return this.uniqueItemIdOrVisibleItemIdOrUniqueRequestId;
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
     * Gets the value of the currentBorrowerDesired property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentBorrowerDesired }
     *     
     */
    public CurrentBorrowerDesired getCurrentBorrowerDesired() {
        return currentBorrowerDesired;
    }

    /**
     * Sets the value of the currentBorrowerDesired property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentBorrowerDesired }
     *     
     */
    public void setCurrentBorrowerDesired(CurrentBorrowerDesired value) {
        this.currentBorrowerDesired = value;
    }

    /**
     * Gets the value of the currentRequestersDesired property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentRequestersDesired }
     *     
     */
    public CurrentRequestersDesired getCurrentRequestersDesired() {
        return currentRequestersDesired;
    }

    /**
     * Sets the value of the currentRequestersDesired property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentRequestersDesired }
     *     
     */
    public void setCurrentRequestersDesired(CurrentRequestersDesired value) {
        this.currentRequestersDesired = value;
    }

}