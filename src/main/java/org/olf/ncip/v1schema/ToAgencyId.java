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
    "uniqueAgencyId"
})
@XmlRootElement(name = "ToAgencyId")
public class ToAgencyId {

    @XmlElement(name = "UniqueAgencyId", required = true)
    protected UniqueAgencyId uniqueAgencyId;

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

}
