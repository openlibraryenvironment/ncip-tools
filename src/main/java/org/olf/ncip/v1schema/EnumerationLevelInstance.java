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
    "enumerationCaptionOrEnumerationLevel",
    "enumerationValue"
})
@XmlRootElement(name = "EnumerationLevelInstance")
public class EnumerationLevelInstance {

    @XmlElements({
        @XmlElement(name = "EnumerationCaption", required = true, type = EnumerationCaption.class),
        @XmlElement(name = "EnumerationLevel", required = true, type = EnumerationLevel.class)
    })
    protected List<Object> enumerationCaptionOrEnumerationLevel;
    @XmlElement(name = "EnumerationValue", required = true)
    protected EnumerationValue enumerationValue;

    /**
     * Gets the value of the enumerationCaptionOrEnumerationLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumerationCaptionOrEnumerationLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumerationCaptionOrEnumerationLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumerationCaption }
     * {@link EnumerationLevel }
     * 
     * 
     */
    public List<Object> getEnumerationCaptionOrEnumerationLevel() {
        if (enumerationCaptionOrEnumerationLevel == null) {
            enumerationCaptionOrEnumerationLevel = new ArrayList<Object>();
        }
        return this.enumerationCaptionOrEnumerationLevel;
    }

    /**
     * Gets the value of the enumerationValue property.
     * 
     * @return
     *     possible object is
     *     {@link EnumerationValue }
     *     
     */
    public EnumerationValue getEnumerationValue() {
        return enumerationValue;
    }

    /**
     * Sets the value of the enumerationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationValue }
     *     
     */
    public void setEnumerationValue(EnumerationValue value) {
        this.enumerationValue = value;
    }

}