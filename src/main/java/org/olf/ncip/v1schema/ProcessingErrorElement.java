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
    "elementName",
    "processingErrorElementOrProcessingErrorValue"
})
@XmlRootElement(name = "ProcessingErrorElement")
public class ProcessingErrorElement {

    @XmlElement(name = "ElementName", required = true)
    protected ElementName elementName;
    @XmlElements({
        @XmlElement(name = "ProcessingErrorElement", type = ProcessingErrorElement.class),
        @XmlElement(name = "ProcessingErrorValue", type = ProcessingErrorValue.class)
    })
    protected List<Object> processingErrorElementOrProcessingErrorValue;

    /**
     * Gets the value of the elementName property.
     * 
     * @return
     *     possible object is
     *     {@link ElementName }
     *     
     */
    public ElementName getElementName() {
        return elementName;
    }

    /**
     * Sets the value of the elementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementName }
     *     
     */
    public void setElementName(ElementName value) {
        this.elementName = value;
    }

    /**
     * Gets the value of the processingErrorElementOrProcessingErrorValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processingErrorElementOrProcessingErrorValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingErrorElementOrProcessingErrorValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessingErrorElement }
     * {@link ProcessingErrorValue }
     * 
     * 
     */
    public List<Object> getProcessingErrorElementOrProcessingErrorValue() {
        if (processingErrorElementOrProcessingErrorValue == null) {
            processingErrorElementOrProcessingErrorValue = new ArrayList<Object>();
        }
        return this.processingErrorElementOrProcessingErrorValue;
    }

}
