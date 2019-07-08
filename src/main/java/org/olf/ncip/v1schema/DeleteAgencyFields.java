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
    "organizationNameInformation",
    "agencyAddressInformation",
    "authenticationPrompt",
    "applicationProfileSupportedType",
    "consortiumAgreement",
    "agencyUserPrivilegeType"
})
@XmlRootElement(name = "DeleteAgencyFields")
public class DeleteAgencyFields {

    @XmlElement(name = "OrganizationNameInformation")
    protected List<OrganizationNameInformation> organizationNameInformation;
    @XmlElement(name = "AgencyAddressInformation")
    protected List<AgencyAddressInformation> agencyAddressInformation;
    @XmlElement(name = "AuthenticationPrompt")
    protected List<AuthenticationPrompt> authenticationPrompt;
    @XmlElement(name = "ApplicationProfileSupportedType")
    protected List<ApplicationProfileSupportedType> applicationProfileSupportedType;
    @XmlElement(name = "ConsortiumAgreement")
    protected List<ConsortiumAgreement> consortiumAgreement;
    @XmlElement(name = "AgencyUserPrivilegeType")
    protected List<AgencyUserPrivilegeType> agencyUserPrivilegeType;

    /**
     * Gets the value of the organizationNameInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationNameInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationNameInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationNameInformation }
     * 
     * 
     */
    public List<OrganizationNameInformation> getOrganizationNameInformation() {
        if (organizationNameInformation == null) {
            organizationNameInformation = new ArrayList<OrganizationNameInformation>();
        }
        return this.organizationNameInformation;
    }

    /**
     * Gets the value of the agencyAddressInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agencyAddressInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgencyAddressInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgencyAddressInformation }
     * 
     * 
     */
    public List<AgencyAddressInformation> getAgencyAddressInformation() {
        if (agencyAddressInformation == null) {
            agencyAddressInformation = new ArrayList<AgencyAddressInformation>();
        }
        return this.agencyAddressInformation;
    }

    /**
     * Gets the value of the authenticationPrompt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authenticationPrompt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthenticationPrompt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthenticationPrompt }
     * 
     * 
     */
    public List<AuthenticationPrompt> getAuthenticationPrompt() {
        if (authenticationPrompt == null) {
            authenticationPrompt = new ArrayList<AuthenticationPrompt>();
        }
        return this.authenticationPrompt;
    }

    /**
     * Gets the value of the applicationProfileSupportedType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationProfileSupportedType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationProfileSupportedType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationProfileSupportedType }
     * 
     * 
     */
    public List<ApplicationProfileSupportedType> getApplicationProfileSupportedType() {
        if (applicationProfileSupportedType == null) {
            applicationProfileSupportedType = new ArrayList<ApplicationProfileSupportedType>();
        }
        return this.applicationProfileSupportedType;
    }

    /**
     * Gets the value of the consortiumAgreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consortiumAgreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsortiumAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsortiumAgreement }
     * 
     * 
     */
    public List<ConsortiumAgreement> getConsortiumAgreement() {
        if (consortiumAgreement == null) {
            consortiumAgreement = new ArrayList<ConsortiumAgreement>();
        }
        return this.consortiumAgreement;
    }

    /**
     * Gets the value of the agencyUserPrivilegeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agencyUserPrivilegeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgencyUserPrivilegeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgencyUserPrivilegeType }
     * 
     * 
     */
    public List<AgencyUserPrivilegeType> getAgencyUserPrivilegeType() {
        if (agencyUserPrivilegeType == null) {
            agencyUserPrivilegeType = new ArrayList<AgencyUserPrivilegeType>();
        }
        return this.agencyUserPrivilegeType;
    }

}