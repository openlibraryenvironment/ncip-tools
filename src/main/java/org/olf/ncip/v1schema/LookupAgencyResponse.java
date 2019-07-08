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
    "responseHeader",
    "problemOrUniqueAgencyIdOrOrganizationNameInformationOrAgencyAddressInformationOrAuthenticationPromptOrApplicationProfileSupportedTypeOrConsortiumAgreementOrAgencyUserPrivilegeType"
})
@XmlRootElement(name = "LookupAgencyResponse")
public class LookupAgencyResponse {

    @XmlElement(name = "ResponseHeader", required = true)
    protected ResponseHeader responseHeader;
    @XmlElements({
        @XmlElement(name = "Problem", required = true, type = Problem.class),
        @XmlElement(name = "UniqueAgencyId", required = true, type = UniqueAgencyId.class),
        @XmlElement(name = "OrganizationNameInformation", required = true, type = OrganizationNameInformation.class),
        @XmlElement(name = "AgencyAddressInformation", required = true, type = AgencyAddressInformation.class),
        @XmlElement(name = "AuthenticationPrompt", required = true, type = AuthenticationPrompt.class),
        @XmlElement(name = "ApplicationProfileSupportedType", required = true, type = ApplicationProfileSupportedType.class),
        @XmlElement(name = "ConsortiumAgreement", required = true, type = ConsortiumAgreement.class),
        @XmlElement(name = "AgencyUserPrivilegeType", required = true, type = AgencyUserPrivilegeType.class)
    })
    protected List<Object> problemOrUniqueAgencyIdOrOrganizationNameInformationOrAgencyAddressInformationOrAuthenticationPromptOrApplicationProfileSupportedTypeOrConsortiumAgreementOrAgencyUserPrivilegeType;

    /**
     * Gets the value of the responseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeader }
     *     
     */
    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the value of the responseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeader }
     *     
     */
    public void setResponseHeader(ResponseHeader value) {
        this.responseHeader = value;
    }

    /**
     * Gets the value of the problemOrUniqueAgencyIdOrOrganizationNameInformationOrAgencyAddressInformationOrAuthenticationPromptOrApplicationProfileSupportedTypeOrConsortiumAgreementOrAgencyUserPrivilegeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the problemOrUniqueAgencyIdOrOrganizationNameInformationOrAgencyAddressInformationOrAuthenticationPromptOrApplicationProfileSupportedTypeOrConsortiumAgreementOrAgencyUserPrivilegeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProblemOrUniqueAgencyIdOrOrganizationNameInformationOrAgencyAddressInformationOrAuthenticationPromptOrApplicationProfileSupportedTypeOrConsortiumAgreementOrAgencyUserPrivilegeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Problem }
     * {@link UniqueAgencyId }
     * {@link OrganizationNameInformation }
     * {@link AgencyAddressInformation }
     * {@link AuthenticationPrompt }
     * {@link ApplicationProfileSupportedType }
     * {@link ConsortiumAgreement }
     * {@link AgencyUserPrivilegeType }
     * 
     * 
     */
    public List<Object> getProblemOrUniqueAgencyIdOrOrganizationNameInformationOrAgencyAddressInformationOrAuthenticationPromptOrApplicationProfileSupportedTypeOrConsortiumAgreementOrAgencyUserPrivilegeType() {
        if (problemOrUniqueAgencyIdOrOrganizationNameInformationOrAgencyAddressInformationOrAuthenticationPromptOrApplicationProfileSupportedTypeOrConsortiumAgreementOrAgencyUserPrivilegeType == null) {
            problemOrUniqueAgencyIdOrOrganizationNameInformationOrAgencyAddressInformationOrAuthenticationPromptOrApplicationProfileSupportedTypeOrConsortiumAgreementOrAgencyUserPrivilegeType = new ArrayList<Object>();
        }
        return this.problemOrUniqueAgencyIdOrOrganizationNameInformationOrAgencyAddressInformationOrAuthenticationPromptOrApplicationProfileSupportedTypeOrConsortiumAgreementOrAgencyUserPrivilegeType;
    }

}