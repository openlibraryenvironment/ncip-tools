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
    "messagingErrorType",
    "messagingErrorElement"
})
@XmlRootElement(name = "MessagingError")
public class MessagingError {

    @XmlElement(name = "MessagingErrorType", required = true)
    protected MessagingErrorType messagingErrorType;
    @XmlElement(name = "MessagingErrorElement", required = true)
    protected MessagingErrorElement messagingErrorElement;

    /**
     * Gets the value of the messagingErrorType property.
     * 
     * @return
     *     possible object is
     *     {@link MessagingErrorType }
     *     
     */
    public MessagingErrorType getMessagingErrorType() {
        return messagingErrorType;
    }

    /**
     * Sets the value of the messagingErrorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagingErrorType }
     *     
     */
    public void setMessagingErrorType(MessagingErrorType value) {
        this.messagingErrorType = value;
    }

    /**
     * Gets the value of the messagingErrorElement property.
     * 
     * @return
     *     possible object is
     *     {@link MessagingErrorElement }
     *     
     */
    public MessagingErrorElement getMessagingErrorElement() {
        return messagingErrorElement;
    }

    /**
     * Sets the value of the messagingErrorElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagingErrorElement }
     *     
     */
    public void setMessagingErrorElement(MessagingErrorElement value) {
        this.messagingErrorElement = value;
    }

}
