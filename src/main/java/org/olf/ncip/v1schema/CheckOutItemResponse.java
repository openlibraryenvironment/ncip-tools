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
    "problemOrRequiredFeeAmountOrRequiredItemUseRestrictionTypeOrUniqueItemIdOrUniqueUserIdOrDateDueOrIndeterminateLoanPeriodFlagOrNonReturnableFlagOrRenewalCountOrElectronicResourceOrFiscalTransactionInformationOrItemOptionalFieldsOrUserOptionalFields"
})
@XmlRootElement(name = "CheckOutItemResponse")
public class CheckOutItemResponse {

    @XmlElement(name = "ResponseHeader", required = true)
    protected ResponseHeader responseHeader;
    @XmlElements({
        @XmlElement(name = "Problem", required = true, type = Problem.class),
        @XmlElement(name = "RequiredFeeAmount", required = true, type = RequiredFeeAmount.class),
        @XmlElement(name = "RequiredItemUseRestrictionType", required = true, type = RequiredItemUseRestrictionType.class),
        @XmlElement(name = "UniqueItemId", required = true, type = UniqueItemId.class),
        @XmlElement(name = "UniqueUserId", required = true, type = UniqueUserId.class),
        @XmlElement(name = "DateDue", required = true, type = DateDue.class),
        @XmlElement(name = "IndeterminateLoanPeriodFlag", required = true, type = IndeterminateLoanPeriodFlag.class),
        @XmlElement(name = "NonReturnableFlag", required = true, type = NonReturnableFlag.class),
        @XmlElement(name = "RenewalCount", required = true, type = RenewalCount.class),
        @XmlElement(name = "ElectronicResource", required = true, type = ElectronicResource.class),
        @XmlElement(name = "FiscalTransactionInformation", required = true, type = FiscalTransactionInformation.class),
        @XmlElement(name = "ItemOptionalFields", required = true, type = ItemOptionalFields.class),
        @XmlElement(name = "UserOptionalFields", required = true, type = UserOptionalFields.class)
    })
    protected List<Object> problemOrRequiredFeeAmountOrRequiredItemUseRestrictionTypeOrUniqueItemIdOrUniqueUserIdOrDateDueOrIndeterminateLoanPeriodFlagOrNonReturnableFlagOrRenewalCountOrElectronicResourceOrFiscalTransactionInformationOrItemOptionalFieldsOrUserOptionalFields;

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
     * Gets the value of the problemOrRequiredFeeAmountOrRequiredItemUseRestrictionTypeOrUniqueItemIdOrUniqueUserIdOrDateDueOrIndeterminateLoanPeriodFlagOrNonReturnableFlagOrRenewalCountOrElectronicResourceOrFiscalTransactionInformationOrItemOptionalFieldsOrUserOptionalFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the problemOrRequiredFeeAmountOrRequiredItemUseRestrictionTypeOrUniqueItemIdOrUniqueUserIdOrDateDueOrIndeterminateLoanPeriodFlagOrNonReturnableFlagOrRenewalCountOrElectronicResourceOrFiscalTransactionInformationOrItemOptionalFieldsOrUserOptionalFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProblemOrRequiredFeeAmountOrRequiredItemUseRestrictionTypeOrUniqueItemIdOrUniqueUserIdOrDateDueOrIndeterminateLoanPeriodFlagOrNonReturnableFlagOrRenewalCountOrElectronicResourceOrFiscalTransactionInformationOrItemOptionalFieldsOrUserOptionalFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Problem }
     * {@link RequiredFeeAmount }
     * {@link RequiredItemUseRestrictionType }
     * {@link UniqueItemId }
     * {@link UniqueUserId }
     * {@link DateDue }
     * {@link IndeterminateLoanPeriodFlag }
     * {@link NonReturnableFlag }
     * {@link RenewalCount }
     * {@link ElectronicResource }
     * {@link FiscalTransactionInformation }
     * {@link ItemOptionalFields }
     * {@link UserOptionalFields }
     * 
     * 
     */
    public List<Object> getProblemOrRequiredFeeAmountOrRequiredItemUseRestrictionTypeOrUniqueItemIdOrUniqueUserIdOrDateDueOrIndeterminateLoanPeriodFlagOrNonReturnableFlagOrRenewalCountOrElectronicResourceOrFiscalTransactionInformationOrItemOptionalFieldsOrUserOptionalFields() {
        if (problemOrRequiredFeeAmountOrRequiredItemUseRestrictionTypeOrUniqueItemIdOrUniqueUserIdOrDateDueOrIndeterminateLoanPeriodFlagOrNonReturnableFlagOrRenewalCountOrElectronicResourceOrFiscalTransactionInformationOrItemOptionalFieldsOrUserOptionalFields == null) {
            problemOrRequiredFeeAmountOrRequiredItemUseRestrictionTypeOrUniqueItemIdOrUniqueUserIdOrDateDueOrIndeterminateLoanPeriodFlagOrNonReturnableFlagOrRenewalCountOrElectronicResourceOrFiscalTransactionInformationOrItemOptionalFieldsOrUserOptionalFields = new ArrayList<Object>();
        }
        return this.problemOrRequiredFeeAmountOrRequiredItemUseRestrictionTypeOrUniqueItemIdOrUniqueUserIdOrDateDueOrIndeterminateLoanPeriodFlagOrNonReturnableFlagOrRenewalCountOrElectronicResourceOrFiscalTransactionInformationOrItemOptionalFieldsOrUserOptionalFields;
    }

}
