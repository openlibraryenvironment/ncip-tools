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
    "visibleUserId",
    "authenticationInput",
    "nameInformation",
    "userAddressInformation",
    "dateOfBirth",
    "userLanguage",
    "userPrivilege",
    "blockOrTrap"
})
@XmlRootElement(name = "DeleteUserFields")
public class DeleteUserFields {

    @XmlElement(name = "VisibleUserId")
    protected List<VisibleUserId> visibleUserId;
    @XmlElement(name = "AuthenticationInput")
    protected List<AuthenticationInput> authenticationInput;
    @XmlElement(name = "NameInformation")
    protected NameInformation nameInformation;
    @XmlElement(name = "UserAddressInformation")
    protected List<UserAddressInformation> userAddressInformation;
    @XmlElement(name = "DateOfBirth")
    protected DateOfBirth dateOfBirth;
    @XmlElement(name = "UserLanguage")
    protected List<UserLanguage> userLanguage;
    @XmlElement(name = "UserPrivilege")
    protected List<UserPrivilege> userPrivilege;
    @XmlElement(name = "BlockOrTrap")
    protected List<BlockOrTrap> blockOrTrap;

    /**
     * Gets the value of the visibleUserId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visibleUserId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisibleUserId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisibleUserId }
     * 
     * 
     */
    public List<VisibleUserId> getVisibleUserId() {
        if (visibleUserId == null) {
            visibleUserId = new ArrayList<VisibleUserId>();
        }
        return this.visibleUserId;
    }

    /**
     * Gets the value of the authenticationInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authenticationInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthenticationInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthenticationInput }
     * 
     * 
     */
    public List<AuthenticationInput> getAuthenticationInput() {
        if (authenticationInput == null) {
            authenticationInput = new ArrayList<AuthenticationInput>();
        }
        return this.authenticationInput;
    }

    /**
     * Gets the value of the nameInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NameInformation }
     *     
     */
    public NameInformation getNameInformation() {
        return nameInformation;
    }

    /**
     * Sets the value of the nameInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameInformation }
     *     
     */
    public void setNameInformation(NameInformation value) {
        this.nameInformation = value;
    }

    /**
     * Gets the value of the userAddressInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userAddressInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserAddressInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserAddressInformation }
     * 
     * 
     */
    public List<UserAddressInformation> getUserAddressInformation() {
        if (userAddressInformation == null) {
            userAddressInformation = new ArrayList<UserAddressInformation>();
        }
        return this.userAddressInformation;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateOfBirth }
     *     
     */
    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOfBirth }
     *     
     */
    public void setDateOfBirth(DateOfBirth value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the userLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserLanguage }
     * 
     * 
     */
    public List<UserLanguage> getUserLanguage() {
        if (userLanguage == null) {
            userLanguage = new ArrayList<UserLanguage>();
        }
        return this.userLanguage;
    }

    /**
     * Gets the value of the userPrivilege property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userPrivilege property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserPrivilege().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserPrivilege }
     * 
     * 
     */
    public List<UserPrivilege> getUserPrivilege() {
        if (userPrivilege == null) {
            userPrivilege = new ArrayList<UserPrivilege>();
        }
        return this.userPrivilege;
    }

    /**
     * Gets the value of the blockOrTrap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockOrTrap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockOrTrap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlockOrTrap }
     * 
     * 
     */
    public List<BlockOrTrap> getBlockOrTrap() {
        if (blockOrTrap == null) {
            blockOrTrap = new ArrayList<BlockOrTrap>();
        }
        return this.blockOrTrap;
    }

}