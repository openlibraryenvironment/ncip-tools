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
    "authenticationPromptData",
    "authenticationPromptType"
})
@XmlRootElement(name = "PromptOutput")
public class PromptOutput {

    @XmlElement(name = "AuthenticationPromptData", required = true)
    protected AuthenticationPromptData authenticationPromptData;
    @XmlElement(name = "AuthenticationPromptType", required = true)
    protected AuthenticationPromptType authenticationPromptType;

    /**
     * Gets the value of the authenticationPromptData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationPromptData }
     *     
     */
    public AuthenticationPromptData getAuthenticationPromptData() {
        return authenticationPromptData;
    }

    /**
     * Sets the value of the authenticationPromptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationPromptData }
     *     
     */
    public void setAuthenticationPromptData(AuthenticationPromptData value) {
        this.authenticationPromptData = value;
    }

    /**
     * Gets the value of the authenticationPromptType property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationPromptType }
     *     
     */
    public AuthenticationPromptType getAuthenticationPromptType() {
        return authenticationPromptType;
    }

    /**
     * Sets the value of the authenticationPromptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationPromptType }
     *     
     */
    public void setAuthenticationPromptType(AuthenticationPromptType value) {
        this.authenticationPromptType = value;
    }

}
