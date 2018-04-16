package com.salesforce.placeorder.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "attributes", "Id", "OwnerId", "ContractId", "AccountId",
		"Pricebook2Id", "OpportunityId", "QuoteId", "RecordTypeId",
		"EffectiveDate", "EndDate", "ShouldSuppressProvisioning",
		"IsReductionOrder", "Status", "Description", "InternalComments",
		"CustomerAuthorizedById", "CustomerAuthorizedDate",
		"CompanyAuthorizedById", "CompanyAuthorizedDate", "ExternalNote",
		"Type", "OfferExpirationDate", "BillingStreet", "BillingCity",
		"BillingState", "BillingPostalCode", "BillingCountry",
		"BillingLatitude", "BillingLongitude", "BillingGeocodeAccuracy",
		"BillingAddress", "ShippingStreet", "ShippingCity", "ShippingState",
		"ShippingPostalCode", "ShippingCountry", "ShippingLatitude",
		"ShippingLongitude", "ShippingGeocodeAccuracy", "ShippingAddress",
		"ProcessingInstruction", "Name", "PoDate", "PoNumber",
		"OrderReferenceNumber", "BillToContactId", "ShipToContactId",
		"RenUpgradeBasis", "OrdCommissionType", "OrdCommissionSubtype",
		"AePct", "ActivatedDate", "ActivatedById", "WasActivatedManually",
		"StatusCode", "IsRenewOrder", "CurrencyIsoCode", "IsTrialOrder",
		"OrderNumber", "TotalAmount", "InvoiceId", "LastApprovedDate",
		"CreatedDate", "CreatedById", "LastModifiedDate", "LastModifiedById",
		"IsDeleted", "SystemModstamp", "MayEdit", "IsLocked", "LastViewedDate",
		"LastReferencedDate", "Provisioning_Contact_Email__c",
		"Edit_Delete__c", "sfbase__IsAutoActivated__c",
		"Provisioning_Mobile_URL__c", "Commission_Audit_Comments__c",
		"Commission_Period__c", "Commission_Processing_Message__c",
		"Commission_Ready_Date__c", "Commission_Status__c",
		"SpecialTermConversion__c", "sfbase__Order_Class__c", "Net60_Hold__c",
		"Order_Commission_Sub_Type__c", "Order_Commission_Type__c",
		"Order_End_Date__c", "Order_Owner_Username__c", "Order_Sub_Type__c",
		"Order_Term__c", "Outclause_Hold_Release_Date__c",
		"Outclause_Hold_Status__c", "Related_Renewal_Order_Number__c",
		"Renewal_Manager1__c", "Renewal_Manager1_Split__c",
		"Renewal_Manager2__c", "Renewal_Manager2_Split__c",
		"Revenue_Hold_Status__c", "Salesperson1__c", "Salesperson1_Split__c",
		"Salesperson2__c", "Salesperson2_Split__c", "Salesperson3__c",
		"Salesperson3_Split__c", "Salesperson4__c", "Salesperson4_Split__c",
		"sfbase__Order_Designation__c", "sfquote__Related_Quote__c",
		"Rejected_Picklist__c", "GEO_Activated_Date__c",
		"sfbase__OrderLifeTimeValue__c", "sfbase__OrderEndDate__c",
		"sfbase__OrderTermAps__c", "sfbase__OrdProvisionDatetime__c",
		"sfbase__GEOActivatedDate__c", "sfbase__RelatedReductionOrder__c",
		"sfbase__PreviousOrder__c", "sfbase__ServiceExtension__c",
		"New_Order_Term__c", "sfbase__OrdProvisionDateGEO__c",
		"sfbase__RevenueProcessingStatus__c",
		"sfbase__APIRevenueProcessingStatus__c",
		"sfbase__RevenueProcessingMessage__c",
		"sfbase__RelatedContractCount__c", "sfbase__Source__c",
		"New_Commission_Period__c", "sfbase__OrdProvisionDateGEO_GUI__c",
		"sfbase__CustomerProvisioningDate__c",
		"sfbase__CustomerOrgTimeZone__c", "sfbase__PrimarySalesOrder__c",
		"IsConversionOrder__c", "GLOverrideDate__c",
		"RevenueExternalSystemRef__c", "RevenueGLDate__c",
		"ExchangeRateDate__c", "ExchangeRate__c",
		"ExchangeRateFunctionalCurrency__c", "Flash_Handling__c",
		"Max_Order_Item_Term__c", "Related_Case__c",
		"Primary_Order_Start_Date__c", "sfbase__PrimaryOrderStartDate__c",
		"Quote_AE_Percentage__c", "sfbase__Initial_Price_Ramp_Order__c",
		"sfbase__Price_Ramp_End_Date__c", "sfbase__Price_Ramp__c",
		"sfbill__MaxBillThroughDate__c", "sfom__FirstLogoEligible__c",
		"sfbase__ActivationEmailToBeSent__c", "sfbase__CustomerPORequired__c",
		"sfbase__Date_Language__c", "sfbase__ExceptionComments__c",
		"sfbase__POAmount__c", "sfbase__POExpirationDate__c",
		"sfbase__Show_SFDC_Signature_Block__c",
		"sfbase__SuppressActivationEmail__c", "sfbase__CMCode__c",
		"sfbase__CMReason__c", "sfbase__IncrementalACVPct__c",
		"sfbase__RMPct__c", "sfbase__SuppressProvisioning__c",
		"sfbill__BillSeperately__c", "sfbill__CMHold__c",
		"sfbill__CashMovement__c", "sfbill__ReportedRevImpact__c",
		"Paid_Through_Date__c", "sfbase__DealRelationshipNext__c",
		"sfbase__MarkForOrderTeamCreate__c", "sfbase__Opportunity__c",
		"sfbase__OrderCommissionableACV__c",
		"sfbase__OrderTeamErrorMessage__c", "sfbase__OrderTeamStatus__c",
		"sfbase__DealRelationshipPrior__c", "sfbase__Division__c",
		"sfbase__DocusignEnvelopeId__c", "sfbase__DocusignEnvelopeStatus__c",
		"sfbase__PartnerProvisioningDate__c", "sfbase__SignedOnPaper__c",
		"sfom__EnvelopeSent__c", "sfbase__OrderOwner__c", "sfbase__CEOHold__c",
		"sfbase__DealCurrency__c",
		"sfbase__IsActivatedAfterDealCalculations__c",
		"sfbase__NewMonthlyNumericValue__c",
		"sfbase__NewWeightedAverageTerm__c", "sfbase__NextDealStatus__c",
		"sfbase__NextTransferDeal__c", "sfbase__OldMonthlyNumericValue__c",
		"sfbase__OldWeightedAverageRemainingTerm__c",
		"sfbase__OldWeightedAverageTerm__c", "sfbase__PriorTransferDeal__c",
		"External_ID__c", "sfbase__Brand__c", "isDeclarativeLicenseOrder__c",
		"Order_Item_Licensing_Map__c", "ManualTransferComments__c",
		"ManualTransferReason__c", "ReplacementOrder__c", "DoNotCommission__c",
		"PartnerOrder__c", "FDOEvalDate__c", "FDOEvalDueDate__c",
		"FDOEvalStatus__c", "FDOProcessingMessage__c",
		"SuppressManagerCrediting__c", "Attempted_Convert_2_Asset__c",
		"Processed_for_Convert_to_Asset__c", "SfdcDerived_Product_Type__c",
		"SfdcIsDerivedOrder__c", "SfdcRelatedQuote__c",
		"SfdcShowAnnualPricingSummary__c", "MaxPrimaryLineNumber__c",
		"Automation_Field__c", "Process_SCE__c", "Voucher_Code__c",
		"OverrideOrderSubtypeRules__c", "EvaluateRamp__c", "IsOverageOrder__c",
		"Ramp__c", "DealRampNext__c", "DealRampPrior__c", "RampOrderNext__c",
		"RampOrderPrior__c", "RampProcessHold__c", "RampProcessingMessage__c",
		"RampStatus__c", "DealSwapNext__c", "DealSwapPrior__c",
		"ApplicableToRms__c", "ContractModNumber__c", "ContractModType__c",
		"PresentInRms__c", "ReasonNotApplicableToRms__c", "SyncWithRms__c",
		"PriorPeriodProcessed__c", "CreatePo__c", "PoTracker__c", "OrderItems" })
public class Order implements Serializable {

	@JsonProperty("attributes")
	private Attributes attributes;
	@JsonProperty("Id")
	private String id;
	@JsonProperty("OwnerId")
	private String ownerId;
	@JsonProperty("ContractId")
	private String contractId;
	@JsonProperty("AccountId")
	private String accountId;
	@JsonProperty("Pricebook2Id")
	private String pricebook2Id;
	@JsonProperty("OpportunityId")
	private Object opportunityId;
	@JsonProperty("QuoteId")
	private Object quoteId;
	@JsonProperty("RecordTypeId")
	private String recordTypeId;
	@JsonProperty("EffectiveDate")
	private String effectiveDate;
	@JsonProperty("EndDate")
	private String endDate;
	@JsonProperty("ShouldSuppressProvisioning")
	private Boolean shouldSuppressProvisioning;
	@JsonProperty("IsReductionOrder")
	private Boolean isReductionOrder;
	@JsonProperty("Status")
	private String status;
	@JsonProperty("Description")
	private Object description;
	@JsonProperty("InternalComments")
	private Object internalComments;
	@JsonProperty("CustomerAuthorizedById")
	private Object customerAuthorizedById;
	@JsonProperty("CustomerAuthorizedDate")
	private Object customerAuthorizedDate;
	@JsonProperty("CompanyAuthorizedById")
	private Object companyAuthorizedById;
	@JsonProperty("CompanyAuthorizedDate")
	private Object companyAuthorizedDate;
	@JsonProperty("ExternalNote")
	private Object externalNote;
	@JsonProperty("Type")
	private String type;
	@JsonProperty("OfferExpirationDate")
	private Object offerExpirationDate;
	@JsonProperty("BillingStreet")
	private Object billingStreet;
	@JsonProperty("BillingCity")
	private Object billingCity;
	@JsonProperty("BillingState")
	private Object billingState;
	@JsonProperty("BillingPostalCode")
	private Object billingPostalCode;
	@JsonProperty("BillingCountry")
	private Object billingCountry;
	@JsonProperty("BillingLatitude")
	private Object billingLatitude;
	@JsonProperty("BillingLongitude")
	private Object billingLongitude;
	@JsonProperty("BillingGeocodeAccuracy")
	private Object billingGeocodeAccuracy;
	@JsonProperty("BillingAddress")
	private Object billingAddress;
	@JsonProperty("ShippingStreet")
	private Object shippingStreet;
	@JsonProperty("ShippingCity")
	private Object shippingCity;
	@JsonProperty("ShippingState")
	private Object shippingState;
	@JsonProperty("ShippingPostalCode")
	private Object shippingPostalCode;
	@JsonProperty("ShippingCountry")
	private Object shippingCountry;
	@JsonProperty("ShippingLatitude")
	private Object shippingLatitude;
	@JsonProperty("ShippingLongitude")
	private Object shippingLongitude;
	@JsonProperty("ShippingGeocodeAccuracy")
	private Object shippingGeocodeAccuracy;
	@JsonProperty("ShippingAddress")
	private Object shippingAddress;
	@JsonProperty("ProcessingInstruction")
	private Object processingInstruction;
	@JsonProperty("Name")
	private Object name;
	@JsonProperty("PoDate")
	private Object poDate;
	@JsonProperty("PoNumber")
	private Object poNumber;
	@JsonProperty("OrderReferenceNumber")
	private Object orderReferenceNumber;
	@JsonProperty("BillToContactId")
	private Object billToContactId;
	@JsonProperty("ShipToContactId")
	private Object shipToContactId;
	@JsonProperty("RenUpgradeBasis")
	private Object renUpgradeBasis;
	@JsonProperty("OrdCommissionType")
	private String ordCommissionType;
	@JsonProperty("OrdCommissionSubtype")
	private String ordCommissionSubtype;
	@JsonProperty("AePct")
	private Double aePct;
	@JsonProperty("ActivatedDate")
	private String activatedDate;
	@JsonProperty("ActivatedById")
	private String activatedById;
	@JsonProperty("WasActivatedManually")
	private Boolean wasActivatedManually;
	@JsonProperty("StatusCode")
	private String statusCode;
	@JsonProperty("IsRenewOrder")
	private Boolean isRenewOrder;
	@JsonProperty("CurrencyIsoCode")
	private String currencyIsoCode;
	@JsonProperty("IsTrialOrder")
	private Boolean isTrialOrder;
	@JsonProperty("OrderNumber")
	private String orderNumber;
	@JsonProperty("TotalAmount")
	private Double totalAmount;
	@JsonProperty("InvoiceId")
	private Object invoiceId;
	@JsonProperty("LastApprovedDate")
	private Object lastApprovedDate;
	@JsonProperty("CreatedDate")
	private String createdDate;
	@JsonProperty("CreatedById")
	private String createdById;
	@JsonProperty("LastModifiedDate")
	private String lastModifiedDate;
	@JsonProperty("LastModifiedById")
	private String lastModifiedById;
	@JsonProperty("IsDeleted")
	private Boolean isDeleted;
	@JsonProperty("SystemModstamp")
	private String systemModstamp;
	@JsonProperty("MayEdit")
	private Boolean mayEdit;
	@JsonProperty("IsLocked")
	private Boolean isLocked;
	@JsonProperty("LastViewedDate")
	private String lastViewedDate;
	@JsonProperty("LastReferencedDate")
	private String lastReferencedDate;
	@JsonProperty("Provisioning_Contact_Email__c")
	private Object provisioningContactEmailC;
	@JsonProperty("Edit_Delete__c")
	private String editDeleteC;
	@JsonProperty("sfbase__IsAutoActivated__c")
	private Boolean sfbaseIsAutoActivatedC;
	@JsonProperty("Provisioning_Mobile_URL__c")
	private Object provisioningMobileURLC;
	@JsonProperty("Commission_Audit_Comments__c")
	private Object commissionAuditCommentsC;
	@JsonProperty("Commission_Period__c")
	private Object commissionPeriodC;
	@JsonProperty("Commission_Processing_Message__c")
	private Object commissionProcessingMessageC;
	@JsonProperty("Commission_Ready_Date__c")
	private Object commissionReadyDateC;
	@JsonProperty("Commission_Status__c")
	private String commissionStatusC;
	@JsonProperty("SpecialTermConversion__c")
	private Object specialTermConversionC;
	@JsonProperty("sfbase__Order_Class__c")
	private Object sfbaseOrderClassC;
	@JsonProperty("Net60_Hold__c")
	private String net60HoldC;
	@JsonProperty("Order_Commission_Sub_Type__c")
	private Object orderCommissionSubTypeC;
	@JsonProperty("Order_Commission_Type__c")
	private Object orderCommissionTypeC;
	@JsonProperty("Order_End_Date__c")
	private String orderEndDateC;
	@JsonProperty("Order_Owner_Username__c")
	private Object orderOwnerUsernameC;
	@JsonProperty("Order_Sub_Type__c")
	private String orderSubTypeC;
	@JsonProperty("Order_Term__c")
	private Object orderTermC;
	@JsonProperty("Outclause_Hold_Release_Date__c")
	private Object outclauseHoldReleaseDateC;
	@JsonProperty("Outclause_Hold_Status__c")
	private String outclauseHoldStatusC;
	@JsonProperty("Related_Renewal_Order_Number__c")
	private Object relatedRenewalOrderNumberC;
	@JsonProperty("Renewal_Manager1__c")
	private Object renewalManager1C;
	@JsonProperty("Renewal_Manager1_Split__c")
	private Object renewalManager1SplitC;
	@JsonProperty("Renewal_Manager2__c")
	private Object renewalManager2C;
	@JsonProperty("Renewal_Manager2_Split__c")
	private Object renewalManager2SplitC;
	@JsonProperty("Revenue_Hold_Status__c")
	private String revenueHoldStatusC;
	@JsonProperty("Salesperson1__c")
	private Object salesperson1C;
	@JsonProperty("Salesperson1_Split__c")
	private Object salesperson1SplitC;
	@JsonProperty("Salesperson2__c")
	private Object salesperson2C;
	@JsonProperty("Salesperson2_Split__c")
	private Object salesperson2SplitC;
	@JsonProperty("Salesperson3__c")
	private Object salesperson3C;
	@JsonProperty("Salesperson3_Split__c")
	private Object salesperson3SplitC;
	@JsonProperty("Salesperson4__c")
	private Object salesperson4C;
	@JsonProperty("Salesperson4_Split__c")
	private Object salesperson4SplitC;
	@JsonProperty("sfbase__Order_Designation__c")
	private Object sfbaseOrderDesignationC;
	@JsonProperty("sfquote__Related_Quote__c")
	private Object sfquoteRelatedQuoteC;
	@JsonProperty("Rejected_Picklist__c")
	private Object rejectedPicklistC;
	@JsonProperty("GEO_Activated_Date__c")
	private String gEOActivatedDateC;
	@JsonProperty("sfbase__OrderLifeTimeValue__c")
	private Double sfbaseOrderLifeTimeValueC;
	@JsonProperty("sfbase__OrderEndDate__c")
	private String sfbaseOrderEndDateC;
	@JsonProperty("sfbase__OrderTermAps__c")
	private Double sfbaseOrderTermApsC;
	@JsonProperty("sfbase__OrdProvisionDatetime__c")
	private Object sfbaseOrdProvisionDatetimeC;
	@JsonProperty("sfbase__GEOActivatedDate__c")
	private Object sfbaseGEOActivatedDateC;
	@JsonProperty("sfbase__RelatedReductionOrder__c")
	private Object sfbaseRelatedReductionOrderC;
	@JsonProperty("sfbase__PreviousOrder__c")
	private Object sfbasePreviousOrderC;
	@JsonProperty("sfbase__ServiceExtension__c")
	private Boolean sfbaseServiceExtensionC;
	@JsonProperty("New_Order_Term__c")
	private Double newOrderTermC;
	@JsonProperty("sfbase__OrdProvisionDateGEO__c")
	private Object sfbaseOrdProvisionDateGEOC;
	@JsonProperty("sfbase__RevenueProcessingStatus__c")
	private String sfbaseRevenueProcessingStatusC;
	@JsonProperty("sfbase__APIRevenueProcessingStatus__c")
	private String sfbaseAPIRevenueProcessingStatusC;
	@JsonProperty("sfbase__RevenueProcessingMessage__c")
	private Object sfbaseRevenueProcessingMessageC;
	@JsonProperty("sfbase__RelatedContractCount__c")
	private Double sfbaseRelatedContractCountC;
	@JsonProperty("sfbase__Source__c")
	private Object sfbaseSourceC;
	@JsonProperty("New_Commission_Period__c")
	private Object newCommissionPeriodC;
	@JsonProperty("sfbase__OrdProvisionDateGEO_GUI__c")
	private Object sfbaseOrdProvisionDateGEOGUIC;
	@JsonProperty("sfbase__CustomerProvisioningDate__c")
	private Object sfbaseCustomerProvisioningDateC;
	@JsonProperty("sfbase__CustomerOrgTimeZone__c")
	private Double sfbaseCustomerOrgTimeZoneC;
	@JsonProperty("sfbase__PrimarySalesOrder__c")
	private Object sfbasePrimarySalesOrderC;
	@JsonProperty("IsConversionOrder__c")
	private Boolean isConversionOrderC;
	@JsonProperty("GLOverrideDate__c")
	private Object gLOverrideDateC;
	@JsonProperty("RevenueExternalSystemRef__c")
	private Object revenueExternalSystemRefC;
	@JsonProperty("RevenueGLDate__c")
	private Object revenueGLDateC;
	@JsonProperty("ExchangeRateDate__c")
	private Object exchangeRateDateC;
	@JsonProperty("ExchangeRate__c")
	private Object exchangeRateC;
	@JsonProperty("ExchangeRateFunctionalCurrency__c")
	private Object exchangeRateFunctionalCurrencyC;
	@JsonProperty("Flash_Handling__c")
	private Object flashHandlingC;
	@JsonProperty("Max_Order_Item_Term__c")
	private Object maxOrderItemTermC;
	@JsonProperty("Related_Case__c")
	private Object relatedCaseC;
	@JsonProperty("Primary_Order_Start_Date__c")
	private Object primaryOrderStartDateC;
	@JsonProperty("sfbase__PrimaryOrderStartDate__c")
	private Object sfbasePrimaryOrderStartDateC;
	@JsonProperty("Quote_AE_Percentage__c")
	private Object quoteAEPercentageC;
	@JsonProperty("sfbase__Initial_Price_Ramp_Order__c")
	private Object sfbaseInitialPriceRampOrderC;
	@JsonProperty("sfbase__Price_Ramp_End_Date__c")
	private Object sfbasePriceRampEndDateC;
	@JsonProperty("sfbase__Price_Ramp__c")
	private Boolean sfbasePriceRampC;
	@JsonProperty("sfbill__MaxBillThroughDate__c")
	private Object sfbillMaxBillThroughDateC;
	@JsonProperty("sfom__FirstLogoEligible__c")
	private Boolean sfomFirstLogoEligibleC;
	@JsonProperty("sfbase__ActivationEmailToBeSent__c")
	private Boolean sfbaseActivationEmailToBeSentC;
	@JsonProperty("sfbase__CustomerPORequired__c")
	private Object sfbaseCustomerPORequiredC;
	@JsonProperty("sfbase__Date_Language__c")
	private Boolean sfbaseDateLanguageC;
	@JsonProperty("sfbase__ExceptionComments__c")
	private Object sfbaseExceptionCommentsC;
	@JsonProperty("sfbase__POAmount__c")
	private Object sfbasePOAmountC;
	@JsonProperty("sfbase__POExpirationDate__c")
	private Object sfbasePOExpirationDateC;
	@JsonProperty("sfbase__Show_SFDC_Signature_Block__c")
	private Boolean sfbaseShowSFDCSignatureBlockC;
	@JsonProperty("sfbase__SuppressActivationEmail__c")
	private Boolean sfbaseSuppressActivationEmailC;
	@JsonProperty("sfbase__CMCode__c")
	private String sfbaseCMCodeC;
	@JsonProperty("sfbase__CMReason__c")
	private String sfbaseCMReasonC;
	@JsonProperty("sfbase__IncrementalACVPct__c")
	private Double sfbaseIncrementalACVPctC;
	@JsonProperty("sfbase__RMPct__c")
	private Double sfbaseRMPctC;
	@JsonProperty("sfbase__SuppressProvisioning__c")
	private Boolean sfbaseSuppressProvisioningC;
	@JsonProperty("sfbill__BillSeperately__c")
	private Boolean sfbillBillSeperatelyC;
	@JsonProperty("sfbill__CMHold__c")
	private Boolean sfbillCMHoldC;
	@JsonProperty("sfbill__CashMovement__c")
	private Object sfbillCashMovementC;
	@JsonProperty("sfbill__ReportedRevImpact__c")
	private Object sfbillReportedRevImpactC;
	@JsonProperty("Paid_Through_Date__c")
	private Object paidThroughDateC;
	@JsonProperty("sfbase__DealRelationshipNext__c")
	private String sfbaseDealRelationshipNextC;
	@JsonProperty("sfbase__MarkForOrderTeamCreate__c")
	private Boolean sfbaseMarkForOrderTeamCreateC;
	@JsonProperty("sfbase__Opportunity__c")
	private Object sfbaseOpportunityC;
	@JsonProperty("sfbase__OrderCommissionableACV__c")
	private Double sfbaseOrderCommissionableACVC;
	@JsonProperty("sfbase__OrderTeamErrorMessage__c")
	private String sfbaseOrderTeamErrorMessageC;
	@JsonProperty("sfbase__OrderTeamStatus__c")
	private String sfbaseOrderTeamStatusC;
	@JsonProperty("sfbase__DealRelationshipPrior__c")
	private String sfbaseDealRelationshipPriorC;
	@JsonProperty("sfbase__Division__c")
	private Object sfbaseDivisionC;
	@JsonProperty("sfbase__DocusignEnvelopeId__c")
	private Object sfbaseDocusignEnvelopeIdC;
	@JsonProperty("sfbase__DocusignEnvelopeStatus__c")
	private Object sfbaseDocusignEnvelopeStatusC;
	@JsonProperty("sfbase__PartnerProvisioningDate__c")
	private Object sfbasePartnerProvisioningDateC;
	@JsonProperty("sfbase__SignedOnPaper__c")
	private Boolean sfbaseSignedOnPaperC;
	@JsonProperty("sfom__EnvelopeSent__c")
	private Boolean sfomEnvelopeSentC;
	@JsonProperty("sfbase__OrderOwner__c")
	private Object sfbaseOrderOwnerC;
	@JsonProperty("sfbase__CEOHold__c")
	private Boolean sfbaseCEOHoldC;
	@JsonProperty("sfbase__DealCurrency__c")
	private Object sfbaseDealCurrencyC;
	@JsonProperty("sfbase__IsActivatedAfterDealCalculations__c")
	private Boolean sfbaseIsActivatedAfterDealCalculationsC;
	@JsonProperty("sfbase__NewMonthlyNumericValue__c")
	private Object sfbaseNewMonthlyNumericValueC;
	@JsonProperty("sfbase__NewWeightedAverageTerm__c")
	private Object sfbaseNewWeightedAverageTermC;
	@JsonProperty("sfbase__NextDealStatus__c")
	private Object sfbaseNextDealStatusC;
	@JsonProperty("sfbase__NextTransferDeal__c")
	private Object sfbaseNextTransferDealC;
	@JsonProperty("sfbase__OldMonthlyNumericValue__c")
	private Object sfbaseOldMonthlyNumericValueC;
	@JsonProperty("sfbase__OldWeightedAverageRemainingTerm__c")
	private Object sfbaseOldWeightedAverageRemainingTermC;
	@JsonProperty("sfbase__OldWeightedAverageTerm__c")
	private Object sfbaseOldWeightedAverageTermC;
	@JsonProperty("sfbase__PriorTransferDeal__c")
	private Object sfbasePriorTransferDealC;
	@JsonProperty("External_ID__c")
	private Object externalIDC;
	@JsonProperty("sfbase__Brand__c")
	private String sfbaseBrandC;
	@JsonProperty("isDeclarativeLicenseOrder__c")
	private Boolean isDeclarativeLicenseOrderC;
	@JsonProperty("Order_Item_Licensing_Map__c")
	private Object orderItemLicensingMapC;
	@JsonProperty("ManualTransferComments__c")
	private Object manualTransferCommentsC;
	@JsonProperty("ManualTransferReason__c")
	private Object manualTransferReasonC;
	@JsonProperty("ReplacementOrder__c")
	private Object replacementOrderC;
	@JsonProperty("DoNotCommission__c")
	private Boolean doNotCommissionC;
	@JsonProperty("PartnerOrder__c")
	private Object partnerOrderC;
	@JsonProperty("FDOEvalDate__c")
	private Object fDOEvalDateC;
	@JsonProperty("FDOEvalDueDate__c")
	private Object fDOEvalDueDateC;
	@JsonProperty("FDOEvalStatus__c")
	private String fDOEvalStatusC;
	@JsonProperty("FDOProcessingMessage__c")
	private Object fDOProcessingMessageC;
	@JsonProperty("SuppressManagerCrediting__c")
	private Boolean suppressManagerCreditingC;
	@JsonProperty("Attempted_Convert_2_Asset__c")
	private Boolean attemptedConvert2AssetC;
	@JsonProperty("Processed_for_Convert_to_Asset__c")
	private Boolean processedForConvertToAssetC;
	@JsonProperty("SfdcDerived_Product_Type__c")
	private Object sfdcDerivedProductTypeC;
	@JsonProperty("SfdcIsDerivedOrder__c")
	private Boolean sfdcIsDerivedOrderC;
	@JsonProperty("SfdcRelatedQuote__c")
	private Object sfdcRelatedQuoteC;
	@JsonProperty("SfdcShowAnnualPricingSummary__c")
	private Boolean sfdcShowAnnualPricingSummaryC;
	@JsonProperty("MaxPrimaryLineNumber__c")
	private Double maxPrimaryLineNumberC;
	@JsonProperty("Automation_Field__c")
	private Object automationFieldC;
	@JsonProperty("Process_SCE__c")
	private Boolean processSCEC;
	@JsonProperty("Voucher_Code__c")
	private Object voucherCodeC;
	@JsonProperty("OverrideOrderSubtypeRules__c")
	private Boolean overrideOrderSubtypeRulesC;
	@JsonProperty("EvaluateRamp__c")
	private Boolean evaluateRampC;
	@JsonProperty("IsOverageOrder__c")
	private Boolean isOverageOrderC;
	@JsonProperty("Ramp__c")
	private Object rampC;
	@JsonProperty("DealRampNext__c")
	private Object dealRampNextC;
	@JsonProperty("DealRampPrior__c")
	private Object dealRampPriorC;
	@JsonProperty("RampOrderNext__c")
	private Object rampOrderNextC;
	@JsonProperty("RampOrderPrior__c")
	private Object rampOrderPriorC;
	@JsonProperty("RampProcessHold__c")
	private Boolean rampProcessHoldC;
	@JsonProperty("RampProcessingMessage__c")
	private Object rampProcessingMessageC;
	@JsonProperty("RampStatus__c")
	private Object rampStatusC;
	@JsonProperty("DealSwapNext__c")
	private Object dealSwapNextC;
	@JsonProperty("DealSwapPrior__c")
	private Object dealSwapPriorC;
	@JsonProperty("ApplicableToRms__c")
	private Boolean applicableToRmsC;
	@JsonProperty("ContractModNumber__c")
	private Object contractModNumberC;
	@JsonProperty("ContractModType__c")
	private Object contractModTypeC;
	@JsonProperty("PresentInRms__c")
	private Boolean presentInRmsC;
	@JsonProperty("ReasonNotApplicableToRms__c")
	private Object reasonNotApplicableToRmsC;
	@JsonProperty("SyncWithRms__c")
	private Boolean syncWithRmsC;
	@JsonProperty("PriorPeriodProcessed__c")
	private Boolean priorPeriodProcessedC;
	@JsonProperty("CreatePo__c")
	private Boolean createPoC;
	@JsonProperty("PoTracker__c")
	private Object poTrackerC;
	@JsonProperty("OrderItems")
	private OrderItems orderItems;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -421706985876659988L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Order() {
	}

	@JsonProperty("attributes")
	public Attributes getAttributes() {
		return attributes;
	}

	@JsonProperty("attributes")
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public Order withAttributes(Attributes attributes) {
		this.attributes = attributes;
		return this;
	}

	@JsonProperty("Id")
	public String getId() {
		return id;
	}

	@JsonProperty("Id")
	public void setId(String id) {
		this.id = id;
	}

	public Order withId(String id) {
		this.id = id;
		return this;
	}

	@JsonProperty("OwnerId")
	public String getOwnerId() {
		return ownerId;
	}

	@JsonProperty("OwnerId")
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Order withOwnerId(String ownerId) {
		this.ownerId = ownerId;
		return this;
	}

	@JsonProperty("ContractId")
	public String getContractId() {
		return contractId;
	}

	@JsonProperty("ContractId")
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public Order withContractId(String contractId) {
		this.contractId = contractId;
		return this;
	}

	@JsonProperty("AccountId")
	public String getAccountId() {
		return accountId;
	}

	@JsonProperty("AccountId")
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Order withAccountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	@JsonProperty("Pricebook2Id")
	public String getPricebook2Id() {
		return pricebook2Id;
	}

	@JsonProperty("Pricebook2Id")
	public void setPricebook2Id(String pricebook2Id) {
		this.pricebook2Id = pricebook2Id;
	}

	public Order withPricebook2Id(String pricebook2Id) {
		this.pricebook2Id = pricebook2Id;
		return this;
	}

	@JsonProperty("OpportunityId")
	public Object getOpportunityId() {
		return opportunityId;
	}

	@JsonProperty("OpportunityId")
	public void setOpportunityId(Object opportunityId) {
		this.opportunityId = opportunityId;
	}

	public Order withOpportunityId(Object opportunityId) {
		this.opportunityId = opportunityId;
		return this;
	}

	@JsonProperty("QuoteId")
	public Object getQuoteId() {
		return quoteId;
	}

	@JsonProperty("QuoteId")
	public void setQuoteId(Object quoteId) {
		this.quoteId = quoteId;
	}

	public Order withQuoteId(Object quoteId) {
		this.quoteId = quoteId;
		return this;
	}

	@JsonProperty("RecordTypeId")
	public String getRecordTypeId() {
		return recordTypeId;
	}

	@JsonProperty("RecordTypeId")
	public void setRecordTypeId(String recordTypeId) {
		this.recordTypeId = recordTypeId;
	}

	public Order withRecordTypeId(String recordTypeId) {
		this.recordTypeId = recordTypeId;
		return this;
	}

	@JsonProperty("EffectiveDate")
	public String getEffectiveDate() {
		return effectiveDate;
	}

	@JsonProperty("EffectiveDate")
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Order withEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
		return this;
	}

	@JsonProperty("EndDate")
	public String getEndDate() {
		return endDate;
	}

	@JsonProperty("EndDate")
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Order withEndDate(String endDate) {
		this.endDate = endDate;
		return this;
	}

	@JsonProperty("ShouldSuppressProvisioning")
	public Boolean getShouldSuppressProvisioning() {
		return shouldSuppressProvisioning;
	}

	@JsonProperty("ShouldSuppressProvisioning")
	public void setShouldSuppressProvisioning(Boolean shouldSuppressProvisioning) {
		this.shouldSuppressProvisioning = shouldSuppressProvisioning;
	}

	public Order withShouldSuppressProvisioning(
			Boolean shouldSuppressProvisioning) {
		this.shouldSuppressProvisioning = shouldSuppressProvisioning;
		return this;
	}

	@JsonProperty("IsReductionOrder")
	public Boolean getIsReductionOrder() {
		return isReductionOrder;
	}

	@JsonProperty("IsReductionOrder")
	public void setIsReductionOrder(Boolean isReductionOrder) {
		this.isReductionOrder = isReductionOrder;
	}

	public Order withIsReductionOrder(Boolean isReductionOrder) {
		this.isReductionOrder = isReductionOrder;
		return this;
	}

	@JsonProperty("Status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("Status")
	public void setStatus(String status) {
		this.status = status;
	}

	public Order withStatus(String status) {
		this.status = status;
		return this;
	}

	@JsonProperty("Description")
	public Object getDescription() {
		return description;
	}

	@JsonProperty("Description")
	public void setDescription(Object description) {
		this.description = description;
	}

	public Order withDescription(Object description) {
		this.description = description;
		return this;
	}

	@JsonProperty("InternalComments")
	public Object getInternalComments() {
		return internalComments;
	}

	@JsonProperty("InternalComments")
	public void setInternalComments(Object internalComments) {
		this.internalComments = internalComments;
	}

	public Order withInternalComments(Object internalComments) {
		this.internalComments = internalComments;
		return this;
	}

	@JsonProperty("CustomerAuthorizedById")
	public Object getCustomerAuthorizedById() {
		return customerAuthorizedById;
	}

	@JsonProperty("CustomerAuthorizedById")
	public void setCustomerAuthorizedById(Object customerAuthorizedById) {
		this.customerAuthorizedById = customerAuthorizedById;
	}

	public Order withCustomerAuthorizedById(Object customerAuthorizedById) {
		this.customerAuthorizedById = customerAuthorizedById;
		return this;
	}

	@JsonProperty("CustomerAuthorizedDate")
	public Object getCustomerAuthorizedDate() {
		return customerAuthorizedDate;
	}

	@JsonProperty("CustomerAuthorizedDate")
	public void setCustomerAuthorizedDate(Object customerAuthorizedDate) {
		this.customerAuthorizedDate = customerAuthorizedDate;
	}

	public Order withCustomerAuthorizedDate(Object customerAuthorizedDate) {
		this.customerAuthorizedDate = customerAuthorizedDate;
		return this;
	}

	@JsonProperty("CompanyAuthorizedById")
	public Object getCompanyAuthorizedById() {
		return companyAuthorizedById;
	}

	@JsonProperty("CompanyAuthorizedById")
	public void setCompanyAuthorizedById(Object companyAuthorizedById) {
		this.companyAuthorizedById = companyAuthorizedById;
	}

	public Order withCompanyAuthorizedById(Object companyAuthorizedById) {
		this.companyAuthorizedById = companyAuthorizedById;
		return this;
	}

	@JsonProperty("CompanyAuthorizedDate")
	public Object getCompanyAuthorizedDate() {
		return companyAuthorizedDate;
	}

	@JsonProperty("CompanyAuthorizedDate")
	public void setCompanyAuthorizedDate(Object companyAuthorizedDate) {
		this.companyAuthorizedDate = companyAuthorizedDate;
	}

	public Order withCompanyAuthorizedDate(Object companyAuthorizedDate) {
		this.companyAuthorizedDate = companyAuthorizedDate;
		return this;
	}

	@JsonProperty("ExternalNote")
	public Object getExternalNote() {
		return externalNote;
	}

	@JsonProperty("ExternalNote")
	public void setExternalNote(Object externalNote) {
		this.externalNote = externalNote;
	}

	public Order withExternalNote(Object externalNote) {
		this.externalNote = externalNote;
		return this;
	}

	@JsonProperty("Type")
	public String getType() {
		return type;
	}

	@JsonProperty("Type")
	public void setType(String type) {
		this.type = type;
	}

	public Order withType(String type) {
		this.type = type;
		return this;
	}

	@JsonProperty("OfferExpirationDate")
	public Object getOfferExpirationDate() {
		return offerExpirationDate;
	}

	@JsonProperty("OfferExpirationDate")
	public void setOfferExpirationDate(Object offerExpirationDate) {
		this.offerExpirationDate = offerExpirationDate;
	}

	public Order withOfferExpirationDate(Object offerExpirationDate) {
		this.offerExpirationDate = offerExpirationDate;
		return this;
	}

	@JsonProperty("BillingStreet")
	public Object getBillingStreet() {
		return billingStreet;
	}

	@JsonProperty("BillingStreet")
	public void setBillingStreet(Object billingStreet) {
		this.billingStreet = billingStreet;
	}

	public Order withBillingStreet(Object billingStreet) {
		this.billingStreet = billingStreet;
		return this;
	}

	@JsonProperty("BillingCity")
	public Object getBillingCity() {
		return billingCity;
	}

	@JsonProperty("BillingCity")
	public void setBillingCity(Object billingCity) {
		this.billingCity = billingCity;
	}

	public Order withBillingCity(Object billingCity) {
		this.billingCity = billingCity;
		return this;
	}

	@JsonProperty("BillingState")
	public Object getBillingState() {
		return billingState;
	}

	@JsonProperty("BillingState")
	public void setBillingState(Object billingState) {
		this.billingState = billingState;
	}

	public Order withBillingState(Object billingState) {
		this.billingState = billingState;
		return this;
	}

	@JsonProperty("BillingPostalCode")
	public Object getBillingPostalCode() {
		return billingPostalCode;
	}

	@JsonProperty("BillingPostalCode")
	public void setBillingPostalCode(Object billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
	}

	public Order withBillingPostalCode(Object billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
		return this;
	}

	@JsonProperty("BillingCountry")
	public Object getBillingCountry() {
		return billingCountry;
	}

	@JsonProperty("BillingCountry")
	public void setBillingCountry(Object billingCountry) {
		this.billingCountry = billingCountry;
	}

	public Order withBillingCountry(Object billingCountry) {
		this.billingCountry = billingCountry;
		return this;
	}

	@JsonProperty("BillingLatitude")
	public Object getBillingLatitude() {
		return billingLatitude;
	}

	@JsonProperty("BillingLatitude")
	public void setBillingLatitude(Object billingLatitude) {
		this.billingLatitude = billingLatitude;
	}

	public Order withBillingLatitude(Object billingLatitude) {
		this.billingLatitude = billingLatitude;
		return this;
	}

	@JsonProperty("BillingLongitude")
	public Object getBillingLongitude() {
		return billingLongitude;
	}

	@JsonProperty("BillingLongitude")
	public void setBillingLongitude(Object billingLongitude) {
		this.billingLongitude = billingLongitude;
	}

	public Order withBillingLongitude(Object billingLongitude) {
		this.billingLongitude = billingLongitude;
		return this;
	}

	@JsonProperty("BillingGeocodeAccuracy")
	public Object getBillingGeocodeAccuracy() {
		return billingGeocodeAccuracy;
	}

	@JsonProperty("BillingGeocodeAccuracy")
	public void setBillingGeocodeAccuracy(Object billingGeocodeAccuracy) {
		this.billingGeocodeAccuracy = billingGeocodeAccuracy;
	}

	public Order withBillingGeocodeAccuracy(Object billingGeocodeAccuracy) {
		this.billingGeocodeAccuracy = billingGeocodeAccuracy;
		return this;
	}

	@JsonProperty("BillingAddress")
	public Object getBillingAddress() {
		return billingAddress;
	}

	@JsonProperty("BillingAddress")
	public void setBillingAddress(Object billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Order withBillingAddress(Object billingAddress) {
		this.billingAddress = billingAddress;
		return this;
	}

	@JsonProperty("ShippingStreet")
	public Object getShippingStreet() {
		return shippingStreet;
	}

	@JsonProperty("ShippingStreet")
	public void setShippingStreet(Object shippingStreet) {
		this.shippingStreet = shippingStreet;
	}

	public Order withShippingStreet(Object shippingStreet) {
		this.shippingStreet = shippingStreet;
		return this;
	}

	@JsonProperty("ShippingCity")
	public Object getShippingCity() {
		return shippingCity;
	}

	@JsonProperty("ShippingCity")
	public void setShippingCity(Object shippingCity) {
		this.shippingCity = shippingCity;
	}

	public Order withShippingCity(Object shippingCity) {
		this.shippingCity = shippingCity;
		return this;
	}

	@JsonProperty("ShippingState")
	public Object getShippingState() {
		return shippingState;
	}

	@JsonProperty("ShippingState")
	public void setShippingState(Object shippingState) {
		this.shippingState = shippingState;
	}

	public Order withShippingState(Object shippingState) {
		this.shippingState = shippingState;
		return this;
	}

	@JsonProperty("ShippingPostalCode")
	public Object getShippingPostalCode() {
		return shippingPostalCode;
	}

	@JsonProperty("ShippingPostalCode")
	public void setShippingPostalCode(Object shippingPostalCode) {
		this.shippingPostalCode = shippingPostalCode;
	}

	public Order withShippingPostalCode(Object shippingPostalCode) {
		this.shippingPostalCode = shippingPostalCode;
		return this;
	}

	@JsonProperty("ShippingCountry")
	public Object getShippingCountry() {
		return shippingCountry;
	}

	@JsonProperty("ShippingCountry")
	public void setShippingCountry(Object shippingCountry) {
		this.shippingCountry = shippingCountry;
	}

	public Order withShippingCountry(Object shippingCountry) {
		this.shippingCountry = shippingCountry;
		return this;
	}

	@JsonProperty("ShippingLatitude")
	public Object getShippingLatitude() {
		return shippingLatitude;
	}

	@JsonProperty("ShippingLatitude")
	public void setShippingLatitude(Object shippingLatitude) {
		this.shippingLatitude = shippingLatitude;
	}

	public Order withShippingLatitude(Object shippingLatitude) {
		this.shippingLatitude = shippingLatitude;
		return this;
	}

	@JsonProperty("ShippingLongitude")
	public Object getShippingLongitude() {
		return shippingLongitude;
	}

	@JsonProperty("ShippingLongitude")
	public void setShippingLongitude(Object shippingLongitude) {
		this.shippingLongitude = shippingLongitude;
	}

	public Order withShippingLongitude(Object shippingLongitude) {
		this.shippingLongitude = shippingLongitude;
		return this;
	}

	@JsonProperty("ShippingGeocodeAccuracy")
	public Object getShippingGeocodeAccuracy() {
		return shippingGeocodeAccuracy;
	}

	@JsonProperty("ShippingGeocodeAccuracy")
	public void setShippingGeocodeAccuracy(Object shippingGeocodeAccuracy) {
		this.shippingGeocodeAccuracy = shippingGeocodeAccuracy;
	}

	public Order withShippingGeocodeAccuracy(Object shippingGeocodeAccuracy) {
		this.shippingGeocodeAccuracy = shippingGeocodeAccuracy;
		return this;
	}

	@JsonProperty("ShippingAddress")
	public Object getShippingAddress() {
		return shippingAddress;
	}

	@JsonProperty("ShippingAddress")
	public void setShippingAddress(Object shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Order withShippingAddress(Object shippingAddress) {
		this.shippingAddress = shippingAddress;
		return this;
	}

	@JsonProperty("ProcessingInstruction")
	public Object getProcessingInstruction() {
		return processingInstruction;
	}

	@JsonProperty("ProcessingInstruction")
	public void setProcessingInstruction(Object processingInstruction) {
		this.processingInstruction = processingInstruction;
	}

	public Order withProcessingInstruction(Object processingInstruction) {
		this.processingInstruction = processingInstruction;
		return this;
	}

	@JsonProperty("Name")
	public Object getName() {
		return name;
	}

	@JsonProperty("Name")
	public void setName(Object name) {
		this.name = name;
	}

	public Order withName(Object name) {
		this.name = name;
		return this;
	}

	@JsonProperty("PoDate")
	public Object getPoDate() {
		return poDate;
	}

	@JsonProperty("PoDate")
	public void setPoDate(Object poDate) {
		this.poDate = poDate;
	}

	public Order withPoDate(Object poDate) {
		this.poDate = poDate;
		return this;
	}

	@JsonProperty("PoNumber")
	public Object getPoNumber() {
		return poNumber;
	}

	@JsonProperty("PoNumber")
	public void setPoNumber(Object poNumber) {
		this.poNumber = poNumber;
	}

	public Order withPoNumber(Object poNumber) {
		this.poNumber = poNumber;
		return this;
	}

	@JsonProperty("OrderReferenceNumber")
	public Object getOrderReferenceNumber() {
		return orderReferenceNumber;
	}

	@JsonProperty("OrderReferenceNumber")
	public void setOrderReferenceNumber(Object orderReferenceNumber) {
		this.orderReferenceNumber = orderReferenceNumber;
	}

	public Order withOrderReferenceNumber(Object orderReferenceNumber) {
		this.orderReferenceNumber = orderReferenceNumber;
		return this;
	}

	@JsonProperty("BillToContactId")
	public Object getBillToContactId() {
		return billToContactId;
	}

	@JsonProperty("BillToContactId")
	public void setBillToContactId(Object billToContactId) {
		this.billToContactId = billToContactId;
	}

	public Order withBillToContactId(Object billToContactId) {
		this.billToContactId = billToContactId;
		return this;
	}

	@JsonProperty("ShipToContactId")
	public Object getShipToContactId() {
		return shipToContactId;
	}

	@JsonProperty("ShipToContactId")
	public void setShipToContactId(Object shipToContactId) {
		this.shipToContactId = shipToContactId;
	}

	public Order withShipToContactId(Object shipToContactId) {
		this.shipToContactId = shipToContactId;
		return this;
	}

	@JsonProperty("RenUpgradeBasis")
	public Object getRenUpgradeBasis() {
		return renUpgradeBasis;
	}

	@JsonProperty("RenUpgradeBasis")
	public void setRenUpgradeBasis(Object renUpgradeBasis) {
		this.renUpgradeBasis = renUpgradeBasis;
	}

	public Order withRenUpgradeBasis(Object renUpgradeBasis) {
		this.renUpgradeBasis = renUpgradeBasis;
		return this;
	}

	@JsonProperty("OrdCommissionType")
	public String getOrdCommissionType() {
		return ordCommissionType;
	}

	@JsonProperty("OrdCommissionType")
	public void setOrdCommissionType(String ordCommissionType) {
		this.ordCommissionType = ordCommissionType;
	}

	public Order withOrdCommissionType(String ordCommissionType) {
		this.ordCommissionType = ordCommissionType;
		return this;
	}

	@JsonProperty("OrdCommissionSubtype")
	public String getOrdCommissionSubtype() {
		return ordCommissionSubtype;
	}

	@JsonProperty("OrdCommissionSubtype")
	public void setOrdCommissionSubtype(String ordCommissionSubtype) {
		this.ordCommissionSubtype = ordCommissionSubtype;
	}

	public Order withOrdCommissionSubtype(String ordCommissionSubtype) {
		this.ordCommissionSubtype = ordCommissionSubtype;
		return this;
	}

	@JsonProperty("AePct")
	public Double getAePct() {
		return aePct;
	}

	@JsonProperty("AePct")
	public void setAePct(Double aePct) {
		this.aePct = aePct;
	}

	public Order withAePct(Double aePct) {
		this.aePct = aePct;
		return this;
	}

	@JsonProperty("ActivatedDate")
	public String getActivatedDate() {
		return activatedDate;
	}

	@JsonProperty("ActivatedDate")
	public void setActivatedDate(String activatedDate) {
		this.activatedDate = activatedDate;
	}

	public Order withActivatedDate(String activatedDate) {
		this.activatedDate = activatedDate;
		return this;
	}

	@JsonProperty("ActivatedById")
	public String getActivatedById() {
		return activatedById;
	}

	@JsonProperty("ActivatedById")
	public void setActivatedById(String activatedById) {
		this.activatedById = activatedById;
	}

	public Order withActivatedById(String activatedById) {
		this.activatedById = activatedById;
		return this;
	}

	@JsonProperty("WasActivatedManually")
	public Boolean getWasActivatedManually() {
		return wasActivatedManually;
	}

	@JsonProperty("WasActivatedManually")
	public void setWasActivatedManually(Boolean wasActivatedManually) {
		this.wasActivatedManually = wasActivatedManually;
	}

	public Order withWasActivatedManually(Boolean wasActivatedManually) {
		this.wasActivatedManually = wasActivatedManually;
		return this;
	}

	@JsonProperty("StatusCode")
	public String getStatusCode() {
		return statusCode;
	}

	@JsonProperty("StatusCode")
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Order withStatusCode(String statusCode) {
		this.statusCode = statusCode;
		return this;
	}

	@JsonProperty("IsRenewOrder")
	public Boolean getIsRenewOrder() {
		return isRenewOrder;
	}

	@JsonProperty("IsRenewOrder")
	public void setIsRenewOrder(Boolean isRenewOrder) {
		this.isRenewOrder = isRenewOrder;
	}

	public Order withIsRenewOrder(Boolean isRenewOrder) {
		this.isRenewOrder = isRenewOrder;
		return this;
	}

	@JsonProperty("CurrencyIsoCode")
	public String getCurrencyIsoCode() {
		return currencyIsoCode;
	}

	@JsonProperty("CurrencyIsoCode")
	public void setCurrencyIsoCode(String currencyIsoCode) {
		this.currencyIsoCode = currencyIsoCode;
	}

	public Order withCurrencyIsoCode(String currencyIsoCode) {
		this.currencyIsoCode = currencyIsoCode;
		return this;
	}

	@JsonProperty("IsTrialOrder")
	public Boolean getIsTrialOrder() {
		return isTrialOrder;
	}

	@JsonProperty("IsTrialOrder")
	public void setIsTrialOrder(Boolean isTrialOrder) {
		this.isTrialOrder = isTrialOrder;
	}

	public Order withIsTrialOrder(Boolean isTrialOrder) {
		this.isTrialOrder = isTrialOrder;
		return this;
	}

	@JsonProperty("OrderNumber")
	public String getOrderNumber() {
		return orderNumber;
	}

	@JsonProperty("OrderNumber")
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Order withOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
		return this;
	}

	@JsonProperty("TotalAmount")
	public Double getTotalAmount() {
		return totalAmount;
	}

	@JsonProperty("TotalAmount")
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Order withTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
		return this;
	}

	@JsonProperty("InvoiceId")
	public Object getInvoiceId() {
		return invoiceId;
	}

	@JsonProperty("InvoiceId")
	public void setInvoiceId(Object invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Order withInvoiceId(Object invoiceId) {
		this.invoiceId = invoiceId;
		return this;
	}

	@JsonProperty("LastApprovedDate")
	public Object getLastApprovedDate() {
		return lastApprovedDate;
	}

	@JsonProperty("LastApprovedDate")
	public void setLastApprovedDate(Object lastApprovedDate) {
		this.lastApprovedDate = lastApprovedDate;
	}

	public Order withLastApprovedDate(Object lastApprovedDate) {
		this.lastApprovedDate = lastApprovedDate;
		return this;
	}

	@JsonProperty("CreatedDate")
	public String getCreatedDate() {
		return createdDate;
	}

	@JsonProperty("CreatedDate")
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public Order withCreatedDate(String createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	@JsonProperty("CreatedById")
	public String getCreatedById() {
		return createdById;
	}

	@JsonProperty("CreatedById")
	public void setCreatedById(String createdById) {
		this.createdById = createdById;
	}

	public Order withCreatedById(String createdById) {
		this.createdById = createdById;
		return this;
	}

	@JsonProperty("LastModifiedDate")
	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	@JsonProperty("LastModifiedDate")
	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public Order withLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
		return this;
	}

	@JsonProperty("LastModifiedById")
	public String getLastModifiedById() {
		return lastModifiedById;
	}

	@JsonProperty("LastModifiedById")
	public void setLastModifiedById(String lastModifiedById) {
		this.lastModifiedById = lastModifiedById;
	}

	public Order withLastModifiedById(String lastModifiedById) {
		this.lastModifiedById = lastModifiedById;
		return this;
	}

	@JsonProperty("IsDeleted")
	public Boolean getIsDeleted() {
		return isDeleted;
	}

	@JsonProperty("IsDeleted")
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Order withIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
		return this;
	}

	@JsonProperty("SystemModstamp")
	public String getSystemModstamp() {
		return systemModstamp;
	}

	@JsonProperty("SystemModstamp")
	public void setSystemModstamp(String systemModstamp) {
		this.systemModstamp = systemModstamp;
	}

	public Order withSystemModstamp(String systemModstamp) {
		this.systemModstamp = systemModstamp;
		return this;
	}

	@JsonProperty("MayEdit")
	public Boolean getMayEdit() {
		return mayEdit;
	}

	@JsonProperty("MayEdit")
	public void setMayEdit(Boolean mayEdit) {
		this.mayEdit = mayEdit;
	}

	public Order withMayEdit(Boolean mayEdit) {
		this.mayEdit = mayEdit;
		return this;
	}

	@JsonProperty("IsLocked")
	public Boolean getIsLocked() {
		return isLocked;
	}

	@JsonProperty("IsLocked")
	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Order withIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
		return this;
	}

	@JsonProperty("LastViewedDate")
	public String getLastViewedDate() {
		return lastViewedDate;
	}

	@JsonProperty("LastViewedDate")
	public void setLastViewedDate(String lastViewedDate) {
		this.lastViewedDate = lastViewedDate;
	}

	public Order withLastViewedDate(String lastViewedDate) {
		this.lastViewedDate = lastViewedDate;
		return this;
	}

	@JsonProperty("LastReferencedDate")
	public String getLastReferencedDate() {
		return lastReferencedDate;
	}

	@JsonProperty("LastReferencedDate")
	public void setLastReferencedDate(String lastReferencedDate) {
		this.lastReferencedDate = lastReferencedDate;
	}

	public Order withLastReferencedDate(String lastReferencedDate) {
		this.lastReferencedDate = lastReferencedDate;
		return this;
	}

	@JsonProperty("Provisioning_Contact_Email__c")
	public Object getProvisioningContactEmailC() {
		return provisioningContactEmailC;
	}

	@JsonProperty("Provisioning_Contact_Email__c")
	public void setProvisioningContactEmailC(Object provisioningContactEmailC) {
		this.provisioningContactEmailC = provisioningContactEmailC;
	}

	public Order withProvisioningContactEmailC(Object provisioningContactEmailC) {
		this.provisioningContactEmailC = provisioningContactEmailC;
		return this;
	}

	@JsonProperty("Edit_Delete__c")
	public String getEditDeleteC() {
		return editDeleteC;
	}

	@JsonProperty("Edit_Delete__c")
	public void setEditDeleteC(String editDeleteC) {
		this.editDeleteC = editDeleteC;
	}

	public Order withEditDeleteC(String editDeleteC) {
		this.editDeleteC = editDeleteC;
		return this;
	}

	@JsonProperty("sfbase__IsAutoActivated__c")
	public Boolean getSfbaseIsAutoActivatedC() {
		return sfbaseIsAutoActivatedC;
	}

	@JsonProperty("sfbase__IsAutoActivated__c")
	public void setSfbaseIsAutoActivatedC(Boolean sfbaseIsAutoActivatedC) {
		this.sfbaseIsAutoActivatedC = sfbaseIsAutoActivatedC;
	}

	public Order withSfbaseIsAutoActivatedC(Boolean sfbaseIsAutoActivatedC) {
		this.sfbaseIsAutoActivatedC = sfbaseIsAutoActivatedC;
		return this;
	}

	@JsonProperty("Provisioning_Mobile_URL__c")
	public Object getProvisioningMobileURLC() {
		return provisioningMobileURLC;
	}

	@JsonProperty("Provisioning_Mobile_URL__c")
	public void setProvisioningMobileURLC(Object provisioningMobileURLC) {
		this.provisioningMobileURLC = provisioningMobileURLC;
	}

	public Order withProvisioningMobileURLC(Object provisioningMobileURLC) {
		this.provisioningMobileURLC = provisioningMobileURLC;
		return this;
	}

	@JsonProperty("Commission_Audit_Comments__c")
	public Object getCommissionAuditCommentsC() {
		return commissionAuditCommentsC;
	}

	@JsonProperty("Commission_Audit_Comments__c")
	public void setCommissionAuditCommentsC(Object commissionAuditCommentsC) {
		this.commissionAuditCommentsC = commissionAuditCommentsC;
	}

	public Order withCommissionAuditCommentsC(Object commissionAuditCommentsC) {
		this.commissionAuditCommentsC = commissionAuditCommentsC;
		return this;
	}

	@JsonProperty("Commission_Period__c")
	public Object getCommissionPeriodC() {
		return commissionPeriodC;
	}

	@JsonProperty("Commission_Period__c")
	public void setCommissionPeriodC(Object commissionPeriodC) {
		this.commissionPeriodC = commissionPeriodC;
	}

	public Order withCommissionPeriodC(Object commissionPeriodC) {
		this.commissionPeriodC = commissionPeriodC;
		return this;
	}

	@JsonProperty("Commission_Processing_Message__c")
	public Object getCommissionProcessingMessageC() {
		return commissionProcessingMessageC;
	}

	@JsonProperty("Commission_Processing_Message__c")
	public void setCommissionProcessingMessageC(
			Object commissionProcessingMessageC) {
		this.commissionProcessingMessageC = commissionProcessingMessageC;
	}

	public Order withCommissionProcessingMessageC(
			Object commissionProcessingMessageC) {
		this.commissionProcessingMessageC = commissionProcessingMessageC;
		return this;
	}

	@JsonProperty("Commission_Ready_Date__c")
	public Object getCommissionReadyDateC() {
		return commissionReadyDateC;
	}

	@JsonProperty("Commission_Ready_Date__c")
	public void setCommissionReadyDateC(Object commissionReadyDateC) {
		this.commissionReadyDateC = commissionReadyDateC;
	}

	public Order withCommissionReadyDateC(Object commissionReadyDateC) {
		this.commissionReadyDateC = commissionReadyDateC;
		return this;
	}

	@JsonProperty("Commission_Status__c")
	public String getCommissionStatusC() {
		return commissionStatusC;
	}

	@JsonProperty("Commission_Status__c")
	public void setCommissionStatusC(String commissionStatusC) {
		this.commissionStatusC = commissionStatusC;
	}

	public Order withCommissionStatusC(String commissionStatusC) {
		this.commissionStatusC = commissionStatusC;
		return this;
	}

	@JsonProperty("SpecialTermConversion__c")
	public Object getSpecialTermConversionC() {
		return specialTermConversionC;
	}

	@JsonProperty("SpecialTermConversion__c")
	public void setSpecialTermConversionC(Object specialTermConversionC) {
		this.specialTermConversionC = specialTermConversionC;
	}

	public Order withSpecialTermConversionC(Object specialTermConversionC) {
		this.specialTermConversionC = specialTermConversionC;
		return this;
	}

	@JsonProperty("sfbase__Order_Class__c")
	public Object getSfbaseOrderClassC() {
		return sfbaseOrderClassC;
	}

	@JsonProperty("sfbase__Order_Class__c")
	public void setSfbaseOrderClassC(Object sfbaseOrderClassC) {
		this.sfbaseOrderClassC = sfbaseOrderClassC;
	}

	public Order withSfbaseOrderClassC(Object sfbaseOrderClassC) {
		this.sfbaseOrderClassC = sfbaseOrderClassC;
		return this;
	}

	@JsonProperty("Net60_Hold__c")
	public String getNet60HoldC() {
		return net60HoldC;
	}

	@JsonProperty("Net60_Hold__c")
	public void setNet60HoldC(String net60HoldC) {
		this.net60HoldC = net60HoldC;
	}

	public Order withNet60HoldC(String net60HoldC) {
		this.net60HoldC = net60HoldC;
		return this;
	}

	@JsonProperty("Order_Commission_Sub_Type__c")
	public Object getOrderCommissionSubTypeC() {
		return orderCommissionSubTypeC;
	}

	@JsonProperty("Order_Commission_Sub_Type__c")
	public void setOrderCommissionSubTypeC(Object orderCommissionSubTypeC) {
		this.orderCommissionSubTypeC = orderCommissionSubTypeC;
	}

	public Order withOrderCommissionSubTypeC(Object orderCommissionSubTypeC) {
		this.orderCommissionSubTypeC = orderCommissionSubTypeC;
		return this;
	}

	@JsonProperty("Order_Commission_Type__c")
	public Object getOrderCommissionTypeC() {
		return orderCommissionTypeC;
	}

	@JsonProperty("Order_Commission_Type__c")
	public void setOrderCommissionTypeC(Object orderCommissionTypeC) {
		this.orderCommissionTypeC = orderCommissionTypeC;
	}

	public Order withOrderCommissionTypeC(Object orderCommissionTypeC) {
		this.orderCommissionTypeC = orderCommissionTypeC;
		return this;
	}

	@JsonProperty("Order_End_Date__c")
	public String getOrderEndDateC() {
		return orderEndDateC;
	}

	@JsonProperty("Order_End_Date__c")
	public void setOrderEndDateC(String orderEndDateC) {
		this.orderEndDateC = orderEndDateC;
	}

	public Order withOrderEndDateC(String orderEndDateC) {
		this.orderEndDateC = orderEndDateC;
		return this;
	}

	@JsonProperty("Order_Owner_Username__c")
	public Object getOrderOwnerUsernameC() {
		return orderOwnerUsernameC;
	}

	@JsonProperty("Order_Owner_Username__c")
	public void setOrderOwnerUsernameC(Object orderOwnerUsernameC) {
		this.orderOwnerUsernameC = orderOwnerUsernameC;
	}

	public Order withOrderOwnerUsernameC(Object orderOwnerUsernameC) {
		this.orderOwnerUsernameC = orderOwnerUsernameC;
		return this;
	}

	@JsonProperty("Order_Sub_Type__c")
	public String getOrderSubTypeC() {
		return orderSubTypeC;
	}

	@JsonProperty("Order_Sub_Type__c")
	public void setOrderSubTypeC(String orderSubTypeC) {
		this.orderSubTypeC = orderSubTypeC;
	}

	public Order withOrderSubTypeC(String orderSubTypeC) {
		this.orderSubTypeC = orderSubTypeC;
		return this;
	}

	@JsonProperty("Order_Term__c")
	public Object getOrderTermC() {
		return orderTermC;
	}

	@JsonProperty("Order_Term__c")
	public void setOrderTermC(Object orderTermC) {
		this.orderTermC = orderTermC;
	}

	public Order withOrderTermC(Object orderTermC) {
		this.orderTermC = orderTermC;
		return this;
	}

	@JsonProperty("Outclause_Hold_Release_Date__c")
	public Object getOutclauseHoldReleaseDateC() {
		return outclauseHoldReleaseDateC;
	}

	@JsonProperty("Outclause_Hold_Release_Date__c")
	public void setOutclauseHoldReleaseDateC(Object outclauseHoldReleaseDateC) {
		this.outclauseHoldReleaseDateC = outclauseHoldReleaseDateC;
	}

	public Order withOutclauseHoldReleaseDateC(Object outclauseHoldReleaseDateC) {
		this.outclauseHoldReleaseDateC = outclauseHoldReleaseDateC;
		return this;
	}

	@JsonProperty("Outclause_Hold_Status__c")
	public String getOutclauseHoldStatusC() {
		return outclauseHoldStatusC;
	}

	@JsonProperty("Outclause_Hold_Status__c")
	public void setOutclauseHoldStatusC(String outclauseHoldStatusC) {
		this.outclauseHoldStatusC = outclauseHoldStatusC;
	}

	public Order withOutclauseHoldStatusC(String outclauseHoldStatusC) {
		this.outclauseHoldStatusC = outclauseHoldStatusC;
		return this;
	}

	@JsonProperty("Related_Renewal_Order_Number__c")
	public Object getRelatedRenewalOrderNumberC() {
		return relatedRenewalOrderNumberC;
	}

	@JsonProperty("Related_Renewal_Order_Number__c")
	public void setRelatedRenewalOrderNumberC(Object relatedRenewalOrderNumberC) {
		this.relatedRenewalOrderNumberC = relatedRenewalOrderNumberC;
	}

	public Order withRelatedRenewalOrderNumberC(
			Object relatedRenewalOrderNumberC) {
		this.relatedRenewalOrderNumberC = relatedRenewalOrderNumberC;
		return this;
	}

	@JsonProperty("Renewal_Manager1__c")
	public Object getRenewalManager1C() {
		return renewalManager1C;
	}

	@JsonProperty("Renewal_Manager1__c")
	public void setRenewalManager1C(Object renewalManager1C) {
		this.renewalManager1C = renewalManager1C;
	}

	public Order withRenewalManager1C(Object renewalManager1C) {
		this.renewalManager1C = renewalManager1C;
		return this;
	}

	@JsonProperty("Renewal_Manager1_Split__c")
	public Object getRenewalManager1SplitC() {
		return renewalManager1SplitC;
	}

	@JsonProperty("Renewal_Manager1_Split__c")
	public void setRenewalManager1SplitC(Object renewalManager1SplitC) {
		this.renewalManager1SplitC = renewalManager1SplitC;
	}

	public Order withRenewalManager1SplitC(Object renewalManager1SplitC) {
		this.renewalManager1SplitC = renewalManager1SplitC;
		return this;
	}

	@JsonProperty("Renewal_Manager2__c")
	public Object getRenewalManager2C() {
		return renewalManager2C;
	}

	@JsonProperty("Renewal_Manager2__c")
	public void setRenewalManager2C(Object renewalManager2C) {
		this.renewalManager2C = renewalManager2C;
	}

	public Order withRenewalManager2C(Object renewalManager2C) {
		this.renewalManager2C = renewalManager2C;
		return this;
	}

	@JsonProperty("Renewal_Manager2_Split__c")
	public Object getRenewalManager2SplitC() {
		return renewalManager2SplitC;
	}

	@JsonProperty("Renewal_Manager2_Split__c")
	public void setRenewalManager2SplitC(Object renewalManager2SplitC) {
		this.renewalManager2SplitC = renewalManager2SplitC;
	}

	public Order withRenewalManager2SplitC(Object renewalManager2SplitC) {
		this.renewalManager2SplitC = renewalManager2SplitC;
		return this;
	}

	@JsonProperty("Revenue_Hold_Status__c")
	public String getRevenueHoldStatusC() {
		return revenueHoldStatusC;
	}

	@JsonProperty("Revenue_Hold_Status__c")
	public void setRevenueHoldStatusC(String revenueHoldStatusC) {
		this.revenueHoldStatusC = revenueHoldStatusC;
	}

	public Order withRevenueHoldStatusC(String revenueHoldStatusC) {
		this.revenueHoldStatusC = revenueHoldStatusC;
		return this;
	}

	@JsonProperty("Salesperson1__c")
	public Object getSalesperson1C() {
		return salesperson1C;
	}

	@JsonProperty("Salesperson1__c")
	public void setSalesperson1C(Object salesperson1C) {
		this.salesperson1C = salesperson1C;
	}

	public Order withSalesperson1C(Object salesperson1C) {
		this.salesperson1C = salesperson1C;
		return this;
	}

	@JsonProperty("Salesperson1_Split__c")
	public Object getSalesperson1SplitC() {
		return salesperson1SplitC;
	}

	@JsonProperty("Salesperson1_Split__c")
	public void setSalesperson1SplitC(Object salesperson1SplitC) {
		this.salesperson1SplitC = salesperson1SplitC;
	}

	public Order withSalesperson1SplitC(Object salesperson1SplitC) {
		this.salesperson1SplitC = salesperson1SplitC;
		return this;
	}

	@JsonProperty("Salesperson2__c")
	public Object getSalesperson2C() {
		return salesperson2C;
	}

	@JsonProperty("Salesperson2__c")
	public void setSalesperson2C(Object salesperson2C) {
		this.salesperson2C = salesperson2C;
	}

	public Order withSalesperson2C(Object salesperson2C) {
		this.salesperson2C = salesperson2C;
		return this;
	}

	@JsonProperty("Salesperson2_Split__c")
	public Object getSalesperson2SplitC() {
		return salesperson2SplitC;
	}

	@JsonProperty("Salesperson2_Split__c")
	public void setSalesperson2SplitC(Object salesperson2SplitC) {
		this.salesperson2SplitC = salesperson2SplitC;
	}

	public Order withSalesperson2SplitC(Object salesperson2SplitC) {
		this.salesperson2SplitC = salesperson2SplitC;
		return this;
	}

	@JsonProperty("Salesperson3__c")
	public Object getSalesperson3C() {
		return salesperson3C;
	}

	@JsonProperty("Salesperson3__c")
	public void setSalesperson3C(Object salesperson3C) {
		this.salesperson3C = salesperson3C;
	}

	public Order withSalesperson3C(Object salesperson3C) {
		this.salesperson3C = salesperson3C;
		return this;
	}

	@JsonProperty("Salesperson3_Split__c")
	public Object getSalesperson3SplitC() {
		return salesperson3SplitC;
	}

	@JsonProperty("Salesperson3_Split__c")
	public void setSalesperson3SplitC(Object salesperson3SplitC) {
		this.salesperson3SplitC = salesperson3SplitC;
	}

	public Order withSalesperson3SplitC(Object salesperson3SplitC) {
		this.salesperson3SplitC = salesperson3SplitC;
		return this;
	}

	@JsonProperty("Salesperson4__c")
	public Object getSalesperson4C() {
		return salesperson4C;
	}

	@JsonProperty("Salesperson4__c")
	public void setSalesperson4C(Object salesperson4C) {
		this.salesperson4C = salesperson4C;
	}

	public Order withSalesperson4C(Object salesperson4C) {
		this.salesperson4C = salesperson4C;
		return this;
	}

	@JsonProperty("Salesperson4_Split__c")
	public Object getSalesperson4SplitC() {
		return salesperson4SplitC;
	}

	@JsonProperty("Salesperson4_Split__c")
	public void setSalesperson4SplitC(Object salesperson4SplitC) {
		this.salesperson4SplitC = salesperson4SplitC;
	}

	public Order withSalesperson4SplitC(Object salesperson4SplitC) {
		this.salesperson4SplitC = salesperson4SplitC;
		return this;
	}

	@JsonProperty("sfbase__Order_Designation__c")
	public Object getSfbaseOrderDesignationC() {
		return sfbaseOrderDesignationC;
	}

	@JsonProperty("sfbase__Order_Designation__c")
	public void setSfbaseOrderDesignationC(Object sfbaseOrderDesignationC) {
		this.sfbaseOrderDesignationC = sfbaseOrderDesignationC;
	}

	public Order withSfbaseOrderDesignationC(Object sfbaseOrderDesignationC) {
		this.sfbaseOrderDesignationC = sfbaseOrderDesignationC;
		return this;
	}

	@JsonProperty("sfquote__Related_Quote__c")
	public Object getSfquoteRelatedQuoteC() {
		return sfquoteRelatedQuoteC;
	}

	@JsonProperty("sfquote__Related_Quote__c")
	public void setSfquoteRelatedQuoteC(Object sfquoteRelatedQuoteC) {
		this.sfquoteRelatedQuoteC = sfquoteRelatedQuoteC;
	}

	public Order withSfquoteRelatedQuoteC(Object sfquoteRelatedQuoteC) {
		this.sfquoteRelatedQuoteC = sfquoteRelatedQuoteC;
		return this;
	}

	@JsonProperty("Rejected_Picklist__c")
	public Object getRejectedPicklistC() {
		return rejectedPicklistC;
	}

	@JsonProperty("Rejected_Picklist__c")
	public void setRejectedPicklistC(Object rejectedPicklistC) {
		this.rejectedPicklistC = rejectedPicklistC;
	}

	public Order withRejectedPicklistC(Object rejectedPicklistC) {
		this.rejectedPicklistC = rejectedPicklistC;
		return this;
	}

	@JsonProperty("GEO_Activated_Date__c")
	public String getGEOActivatedDateC() {
		return gEOActivatedDateC;
	}

	@JsonProperty("GEO_Activated_Date__c")
	public void setGEOActivatedDateC(String gEOActivatedDateC) {
		this.gEOActivatedDateC = gEOActivatedDateC;
	}

	public Order withGEOActivatedDateC(String gEOActivatedDateC) {
		this.gEOActivatedDateC = gEOActivatedDateC;
		return this;
	}

	@JsonProperty("sfbase__OrderLifeTimeValue__c")
	public Double getSfbaseOrderLifeTimeValueC() {
		return sfbaseOrderLifeTimeValueC;
	}

	@JsonProperty("sfbase__OrderLifeTimeValue__c")
	public void setSfbaseOrderLifeTimeValueC(Double sfbaseOrderLifeTimeValueC) {
		this.sfbaseOrderLifeTimeValueC = sfbaseOrderLifeTimeValueC;
	}

	public Order withSfbaseOrderLifeTimeValueC(Double sfbaseOrderLifeTimeValueC) {
		this.sfbaseOrderLifeTimeValueC = sfbaseOrderLifeTimeValueC;
		return this;
	}

	@JsonProperty("sfbase__OrderEndDate__c")
	public String getSfbaseOrderEndDateC() {
		return sfbaseOrderEndDateC;
	}

	@JsonProperty("sfbase__OrderEndDate__c")
	public void setSfbaseOrderEndDateC(String sfbaseOrderEndDateC) {
		this.sfbaseOrderEndDateC = sfbaseOrderEndDateC;
	}

	public Order withSfbaseOrderEndDateC(String sfbaseOrderEndDateC) {
		this.sfbaseOrderEndDateC = sfbaseOrderEndDateC;
		return this;
	}

	@JsonProperty("sfbase__OrderTermAps__c")
	public Double getSfbaseOrderTermApsC() {
		return sfbaseOrderTermApsC;
	}

	@JsonProperty("sfbase__OrderTermAps__c")
	public void setSfbaseOrderTermApsC(Double sfbaseOrderTermApsC) {
		this.sfbaseOrderTermApsC = sfbaseOrderTermApsC;
	}

	public Order withSfbaseOrderTermApsC(Double sfbaseOrderTermApsC) {
		this.sfbaseOrderTermApsC = sfbaseOrderTermApsC;
		return this;
	}

	@JsonProperty("sfbase__OrdProvisionDatetime__c")
	public Object getSfbaseOrdProvisionDatetimeC() {
		return sfbaseOrdProvisionDatetimeC;
	}

	@JsonProperty("sfbase__OrdProvisionDatetime__c")
	public void setSfbaseOrdProvisionDatetimeC(
			Object sfbaseOrdProvisionDatetimeC) {
		this.sfbaseOrdProvisionDatetimeC = sfbaseOrdProvisionDatetimeC;
	}

	public Order withSfbaseOrdProvisionDatetimeC(
			Object sfbaseOrdProvisionDatetimeC) {
		this.sfbaseOrdProvisionDatetimeC = sfbaseOrdProvisionDatetimeC;
		return this;
	}

	@JsonProperty("sfbase__GEOActivatedDate__c")
	public Object getSfbaseGEOActivatedDateC() {
		return sfbaseGEOActivatedDateC;
	}

	@JsonProperty("sfbase__GEOActivatedDate__c")
	public void setSfbaseGEOActivatedDateC(Object sfbaseGEOActivatedDateC) {
		this.sfbaseGEOActivatedDateC = sfbaseGEOActivatedDateC;
	}

	public Order withSfbaseGEOActivatedDateC(Object sfbaseGEOActivatedDateC) {
		this.sfbaseGEOActivatedDateC = sfbaseGEOActivatedDateC;
		return this;
	}

	@JsonProperty("sfbase__RelatedReductionOrder__c")
	public Object getSfbaseRelatedReductionOrderC() {
		return sfbaseRelatedReductionOrderC;
	}

	@JsonProperty("sfbase__RelatedReductionOrder__c")
	public void setSfbaseRelatedReductionOrderC(
			Object sfbaseRelatedReductionOrderC) {
		this.sfbaseRelatedReductionOrderC = sfbaseRelatedReductionOrderC;
	}

	public Order withSfbaseRelatedReductionOrderC(
			Object sfbaseRelatedReductionOrderC) {
		this.sfbaseRelatedReductionOrderC = sfbaseRelatedReductionOrderC;
		return this;
	}

	@JsonProperty("sfbase__PreviousOrder__c")
	public Object getSfbasePreviousOrderC() {
		return sfbasePreviousOrderC;
	}

	@JsonProperty("sfbase__PreviousOrder__c")
	public void setSfbasePreviousOrderC(Object sfbasePreviousOrderC) {
		this.sfbasePreviousOrderC = sfbasePreviousOrderC;
	}

	public Order withSfbasePreviousOrderC(Object sfbasePreviousOrderC) {
		this.sfbasePreviousOrderC = sfbasePreviousOrderC;
		return this;
	}

	@JsonProperty("sfbase__ServiceExtension__c")
	public Boolean getSfbaseServiceExtensionC() {
		return sfbaseServiceExtensionC;
	}

	@JsonProperty("sfbase__ServiceExtension__c")
	public void setSfbaseServiceExtensionC(Boolean sfbaseServiceExtensionC) {
		this.sfbaseServiceExtensionC = sfbaseServiceExtensionC;
	}

	public Order withSfbaseServiceExtensionC(Boolean sfbaseServiceExtensionC) {
		this.sfbaseServiceExtensionC = sfbaseServiceExtensionC;
		return this;
	}

	@JsonProperty("New_Order_Term__c")
	public Double getNewOrderTermC() {
		return newOrderTermC;
	}

	@JsonProperty("New_Order_Term__c")
	public void setNewOrderTermC(Double newOrderTermC) {
		this.newOrderTermC = newOrderTermC;
	}

	public Order withNewOrderTermC(Double newOrderTermC) {
		this.newOrderTermC = newOrderTermC;
		return this;
	}

	@JsonProperty("sfbase__OrdProvisionDateGEO__c")
	public Object getSfbaseOrdProvisionDateGEOC() {
		return sfbaseOrdProvisionDateGEOC;
	}

	@JsonProperty("sfbase__OrdProvisionDateGEO__c")
	public void setSfbaseOrdProvisionDateGEOC(Object sfbaseOrdProvisionDateGEOC) {
		this.sfbaseOrdProvisionDateGEOC = sfbaseOrdProvisionDateGEOC;
	}

	public Order withSfbaseOrdProvisionDateGEOC(
			Object sfbaseOrdProvisionDateGEOC) {
		this.sfbaseOrdProvisionDateGEOC = sfbaseOrdProvisionDateGEOC;
		return this;
	}

	@JsonProperty("sfbase__RevenueProcessingStatus__c")
	public String getSfbaseRevenueProcessingStatusC() {
		return sfbaseRevenueProcessingStatusC;
	}

	@JsonProperty("sfbase__RevenueProcessingStatus__c")
	public void setSfbaseRevenueProcessingStatusC(
			String sfbaseRevenueProcessingStatusC) {
		this.sfbaseRevenueProcessingStatusC = sfbaseRevenueProcessingStatusC;
	}

	public Order withSfbaseRevenueProcessingStatusC(
			String sfbaseRevenueProcessingStatusC) {
		this.sfbaseRevenueProcessingStatusC = sfbaseRevenueProcessingStatusC;
		return this;
	}

	@JsonProperty("sfbase__APIRevenueProcessingStatus__c")
	public String getSfbaseAPIRevenueProcessingStatusC() {
		return sfbaseAPIRevenueProcessingStatusC;
	}

	@JsonProperty("sfbase__APIRevenueProcessingStatus__c")
	public void setSfbaseAPIRevenueProcessingStatusC(
			String sfbaseAPIRevenueProcessingStatusC) {
		this.sfbaseAPIRevenueProcessingStatusC = sfbaseAPIRevenueProcessingStatusC;
	}

	public Order withSfbaseAPIRevenueProcessingStatusC(
			String sfbaseAPIRevenueProcessingStatusC) {
		this.sfbaseAPIRevenueProcessingStatusC = sfbaseAPIRevenueProcessingStatusC;
		return this;
	}

	@JsonProperty("sfbase__RevenueProcessingMessage__c")
	public Object getSfbaseRevenueProcessingMessageC() {
		return sfbaseRevenueProcessingMessageC;
	}

	@JsonProperty("sfbase__RevenueProcessingMessage__c")
	public void setSfbaseRevenueProcessingMessageC(
			Object sfbaseRevenueProcessingMessageC) {
		this.sfbaseRevenueProcessingMessageC = sfbaseRevenueProcessingMessageC;
	}

	public Order withSfbaseRevenueProcessingMessageC(
			Object sfbaseRevenueProcessingMessageC) {
		this.sfbaseRevenueProcessingMessageC = sfbaseRevenueProcessingMessageC;
		return this;
	}

	@JsonProperty("sfbase__RelatedContractCount__c")
	public Double getSfbaseRelatedContractCountC() {
		return sfbaseRelatedContractCountC;
	}

	@JsonProperty("sfbase__RelatedContractCount__c")
	public void setSfbaseRelatedContractCountC(
			Double sfbaseRelatedContractCountC) {
		this.sfbaseRelatedContractCountC = sfbaseRelatedContractCountC;
	}

	public Order withSfbaseRelatedContractCountC(
			Double sfbaseRelatedContractCountC) {
		this.sfbaseRelatedContractCountC = sfbaseRelatedContractCountC;
		return this;
	}

	@JsonProperty("sfbase__Source__c")
	public Object getSfbaseSourceC() {
		return sfbaseSourceC;
	}

	@JsonProperty("sfbase__Source__c")
	public void setSfbaseSourceC(Object sfbaseSourceC) {
		this.sfbaseSourceC = sfbaseSourceC;
	}

	public Order withSfbaseSourceC(Object sfbaseSourceC) {
		this.sfbaseSourceC = sfbaseSourceC;
		return this;
	}

	@JsonProperty("New_Commission_Period__c")
	public Object getNewCommissionPeriodC() {
		return newCommissionPeriodC;
	}

	@JsonProperty("New_Commission_Period__c")
	public void setNewCommissionPeriodC(Object newCommissionPeriodC) {
		this.newCommissionPeriodC = newCommissionPeriodC;
	}

	public Order withNewCommissionPeriodC(Object newCommissionPeriodC) {
		this.newCommissionPeriodC = newCommissionPeriodC;
		return this;
	}

	@JsonProperty("sfbase__OrdProvisionDateGEO_GUI__c")
	public Object getSfbaseOrdProvisionDateGEOGUIC() {
		return sfbaseOrdProvisionDateGEOGUIC;
	}

	@JsonProperty("sfbase__OrdProvisionDateGEO_GUI__c")
	public void setSfbaseOrdProvisionDateGEOGUIC(
			Object sfbaseOrdProvisionDateGEOGUIC) {
		this.sfbaseOrdProvisionDateGEOGUIC = sfbaseOrdProvisionDateGEOGUIC;
	}

	public Order withSfbaseOrdProvisionDateGEOGUIC(
			Object sfbaseOrdProvisionDateGEOGUIC) {
		this.sfbaseOrdProvisionDateGEOGUIC = sfbaseOrdProvisionDateGEOGUIC;
		return this;
	}

	@JsonProperty("sfbase__CustomerProvisioningDate__c")
	public Object getSfbaseCustomerProvisioningDateC() {
		return sfbaseCustomerProvisioningDateC;
	}

	@JsonProperty("sfbase__CustomerProvisioningDate__c")
	public void setSfbaseCustomerProvisioningDateC(
			Object sfbaseCustomerProvisioningDateC) {
		this.sfbaseCustomerProvisioningDateC = sfbaseCustomerProvisioningDateC;
	}

	public Order withSfbaseCustomerProvisioningDateC(
			Object sfbaseCustomerProvisioningDateC) {
		this.sfbaseCustomerProvisioningDateC = sfbaseCustomerProvisioningDateC;
		return this;
	}

	@JsonProperty("sfbase__CustomerOrgTimeZone__c")
	public Double getSfbaseCustomerOrgTimeZoneC() {
		return sfbaseCustomerOrgTimeZoneC;
	}

	@JsonProperty("sfbase__CustomerOrgTimeZone__c")
	public void setSfbaseCustomerOrgTimeZoneC(Double sfbaseCustomerOrgTimeZoneC) {
		this.sfbaseCustomerOrgTimeZoneC = sfbaseCustomerOrgTimeZoneC;
	}

	public Order withSfbaseCustomerOrgTimeZoneC(
			Double sfbaseCustomerOrgTimeZoneC) {
		this.sfbaseCustomerOrgTimeZoneC = sfbaseCustomerOrgTimeZoneC;
		return this;
	}

	@JsonProperty("sfbase__PrimarySalesOrder__c")
	public Object getSfbasePrimarySalesOrderC() {
		return sfbasePrimarySalesOrderC;
	}

	@JsonProperty("sfbase__PrimarySalesOrder__c")
	public void setSfbasePrimarySalesOrderC(Object sfbasePrimarySalesOrderC) {
		this.sfbasePrimarySalesOrderC = sfbasePrimarySalesOrderC;
	}

	public Order withSfbasePrimarySalesOrderC(Object sfbasePrimarySalesOrderC) {
		this.sfbasePrimarySalesOrderC = sfbasePrimarySalesOrderC;
		return this;
	}

	@JsonProperty("IsConversionOrder__c")
	public Boolean getIsConversionOrderC() {
		return isConversionOrderC;
	}

	@JsonProperty("IsConversionOrder__c")
	public void setIsConversionOrderC(Boolean isConversionOrderC) {
		this.isConversionOrderC = isConversionOrderC;
	}

	public Order withIsConversionOrderC(Boolean isConversionOrderC) {
		this.isConversionOrderC = isConversionOrderC;
		return this;
	}

	@JsonProperty("GLOverrideDate__c")
	public Object getGLOverrideDateC() {
		return gLOverrideDateC;
	}

	@JsonProperty("GLOverrideDate__c")
	public void setGLOverrideDateC(Object gLOverrideDateC) {
		this.gLOverrideDateC = gLOverrideDateC;
	}

	public Order withGLOverrideDateC(Object gLOverrideDateC) {
		this.gLOverrideDateC = gLOverrideDateC;
		return this;
	}

	@JsonProperty("RevenueExternalSystemRef__c")
	public Object getRevenueExternalSystemRefC() {
		return revenueExternalSystemRefC;
	}

	@JsonProperty("RevenueExternalSystemRef__c")
	public void setRevenueExternalSystemRefC(Object revenueExternalSystemRefC) {
		this.revenueExternalSystemRefC = revenueExternalSystemRefC;
	}

	public Order withRevenueExternalSystemRefC(Object revenueExternalSystemRefC) {
		this.revenueExternalSystemRefC = revenueExternalSystemRefC;
		return this;
	}

	@JsonProperty("RevenueGLDate__c")
	public Object getRevenueGLDateC() {
		return revenueGLDateC;
	}

	@JsonProperty("RevenueGLDate__c")
	public void setRevenueGLDateC(Object revenueGLDateC) {
		this.revenueGLDateC = revenueGLDateC;
	}

	public Order withRevenueGLDateC(Object revenueGLDateC) {
		this.revenueGLDateC = revenueGLDateC;
		return this;
	}

	@JsonProperty("ExchangeRateDate__c")
	public Object getExchangeRateDateC() {
		return exchangeRateDateC;
	}

	@JsonProperty("ExchangeRateDate__c")
	public void setExchangeRateDateC(Object exchangeRateDateC) {
		this.exchangeRateDateC = exchangeRateDateC;
	}

	public Order withExchangeRateDateC(Object exchangeRateDateC) {
		this.exchangeRateDateC = exchangeRateDateC;
		return this;
	}

	@JsonProperty("ExchangeRate__c")
	public Object getExchangeRateC() {
		return exchangeRateC;
	}

	@JsonProperty("ExchangeRate__c")
	public void setExchangeRateC(Object exchangeRateC) {
		this.exchangeRateC = exchangeRateC;
	}

	public Order withExchangeRateC(Object exchangeRateC) {
		this.exchangeRateC = exchangeRateC;
		return this;
	}

	@JsonProperty("ExchangeRateFunctionalCurrency__c")
	public Object getExchangeRateFunctionalCurrencyC() {
		return exchangeRateFunctionalCurrencyC;
	}

	@JsonProperty("ExchangeRateFunctionalCurrency__c")
	public void setExchangeRateFunctionalCurrencyC(
			Object exchangeRateFunctionalCurrencyC) {
		this.exchangeRateFunctionalCurrencyC = exchangeRateFunctionalCurrencyC;
	}

	public Order withExchangeRateFunctionalCurrencyC(
			Object exchangeRateFunctionalCurrencyC) {
		this.exchangeRateFunctionalCurrencyC = exchangeRateFunctionalCurrencyC;
		return this;
	}

	@JsonProperty("Flash_Handling__c")
	public Object getFlashHandlingC() {
		return flashHandlingC;
	}

	@JsonProperty("Flash_Handling__c")
	public void setFlashHandlingC(Object flashHandlingC) {
		this.flashHandlingC = flashHandlingC;
	}

	public Order withFlashHandlingC(Object flashHandlingC) {
		this.flashHandlingC = flashHandlingC;
		return this;
	}

	@JsonProperty("Max_Order_Item_Term__c")
	public Object getMaxOrderItemTermC() {
		return maxOrderItemTermC;
	}

	@JsonProperty("Max_Order_Item_Term__c")
	public void setMaxOrderItemTermC(Object maxOrderItemTermC) {
		this.maxOrderItemTermC = maxOrderItemTermC;
	}

	public Order withMaxOrderItemTermC(Object maxOrderItemTermC) {
		this.maxOrderItemTermC = maxOrderItemTermC;
		return this;
	}

	@JsonProperty("Related_Case__c")
	public Object getRelatedCaseC() {
		return relatedCaseC;
	}

	@JsonProperty("Related_Case__c")
	public void setRelatedCaseC(Object relatedCaseC) {
		this.relatedCaseC = relatedCaseC;
	}

	public Order withRelatedCaseC(Object relatedCaseC) {
		this.relatedCaseC = relatedCaseC;
		return this;
	}

	@JsonProperty("Primary_Order_Start_Date__c")
	public Object getPrimaryOrderStartDateC() {
		return primaryOrderStartDateC;
	}

	@JsonProperty("Primary_Order_Start_Date__c")
	public void setPrimaryOrderStartDateC(Object primaryOrderStartDateC) {
		this.primaryOrderStartDateC = primaryOrderStartDateC;
	}

	public Order withPrimaryOrderStartDateC(Object primaryOrderStartDateC) {
		this.primaryOrderStartDateC = primaryOrderStartDateC;
		return this;
	}

	@JsonProperty("sfbase__PrimaryOrderStartDate__c")
	public Object getSfbasePrimaryOrderStartDateC() {
		return sfbasePrimaryOrderStartDateC;
	}

	@JsonProperty("sfbase__PrimaryOrderStartDate__c")
	public void setSfbasePrimaryOrderStartDateC(
			Object sfbasePrimaryOrderStartDateC) {
		this.sfbasePrimaryOrderStartDateC = sfbasePrimaryOrderStartDateC;
	}

	public Order withSfbasePrimaryOrderStartDateC(
			Object sfbasePrimaryOrderStartDateC) {
		this.sfbasePrimaryOrderStartDateC = sfbasePrimaryOrderStartDateC;
		return this;
	}

	@JsonProperty("Quote_AE_Percentage__c")
	public Object getQuoteAEPercentageC() {
		return quoteAEPercentageC;
	}

	@JsonProperty("Quote_AE_Percentage__c")
	public void setQuoteAEPercentageC(Object quoteAEPercentageC) {
		this.quoteAEPercentageC = quoteAEPercentageC;
	}

	public Order withQuoteAEPercentageC(Object quoteAEPercentageC) {
		this.quoteAEPercentageC = quoteAEPercentageC;
		return this;
	}

	@JsonProperty("sfbase__Initial_Price_Ramp_Order__c")
	public Object getSfbaseInitialPriceRampOrderC() {
		return sfbaseInitialPriceRampOrderC;
	}

	@JsonProperty("sfbase__Initial_Price_Ramp_Order__c")
	public void setSfbaseInitialPriceRampOrderC(
			Object sfbaseInitialPriceRampOrderC) {
		this.sfbaseInitialPriceRampOrderC = sfbaseInitialPriceRampOrderC;
	}

	public Order withSfbaseInitialPriceRampOrderC(
			Object sfbaseInitialPriceRampOrderC) {
		this.sfbaseInitialPriceRampOrderC = sfbaseInitialPriceRampOrderC;
		return this;
	}

	@JsonProperty("sfbase__Price_Ramp_End_Date__c")
	public Object getSfbasePriceRampEndDateC() {
		return sfbasePriceRampEndDateC;
	}

	@JsonProperty("sfbase__Price_Ramp_End_Date__c")
	public void setSfbasePriceRampEndDateC(Object sfbasePriceRampEndDateC) {
		this.sfbasePriceRampEndDateC = sfbasePriceRampEndDateC;
	}

	public Order withSfbasePriceRampEndDateC(Object sfbasePriceRampEndDateC) {
		this.sfbasePriceRampEndDateC = sfbasePriceRampEndDateC;
		return this;
	}

	@JsonProperty("sfbase__Price_Ramp__c")
	public Boolean getSfbasePriceRampC() {
		return sfbasePriceRampC;
	}

	@JsonProperty("sfbase__Price_Ramp__c")
	public void setSfbasePriceRampC(Boolean sfbasePriceRampC) {
		this.sfbasePriceRampC = sfbasePriceRampC;
	}

	public Order withSfbasePriceRampC(Boolean sfbasePriceRampC) {
		this.sfbasePriceRampC = sfbasePriceRampC;
		return this;
	}

	@JsonProperty("sfbill__MaxBillThroughDate__c")
	public Object getSfbillMaxBillThroughDateC() {
		return sfbillMaxBillThroughDateC;
	}

	@JsonProperty("sfbill__MaxBillThroughDate__c")
	public void setSfbillMaxBillThroughDateC(Object sfbillMaxBillThroughDateC) {
		this.sfbillMaxBillThroughDateC = sfbillMaxBillThroughDateC;
	}

	public Order withSfbillMaxBillThroughDateC(Object sfbillMaxBillThroughDateC) {
		this.sfbillMaxBillThroughDateC = sfbillMaxBillThroughDateC;
		return this;
	}

	@JsonProperty("sfom__FirstLogoEligible__c")
	public Boolean getSfomFirstLogoEligibleC() {
		return sfomFirstLogoEligibleC;
	}

	@JsonProperty("sfom__FirstLogoEligible__c")
	public void setSfomFirstLogoEligibleC(Boolean sfomFirstLogoEligibleC) {
		this.sfomFirstLogoEligibleC = sfomFirstLogoEligibleC;
	}

	public Order withSfomFirstLogoEligibleC(Boolean sfomFirstLogoEligibleC) {
		this.sfomFirstLogoEligibleC = sfomFirstLogoEligibleC;
		return this;
	}

	@JsonProperty("sfbase__ActivationEmailToBeSent__c")
	public Boolean getSfbaseActivationEmailToBeSentC() {
		return sfbaseActivationEmailToBeSentC;
	}

	@JsonProperty("sfbase__ActivationEmailToBeSent__c")
	public void setSfbaseActivationEmailToBeSentC(
			Boolean sfbaseActivationEmailToBeSentC) {
		this.sfbaseActivationEmailToBeSentC = sfbaseActivationEmailToBeSentC;
	}

	public Order withSfbaseActivationEmailToBeSentC(
			Boolean sfbaseActivationEmailToBeSentC) {
		this.sfbaseActivationEmailToBeSentC = sfbaseActivationEmailToBeSentC;
		return this;
	}

	@JsonProperty("sfbase__CustomerPORequired__c")
	public Object getSfbaseCustomerPORequiredC() {
		return sfbaseCustomerPORequiredC;
	}

	@JsonProperty("sfbase__CustomerPORequired__c")
	public void setSfbaseCustomerPORequiredC(Object sfbaseCustomerPORequiredC) {
		this.sfbaseCustomerPORequiredC = sfbaseCustomerPORequiredC;
	}

	public Order withSfbaseCustomerPORequiredC(Object sfbaseCustomerPORequiredC) {
		this.sfbaseCustomerPORequiredC = sfbaseCustomerPORequiredC;
		return this;
	}

	@JsonProperty("sfbase__Date_Language__c")
	public Boolean getSfbaseDateLanguageC() {
		return sfbaseDateLanguageC;
	}

	@JsonProperty("sfbase__Date_Language__c")
	public void setSfbaseDateLanguageC(Boolean sfbaseDateLanguageC) {
		this.sfbaseDateLanguageC = sfbaseDateLanguageC;
	}

	public Order withSfbaseDateLanguageC(Boolean sfbaseDateLanguageC) {
		this.sfbaseDateLanguageC = sfbaseDateLanguageC;
		return this;
	}

	@JsonProperty("sfbase__ExceptionComments__c")
	public Object getSfbaseExceptionCommentsC() {
		return sfbaseExceptionCommentsC;
	}

	@JsonProperty("sfbase__ExceptionComments__c")
	public void setSfbaseExceptionCommentsC(Object sfbaseExceptionCommentsC) {
		this.sfbaseExceptionCommentsC = sfbaseExceptionCommentsC;
	}

	public Order withSfbaseExceptionCommentsC(Object sfbaseExceptionCommentsC) {
		this.sfbaseExceptionCommentsC = sfbaseExceptionCommentsC;
		return this;
	}

	@JsonProperty("sfbase__POAmount__c")
	public Object getSfbasePOAmountC() {
		return sfbasePOAmountC;
	}

	@JsonProperty("sfbase__POAmount__c")
	public void setSfbasePOAmountC(Object sfbasePOAmountC) {
		this.sfbasePOAmountC = sfbasePOAmountC;
	}

	public Order withSfbasePOAmountC(Object sfbasePOAmountC) {
		this.sfbasePOAmountC = sfbasePOAmountC;
		return this;
	}

	@JsonProperty("sfbase__POExpirationDate__c")
	public Object getSfbasePOExpirationDateC() {
		return sfbasePOExpirationDateC;
	}

	@JsonProperty("sfbase__POExpirationDate__c")
	public void setSfbasePOExpirationDateC(Object sfbasePOExpirationDateC) {
		this.sfbasePOExpirationDateC = sfbasePOExpirationDateC;
	}

	public Order withSfbasePOExpirationDateC(Object sfbasePOExpirationDateC) {
		this.sfbasePOExpirationDateC = sfbasePOExpirationDateC;
		return this;
	}

	@JsonProperty("sfbase__Show_SFDC_Signature_Block__c")
	public Boolean getSfbaseShowSFDCSignatureBlockC() {
		return sfbaseShowSFDCSignatureBlockC;
	}

	@JsonProperty("sfbase__Show_SFDC_Signature_Block__c")
	public void setSfbaseShowSFDCSignatureBlockC(
			Boolean sfbaseShowSFDCSignatureBlockC) {
		this.sfbaseShowSFDCSignatureBlockC = sfbaseShowSFDCSignatureBlockC;
	}

	public Order withSfbaseShowSFDCSignatureBlockC(
			Boolean sfbaseShowSFDCSignatureBlockC) {
		this.sfbaseShowSFDCSignatureBlockC = sfbaseShowSFDCSignatureBlockC;
		return this;
	}

	@JsonProperty("sfbase__SuppressActivationEmail__c")
	public Boolean getSfbaseSuppressActivationEmailC() {
		return sfbaseSuppressActivationEmailC;
	}

	@JsonProperty("sfbase__SuppressActivationEmail__c")
	public void setSfbaseSuppressActivationEmailC(
			Boolean sfbaseSuppressActivationEmailC) {
		this.sfbaseSuppressActivationEmailC = sfbaseSuppressActivationEmailC;
	}

	public Order withSfbaseSuppressActivationEmailC(
			Boolean sfbaseSuppressActivationEmailC) {
		this.sfbaseSuppressActivationEmailC = sfbaseSuppressActivationEmailC;
		return this;
	}

	@JsonProperty("sfbase__CMCode__c")
	public String getSfbaseCMCodeC() {
		return sfbaseCMCodeC;
	}

	@JsonProperty("sfbase__CMCode__c")
	public void setSfbaseCMCodeC(String sfbaseCMCodeC) {
		this.sfbaseCMCodeC = sfbaseCMCodeC;
	}

	public Order withSfbaseCMCodeC(String sfbaseCMCodeC) {
		this.sfbaseCMCodeC = sfbaseCMCodeC;
		return this;
	}

	@JsonProperty("sfbase__CMReason__c")
	public String getSfbaseCMReasonC() {
		return sfbaseCMReasonC;
	}

	@JsonProperty("sfbase__CMReason__c")
	public void setSfbaseCMReasonC(String sfbaseCMReasonC) {
		this.sfbaseCMReasonC = sfbaseCMReasonC;
	}

	public Order withSfbaseCMReasonC(String sfbaseCMReasonC) {
		this.sfbaseCMReasonC = sfbaseCMReasonC;
		return this;
	}

	@JsonProperty("sfbase__IncrementalACVPct__c")
	public Double getSfbaseIncrementalACVPctC() {
		return sfbaseIncrementalACVPctC;
	}

	@JsonProperty("sfbase__IncrementalACVPct__c")
	public void setSfbaseIncrementalACVPctC(Double sfbaseIncrementalACVPctC) {
		this.sfbaseIncrementalACVPctC = sfbaseIncrementalACVPctC;
	}

	public Order withSfbaseIncrementalACVPctC(Double sfbaseIncrementalACVPctC) {
		this.sfbaseIncrementalACVPctC = sfbaseIncrementalACVPctC;
		return this;
	}

	@JsonProperty("sfbase__RMPct__c")
	public Double getSfbaseRMPctC() {
		return sfbaseRMPctC;
	}

	@JsonProperty("sfbase__RMPct__c")
	public void setSfbaseRMPctC(Double sfbaseRMPctC) {
		this.sfbaseRMPctC = sfbaseRMPctC;
	}

	public Order withSfbaseRMPctC(Double sfbaseRMPctC) {
		this.sfbaseRMPctC = sfbaseRMPctC;
		return this;
	}

	@JsonProperty("sfbase__SuppressProvisioning__c")
	public Boolean getSfbaseSuppressProvisioningC() {
		return sfbaseSuppressProvisioningC;
	}

	@JsonProperty("sfbase__SuppressProvisioning__c")
	public void setSfbaseSuppressProvisioningC(
			Boolean sfbaseSuppressProvisioningC) {
		this.sfbaseSuppressProvisioningC = sfbaseSuppressProvisioningC;
	}

	public Order withSfbaseSuppressProvisioningC(
			Boolean sfbaseSuppressProvisioningC) {
		this.sfbaseSuppressProvisioningC = sfbaseSuppressProvisioningC;
		return this;
	}

	@JsonProperty("sfbill__BillSeperately__c")
	public Boolean getSfbillBillSeperatelyC() {
		return sfbillBillSeperatelyC;
	}

	@JsonProperty("sfbill__BillSeperately__c")
	public void setSfbillBillSeperatelyC(Boolean sfbillBillSeperatelyC) {
		this.sfbillBillSeperatelyC = sfbillBillSeperatelyC;
	}

	public Order withSfbillBillSeperatelyC(Boolean sfbillBillSeperatelyC) {
		this.sfbillBillSeperatelyC = sfbillBillSeperatelyC;
		return this;
	}

	@JsonProperty("sfbill__CMHold__c")
	public Boolean getSfbillCMHoldC() {
		return sfbillCMHoldC;
	}

	@JsonProperty("sfbill__CMHold__c")
	public void setSfbillCMHoldC(Boolean sfbillCMHoldC) {
		this.sfbillCMHoldC = sfbillCMHoldC;
	}

	public Order withSfbillCMHoldC(Boolean sfbillCMHoldC) {
		this.sfbillCMHoldC = sfbillCMHoldC;
		return this;
	}

	@JsonProperty("sfbill__CashMovement__c")
	public Object getSfbillCashMovementC() {
		return sfbillCashMovementC;
	}

	@JsonProperty("sfbill__CashMovement__c")
	public void setSfbillCashMovementC(Object sfbillCashMovementC) {
		this.sfbillCashMovementC = sfbillCashMovementC;
	}

	public Order withSfbillCashMovementC(Object sfbillCashMovementC) {
		this.sfbillCashMovementC = sfbillCashMovementC;
		return this;
	}

	@JsonProperty("sfbill__ReportedRevImpact__c")
	public Object getSfbillReportedRevImpactC() {
		return sfbillReportedRevImpactC;
	}

	@JsonProperty("sfbill__ReportedRevImpact__c")
	public void setSfbillReportedRevImpactC(Object sfbillReportedRevImpactC) {
		this.sfbillReportedRevImpactC = sfbillReportedRevImpactC;
	}

	public Order withSfbillReportedRevImpactC(Object sfbillReportedRevImpactC) {
		this.sfbillReportedRevImpactC = sfbillReportedRevImpactC;
		return this;
	}

	@JsonProperty("Paid_Through_Date__c")
	public Object getPaidThroughDateC() {
		return paidThroughDateC;
	}

	@JsonProperty("Paid_Through_Date__c")
	public void setPaidThroughDateC(Object paidThroughDateC) {
		this.paidThroughDateC = paidThroughDateC;
	}

	public Order withPaidThroughDateC(Object paidThroughDateC) {
		this.paidThroughDateC = paidThroughDateC;
		return this;
	}

	@JsonProperty("sfbase__DealRelationshipNext__c")
	public String getSfbaseDealRelationshipNextC() {
		return sfbaseDealRelationshipNextC;
	}

	@JsonProperty("sfbase__DealRelationshipNext__c")
	public void setSfbaseDealRelationshipNextC(
			String sfbaseDealRelationshipNextC) {
		this.sfbaseDealRelationshipNextC = sfbaseDealRelationshipNextC;
	}

	public Order withSfbaseDealRelationshipNextC(
			String sfbaseDealRelationshipNextC) {
		this.sfbaseDealRelationshipNextC = sfbaseDealRelationshipNextC;
		return this;
	}

	@JsonProperty("sfbase__MarkForOrderTeamCreate__c")
	public Boolean getSfbaseMarkForOrderTeamCreateC() {
		return sfbaseMarkForOrderTeamCreateC;
	}

	@JsonProperty("sfbase__MarkForOrderTeamCreate__c")
	public void setSfbaseMarkForOrderTeamCreateC(
			Boolean sfbaseMarkForOrderTeamCreateC) {
		this.sfbaseMarkForOrderTeamCreateC = sfbaseMarkForOrderTeamCreateC;
	}

	public Order withSfbaseMarkForOrderTeamCreateC(
			Boolean sfbaseMarkForOrderTeamCreateC) {
		this.sfbaseMarkForOrderTeamCreateC = sfbaseMarkForOrderTeamCreateC;
		return this;
	}

	@JsonProperty("sfbase__Opportunity__c")
	public Object getSfbaseOpportunityC() {
		return sfbaseOpportunityC;
	}

	@JsonProperty("sfbase__Opportunity__c")
	public void setSfbaseOpportunityC(Object sfbaseOpportunityC) {
		this.sfbaseOpportunityC = sfbaseOpportunityC;
	}

	public Order withSfbaseOpportunityC(Object sfbaseOpportunityC) {
		this.sfbaseOpportunityC = sfbaseOpportunityC;
		return this;
	}

	@JsonProperty("sfbase__OrderCommissionableACV__c")
	public Double getSfbaseOrderCommissionableACVC() {
		return sfbaseOrderCommissionableACVC;
	}

	@JsonProperty("sfbase__OrderCommissionableACV__c")
	public void setSfbaseOrderCommissionableACVC(
			Double sfbaseOrderCommissionableACVC) {
		this.sfbaseOrderCommissionableACVC = sfbaseOrderCommissionableACVC;
	}

	public Order withSfbaseOrderCommissionableACVC(
			Double sfbaseOrderCommissionableACVC) {
		this.sfbaseOrderCommissionableACVC = sfbaseOrderCommissionableACVC;
		return this;
	}

	@JsonProperty("sfbase__OrderTeamErrorMessage__c")
	public String getSfbaseOrderTeamErrorMessageC() {
		return sfbaseOrderTeamErrorMessageC;
	}

	@JsonProperty("sfbase__OrderTeamErrorMessage__c")
	public void setSfbaseOrderTeamErrorMessageC(
			String sfbaseOrderTeamErrorMessageC) {
		this.sfbaseOrderTeamErrorMessageC = sfbaseOrderTeamErrorMessageC;
	}

	public Order withSfbaseOrderTeamErrorMessageC(
			String sfbaseOrderTeamErrorMessageC) {
		this.sfbaseOrderTeamErrorMessageC = sfbaseOrderTeamErrorMessageC;
		return this;
	}

	@JsonProperty("sfbase__OrderTeamStatus__c")
	public String getSfbaseOrderTeamStatusC() {
		return sfbaseOrderTeamStatusC;
	}

	@JsonProperty("sfbase__OrderTeamStatus__c")
	public void setSfbaseOrderTeamStatusC(String sfbaseOrderTeamStatusC) {
		this.sfbaseOrderTeamStatusC = sfbaseOrderTeamStatusC;
	}

	public Order withSfbaseOrderTeamStatusC(String sfbaseOrderTeamStatusC) {
		this.sfbaseOrderTeamStatusC = sfbaseOrderTeamStatusC;
		return this;
	}

	@JsonProperty("sfbase__DealRelationshipPrior__c")
	public String getSfbaseDealRelationshipPriorC() {
		return sfbaseDealRelationshipPriorC;
	}

	@JsonProperty("sfbase__DealRelationshipPrior__c")
	public void setSfbaseDealRelationshipPriorC(
			String sfbaseDealRelationshipPriorC) {
		this.sfbaseDealRelationshipPriorC = sfbaseDealRelationshipPriorC;
	}

	public Order withSfbaseDealRelationshipPriorC(
			String sfbaseDealRelationshipPriorC) {
		this.sfbaseDealRelationshipPriorC = sfbaseDealRelationshipPriorC;
		return this;
	}

	@JsonProperty("sfbase__Division__c")
	public Object getSfbaseDivisionC() {
		return sfbaseDivisionC;
	}

	@JsonProperty("sfbase__Division__c")
	public void setSfbaseDivisionC(Object sfbaseDivisionC) {
		this.sfbaseDivisionC = sfbaseDivisionC;
	}

	public Order withSfbaseDivisionC(Object sfbaseDivisionC) {
		this.sfbaseDivisionC = sfbaseDivisionC;
		return this;
	}

	@JsonProperty("sfbase__DocusignEnvelopeId__c")
	public Object getSfbaseDocusignEnvelopeIdC() {
		return sfbaseDocusignEnvelopeIdC;
	}

	@JsonProperty("sfbase__DocusignEnvelopeId__c")
	public void setSfbaseDocusignEnvelopeIdC(Object sfbaseDocusignEnvelopeIdC) {
		this.sfbaseDocusignEnvelopeIdC = sfbaseDocusignEnvelopeIdC;
	}

	public Order withSfbaseDocusignEnvelopeIdC(Object sfbaseDocusignEnvelopeIdC) {
		this.sfbaseDocusignEnvelopeIdC = sfbaseDocusignEnvelopeIdC;
		return this;
	}

	@JsonProperty("sfbase__DocusignEnvelopeStatus__c")
	public Object getSfbaseDocusignEnvelopeStatusC() {
		return sfbaseDocusignEnvelopeStatusC;
	}

	@JsonProperty("sfbase__DocusignEnvelopeStatus__c")
	public void setSfbaseDocusignEnvelopeStatusC(
			Object sfbaseDocusignEnvelopeStatusC) {
		this.sfbaseDocusignEnvelopeStatusC = sfbaseDocusignEnvelopeStatusC;
	}

	public Order withSfbaseDocusignEnvelopeStatusC(
			Object sfbaseDocusignEnvelopeStatusC) {
		this.sfbaseDocusignEnvelopeStatusC = sfbaseDocusignEnvelopeStatusC;
		return this;
	}

	@JsonProperty("sfbase__PartnerProvisioningDate__c")
	public Object getSfbasePartnerProvisioningDateC() {
		return sfbasePartnerProvisioningDateC;
	}

	@JsonProperty("sfbase__PartnerProvisioningDate__c")
	public void setSfbasePartnerProvisioningDateC(
			Object sfbasePartnerProvisioningDateC) {
		this.sfbasePartnerProvisioningDateC = sfbasePartnerProvisioningDateC;
	}

	public Order withSfbasePartnerProvisioningDateC(
			Object sfbasePartnerProvisioningDateC) {
		this.sfbasePartnerProvisioningDateC = sfbasePartnerProvisioningDateC;
		return this;
	}

	@JsonProperty("sfbase__SignedOnPaper__c")
	public Boolean getSfbaseSignedOnPaperC() {
		return sfbaseSignedOnPaperC;
	}

	@JsonProperty("sfbase__SignedOnPaper__c")
	public void setSfbaseSignedOnPaperC(Boolean sfbaseSignedOnPaperC) {
		this.sfbaseSignedOnPaperC = sfbaseSignedOnPaperC;
	}

	public Order withSfbaseSignedOnPaperC(Boolean sfbaseSignedOnPaperC) {
		this.sfbaseSignedOnPaperC = sfbaseSignedOnPaperC;
		return this;
	}

	@JsonProperty("sfom__EnvelopeSent__c")
	public Boolean getSfomEnvelopeSentC() {
		return sfomEnvelopeSentC;
	}

	@JsonProperty("sfom__EnvelopeSent__c")
	public void setSfomEnvelopeSentC(Boolean sfomEnvelopeSentC) {
		this.sfomEnvelopeSentC = sfomEnvelopeSentC;
	}

	public Order withSfomEnvelopeSentC(Boolean sfomEnvelopeSentC) {
		this.sfomEnvelopeSentC = sfomEnvelopeSentC;
		return this;
	}

	@JsonProperty("sfbase__OrderOwner__c")
	public Object getSfbaseOrderOwnerC() {
		return sfbaseOrderOwnerC;
	}

	@JsonProperty("sfbase__OrderOwner__c")
	public void setSfbaseOrderOwnerC(Object sfbaseOrderOwnerC) {
		this.sfbaseOrderOwnerC = sfbaseOrderOwnerC;
	}

	public Order withSfbaseOrderOwnerC(Object sfbaseOrderOwnerC) {
		this.sfbaseOrderOwnerC = sfbaseOrderOwnerC;
		return this;
	}

	@JsonProperty("sfbase__CEOHold__c")
	public Boolean getSfbaseCEOHoldC() {
		return sfbaseCEOHoldC;
	}

	@JsonProperty("sfbase__CEOHold__c")
	public void setSfbaseCEOHoldC(Boolean sfbaseCEOHoldC) {
		this.sfbaseCEOHoldC = sfbaseCEOHoldC;
	}

	public Order withSfbaseCEOHoldC(Boolean sfbaseCEOHoldC) {
		this.sfbaseCEOHoldC = sfbaseCEOHoldC;
		return this;
	}

	@JsonProperty("sfbase__DealCurrency__c")
	public Object getSfbaseDealCurrencyC() {
		return sfbaseDealCurrencyC;
	}

	@JsonProperty("sfbase__DealCurrency__c")
	public void setSfbaseDealCurrencyC(Object sfbaseDealCurrencyC) {
		this.sfbaseDealCurrencyC = sfbaseDealCurrencyC;
	}

	public Order withSfbaseDealCurrencyC(Object sfbaseDealCurrencyC) {
		this.sfbaseDealCurrencyC = sfbaseDealCurrencyC;
		return this;
	}

	@JsonProperty("sfbase__IsActivatedAfterDealCalculations__c")
	public Boolean getSfbaseIsActivatedAfterDealCalculationsC() {
		return sfbaseIsActivatedAfterDealCalculationsC;
	}

	@JsonProperty("sfbase__IsActivatedAfterDealCalculations__c")
	public void setSfbaseIsActivatedAfterDealCalculationsC(
			Boolean sfbaseIsActivatedAfterDealCalculationsC) {
		this.sfbaseIsActivatedAfterDealCalculationsC = sfbaseIsActivatedAfterDealCalculationsC;
	}

	public Order withSfbaseIsActivatedAfterDealCalculationsC(
			Boolean sfbaseIsActivatedAfterDealCalculationsC) {
		this.sfbaseIsActivatedAfterDealCalculationsC = sfbaseIsActivatedAfterDealCalculationsC;
		return this;
	}

	@JsonProperty("sfbase__NewMonthlyNumericValue__c")
	public Object getSfbaseNewMonthlyNumericValueC() {
		return sfbaseNewMonthlyNumericValueC;
	}

	@JsonProperty("sfbase__NewMonthlyNumericValue__c")
	public void setSfbaseNewMonthlyNumericValueC(
			Object sfbaseNewMonthlyNumericValueC) {
		this.sfbaseNewMonthlyNumericValueC = sfbaseNewMonthlyNumericValueC;
	}

	public Order withSfbaseNewMonthlyNumericValueC(
			Object sfbaseNewMonthlyNumericValueC) {
		this.sfbaseNewMonthlyNumericValueC = sfbaseNewMonthlyNumericValueC;
		return this;
	}

	@JsonProperty("sfbase__NewWeightedAverageTerm__c")
	public Object getSfbaseNewWeightedAverageTermC() {
		return sfbaseNewWeightedAverageTermC;
	}

	@JsonProperty("sfbase__NewWeightedAverageTerm__c")
	public void setSfbaseNewWeightedAverageTermC(
			Object sfbaseNewWeightedAverageTermC) {
		this.sfbaseNewWeightedAverageTermC = sfbaseNewWeightedAverageTermC;
	}

	public Order withSfbaseNewWeightedAverageTermC(
			Object sfbaseNewWeightedAverageTermC) {
		this.sfbaseNewWeightedAverageTermC = sfbaseNewWeightedAverageTermC;
		return this;
	}

	@JsonProperty("sfbase__NextDealStatus__c")
	public Object getSfbaseNextDealStatusC() {
		return sfbaseNextDealStatusC;
	}

	@JsonProperty("sfbase__NextDealStatus__c")
	public void setSfbaseNextDealStatusC(Object sfbaseNextDealStatusC) {
		this.sfbaseNextDealStatusC = sfbaseNextDealStatusC;
	}

	public Order withSfbaseNextDealStatusC(Object sfbaseNextDealStatusC) {
		this.sfbaseNextDealStatusC = sfbaseNextDealStatusC;
		return this;
	}

	@JsonProperty("sfbase__NextTransferDeal__c")
	public Object getSfbaseNextTransferDealC() {
		return sfbaseNextTransferDealC;
	}

	@JsonProperty("sfbase__NextTransferDeal__c")
	public void setSfbaseNextTransferDealC(Object sfbaseNextTransferDealC) {
		this.sfbaseNextTransferDealC = sfbaseNextTransferDealC;
	}

	public Order withSfbaseNextTransferDealC(Object sfbaseNextTransferDealC) {
		this.sfbaseNextTransferDealC = sfbaseNextTransferDealC;
		return this;
	}

	@JsonProperty("sfbase__OldMonthlyNumericValue__c")
	public Object getSfbaseOldMonthlyNumericValueC() {
		return sfbaseOldMonthlyNumericValueC;
	}

	@JsonProperty("sfbase__OldMonthlyNumericValue__c")
	public void setSfbaseOldMonthlyNumericValueC(
			Object sfbaseOldMonthlyNumericValueC) {
		this.sfbaseOldMonthlyNumericValueC = sfbaseOldMonthlyNumericValueC;
	}

	public Order withSfbaseOldMonthlyNumericValueC(
			Object sfbaseOldMonthlyNumericValueC) {
		this.sfbaseOldMonthlyNumericValueC = sfbaseOldMonthlyNumericValueC;
		return this;
	}

	@JsonProperty("sfbase__OldWeightedAverageRemainingTerm__c")
	public Object getSfbaseOldWeightedAverageRemainingTermC() {
		return sfbaseOldWeightedAverageRemainingTermC;
	}

	@JsonProperty("sfbase__OldWeightedAverageRemainingTerm__c")
	public void setSfbaseOldWeightedAverageRemainingTermC(
			Object sfbaseOldWeightedAverageRemainingTermC) {
		this.sfbaseOldWeightedAverageRemainingTermC = sfbaseOldWeightedAverageRemainingTermC;
	}

	public Order withSfbaseOldWeightedAverageRemainingTermC(
			Object sfbaseOldWeightedAverageRemainingTermC) {
		this.sfbaseOldWeightedAverageRemainingTermC = sfbaseOldWeightedAverageRemainingTermC;
		return this;
	}

	@JsonProperty("sfbase__OldWeightedAverageTerm__c")
	public Object getSfbaseOldWeightedAverageTermC() {
		return sfbaseOldWeightedAverageTermC;
	}

	@JsonProperty("sfbase__OldWeightedAverageTerm__c")
	public void setSfbaseOldWeightedAverageTermC(
			Object sfbaseOldWeightedAverageTermC) {
		this.sfbaseOldWeightedAverageTermC = sfbaseOldWeightedAverageTermC;
	}

	public Order withSfbaseOldWeightedAverageTermC(
			Object sfbaseOldWeightedAverageTermC) {
		this.sfbaseOldWeightedAverageTermC = sfbaseOldWeightedAverageTermC;
		return this;
	}

	@JsonProperty("sfbase__PriorTransferDeal__c")
	public Object getSfbasePriorTransferDealC() {
		return sfbasePriorTransferDealC;
	}

	@JsonProperty("sfbase__PriorTransferDeal__c")
	public void setSfbasePriorTransferDealC(Object sfbasePriorTransferDealC) {
		this.sfbasePriorTransferDealC = sfbasePriorTransferDealC;
	}

	public Order withSfbasePriorTransferDealC(Object sfbasePriorTransferDealC) {
		this.sfbasePriorTransferDealC = sfbasePriorTransferDealC;
		return this;
	}

	@JsonProperty("External_ID__c")
	public Object getExternalIDC() {
		return externalIDC;
	}

	@JsonProperty("External_ID__c")
	public void setExternalIDC(Object externalIDC) {
		this.externalIDC = externalIDC;
	}

	public Order withExternalIDC(Object externalIDC) {
		this.externalIDC = externalIDC;
		return this;
	}

	@JsonProperty("sfbase__Brand__c")
	public String getSfbaseBrandC() {
		return sfbaseBrandC;
	}

	@JsonProperty("sfbase__Brand__c")
	public void setSfbaseBrandC(String sfbaseBrandC) {
		this.sfbaseBrandC = sfbaseBrandC;
	}

	public Order withSfbaseBrandC(String sfbaseBrandC) {
		this.sfbaseBrandC = sfbaseBrandC;
		return this;
	}

	@JsonProperty("isDeclarativeLicenseOrder__c")
	public Boolean getIsDeclarativeLicenseOrderC() {
		return isDeclarativeLicenseOrderC;
	}

	@JsonProperty("isDeclarativeLicenseOrder__c")
	public void setIsDeclarativeLicenseOrderC(Boolean isDeclarativeLicenseOrderC) {
		this.isDeclarativeLicenseOrderC = isDeclarativeLicenseOrderC;
	}

	public Order withIsDeclarativeLicenseOrderC(
			Boolean isDeclarativeLicenseOrderC) {
		this.isDeclarativeLicenseOrderC = isDeclarativeLicenseOrderC;
		return this;
	}

	@JsonProperty("Order_Item_Licensing_Map__c")
	public Object getOrderItemLicensingMapC() {
		return orderItemLicensingMapC;
	}

	@JsonProperty("Order_Item_Licensing_Map__c")
	public void setOrderItemLicensingMapC(Object orderItemLicensingMapC) {
		this.orderItemLicensingMapC = orderItemLicensingMapC;
	}

	public Order withOrderItemLicensingMapC(Object orderItemLicensingMapC) {
		this.orderItemLicensingMapC = orderItemLicensingMapC;
		return this;
	}

	@JsonProperty("ManualTransferComments__c")
	public Object getManualTransferCommentsC() {
		return manualTransferCommentsC;
	}

	@JsonProperty("ManualTransferComments__c")
	public void setManualTransferCommentsC(Object manualTransferCommentsC) {
		this.manualTransferCommentsC = manualTransferCommentsC;
	}

	public Order withManualTransferCommentsC(Object manualTransferCommentsC) {
		this.manualTransferCommentsC = manualTransferCommentsC;
		return this;
	}

	@JsonProperty("ManualTransferReason__c")
	public Object getManualTransferReasonC() {
		return manualTransferReasonC;
	}

	@JsonProperty("ManualTransferReason__c")
	public void setManualTransferReasonC(Object manualTransferReasonC) {
		this.manualTransferReasonC = manualTransferReasonC;
	}

	public Order withManualTransferReasonC(Object manualTransferReasonC) {
		this.manualTransferReasonC = manualTransferReasonC;
		return this;
	}

	@JsonProperty("ReplacementOrder__c")
	public Object getReplacementOrderC() {
		return replacementOrderC;
	}

	@JsonProperty("ReplacementOrder__c")
	public void setReplacementOrderC(Object replacementOrderC) {
		this.replacementOrderC = replacementOrderC;
	}

	public Order withReplacementOrderC(Object replacementOrderC) {
		this.replacementOrderC = replacementOrderC;
		return this;
	}

	@JsonProperty("DoNotCommission__c")
	public Boolean getDoNotCommissionC() {
		return doNotCommissionC;
	}

	@JsonProperty("DoNotCommission__c")
	public void setDoNotCommissionC(Boolean doNotCommissionC) {
		this.doNotCommissionC = doNotCommissionC;
	}

	public Order withDoNotCommissionC(Boolean doNotCommissionC) {
		this.doNotCommissionC = doNotCommissionC;
		return this;
	}

	@JsonProperty("PartnerOrder__c")
	public Object getPartnerOrderC() {
		return partnerOrderC;
	}

	@JsonProperty("PartnerOrder__c")
	public void setPartnerOrderC(Object partnerOrderC) {
		this.partnerOrderC = partnerOrderC;
	}

	public Order withPartnerOrderC(Object partnerOrderC) {
		this.partnerOrderC = partnerOrderC;
		return this;
	}

	@JsonProperty("FDOEvalDate__c")
	public Object getFDOEvalDateC() {
		return fDOEvalDateC;
	}

	@JsonProperty("FDOEvalDate__c")
	public void setFDOEvalDateC(Object fDOEvalDateC) {
		this.fDOEvalDateC = fDOEvalDateC;
	}

	public Order withFDOEvalDateC(Object fDOEvalDateC) {
		this.fDOEvalDateC = fDOEvalDateC;
		return this;
	}

	@JsonProperty("FDOEvalDueDate__c")
	public Object getFDOEvalDueDateC() {
		return fDOEvalDueDateC;
	}

	@JsonProperty("FDOEvalDueDate__c")
	public void setFDOEvalDueDateC(Object fDOEvalDueDateC) {
		this.fDOEvalDueDateC = fDOEvalDueDateC;
	}

	public Order withFDOEvalDueDateC(Object fDOEvalDueDateC) {
		this.fDOEvalDueDateC = fDOEvalDueDateC;
		return this;
	}

	@JsonProperty("FDOEvalStatus__c")
	public String getFDOEvalStatusC() {
		return fDOEvalStatusC;
	}

	@JsonProperty("FDOEvalStatus__c")
	public void setFDOEvalStatusC(String fDOEvalStatusC) {
		this.fDOEvalStatusC = fDOEvalStatusC;
	}

	public Order withFDOEvalStatusC(String fDOEvalStatusC) {
		this.fDOEvalStatusC = fDOEvalStatusC;
		return this;
	}

	@JsonProperty("FDOProcessingMessage__c")
	public Object getFDOProcessingMessageC() {
		return fDOProcessingMessageC;
	}

	@JsonProperty("FDOProcessingMessage__c")
	public void setFDOProcessingMessageC(Object fDOProcessingMessageC) {
		this.fDOProcessingMessageC = fDOProcessingMessageC;
	}

	public Order withFDOProcessingMessageC(Object fDOProcessingMessageC) {
		this.fDOProcessingMessageC = fDOProcessingMessageC;
		return this;
	}

	@JsonProperty("SuppressManagerCrediting__c")
	public Boolean getSuppressManagerCreditingC() {
		return suppressManagerCreditingC;
	}

	@JsonProperty("SuppressManagerCrediting__c")
	public void setSuppressManagerCreditingC(Boolean suppressManagerCreditingC) {
		this.suppressManagerCreditingC = suppressManagerCreditingC;
	}

	public Order withSuppressManagerCreditingC(Boolean suppressManagerCreditingC) {
		this.suppressManagerCreditingC = suppressManagerCreditingC;
		return this;
	}

	@JsonProperty("Attempted_Convert_2_Asset__c")
	public Boolean getAttemptedConvert2AssetC() {
		return attemptedConvert2AssetC;
	}

	@JsonProperty("Attempted_Convert_2_Asset__c")
	public void setAttemptedConvert2AssetC(Boolean attemptedConvert2AssetC) {
		this.attemptedConvert2AssetC = attemptedConvert2AssetC;
	}

	public Order withAttemptedConvert2AssetC(Boolean attemptedConvert2AssetC) {
		this.attemptedConvert2AssetC = attemptedConvert2AssetC;
		return this;
	}

	@JsonProperty("Processed_for_Convert_to_Asset__c")
	public Boolean getProcessedForConvertToAssetC() {
		return processedForConvertToAssetC;
	}

	@JsonProperty("Processed_for_Convert_to_Asset__c")
	public void setProcessedForConvertToAssetC(
			Boolean processedForConvertToAssetC) {
		this.processedForConvertToAssetC = processedForConvertToAssetC;
	}

	public Order withProcessedForConvertToAssetC(
			Boolean processedForConvertToAssetC) {
		this.processedForConvertToAssetC = processedForConvertToAssetC;
		return this;
	}

	@JsonProperty("SfdcDerived_Product_Type__c")
	public Object getSfdcDerivedProductTypeC() {
		return sfdcDerivedProductTypeC;
	}

	@JsonProperty("SfdcDerived_Product_Type__c")
	public void setSfdcDerivedProductTypeC(Object sfdcDerivedProductTypeC) {
		this.sfdcDerivedProductTypeC = sfdcDerivedProductTypeC;
	}

	public Order withSfdcDerivedProductTypeC(Object sfdcDerivedProductTypeC) {
		this.sfdcDerivedProductTypeC = sfdcDerivedProductTypeC;
		return this;
	}

	@JsonProperty("SfdcIsDerivedOrder__c")
	public Boolean getSfdcIsDerivedOrderC() {
		return sfdcIsDerivedOrderC;
	}

	@JsonProperty("SfdcIsDerivedOrder__c")
	public void setSfdcIsDerivedOrderC(Boolean sfdcIsDerivedOrderC) {
		this.sfdcIsDerivedOrderC = sfdcIsDerivedOrderC;
	}

	public Order withSfdcIsDerivedOrderC(Boolean sfdcIsDerivedOrderC) {
		this.sfdcIsDerivedOrderC = sfdcIsDerivedOrderC;
		return this;
	}

	@JsonProperty("SfdcRelatedQuote__c")
	public Object getSfdcRelatedQuoteC() {
		return sfdcRelatedQuoteC;
	}

	@JsonProperty("SfdcRelatedQuote__c")
	public void setSfdcRelatedQuoteC(Object sfdcRelatedQuoteC) {
		this.sfdcRelatedQuoteC = sfdcRelatedQuoteC;
	}

	public Order withSfdcRelatedQuoteC(Object sfdcRelatedQuoteC) {
		this.sfdcRelatedQuoteC = sfdcRelatedQuoteC;
		return this;
	}

	@JsonProperty("SfdcShowAnnualPricingSummary__c")
	public Boolean getSfdcShowAnnualPricingSummaryC() {
		return sfdcShowAnnualPricingSummaryC;
	}

	@JsonProperty("SfdcShowAnnualPricingSummary__c")
	public void setSfdcShowAnnualPricingSummaryC(
			Boolean sfdcShowAnnualPricingSummaryC) {
		this.sfdcShowAnnualPricingSummaryC = sfdcShowAnnualPricingSummaryC;
	}

	public Order withSfdcShowAnnualPricingSummaryC(
			Boolean sfdcShowAnnualPricingSummaryC) {
		this.sfdcShowAnnualPricingSummaryC = sfdcShowAnnualPricingSummaryC;
		return this;
	}

	@JsonProperty("MaxPrimaryLineNumber__c")
	public Double getMaxPrimaryLineNumberC() {
		return maxPrimaryLineNumberC;
	}

	@JsonProperty("MaxPrimaryLineNumber__c")
	public void setMaxPrimaryLineNumberC(Double maxPrimaryLineNumberC) {
		this.maxPrimaryLineNumberC = maxPrimaryLineNumberC;
	}

	public Order withMaxPrimaryLineNumberC(Double maxPrimaryLineNumberC) {
		this.maxPrimaryLineNumberC = maxPrimaryLineNumberC;
		return this;
	}

	@JsonProperty("Automation_Field__c")
	public Object getAutomationFieldC() {
		return automationFieldC;
	}

	@JsonProperty("Automation_Field__c")
	public void setAutomationFieldC(Object automationFieldC) {
		this.automationFieldC = automationFieldC;
	}

	public Order withAutomationFieldC(Object automationFieldC) {
		this.automationFieldC = automationFieldC;
		return this;
	}

	@JsonProperty("Process_SCE__c")
	public Boolean getProcessSCEC() {
		return processSCEC;
	}

	@JsonProperty("Process_SCE__c")
	public void setProcessSCEC(Boolean processSCEC) {
		this.processSCEC = processSCEC;
	}

	public Order withProcessSCEC(Boolean processSCEC) {
		this.processSCEC = processSCEC;
		return this;
	}

	@JsonProperty("Voucher_Code__c")
	public Object getVoucherCodeC() {
		return voucherCodeC;
	}

	@JsonProperty("Voucher_Code__c")
	public void setVoucherCodeC(Object voucherCodeC) {
		this.voucherCodeC = voucherCodeC;
	}

	public Order withVoucherCodeC(Object voucherCodeC) {
		this.voucherCodeC = voucherCodeC;
		return this;
	}

	@JsonProperty("OverrideOrderSubtypeRules__c")
	public Boolean getOverrideOrderSubtypeRulesC() {
		return overrideOrderSubtypeRulesC;
	}

	@JsonProperty("OverrideOrderSubtypeRules__c")
	public void setOverrideOrderSubtypeRulesC(Boolean overrideOrderSubtypeRulesC) {
		this.overrideOrderSubtypeRulesC = overrideOrderSubtypeRulesC;
	}

	public Order withOverrideOrderSubtypeRulesC(
			Boolean overrideOrderSubtypeRulesC) {
		this.overrideOrderSubtypeRulesC = overrideOrderSubtypeRulesC;
		return this;
	}

	@JsonProperty("EvaluateRamp__c")
	public Boolean getEvaluateRampC() {
		return evaluateRampC;
	}

	@JsonProperty("EvaluateRamp__c")
	public void setEvaluateRampC(Boolean evaluateRampC) {
		this.evaluateRampC = evaluateRampC;
	}

	public Order withEvaluateRampC(Boolean evaluateRampC) {
		this.evaluateRampC = evaluateRampC;
		return this;
	}

	@JsonProperty("IsOverageOrder__c")
	public Boolean getIsOverageOrderC() {
		return isOverageOrderC;
	}

	@JsonProperty("IsOverageOrder__c")
	public void setIsOverageOrderC(Boolean isOverageOrderC) {
		this.isOverageOrderC = isOverageOrderC;
	}

	public Order withIsOverageOrderC(Boolean isOverageOrderC) {
		this.isOverageOrderC = isOverageOrderC;
		return this;
	}

	@JsonProperty("Ramp__c")
	public Object getRampC() {
		return rampC;
	}

	@JsonProperty("Ramp__c")
	public void setRampC(Object rampC) {
		this.rampC = rampC;
	}

	public Order withRampC(Object rampC) {
		this.rampC = rampC;
		return this;
	}

	@JsonProperty("DealRampNext__c")
	public Object getDealRampNextC() {
		return dealRampNextC;
	}

	@JsonProperty("DealRampNext__c")
	public void setDealRampNextC(Object dealRampNextC) {
		this.dealRampNextC = dealRampNextC;
	}

	public Order withDealRampNextC(Object dealRampNextC) {
		this.dealRampNextC = dealRampNextC;
		return this;
	}

	@JsonProperty("DealRampPrior__c")
	public Object getDealRampPriorC() {
		return dealRampPriorC;
	}

	@JsonProperty("DealRampPrior__c")
	public void setDealRampPriorC(Object dealRampPriorC) {
		this.dealRampPriorC = dealRampPriorC;
	}

	public Order withDealRampPriorC(Object dealRampPriorC) {
		this.dealRampPriorC = dealRampPriorC;
		return this;
	}

	@JsonProperty("RampOrderNext__c")
	public Object getRampOrderNextC() {
		return rampOrderNextC;
	}

	@JsonProperty("RampOrderNext__c")
	public void setRampOrderNextC(Object rampOrderNextC) {
		this.rampOrderNextC = rampOrderNextC;
	}

	public Order withRampOrderNextC(Object rampOrderNextC) {
		this.rampOrderNextC = rampOrderNextC;
		return this;
	}

	@JsonProperty("RampOrderPrior__c")
	public Object getRampOrderPriorC() {
		return rampOrderPriorC;
	}

	@JsonProperty("RampOrderPrior__c")
	public void setRampOrderPriorC(Object rampOrderPriorC) {
		this.rampOrderPriorC = rampOrderPriorC;
	}

	public Order withRampOrderPriorC(Object rampOrderPriorC) {
		this.rampOrderPriorC = rampOrderPriorC;
		return this;
	}

	@JsonProperty("RampProcessHold__c")
	public Boolean getRampProcessHoldC() {
		return rampProcessHoldC;
	}

	@JsonProperty("RampProcessHold__c")
	public void setRampProcessHoldC(Boolean rampProcessHoldC) {
		this.rampProcessHoldC = rampProcessHoldC;
	}

	public Order withRampProcessHoldC(Boolean rampProcessHoldC) {
		this.rampProcessHoldC = rampProcessHoldC;
		return this;
	}

	@JsonProperty("RampProcessingMessage__c")
	public Object getRampProcessingMessageC() {
		return rampProcessingMessageC;
	}

	@JsonProperty("RampProcessingMessage__c")
	public void setRampProcessingMessageC(Object rampProcessingMessageC) {
		this.rampProcessingMessageC = rampProcessingMessageC;
	}

	public Order withRampProcessingMessageC(Object rampProcessingMessageC) {
		this.rampProcessingMessageC = rampProcessingMessageC;
		return this;
	}

	@JsonProperty("RampStatus__c")
	public Object getRampStatusC() {
		return rampStatusC;
	}

	@JsonProperty("RampStatus__c")
	public void setRampStatusC(Object rampStatusC) {
		this.rampStatusC = rampStatusC;
	}

	public Order withRampStatusC(Object rampStatusC) {
		this.rampStatusC = rampStatusC;
		return this;
	}

	@JsonProperty("DealSwapNext__c")
	public Object getDealSwapNextC() {
		return dealSwapNextC;
	}

	@JsonProperty("DealSwapNext__c")
	public void setDealSwapNextC(Object dealSwapNextC) {
		this.dealSwapNextC = dealSwapNextC;
	}

	public Order withDealSwapNextC(Object dealSwapNextC) {
		this.dealSwapNextC = dealSwapNextC;
		return this;
	}

	@JsonProperty("DealSwapPrior__c")
	public Object getDealSwapPriorC() {
		return dealSwapPriorC;
	}

	@JsonProperty("DealSwapPrior__c")
	public void setDealSwapPriorC(Object dealSwapPriorC) {
		this.dealSwapPriorC = dealSwapPriorC;
	}

	public Order withDealSwapPriorC(Object dealSwapPriorC) {
		this.dealSwapPriorC = dealSwapPriorC;
		return this;
	}

	@JsonProperty("ApplicableToRms__c")
	public Boolean getApplicableToRmsC() {
		return applicableToRmsC;
	}

	@JsonProperty("ApplicableToRms__c")
	public void setApplicableToRmsC(Boolean applicableToRmsC) {
		this.applicableToRmsC = applicableToRmsC;
	}

	public Order withApplicableToRmsC(Boolean applicableToRmsC) {
		this.applicableToRmsC = applicableToRmsC;
		return this;
	}

	@JsonProperty("ContractModNumber__c")
	public Object getContractModNumberC() {
		return contractModNumberC;
	}

	@JsonProperty("ContractModNumber__c")
	public void setContractModNumberC(Object contractModNumberC) {
		this.contractModNumberC = contractModNumberC;
	}

	public Order withContractModNumberC(Object contractModNumberC) {
		this.contractModNumberC = contractModNumberC;
		return this;
	}

	@JsonProperty("ContractModType__c")
	public Object getContractModTypeC() {
		return contractModTypeC;
	}

	@JsonProperty("ContractModType__c")
	public void setContractModTypeC(Object contractModTypeC) {
		this.contractModTypeC = contractModTypeC;
	}

	public Order withContractModTypeC(Object contractModTypeC) {
		this.contractModTypeC = contractModTypeC;
		return this;
	}

	@JsonProperty("PresentInRms__c")
	public Boolean getPresentInRmsC() {
		return presentInRmsC;
	}

	@JsonProperty("PresentInRms__c")
	public void setPresentInRmsC(Boolean presentInRmsC) {
		this.presentInRmsC = presentInRmsC;
	}

	public Order withPresentInRmsC(Boolean presentInRmsC) {
		this.presentInRmsC = presentInRmsC;
		return this;
	}

	@JsonProperty("ReasonNotApplicableToRms__c")
	public Object getReasonNotApplicableToRmsC() {
		return reasonNotApplicableToRmsC;
	}

	@JsonProperty("ReasonNotApplicableToRms__c")
	public void setReasonNotApplicableToRmsC(Object reasonNotApplicableToRmsC) {
		this.reasonNotApplicableToRmsC = reasonNotApplicableToRmsC;
	}

	public Order withReasonNotApplicableToRmsC(Object reasonNotApplicableToRmsC) {
		this.reasonNotApplicableToRmsC = reasonNotApplicableToRmsC;
		return this;
	}

	@JsonProperty("SyncWithRms__c")
	public Boolean getSyncWithRmsC() {
		return syncWithRmsC;
	}

	@JsonProperty("SyncWithRms__c")
	public void setSyncWithRmsC(Boolean syncWithRmsC) {
		this.syncWithRmsC = syncWithRmsC;
	}

	public Order withSyncWithRmsC(Boolean syncWithRmsC) {
		this.syncWithRmsC = syncWithRmsC;
		return this;
	}

	@JsonProperty("PriorPeriodProcessed__c")
	public Boolean getPriorPeriodProcessedC() {
		return priorPeriodProcessedC;
	}

	@JsonProperty("PriorPeriodProcessed__c")
	public void setPriorPeriodProcessedC(Boolean priorPeriodProcessedC) {
		this.priorPeriodProcessedC = priorPeriodProcessedC;
	}

	public Order withPriorPeriodProcessedC(Boolean priorPeriodProcessedC) {
		this.priorPeriodProcessedC = priorPeriodProcessedC;
		return this;
	}

	@JsonProperty("CreatePo__c")
	public Boolean getCreatePoC() {
		return createPoC;
	}

	@JsonProperty("CreatePo__c")
	public void setCreatePoC(Boolean createPoC) {
		this.createPoC = createPoC;
	}

	public Order withCreatePoC(Boolean createPoC) {
		this.createPoC = createPoC;
		return this;
	}

	@JsonProperty("PoTracker__c")
	public Object getPoTrackerC() {
		return poTrackerC;
	}

	@JsonProperty("PoTracker__c")
	public void setPoTrackerC(Object poTrackerC) {
		this.poTrackerC = poTrackerC;
	}

	public Order withPoTrackerC(Object poTrackerC) {
		this.poTrackerC = poTrackerC;
		return this;
	}

	@JsonProperty("OrderItems")
	public OrderItems getOrderItems() {
		return orderItems;
	}

	@JsonProperty("OrderItems")
	public void setOrderItems(OrderItems orderItems) {
		this.orderItems = orderItems;
	}

	public Order withOrderItems(OrderItems orderItems) {
		this.orderItems = orderItems;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Order withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object other) {
		return EqualsBuilder.reflectionEquals(this, other);
	}

}
