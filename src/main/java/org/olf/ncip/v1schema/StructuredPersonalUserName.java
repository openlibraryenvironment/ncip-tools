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
    "prefix",
    "givenName",
    "initials",
    "surname",
    "suffix"
})
@XmlRootElement(name = "StructuredPersonalUserName")
public class StructuredPersonalUserName {

    @XmlElement(name = "Prefix")
    protected Prefix prefix;
    @XmlElement(name = "GivenName")
    protected GivenName givenName;
    @XmlElement(name = "Initials")
    protected Initials initials;
    @XmlElement(name = "Surname", required = true)
    protected Surname surname;
    @XmlElement(name = "Suffix")
    protected Suffix suffix;

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link Prefix }
     *     
     */
    public Prefix getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prefix }
     *     
     */
    public void setPrefix(Prefix value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link GivenName }
     *     
     */
    public GivenName getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link GivenName }
     *     
     */
    public void setGivenName(GivenName value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link Initials }
     *     
     */
    public Initials getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Initials }
     *     
     */
    public void setInitials(Initials value) {
        this.initials = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link Surname }
     *     
     */
    public Surname getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Surname }
     *     
     */
    public void setSurname(Surname value) {
        this.surname = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link Suffix }
     *     
     */
    public Suffix getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Suffix }
     *     
     */
    public void setSuffix(Suffix value) {
        this.suffix = value;
    }

}
