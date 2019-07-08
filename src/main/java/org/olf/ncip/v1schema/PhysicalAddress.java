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
    "structuredAddressOrUnstructuredAddress",
    "physicalAddressType"
})
@XmlRootElement(name = "PhysicalAddress")
public class PhysicalAddress {

    @XmlElements({
        @XmlElement(name = "StructuredAddress", required = true, type = StructuredAddress.class),
        @XmlElement(name = "UnstructuredAddress", required = true, type = UnstructuredAddress.class)
    })
    protected List<Object> structuredAddressOrUnstructuredAddress;
    @XmlElement(name = "PhysicalAddressType", required = true)
    protected PhysicalAddressType physicalAddressType;

    /**
     * Gets the value of the structuredAddressOrUnstructuredAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structuredAddressOrUnstructuredAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructuredAddressOrUnstructuredAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredAddress }
     * {@link UnstructuredAddress }
     * 
     * 
     */
    public List<Object> getStructuredAddressOrUnstructuredAddress() {
        if (structuredAddressOrUnstructuredAddress == null) {
            structuredAddressOrUnstructuredAddress = new ArrayList<Object>();
        }
        return this.structuredAddressOrUnstructuredAddress;
    }

    /**
     * Gets the value of the physicalAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddressType }
     *     
     */
    public PhysicalAddressType getPhysicalAddressType() {
        return physicalAddressType;
    }

    /**
     * Sets the value of the physicalAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddressType }
     *     
     */
    public void setPhysicalAddressType(PhysicalAddressType value) {
        this.physicalAddressType = value;
    }

}