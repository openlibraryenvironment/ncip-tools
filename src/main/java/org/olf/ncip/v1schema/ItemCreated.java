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
    "uniqueItemId",
    "uniqueRequestId",
    "bibliographicDescription",
    "itemUseRestrictionType",
    "circulationStatus",
    "itemDescription",
    "location",
    "physicalCondition",
    "securityMarker",
    "sensitizationFlag"
})
@XmlRootElement(name = "ItemCreated")
public class ItemCreated {

    @XmlElement(name = "InitiationHeader", required = true)
    protected InitiationHeader initiationHeader;
    @XmlElement(name = "UniqueItemId", required = true)
    protected UniqueItemId uniqueItemId;
    @XmlElement(name = "UniqueRequestId")
    protected UniqueRequestId uniqueRequestId;
    @XmlElement(name = "BibliographicDescription", required = true)
    protected BibliographicDescription bibliographicDescription;
    @XmlElement(name = "ItemUseRestrictionType")
    protected List<ItemUseRestrictionType> itemUseRestrictionType;
    @XmlElement(name = "CirculationStatus")
    protected CirculationStatus circulationStatus;
    @XmlElement(name = "ItemDescription")
    protected ItemDescription itemDescription;
    @XmlElement(name = "Location")
    protected List<Location> location;
    @XmlElement(name = "PhysicalCondition")
    protected PhysicalCondition physicalCondition;
    @XmlElement(name = "SecurityMarker")
    protected SecurityMarker securityMarker;
    @XmlElement(name = "SensitizationFlag")
    protected SensitizationFlag sensitizationFlag;

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

    /**
     * Gets the value of the bibliographicDescription property.
     * 
     * @return
     *     possible object is
     *     {@link BibliographicDescription }
     *     
     */
    public BibliographicDescription getBibliographicDescription() {
        return bibliographicDescription;
    }

    /**
     * Sets the value of the bibliographicDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibliographicDescription }
     *     
     */
    public void setBibliographicDescription(BibliographicDescription value) {
        this.bibliographicDescription = value;
    }

    /**
     * Gets the value of the itemUseRestrictionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemUseRestrictionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemUseRestrictionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemUseRestrictionType }
     * 
     * 
     */
    public List<ItemUseRestrictionType> getItemUseRestrictionType() {
        if (itemUseRestrictionType == null) {
            itemUseRestrictionType = new ArrayList<ItemUseRestrictionType>();
        }
        return this.itemUseRestrictionType;
    }

    /**
     * Gets the value of the circulationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CirculationStatus }
     *     
     */
    public CirculationStatus getCirculationStatus() {
        return circulationStatus;
    }

    /**
     * Sets the value of the circulationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CirculationStatus }
     *     
     */
    public void setCirculationStatus(CirculationStatus value) {
        this.circulationStatus = value;
    }

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDescription }
     *     
     */
    public ItemDescription getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDescription }
     *     
     */
    public void setItemDescription(ItemDescription value) {
        this.itemDescription = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getLocation() {
        if (location == null) {
            location = new ArrayList<Location>();
        }
        return this.location;
    }

    /**
     * Gets the value of the physicalCondition property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalCondition }
     *     
     */
    public PhysicalCondition getPhysicalCondition() {
        return physicalCondition;
    }

    /**
     * Sets the value of the physicalCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalCondition }
     *     
     */
    public void setPhysicalCondition(PhysicalCondition value) {
        this.physicalCondition = value;
    }

    /**
     * Gets the value of the securityMarker property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityMarker }
     *     
     */
    public SecurityMarker getSecurityMarker() {
        return securityMarker;
    }

    /**
     * Sets the value of the securityMarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityMarker }
     *     
     */
    public void setSecurityMarker(SecurityMarker value) {
        this.securityMarker = value;
    }

    /**
     * Gets the value of the sensitizationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link SensitizationFlag }
     *     
     */
    public SensitizationFlag getSensitizationFlag() {
        return sensitizationFlag;
    }

    /**
     * Sets the value of the sensitizationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitizationFlag }
     *     
     */
    public void setSensitizationFlag(SensitizationFlag value) {
        this.sensitizationFlag = value;
    }

}