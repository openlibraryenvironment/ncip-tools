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
    "electronicDataFormatTypeOrActualResourceOrReferenceToResource"
})
@XmlRootElement(name = "ElectronicResource")
public class ElectronicResource {

    @XmlElements({
        @XmlElement(name = "ElectronicDataFormatType", required = true, type = ElectronicDataFormatType.class),
        @XmlElement(name = "ActualResource", required = true, type = ActualResource.class),
        @XmlElement(name = "ReferenceToResource", required = true, type = ReferenceToResource.class)
    })
    protected List<Object> electronicDataFormatTypeOrActualResourceOrReferenceToResource;

    /**
     * Gets the value of the electronicDataFormatTypeOrActualResourceOrReferenceToResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicDataFormatTypeOrActualResourceOrReferenceToResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicDataFormatTypeOrActualResourceOrReferenceToResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicDataFormatType }
     * {@link ActualResource }
     * {@link ReferenceToResource }
     * 
     * 
     */
    public List<Object> getElectronicDataFormatTypeOrActualResourceOrReferenceToResource() {
        if (electronicDataFormatTypeOrActualResourceOrReferenceToResource == null) {
            electronicDataFormatTypeOrActualResourceOrReferenceToResource = new ArrayList<Object>();
        }
        return this.electronicDataFormatTypeOrActualResourceOrReferenceToResource;
    }

}
