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
    "enumerationLevelInstance"
})
@XmlRootElement(name = "HoldingsEnumeration")
public class HoldingsEnumeration {

    @XmlElement(name = "EnumerationLevelInstance", required = true)
    protected List<EnumerationLevelInstance> enumerationLevelInstance;

    /**
     * Gets the value of the enumerationLevelInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumerationLevelInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumerationLevelInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumerationLevelInstance }
     * 
     * 
     */
    public List<EnumerationLevelInstance> getEnumerationLevelInstance() {
        if (enumerationLevelInstance == null) {
            enumerationLevelInstance = new ArrayList<EnumerationLevelInstance>();
        }
        return this.enumerationLevelInstance;
    }

}
