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
    "uniqueAgencyId",
    "blockOrTrapType",
    "validFromDate",
    "validToDate"
})
@XmlRootElement(name = "BlockOrTrap")
public class BlockOrTrap {

    @XmlElement(name = "UniqueAgencyId", required = true)
    protected UniqueAgencyId uniqueAgencyId;
    @XmlElement(name = "BlockOrTrapType", required = true)
    protected BlockOrTrapType blockOrTrapType;
    @XmlElement(name = "ValidFromDate")
    protected ValidFromDate validFromDate;
    @XmlElement(name = "ValidToDate")
    protected ValidToDate validToDate;

    /**
     * Gets the value of the uniqueAgencyId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueAgencyId }
     *     
     */
    public UniqueAgencyId getUniqueAgencyId() {
        return uniqueAgencyId;
    }

    /**
     * Sets the value of the uniqueAgencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueAgencyId }
     *     
     */
    public void setUniqueAgencyId(UniqueAgencyId value) {
        this.uniqueAgencyId = value;
    }

    /**
     * Gets the value of the blockOrTrapType property.
     * 
     * @return
     *     possible object is
     *     {@link BlockOrTrapType }
     *     
     */
    public BlockOrTrapType getBlockOrTrapType() {
        return blockOrTrapType;
    }

    /**
     * Sets the value of the blockOrTrapType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockOrTrapType }
     *     
     */
    public void setBlockOrTrapType(BlockOrTrapType value) {
        this.blockOrTrapType = value;
    }

    /**
     * Gets the value of the validFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link ValidFromDate }
     *     
     */
    public ValidFromDate getValidFromDate() {
        return validFromDate;
    }

    /**
     * Sets the value of the validFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidFromDate }
     *     
     */
    public void setValidFromDate(ValidFromDate value) {
        this.validFromDate = value;
    }

    /**
     * Gets the value of the validToDate property.
     * 
     * @return
     *     possible object is
     *     {@link ValidToDate }
     *     
     */
    public ValidToDate getValidToDate() {
        return validToDate;
    }

    /**
     * Sets the value of the validToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidToDate }
     *     
     */
    public void setValidToDate(ValidToDate value) {
        this.validToDate = value;
    }

}
