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
@JsonPropertyOrder({ "attributes", "Id", "Product2Id", "IsDeleted", "OrderId",
		"PricebookEntryId", "OriginalOrderItemId", "QuoteLineItemId",
		"OriginalOrderItemQuantity", "RenewalOrderItemId", "IsPriceLocked",
		"NeedsRenewal", "Quantity", "CurrencyIsoCode", "UnitPrice",
		"ListPrice", "BillingReference", "ServiceDate", "EndDate",
		"Description", "InternalComments", "RelatedCeoNum", "OrdLineAddQty",
		"RelatedOppty", "ProvisioningTargetId", "ProvisioningStatus",
		"ProvisionedDateTime", "ProcessingBatchNumber", "CreatedDate",
		"CreatedById", "LastModifiedDate", "LastModifiedById",
		"SystemModstamp", "MayEdit", "IsLocked", "OrderItemNumber",
		"Restricted_Language__c", "Order_Line_Type__c",
		"sfbase__X90_Day_Rule__c", "sfbase__Product_Swap__c",
		"sfbase__Order_Line_Change__c", "sfbase__OrderItemTermMonths__c",
		"sfbase__OrderItemEffectiveDate__c", "sfbase__OrderItemLTV__c",
		"sfbase__SfdcProvStatus__c", "sfbase__SfdcProvDate__c",
		"sfbase__PartnerProvStatus__c", "sfbase__PartnerProvDate__c",
		"sfbase__OrderItemEndDate__c", "sfbase__OrderItemTermDays__c",
		"sfbase__SFDCProvisionGEO__c", "sfbase__PartnerProvisionGEO__c",
		"sfbase__OrdItmAddQtyRev__c", "sfbase__DailyValue__c",
		"sfbase__MonthlyListPrice__c", "sfbase__MonthlyNetPrice__c",
		"sfbase__PreviousOrderItemId__c", "sfbill__BillFromDate__c",
		"sfbill__BillThroughDate__c", "sfbill__IsFullyReduced__c",
		"sfbase__AutoRenewalQuantity__c", "sfbase__AvailableQuantity__c",
		"sfbase__IsAutoRenewed__c", "sfbase__MonthlyUnitPrice__c",
		"sfbase__CMEndDate__c", "Product_ACV__c", "Product_ACV_SP1__c",
		"Product_ACV_SP2__c", "Product_ACV_SP3__c", "Product_ACV_SP4__c",
		"sfbase__SFDCProvisionGEO_GUI__c",
		"sfbase__CustomerProvisioningDate__c", "sfbase__ACVEndDate__c",
		"sfbase__PrimarySalesOrderItemId__c", "sfbase__RenewalDeltaQty__c",
		"sfbase__RenewalAttritionCEO__c", "sfbase__ExpirationAttritionCEO__c",
		"sfbase__CEOFollowupReason__c", "sfbill__TotalBillable__c",
		"sfbill__TotalBilled__c", "sfbill__CreditMemoAmount__c",
		"ConversionOrderItemId__c", "PHXStartDate__c", "PHXTermDays__c",
		"PHXTermMonths__c", "PHXOrderItemLTV__c", "PHXDailyValue__c",
		"ConversionOrderItem__c", "ConversionOrderItemPHX__c",
		"RevenueExternalSystemRef__c", "Primary_CEO__c",
		"Attrition_Quantity__c", "Total_Amount__c", "Rejected__c",
		"Rejected_Reason__c", "Compliance_Comments__c", "Adjustment_Team__c",
		"TACV_Attrition_Required__c", "ErrorText__c", "hasError__c",
		"Trailing_ACV_CEO__c", "sfbase__Partner_Fee__c",
		"sfbase__CompensationEndDate__c", "sfbase__OrderTermCompensation__c",
		"sfbase__PromoCode__c", "sfbase__PartnerUnitPrice__c",
		"sfbase__Entitlement__c", "sfbase__TotalCreditMemoTerm__c",
		"sfbill__CMStatus__c", "sfbill__CMTriggerDatetime__c",
		"sfbase__ElaUnitPrice__c", "sfbase__ShortTermOrder__c",
		"sfbase__ProductBillingFrequency__c", "sfbase__BillingRevenueModel__c",
		"sfbill__DoNotBill__c", "External_ID__c",
		"sfbase__ExternalTenantId__c", "sfbase__ExternalTenantName__c",
		"sfbase__ExternalTenantOwner__c", "TenantData__c", "OTVCriteria__c",
		"NCO__c", "OpptyOwnerEmail__c", "OpptyOwnerNotified__c",
		"Annual_Value__c", "AccountLocation__c", "AgreementPriceRule__c",
		"ParentOrderItem__c", "ParentProduct__c", "PriceListItem__c",
		"createAssetLine__c", "AssetLineId__c", "ConfigurationType__c",
		"BusinessUnit__c", "Cloud__c", "CostCenter__c", "GeneralLedger__c",
		"Channel__c", "ComponentQuantityFactor__c", "DerivedFrom__c",
		"Eligible_for_Delight_Data_Conversion__c", "ParentBundleNumber__c",
		"PreviousOrderItem__c", "PrimaryLineNumber__c", "QuoteLinePrice__c",
		"RelatedQuoteLine__c", "RevenueAllocationPercentage__c",
		"SfdcHas_Inconsistent_Asset__c", "SfdcRenewFromAsset__c",
		"SourceAsset__c", "TransferItem__c", "updateAsset__c",
		"EntitlementUsageGroup__c", "MigrationSourceLineId__c",
		"Bookings_Treatment__c", "IsSharedUsage__c",
		"NormalizedMonthlyUnitPrice__c", "OverageRate__c",
		"sfbase__ProductBillingTreatment__c", "ApplicableToRms__c",
		"EvaluateReductionOrderItemForRMS__c", "ExtendedListPrice__c",
		"ExternalCloud__c", "ReasonNotApplicableToRms__c", "SyncWithRms__c",
		"CreatePo__c", "DPP_List_Price__c", "PoCorrespondent__c",
		"PoTracker__c" })
public class OrderItem implements Serializable {

	@JsonProperty("attributes")
	private Attributes attributes;
	@JsonProperty("Id")
	private String id;
	@JsonProperty("Product2Id")
	private String product2Id;
	@JsonProperty("IsDeleted")
	private Boolean isDeleted;
	@JsonProperty("OrderId")
	private String orderId;
	@JsonProperty("PricebookEntryId")
	private String pricebookEntryId;
	@JsonProperty("OriginalOrderItemId")
	private String originalOrderItemId;
	@JsonProperty("QuoteLineItemId")
	private Object quoteLineItemId;
	@JsonProperty("OriginalOrderItemQuantity")
	private Double originalOrderItemQuantity;
	@JsonProperty("RenewalOrderItemId")
	private Object renewalOrderItemId;
	@JsonProperty("IsPriceLocked")
	private Boolean isPriceLocked;
	@JsonProperty("NeedsRenewal")
	private Boolean needsRenewal;
	@JsonProperty("Quantity")
	private Double quantity;
	@JsonProperty("CurrencyIsoCode")
	private String currencyIsoCode;
	@JsonProperty("UnitPrice")
	private Double unitPrice;
	@JsonProperty("ListPrice")
	private Double listPrice;
	@JsonProperty("BillingReference")
	private Object billingReference;
	@JsonProperty("ServiceDate")
	private String serviceDate;
	@JsonProperty("EndDate")
	private String endDate;
	@JsonProperty("Description")
	private Object description;
	@JsonProperty("InternalComments")
	private Object internalComments;
	@JsonProperty("RelatedCeoNum")
	private Object relatedCeoNum;
	@JsonProperty("OrdLineAddQty")
	private Object ordLineAddQty;
	@JsonProperty("RelatedOppty")
	private Object relatedOppty;
	@JsonProperty("ProvisioningTargetId")
	private String provisioningTargetId;
	@JsonProperty("ProvisioningStatus")
	private Object provisioningStatus;
	@JsonProperty("ProvisionedDateTime")
	private Object provisionedDateTime;
	@JsonProperty("ProcessingBatchNumber")
	private Object processingBatchNumber;
	@JsonProperty("CreatedDate")
	private String createdDate;
	@JsonProperty("CreatedById")
	private String createdById;
	@JsonProperty("LastModifiedDate")
	private String lastModifiedDate;
	@JsonProperty("LastModifiedById")
	private String lastModifiedById;
	@JsonProperty("SystemModstamp")
	private String systemModstamp;
	@JsonProperty("MayEdit")
	private Boolean mayEdit;
	@JsonProperty("IsLocked")
	private Boolean isLocked;
	@JsonProperty("OrderItemNumber")
	private String orderItemNumber;
	@JsonProperty("Restricted_Language__c")
	private Object restrictedLanguageC;
	@JsonProperty("Order_Line_Type__c")
	private Object orderLineTypeC;
	@JsonProperty("sfbase__X90_Day_Rule__c")
	private Boolean sfbaseX90DayRuleC;
	@JsonProperty("sfbase__Product_Swap__c")
	private Boolean sfbaseProductSwapC;
	@JsonProperty("sfbase__Order_Line_Change__c")
	private Object sfbaseOrderLineChangeC;
	@JsonProperty("sfbase__OrderItemTermMonths__c")
	private Double sfbaseOrderItemTermMonthsC;
	@JsonProperty("sfbase__OrderItemEffectiveDate__c")
	private String sfbaseOrderItemEffectiveDateC;
	@JsonProperty("sfbase__OrderItemLTV__c")
	private Double sfbaseOrderItemLTVC;
	@JsonProperty("sfbase__SfdcProvStatus__c")
	private Object sfbaseSfdcProvStatusC;
	@JsonProperty("sfbase__SfdcProvDate__c")
	private Object sfbaseSfdcProvDateC;
	@JsonProperty("sfbase__PartnerProvStatus__c")
	private Object sfbasePartnerProvStatusC;
	@JsonProperty("sfbase__PartnerProvDate__c")
	private Object sfbasePartnerProvDateC;
	@JsonProperty("sfbase__OrderItemEndDate__c")
	private String sfbaseOrderItemEndDateC;
	@JsonProperty("sfbase__OrderItemTermDays__c")
	private Double sfbaseOrderItemTermDaysC;
	@JsonProperty("sfbase__SFDCProvisionGEO__c")
	private Object sfbaseSFDCProvisionGEOC;
	@JsonProperty("sfbase__PartnerProvisionGEO__c")
	private Object sfbasePartnerProvisionGEOC;
	@JsonProperty("sfbase__OrdItmAddQtyRev__c")
	private Double sfbaseOrdItmAddQtyRevC;
	@JsonProperty("sfbase__DailyValue__c")
	private Double sfbaseDailyValueC;
	@JsonProperty("sfbase__MonthlyListPrice__c")
	private Double sfbaseMonthlyListPriceC;
	@JsonProperty("sfbase__MonthlyNetPrice__c")
	private Double sfbaseMonthlyNetPriceC;
	@JsonProperty("sfbase__PreviousOrderItemId__c")
	private Object sfbasePreviousOrderItemIdC;
	@JsonProperty("sfbill__BillFromDate__c")
	private Object sfbillBillFromDateC;
	@JsonProperty("sfbill__BillThroughDate__c")
	private Object sfbillBillThroughDateC;
	@JsonProperty("sfbill__IsFullyReduced__c")
	private Boolean sfbillIsFullyReducedC;
	@JsonProperty("sfbase__AutoRenewalQuantity__c")
	private Double sfbaseAutoRenewalQuantityC;
	@JsonProperty("sfbase__AvailableQuantity__c")
	private Double sfbaseAvailableQuantityC;
	@JsonProperty("sfbase__IsAutoRenewed__c")
	private Boolean sfbaseIsAutoRenewedC;
	@JsonProperty("sfbase__MonthlyUnitPrice__c")
	private Double sfbaseMonthlyUnitPriceC;
	@JsonProperty("sfbase__CMEndDate__c")
	private Object sfbaseCMEndDateC;
	@JsonProperty("Product_ACV__c")
	private Double productACVC;
	@JsonProperty("Product_ACV_SP1__c")
	private Double productACVSP1C;
	@JsonProperty("Product_ACV_SP2__c")
	private Double productACVSP2C;
	@JsonProperty("Product_ACV_SP3__c")
	private Double productACVSP3C;
	@JsonProperty("Product_ACV_SP4__c")
	private Double productACVSP4C;
	@JsonProperty("sfbase__SFDCProvisionGEO_GUI__c")
	private Object sfbaseSFDCProvisionGEOGUIC;
	@JsonProperty("sfbase__CustomerProvisioningDate__c")
	private Object sfbaseCustomerProvisioningDateC;
	@JsonProperty("sfbase__ACVEndDate__c")
	private String sfbaseACVEndDateC;
	@JsonProperty("sfbase__PrimarySalesOrderItemId__c")
	private Object sfbasePrimarySalesOrderItemIdC;
	@JsonProperty("sfbase__RenewalDeltaQty__c")
	private Double sfbaseRenewalDeltaQtyC;
	@JsonProperty("sfbase__RenewalAttritionCEO__c")
	private String sfbaseRenewalAttritionCEOC;
	@JsonProperty("sfbase__ExpirationAttritionCEO__c")
	private String sfbaseExpirationAttritionCEOC;
	@JsonProperty("sfbase__CEOFollowupReason__c")
	private Object sfbaseCEOFollowupReasonC;
	@JsonProperty("sfbill__TotalBillable__c")
	private Object sfbillTotalBillableC;
	@JsonProperty("sfbill__TotalBilled__c")
	private Object sfbillTotalBilledC;
	@JsonProperty("sfbill__CreditMemoAmount__c")
	private Object sfbillCreditMemoAmountC;
	@JsonProperty("ConversionOrderItemId__c")
	private Object conversionOrderItemIdC;
	@JsonProperty("PHXStartDate__c")
	private Object pHXStartDateC;
	@JsonProperty("PHXTermDays__c")
	private Double pHXTermDaysC;
	@JsonProperty("PHXTermMonths__c")
	private Double pHXTermMonthsC;
	@JsonProperty("PHXOrderItemLTV__c")
	private Double pHXOrderItemLTVC;
	@JsonProperty("PHXDailyValue__c")
	private Double pHXDailyValueC;
	@JsonProperty("ConversionOrderItem__c")
	private Boolean conversionOrderItemC;
	@JsonProperty("ConversionOrderItemPHX__c")
	private Boolean conversionOrderItemPHXC;
	@JsonProperty("RevenueExternalSystemRef__c")
	private Object revenueExternalSystemRefC;
	@JsonProperty("Primary_CEO__c")
	private Object primaryCEOC;
	@JsonProperty("Attrition_Quantity__c")
	private Double attritionQuantityC;
	@JsonProperty("Total_Amount__c")
	private Double totalAmountC;
	@JsonProperty("Rejected__c")
	private Boolean rejectedC;
	@JsonProperty("Rejected_Reason__c")
	private Object rejectedReasonC;
	@JsonProperty("Compliance_Comments__c")
	private Object complianceCommentsC;
	@JsonProperty("Adjustment_Team__c")
	private Object adjustmentTeamC;
	@JsonProperty("TACV_Attrition_Required__c")
	private String tACVAttritionRequiredC;
	@JsonProperty("ErrorText__c")
	private Object errorTextC;
	@JsonProperty("hasError__c")
	private Boolean hasErrorC;
	@JsonProperty("Trailing_ACV_CEO__c")
	private Object trailingACVCEOC;
	@JsonProperty("sfbase__Partner_Fee__c")
	private Object sfbasePartnerFeeC;
	@JsonProperty("sfbase__CompensationEndDate__c")
	private String sfbaseCompensationEndDateC;
	@JsonProperty("sfbase__OrderTermCompensation__c")
	private String sfbaseOrderTermCompensationC;
	@JsonProperty("sfbase__PromoCode__c")
	private Object sfbasePromoCodeC;
	@JsonProperty("sfbase__PartnerUnitPrice__c")
	private Double sfbasePartnerUnitPriceC;
	@JsonProperty("sfbase__Entitlement__c")
	private Object sfbaseEntitlementC;
	@JsonProperty("sfbase__TotalCreditMemoTerm__c")
	private Double sfbaseTotalCreditMemoTermC;
	@JsonProperty("sfbill__CMStatus__c")
	private String sfbillCMStatusC;
	@JsonProperty("sfbill__CMTriggerDatetime__c")
	private String sfbillCMTriggerDatetimeC;
	@JsonProperty("sfbase__ElaUnitPrice__c")
	private Double sfbaseElaUnitPriceC;
	@JsonProperty("sfbase__ShortTermOrder__c")
	private Boolean sfbaseShortTermOrderC;
	@JsonProperty("sfbase__ProductBillingFrequency__c")
	private Double sfbaseProductBillingFrequencyC;
	@JsonProperty("sfbase__BillingRevenueModel__c")
	private Object sfbaseBillingRevenueModelC;
	@JsonProperty("sfbill__DoNotBill__c")
	private Boolean sfbillDoNotBillC;
	@JsonProperty("External_ID__c")
	private Object externalIDC;
	@JsonProperty("sfbase__ExternalTenantId__c")
	private Object sfbaseExternalTenantIdC;
	@JsonProperty("sfbase__ExternalTenantName__c")
	private Object sfbaseExternalTenantNameC;
	@JsonProperty("sfbase__ExternalTenantOwner__c")
	private Object sfbaseExternalTenantOwnerC;
	@JsonProperty("TenantData__c")
	private Object tenantDataC;
	@JsonProperty("OTVCriteria__c")
	private Object oTVCriteriaC;
	@JsonProperty("NCO__c")
	private Boolean nCOC;
	@JsonProperty("OpptyOwnerEmail__c")
	private Object opptyOwnerEmailC;
	@JsonProperty("OpptyOwnerNotified__c")
	private Boolean opptyOwnerNotifiedC;
	@JsonProperty("Annual_Value__c")
	private Double annualValueC;
	@JsonProperty("AccountLocation__c")
	private String accountLocationC;
	@JsonProperty("AgreementPriceRule__c")
	private Object agreementPriceRuleC;
	@JsonProperty("ParentOrderItem__c")
	private Object parentOrderItemC;
	@JsonProperty("ParentProduct__c")
	private Object parentProductC;
	@JsonProperty("PriceListItem__c")
	private String priceListItemC;
	@JsonProperty("createAssetLine__c")
	private Boolean createAssetLineC;
	@JsonProperty("AssetLineId__c")
	private Object assetLineIdC;
	@JsonProperty("ConfigurationType__c")
	private String configurationTypeC;
	@JsonProperty("BusinessUnit__c")
	private String businessUnitC;
	@JsonProperty("Cloud__c")
	private String cloudC;
	@JsonProperty("CostCenter__c")
	private String costCenterC;
	@JsonProperty("GeneralLedger__c")
	private String generalLedgerC;
	@JsonProperty("Channel__c")
	private Object channelC;
	@JsonProperty("ComponentQuantityFactor__c")
	private Object componentQuantityFactorC;
	@JsonProperty("DerivedFrom__c")
	private Object derivedFromC;
	@JsonProperty("Eligible_for_Delight_Data_Conversion__c")
	private Boolean eligibleForDelightDataConversionC;
	@JsonProperty("ParentBundleNumber__c")
	private Double parentBundleNumberC;
	@JsonProperty("PreviousOrderItem__c")
	private Object previousOrderItemC;
	@JsonProperty("PrimaryLineNumber__c")
	private Double primaryLineNumberC;
	@JsonProperty("QuoteLinePrice__c")
	private Double quoteLinePriceC;
	@JsonProperty("RelatedQuoteLine__c")
	private Object relatedQuoteLineC;
	@JsonProperty("RevenueAllocationPercentage__c")
	private Object revenueAllocationPercentageC;
	@JsonProperty("SfdcHas_Inconsistent_Asset__c")
	private Boolean sfdcHasInconsistentAssetC;
	@JsonProperty("SfdcRenewFromAsset__c")
	private Boolean sfdcRenewFromAssetC;
	@JsonProperty("SourceAsset__c")
	private Object sourceAssetC;
	@JsonProperty("TransferItem__c")
	private Object transferItemC;
	@JsonProperty("updateAsset__c")
	private Boolean updateAssetC;
	@JsonProperty("EntitlementUsageGroup__c")
	private Object entitlementUsageGroupC;
	@JsonProperty("MigrationSourceLineId__c")
	private Object migrationSourceLineIdC;
	@JsonProperty("Bookings_Treatment__c")
	private String bookingsTreatmentC;
	@JsonProperty("IsSharedUsage__c")
	private Boolean isSharedUsageC;
	@JsonProperty("NormalizedMonthlyUnitPrice__c")
	private Double normalizedMonthlyUnitPriceC;
	@JsonProperty("OverageRate__c")
	private Object overageRateC;
	@JsonProperty("sfbase__ProductBillingTreatment__c")
	private String sfbaseProductBillingTreatmentC;
	@JsonProperty("ApplicableToRms__c")
	private Boolean applicableToRmsC;
	@JsonProperty("EvaluateReductionOrderItemForRMS__c")
	private Boolean evaluateReductionOrderItemForRMSC;
	@JsonProperty("ExtendedListPrice__c")
	private Object extendedListPriceC;
	@JsonProperty("ExternalCloud__c")
	private Object externalCloudC;
	@JsonProperty("ReasonNotApplicableToRms__c")
	private Object reasonNotApplicableToRmsC;
	@JsonProperty("SyncWithRms__c")
	private Boolean syncWithRmsC;
	@JsonProperty("CreatePo__c")
	private Boolean createPoC;
	@JsonProperty("DPP_List_Price__c")
	private Object dPPListPriceC;
	@JsonProperty("PoCorrespondent__c")
	private Object poCorrespondentC;
	@JsonProperty("PoTracker__c")
	private Object poTrackerC;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -5815348128355987834L;

	@JsonProperty("attributes")
	public Attributes getAttributes() {
		return attributes;
	}

	@JsonProperty("attributes")
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public OrderItem withAttributes(Attributes attributes) {
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

	public OrderItem withId(String id) {
		this.id = id;
		return this;
	}

	@JsonProperty("Product2Id")
	public String getProduct2Id() {
		return product2Id;
	}

	@JsonProperty("Product2Id")
	public void setProduct2Id(String product2Id) {
		this.product2Id = product2Id;
	}

	public OrderItem withProduct2Id(String product2Id) {
		this.product2Id = product2Id;
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

	public OrderItem withIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
		return this;
	}

	@JsonProperty("OrderId")
	public String getOrderId() {
		return orderId;
	}

	@JsonProperty("OrderId")
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public OrderItem withOrderId(String orderId) {
		this.orderId = orderId;
		return this;
	}

	@JsonProperty("PricebookEntryId")
	public String getPricebookEntryId() {
		return pricebookEntryId;
	}

	@JsonProperty("PricebookEntryId")
	public void setPricebookEntryId(String pricebookEntryId) {
		this.pricebookEntryId = pricebookEntryId;
	}

	public OrderItem withPricebookEntryId(String pricebookEntryId) {
		this.pricebookEntryId = pricebookEntryId;
		return this;
	}

	@JsonProperty("OriginalOrderItemId")
	public String getOriginalOrderItemId() {
		return originalOrderItemId;
	}

	@JsonProperty("OriginalOrderItemId")
	public void setOriginalOrderItemId(String originalOrderItemId) {
		this.originalOrderItemId = originalOrderItemId;
	}

	public OrderItem withOriginalOrderItemId(String originalOrderItemId) {
		this.originalOrderItemId = originalOrderItemId;
		return this;
	}

	@JsonProperty("QuoteLineItemId")
	public Object getQuoteLineItemId() {
		return quoteLineItemId;
	}

	@JsonProperty("QuoteLineItemId")
	public void setQuoteLineItemId(Object quoteLineItemId) {
		this.quoteLineItemId = quoteLineItemId;
	}

	public OrderItem withQuoteLineItemId(Object quoteLineItemId) {
		this.quoteLineItemId = quoteLineItemId;
		return this;
	}

	@JsonProperty("OriginalOrderItemQuantity")
	public Double getOriginalOrderItemQuantity() {
		return originalOrderItemQuantity;
	}

	@JsonProperty("OriginalOrderItemQuantity")
	public void setOriginalOrderItemQuantity(Double originalOrderItemQuantity) {
		this.originalOrderItemQuantity = originalOrderItemQuantity;
	}

	public OrderItem withOriginalOrderItemQuantity(
			Double originalOrderItemQuantity) {
		this.originalOrderItemQuantity = originalOrderItemQuantity;
		return this;
	}

	@JsonProperty("RenewalOrderItemId")
	public Object getRenewalOrderItemId() {
		return renewalOrderItemId;
	}

	@JsonProperty("RenewalOrderItemId")
	public void setRenewalOrderItemId(Object renewalOrderItemId) {
		this.renewalOrderItemId = renewalOrderItemId;
	}

	public OrderItem withRenewalOrderItemId(Object renewalOrderItemId) {
		this.renewalOrderItemId = renewalOrderItemId;
		return this;
	}

	@JsonProperty("IsPriceLocked")
	public Boolean getIsPriceLocked() {
		return isPriceLocked;
	}

	@JsonProperty("IsPriceLocked")
	public void setIsPriceLocked(Boolean isPriceLocked) {
		this.isPriceLocked = isPriceLocked;
	}

	public OrderItem withIsPriceLocked(Boolean isPriceLocked) {
		this.isPriceLocked = isPriceLocked;
		return this;
	}

	@JsonProperty("NeedsRenewal")
	public Boolean getNeedsRenewal() {
		return needsRenewal;
	}

	@JsonProperty("NeedsRenewal")
	public void setNeedsRenewal(Boolean needsRenewal) {
		this.needsRenewal = needsRenewal;
	}

	public OrderItem withNeedsRenewal(Boolean needsRenewal) {
		this.needsRenewal = needsRenewal;
		return this;
	}

	@JsonProperty("Quantity")
	public Double getQuantity() {
		return quantity;
	}

	@JsonProperty("Quantity")
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public OrderItem withQuantity(Double quantity) {
		this.quantity = quantity;
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

	public OrderItem withCurrencyIsoCode(String currencyIsoCode) {
		this.currencyIsoCode = currencyIsoCode;
		return this;
	}

	@JsonProperty("UnitPrice")
	public Double getUnitPrice() {
		return unitPrice;
	}

	@JsonProperty("UnitPrice")
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public OrderItem withUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
		return this;
	}

	@JsonProperty("ListPrice")
	public Double getListPrice() {
		return listPrice;
	}

	@JsonProperty("ListPrice")
	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}

	public OrderItem withListPrice(Double listPrice) {
		this.listPrice = listPrice;
		return this;
	}

	@JsonProperty("BillingReference")
	public Object getBillingReference() {
		return billingReference;
	}

	@JsonProperty("BillingReference")
	public void setBillingReference(Object billingReference) {
		this.billingReference = billingReference;
	}

	public OrderItem withBillingReference(Object billingReference) {
		this.billingReference = billingReference;
		return this;
	}

	@JsonProperty("ServiceDate")
	public String getServiceDate() {
		return serviceDate;
	}

	@JsonProperty("ServiceDate")
	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}

	public OrderItem withServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
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

	public OrderItem withEndDate(String endDate) {
		this.endDate = endDate;
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

	public OrderItem withDescription(Object description) {
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

	public OrderItem withInternalComments(Object internalComments) {
		this.internalComments = internalComments;
		return this;
	}

	@JsonProperty("RelatedCeoNum")
	public Object getRelatedCeoNum() {
		return relatedCeoNum;
	}

	@JsonProperty("RelatedCeoNum")
	public void setRelatedCeoNum(Object relatedCeoNum) {
		this.relatedCeoNum = relatedCeoNum;
	}

	public OrderItem withRelatedCeoNum(Object relatedCeoNum) {
		this.relatedCeoNum = relatedCeoNum;
		return this;
	}

	@JsonProperty("OrdLineAddQty")
	public Object getOrdLineAddQty() {
		return ordLineAddQty;
	}

	@JsonProperty("OrdLineAddQty")
	public void setOrdLineAddQty(Object ordLineAddQty) {
		this.ordLineAddQty = ordLineAddQty;
	}

	public OrderItem withOrdLineAddQty(Object ordLineAddQty) {
		this.ordLineAddQty = ordLineAddQty;
		return this;
	}

	@JsonProperty("RelatedOppty")
	public Object getRelatedOppty() {
		return relatedOppty;
	}

	@JsonProperty("RelatedOppty")
	public void setRelatedOppty(Object relatedOppty) {
		this.relatedOppty = relatedOppty;
	}

	public OrderItem withRelatedOppty(Object relatedOppty) {
		this.relatedOppty = relatedOppty;
		return this;
	}

	@JsonProperty("ProvisioningTargetId")
	public String getProvisioningTargetId() {
		return provisioningTargetId;
	}

	@JsonProperty("ProvisioningTargetId")
	public void setProvisioningTargetId(String provisioningTargetId) {
		this.provisioningTargetId = provisioningTargetId;
	}

	public OrderItem withProvisioningTargetId(String provisioningTargetId) {
		this.provisioningTargetId = provisioningTargetId;
		return this;
	}

	@JsonProperty("ProvisioningStatus")
	public Object getProvisioningStatus() {
		return provisioningStatus;
	}

	@JsonProperty("ProvisioningStatus")
	public void setProvisioningStatus(Object provisioningStatus) {
		this.provisioningStatus = provisioningStatus;
	}

	public OrderItem withProvisioningStatus(Object provisioningStatus) {
		this.provisioningStatus = provisioningStatus;
		return this;
	}

	@JsonProperty("ProvisionedDateTime")
	public Object getProvisionedDateTime() {
		return provisionedDateTime;
	}

	@JsonProperty("ProvisionedDateTime")
	public void setProvisionedDateTime(Object provisionedDateTime) {
		this.provisionedDateTime = provisionedDateTime;
	}

	public OrderItem withProvisionedDateTime(Object provisionedDateTime) {
		this.provisionedDateTime = provisionedDateTime;
		return this;
	}

	@JsonProperty("ProcessingBatchNumber")
	public Object getProcessingBatchNumber() {
		return processingBatchNumber;
	}

	@JsonProperty("ProcessingBatchNumber")
	public void setProcessingBatchNumber(Object processingBatchNumber) {
		this.processingBatchNumber = processingBatchNumber;
	}

	public OrderItem withProcessingBatchNumber(Object processingBatchNumber) {
		this.processingBatchNumber = processingBatchNumber;
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

	public OrderItem withCreatedDate(String createdDate) {
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

	public OrderItem withCreatedById(String createdById) {
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

	public OrderItem withLastModifiedDate(String lastModifiedDate) {
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

	public OrderItem withLastModifiedById(String lastModifiedById) {
		this.lastModifiedById = lastModifiedById;
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

	public OrderItem withSystemModstamp(String systemModstamp) {
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

	public OrderItem withMayEdit(Boolean mayEdit) {
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

	public OrderItem withIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
		return this;
	}

	@JsonProperty("OrderItemNumber")
	public String getOrderItemNumber() {
		return orderItemNumber;
	}

	@JsonProperty("OrderItemNumber")
	public void setOrderItemNumber(String orderItemNumber) {
		this.orderItemNumber = orderItemNumber;
	}

	public OrderItem withOrderItemNumber(String orderItemNumber) {
		this.orderItemNumber = orderItemNumber;
		return this;
	}

	@JsonProperty("Restricted_Language__c")
	public Object getRestrictedLanguageC() {
		return restrictedLanguageC;
	}

	@JsonProperty("Restricted_Language__c")
	public void setRestrictedLanguageC(Object restrictedLanguageC) {
		this.restrictedLanguageC = restrictedLanguageC;
	}

	public OrderItem withRestrictedLanguageC(Object restrictedLanguageC) {
		this.restrictedLanguageC = restrictedLanguageC;
		return this;
	}

	@JsonProperty("Order_Line_Type__c")
	public Object getOrderLineTypeC() {
		return orderLineTypeC;
	}

	@JsonProperty("Order_Line_Type__c")
	public void setOrderLineTypeC(Object orderLineTypeC) {
		this.orderLineTypeC = orderLineTypeC;
	}

	public OrderItem withOrderLineTypeC(Object orderLineTypeC) {
		this.orderLineTypeC = orderLineTypeC;
		return this;
	}

	@JsonProperty("sfbase__X90_Day_Rule__c")
	public Boolean getSfbaseX90DayRuleC() {
		return sfbaseX90DayRuleC;
	}

	@JsonProperty("sfbase__X90_Day_Rule__c")
	public void setSfbaseX90DayRuleC(Boolean sfbaseX90DayRuleC) {
		this.sfbaseX90DayRuleC = sfbaseX90DayRuleC;
	}

	public OrderItem withSfbaseX90DayRuleC(Boolean sfbaseX90DayRuleC) {
		this.sfbaseX90DayRuleC = sfbaseX90DayRuleC;
		return this;
	}

	@JsonProperty("sfbase__Product_Swap__c")
	public Boolean getSfbaseProductSwapC() {
		return sfbaseProductSwapC;
	}

	@JsonProperty("sfbase__Product_Swap__c")
	public void setSfbaseProductSwapC(Boolean sfbaseProductSwapC) {
		this.sfbaseProductSwapC = sfbaseProductSwapC;
	}

	public OrderItem withSfbaseProductSwapC(Boolean sfbaseProductSwapC) {
		this.sfbaseProductSwapC = sfbaseProductSwapC;
		return this;
	}

	@JsonProperty("sfbase__Order_Line_Change__c")
	public Object getSfbaseOrderLineChangeC() {
		return sfbaseOrderLineChangeC;
	}

	@JsonProperty("sfbase__Order_Line_Change__c")
	public void setSfbaseOrderLineChangeC(Object sfbaseOrderLineChangeC) {
		this.sfbaseOrderLineChangeC = sfbaseOrderLineChangeC;
	}

	public OrderItem withSfbaseOrderLineChangeC(Object sfbaseOrderLineChangeC) {
		this.sfbaseOrderLineChangeC = sfbaseOrderLineChangeC;
		return this;
	}

	@JsonProperty("sfbase__OrderItemTermMonths__c")
	public Double getSfbaseOrderItemTermMonthsC() {
		return sfbaseOrderItemTermMonthsC;
	}

	@JsonProperty("sfbase__OrderItemTermMonths__c")
	public void setSfbaseOrderItemTermMonthsC(Double sfbaseOrderItemTermMonthsC) {
		this.sfbaseOrderItemTermMonthsC = sfbaseOrderItemTermMonthsC;
	}

	public OrderItem withSfbaseOrderItemTermMonthsC(
			Double sfbaseOrderItemTermMonthsC) {
		this.sfbaseOrderItemTermMonthsC = sfbaseOrderItemTermMonthsC;
		return this;
	}

	@JsonProperty("sfbase__OrderItemEffectiveDate__c")
	public String getSfbaseOrderItemEffectiveDateC() {
		return sfbaseOrderItemEffectiveDateC;
	}

	@JsonProperty("sfbase__OrderItemEffectiveDate__c")
	public void setSfbaseOrderItemEffectiveDateC(
			String sfbaseOrderItemEffectiveDateC) {
		this.sfbaseOrderItemEffectiveDateC = sfbaseOrderItemEffectiveDateC;
	}

	public OrderItem withSfbaseOrderItemEffectiveDateC(
			String sfbaseOrderItemEffectiveDateC) {
		this.sfbaseOrderItemEffectiveDateC = sfbaseOrderItemEffectiveDateC;
		return this;
	}

	@JsonProperty("sfbase__OrderItemLTV__c")
	public Double getSfbaseOrderItemLTVC() {
		return sfbaseOrderItemLTVC;
	}

	@JsonProperty("sfbase__OrderItemLTV__c")
	public void setSfbaseOrderItemLTVC(Double sfbaseOrderItemLTVC) {
		this.sfbaseOrderItemLTVC = sfbaseOrderItemLTVC;
	}

	public OrderItem withSfbaseOrderItemLTVC(Double sfbaseOrderItemLTVC) {
		this.sfbaseOrderItemLTVC = sfbaseOrderItemLTVC;
		return this;
	}

	@JsonProperty("sfbase__SfdcProvStatus__c")
	public Object getSfbaseSfdcProvStatusC() {
		return sfbaseSfdcProvStatusC;
	}

	@JsonProperty("sfbase__SfdcProvStatus__c")
	public void setSfbaseSfdcProvStatusC(Object sfbaseSfdcProvStatusC) {
		this.sfbaseSfdcProvStatusC = sfbaseSfdcProvStatusC;
	}

	public OrderItem withSfbaseSfdcProvStatusC(Object sfbaseSfdcProvStatusC) {
		this.sfbaseSfdcProvStatusC = sfbaseSfdcProvStatusC;
		return this;
	}

	@JsonProperty("sfbase__SfdcProvDate__c")
	public Object getSfbaseSfdcProvDateC() {
		return sfbaseSfdcProvDateC;
	}

	@JsonProperty("sfbase__SfdcProvDate__c")
	public void setSfbaseSfdcProvDateC(Object sfbaseSfdcProvDateC) {
		this.sfbaseSfdcProvDateC = sfbaseSfdcProvDateC;
	}

	public OrderItem withSfbaseSfdcProvDateC(Object sfbaseSfdcProvDateC) {
		this.sfbaseSfdcProvDateC = sfbaseSfdcProvDateC;
		return this;
	}

	@JsonProperty("sfbase__PartnerProvStatus__c")
	public Object getSfbasePartnerProvStatusC() {
		return sfbasePartnerProvStatusC;
	}

	@JsonProperty("sfbase__PartnerProvStatus__c")
	public void setSfbasePartnerProvStatusC(Object sfbasePartnerProvStatusC) {
		this.sfbasePartnerProvStatusC = sfbasePartnerProvStatusC;
	}

	public OrderItem withSfbasePartnerProvStatusC(
			Object sfbasePartnerProvStatusC) {
		this.sfbasePartnerProvStatusC = sfbasePartnerProvStatusC;
		return this;
	}

	@JsonProperty("sfbase__PartnerProvDate__c")
	public Object getSfbasePartnerProvDateC() {
		return sfbasePartnerProvDateC;
	}

	@JsonProperty("sfbase__PartnerProvDate__c")
	public void setSfbasePartnerProvDateC(Object sfbasePartnerProvDateC) {
		this.sfbasePartnerProvDateC = sfbasePartnerProvDateC;
	}

	public OrderItem withSfbasePartnerProvDateC(Object sfbasePartnerProvDateC) {
		this.sfbasePartnerProvDateC = sfbasePartnerProvDateC;
		return this;
	}

	@JsonProperty("sfbase__OrderItemEndDate__c")
	public String getSfbaseOrderItemEndDateC() {
		return sfbaseOrderItemEndDateC;
	}

	@JsonProperty("sfbase__OrderItemEndDate__c")
	public void setSfbaseOrderItemEndDateC(String sfbaseOrderItemEndDateC) {
		this.sfbaseOrderItemEndDateC = sfbaseOrderItemEndDateC;
	}

	public OrderItem withSfbaseOrderItemEndDateC(String sfbaseOrderItemEndDateC) {
		this.sfbaseOrderItemEndDateC = sfbaseOrderItemEndDateC;
		return this;
	}

	@JsonProperty("sfbase__OrderItemTermDays__c")
	public Double getSfbaseOrderItemTermDaysC() {
		return sfbaseOrderItemTermDaysC;
	}

	@JsonProperty("sfbase__OrderItemTermDays__c")
	public void setSfbaseOrderItemTermDaysC(Double sfbaseOrderItemTermDaysC) {
		this.sfbaseOrderItemTermDaysC = sfbaseOrderItemTermDaysC;
	}

	public OrderItem withSfbaseOrderItemTermDaysC(
			Double sfbaseOrderItemTermDaysC) {
		this.sfbaseOrderItemTermDaysC = sfbaseOrderItemTermDaysC;
		return this;
	}

	@JsonProperty("sfbase__SFDCProvisionGEO__c")
	public Object getSfbaseSFDCProvisionGEOC() {
		return sfbaseSFDCProvisionGEOC;
	}

	@JsonProperty("sfbase__SFDCProvisionGEO__c")
	public void setSfbaseSFDCProvisionGEOC(Object sfbaseSFDCProvisionGEOC) {
		this.sfbaseSFDCProvisionGEOC = sfbaseSFDCProvisionGEOC;
	}

	public OrderItem withSfbaseSFDCProvisionGEOC(Object sfbaseSFDCProvisionGEOC) {
		this.sfbaseSFDCProvisionGEOC = sfbaseSFDCProvisionGEOC;
		return this;
	}

	@JsonProperty("sfbase__PartnerProvisionGEO__c")
	public Object getSfbasePartnerProvisionGEOC() {
		return sfbasePartnerProvisionGEOC;
	}

	@JsonProperty("sfbase__PartnerProvisionGEO__c")
	public void setSfbasePartnerProvisionGEOC(Object sfbasePartnerProvisionGEOC) {
		this.sfbasePartnerProvisionGEOC = sfbasePartnerProvisionGEOC;
	}

	public OrderItem withSfbasePartnerProvisionGEOC(
			Object sfbasePartnerProvisionGEOC) {
		this.sfbasePartnerProvisionGEOC = sfbasePartnerProvisionGEOC;
		return this;
	}

	@JsonProperty("sfbase__OrdItmAddQtyRev__c")
	public Double getSfbaseOrdItmAddQtyRevC() {
		return sfbaseOrdItmAddQtyRevC;
	}

	@JsonProperty("sfbase__OrdItmAddQtyRev__c")
	public void setSfbaseOrdItmAddQtyRevC(Double sfbaseOrdItmAddQtyRevC) {
		this.sfbaseOrdItmAddQtyRevC = sfbaseOrdItmAddQtyRevC;
	}

	public OrderItem withSfbaseOrdItmAddQtyRevC(Double sfbaseOrdItmAddQtyRevC) {
		this.sfbaseOrdItmAddQtyRevC = sfbaseOrdItmAddQtyRevC;
		return this;
	}

	@JsonProperty("sfbase__DailyValue__c")
	public Double getSfbaseDailyValueC() {
		return sfbaseDailyValueC;
	}

	@JsonProperty("sfbase__DailyValue__c")
	public void setSfbaseDailyValueC(Double sfbaseDailyValueC) {
		this.sfbaseDailyValueC = sfbaseDailyValueC;
	}

	public OrderItem withSfbaseDailyValueC(Double sfbaseDailyValueC) {
		this.sfbaseDailyValueC = sfbaseDailyValueC;
		return this;
	}

	@JsonProperty("sfbase__MonthlyListPrice__c")
	public Double getSfbaseMonthlyListPriceC() {
		return sfbaseMonthlyListPriceC;
	}

	@JsonProperty("sfbase__MonthlyListPrice__c")
	public void setSfbaseMonthlyListPriceC(Double sfbaseMonthlyListPriceC) {
		this.sfbaseMonthlyListPriceC = sfbaseMonthlyListPriceC;
	}

	public OrderItem withSfbaseMonthlyListPriceC(Double sfbaseMonthlyListPriceC) {
		this.sfbaseMonthlyListPriceC = sfbaseMonthlyListPriceC;
		return this;
	}

	@JsonProperty("sfbase__MonthlyNetPrice__c")
	public Double getSfbaseMonthlyNetPriceC() {
		return sfbaseMonthlyNetPriceC;
	}

	@JsonProperty("sfbase__MonthlyNetPrice__c")
	public void setSfbaseMonthlyNetPriceC(Double sfbaseMonthlyNetPriceC) {
		this.sfbaseMonthlyNetPriceC = sfbaseMonthlyNetPriceC;
	}

	public OrderItem withSfbaseMonthlyNetPriceC(Double sfbaseMonthlyNetPriceC) {
		this.sfbaseMonthlyNetPriceC = sfbaseMonthlyNetPriceC;
		return this;
	}

	@JsonProperty("sfbase__PreviousOrderItemId__c")
	public Object getSfbasePreviousOrderItemIdC() {
		return sfbasePreviousOrderItemIdC;
	}

	@JsonProperty("sfbase__PreviousOrderItemId__c")
	public void setSfbasePreviousOrderItemIdC(Object sfbasePreviousOrderItemIdC) {
		this.sfbasePreviousOrderItemIdC = sfbasePreviousOrderItemIdC;
	}

	public OrderItem withSfbasePreviousOrderItemIdC(
			Object sfbasePreviousOrderItemIdC) {
		this.sfbasePreviousOrderItemIdC = sfbasePreviousOrderItemIdC;
		return this;
	}

	@JsonProperty("sfbill__BillFromDate__c")
	public Object getSfbillBillFromDateC() {
		return sfbillBillFromDateC;
	}

	@JsonProperty("sfbill__BillFromDate__c")
	public void setSfbillBillFromDateC(Object sfbillBillFromDateC) {
		this.sfbillBillFromDateC = sfbillBillFromDateC;
	}

	public OrderItem withSfbillBillFromDateC(Object sfbillBillFromDateC) {
		this.sfbillBillFromDateC = sfbillBillFromDateC;
		return this;
	}

	@JsonProperty("sfbill__BillThroughDate__c")
	public Object getSfbillBillThroughDateC() {
		return sfbillBillThroughDateC;
	}

	@JsonProperty("sfbill__BillThroughDate__c")
	public void setSfbillBillThroughDateC(Object sfbillBillThroughDateC) {
		this.sfbillBillThroughDateC = sfbillBillThroughDateC;
	}

	public OrderItem withSfbillBillThroughDateC(Object sfbillBillThroughDateC) {
		this.sfbillBillThroughDateC = sfbillBillThroughDateC;
		return this;
	}

	@JsonProperty("sfbill__IsFullyReduced__c")
	public Boolean getSfbillIsFullyReducedC() {
		return sfbillIsFullyReducedC;
	}

	@JsonProperty("sfbill__IsFullyReduced__c")
	public void setSfbillIsFullyReducedC(Boolean sfbillIsFullyReducedC) {
		this.sfbillIsFullyReducedC = sfbillIsFullyReducedC;
	}

	public OrderItem withSfbillIsFullyReducedC(Boolean sfbillIsFullyReducedC) {
		this.sfbillIsFullyReducedC = sfbillIsFullyReducedC;
		return this;
	}

	@JsonProperty("sfbase__AutoRenewalQuantity__c")
	public Double getSfbaseAutoRenewalQuantityC() {
		return sfbaseAutoRenewalQuantityC;
	}

	@JsonProperty("sfbase__AutoRenewalQuantity__c")
	public void setSfbaseAutoRenewalQuantityC(Double sfbaseAutoRenewalQuantityC) {
		this.sfbaseAutoRenewalQuantityC = sfbaseAutoRenewalQuantityC;
	}

	public OrderItem withSfbaseAutoRenewalQuantityC(
			Double sfbaseAutoRenewalQuantityC) {
		this.sfbaseAutoRenewalQuantityC = sfbaseAutoRenewalQuantityC;
		return this;
	}

	@JsonProperty("sfbase__AvailableQuantity__c")
	public Double getSfbaseAvailableQuantityC() {
		return sfbaseAvailableQuantityC;
	}

	@JsonProperty("sfbase__AvailableQuantity__c")
	public void setSfbaseAvailableQuantityC(Double sfbaseAvailableQuantityC) {
		this.sfbaseAvailableQuantityC = sfbaseAvailableQuantityC;
	}

	public OrderItem withSfbaseAvailableQuantityC(
			Double sfbaseAvailableQuantityC) {
		this.sfbaseAvailableQuantityC = sfbaseAvailableQuantityC;
		return this;
	}

	@JsonProperty("sfbase__IsAutoRenewed__c")
	public Boolean getSfbaseIsAutoRenewedC() {
		return sfbaseIsAutoRenewedC;
	}

	@JsonProperty("sfbase__IsAutoRenewed__c")
	public void setSfbaseIsAutoRenewedC(Boolean sfbaseIsAutoRenewedC) {
		this.sfbaseIsAutoRenewedC = sfbaseIsAutoRenewedC;
	}

	public OrderItem withSfbaseIsAutoRenewedC(Boolean sfbaseIsAutoRenewedC) {
		this.sfbaseIsAutoRenewedC = sfbaseIsAutoRenewedC;
		return this;
	}

	@JsonProperty("sfbase__MonthlyUnitPrice__c")
	public Double getSfbaseMonthlyUnitPriceC() {
		return sfbaseMonthlyUnitPriceC;
	}

	@JsonProperty("sfbase__MonthlyUnitPrice__c")
	public void setSfbaseMonthlyUnitPriceC(Double sfbaseMonthlyUnitPriceC) {
		this.sfbaseMonthlyUnitPriceC = sfbaseMonthlyUnitPriceC;
	}

	public OrderItem withSfbaseMonthlyUnitPriceC(Double sfbaseMonthlyUnitPriceC) {
		this.sfbaseMonthlyUnitPriceC = sfbaseMonthlyUnitPriceC;
		return this;
	}

	@JsonProperty("sfbase__CMEndDate__c")
	public Object getSfbaseCMEndDateC() {
		return sfbaseCMEndDateC;
	}

	@JsonProperty("sfbase__CMEndDate__c")
	public void setSfbaseCMEndDateC(Object sfbaseCMEndDateC) {
		this.sfbaseCMEndDateC = sfbaseCMEndDateC;
	}

	public OrderItem withSfbaseCMEndDateC(Object sfbaseCMEndDateC) {
		this.sfbaseCMEndDateC = sfbaseCMEndDateC;
		return this;
	}

	@JsonProperty("Product_ACV__c")
	public Double getProductACVC() {
		return productACVC;
	}

	@JsonProperty("Product_ACV__c")
	public void setProductACVC(Double productACVC) {
		this.productACVC = productACVC;
	}

	public OrderItem withProductACVC(Double productACVC) {
		this.productACVC = productACVC;
		return this;
	}

	@JsonProperty("Product_ACV_SP1__c")
	public Double getProductACVSP1C() {
		return productACVSP1C;
	}

	@JsonProperty("Product_ACV_SP1__c")
	public void setProductACVSP1C(Double productACVSP1C) {
		this.productACVSP1C = productACVSP1C;
	}

	public OrderItem withProductACVSP1C(Double productACVSP1C) {
		this.productACVSP1C = productACVSP1C;
		return this;
	}

	@JsonProperty("Product_ACV_SP2__c")
	public Double getProductACVSP2C() {
		return productACVSP2C;
	}

	@JsonProperty("Product_ACV_SP2__c")
	public void setProductACVSP2C(Double productACVSP2C) {
		this.productACVSP2C = productACVSP2C;
	}

	public OrderItem withProductACVSP2C(Double productACVSP2C) {
		this.productACVSP2C = productACVSP2C;
		return this;
	}

	@JsonProperty("Product_ACV_SP3__c")
	public Double getProductACVSP3C() {
		return productACVSP3C;
	}

	@JsonProperty("Product_ACV_SP3__c")
	public void setProductACVSP3C(Double productACVSP3C) {
		this.productACVSP3C = productACVSP3C;
	}

	public OrderItem withProductACVSP3C(Double productACVSP3C) {
		this.productACVSP3C = productACVSP3C;
		return this;
	}

	@JsonProperty("Product_ACV_SP4__c")
	public Double getProductACVSP4C() {
		return productACVSP4C;
	}

	@JsonProperty("Product_ACV_SP4__c")
	public void setProductACVSP4C(Double productACVSP4C) {
		this.productACVSP4C = productACVSP4C;
	}

	public OrderItem withProductACVSP4C(Double productACVSP4C) {
		this.productACVSP4C = productACVSP4C;
		return this;
	}

	@JsonProperty("sfbase__SFDCProvisionGEO_GUI__c")
	public Object getSfbaseSFDCProvisionGEOGUIC() {
		return sfbaseSFDCProvisionGEOGUIC;
	}

	@JsonProperty("sfbase__SFDCProvisionGEO_GUI__c")
	public void setSfbaseSFDCProvisionGEOGUIC(Object sfbaseSFDCProvisionGEOGUIC) {
		this.sfbaseSFDCProvisionGEOGUIC = sfbaseSFDCProvisionGEOGUIC;
	}

	public OrderItem withSfbaseSFDCProvisionGEOGUIC(
			Object sfbaseSFDCProvisionGEOGUIC) {
		this.sfbaseSFDCProvisionGEOGUIC = sfbaseSFDCProvisionGEOGUIC;
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

	public OrderItem withSfbaseCustomerProvisioningDateC(
			Object sfbaseCustomerProvisioningDateC) {
		this.sfbaseCustomerProvisioningDateC = sfbaseCustomerProvisioningDateC;
		return this;
	}

	@JsonProperty("sfbase__ACVEndDate__c")
	public String getSfbaseACVEndDateC() {
		return sfbaseACVEndDateC;
	}

	@JsonProperty("sfbase__ACVEndDate__c")
	public void setSfbaseACVEndDateC(String sfbaseACVEndDateC) {
		this.sfbaseACVEndDateC = sfbaseACVEndDateC;
	}

	public OrderItem withSfbaseACVEndDateC(String sfbaseACVEndDateC) {
		this.sfbaseACVEndDateC = sfbaseACVEndDateC;
		return this;
	}

	@JsonProperty("sfbase__PrimarySalesOrderItemId__c")
	public Object getSfbasePrimarySalesOrderItemIdC() {
		return sfbasePrimarySalesOrderItemIdC;
	}

	@JsonProperty("sfbase__PrimarySalesOrderItemId__c")
	public void setSfbasePrimarySalesOrderItemIdC(
			Object sfbasePrimarySalesOrderItemIdC) {
		this.sfbasePrimarySalesOrderItemIdC = sfbasePrimarySalesOrderItemIdC;
	}

	public OrderItem withSfbasePrimarySalesOrderItemIdC(
			Object sfbasePrimarySalesOrderItemIdC) {
		this.sfbasePrimarySalesOrderItemIdC = sfbasePrimarySalesOrderItemIdC;
		return this;
	}

	@JsonProperty("sfbase__RenewalDeltaQty__c")
	public Double getSfbaseRenewalDeltaQtyC() {
		return sfbaseRenewalDeltaQtyC;
	}

	@JsonProperty("sfbase__RenewalDeltaQty__c")
	public void setSfbaseRenewalDeltaQtyC(Double sfbaseRenewalDeltaQtyC) {
		this.sfbaseRenewalDeltaQtyC = sfbaseRenewalDeltaQtyC;
	}

	public OrderItem withSfbaseRenewalDeltaQtyC(Double sfbaseRenewalDeltaQtyC) {
		this.sfbaseRenewalDeltaQtyC = sfbaseRenewalDeltaQtyC;
		return this;
	}

	@JsonProperty("sfbase__RenewalAttritionCEO__c")
	public String getSfbaseRenewalAttritionCEOC() {
		return sfbaseRenewalAttritionCEOC;
	}

	@JsonProperty("sfbase__RenewalAttritionCEO__c")
	public void setSfbaseRenewalAttritionCEOC(String sfbaseRenewalAttritionCEOC) {
		this.sfbaseRenewalAttritionCEOC = sfbaseRenewalAttritionCEOC;
	}

	public OrderItem withSfbaseRenewalAttritionCEOC(
			String sfbaseRenewalAttritionCEOC) {
		this.sfbaseRenewalAttritionCEOC = sfbaseRenewalAttritionCEOC;
		return this;
	}

	@JsonProperty("sfbase__ExpirationAttritionCEO__c")
	public String getSfbaseExpirationAttritionCEOC() {
		return sfbaseExpirationAttritionCEOC;
	}

	@JsonProperty("sfbase__ExpirationAttritionCEO__c")
	public void setSfbaseExpirationAttritionCEOC(
			String sfbaseExpirationAttritionCEOC) {
		this.sfbaseExpirationAttritionCEOC = sfbaseExpirationAttritionCEOC;
	}

	public OrderItem withSfbaseExpirationAttritionCEOC(
			String sfbaseExpirationAttritionCEOC) {
		this.sfbaseExpirationAttritionCEOC = sfbaseExpirationAttritionCEOC;
		return this;
	}

	@JsonProperty("sfbase__CEOFollowupReason__c")
	public Object getSfbaseCEOFollowupReasonC() {
		return sfbaseCEOFollowupReasonC;
	}

	@JsonProperty("sfbase__CEOFollowupReason__c")
	public void setSfbaseCEOFollowupReasonC(Object sfbaseCEOFollowupReasonC) {
		this.sfbaseCEOFollowupReasonC = sfbaseCEOFollowupReasonC;
	}

	public OrderItem withSfbaseCEOFollowupReasonC(
			Object sfbaseCEOFollowupReasonC) {
		this.sfbaseCEOFollowupReasonC = sfbaseCEOFollowupReasonC;
		return this;
	}

	@JsonProperty("sfbill__TotalBillable__c")
	public Object getSfbillTotalBillableC() {
		return sfbillTotalBillableC;
	}

	@JsonProperty("sfbill__TotalBillable__c")
	public void setSfbillTotalBillableC(Object sfbillTotalBillableC) {
		this.sfbillTotalBillableC = sfbillTotalBillableC;
	}

	public OrderItem withSfbillTotalBillableC(Object sfbillTotalBillableC) {
		this.sfbillTotalBillableC = sfbillTotalBillableC;
		return this;
	}

	@JsonProperty("sfbill__TotalBilled__c")
	public Object getSfbillTotalBilledC() {
		return sfbillTotalBilledC;
	}

	@JsonProperty("sfbill__TotalBilled__c")
	public void setSfbillTotalBilledC(Object sfbillTotalBilledC) {
		this.sfbillTotalBilledC = sfbillTotalBilledC;
	}

	public OrderItem withSfbillTotalBilledC(Object sfbillTotalBilledC) {
		this.sfbillTotalBilledC = sfbillTotalBilledC;
		return this;
	}

	@JsonProperty("sfbill__CreditMemoAmount__c")
	public Object getSfbillCreditMemoAmountC() {
		return sfbillCreditMemoAmountC;
	}

	@JsonProperty("sfbill__CreditMemoAmount__c")
	public void setSfbillCreditMemoAmountC(Object sfbillCreditMemoAmountC) {
		this.sfbillCreditMemoAmountC = sfbillCreditMemoAmountC;
	}

	public OrderItem withSfbillCreditMemoAmountC(Object sfbillCreditMemoAmountC) {
		this.sfbillCreditMemoAmountC = sfbillCreditMemoAmountC;
		return this;
	}

	@JsonProperty("ConversionOrderItemId__c")
	public Object getConversionOrderItemIdC() {
		return conversionOrderItemIdC;
	}

	@JsonProperty("ConversionOrderItemId__c")
	public void setConversionOrderItemIdC(Object conversionOrderItemIdC) {
		this.conversionOrderItemIdC = conversionOrderItemIdC;
	}

	public OrderItem withConversionOrderItemIdC(Object conversionOrderItemIdC) {
		this.conversionOrderItemIdC = conversionOrderItemIdC;
		return this;
	}

	@JsonProperty("PHXStartDate__c")
	public Object getPHXStartDateC() {
		return pHXStartDateC;
	}

	@JsonProperty("PHXStartDate__c")
	public void setPHXStartDateC(Object pHXStartDateC) {
		this.pHXStartDateC = pHXStartDateC;
	}

	public OrderItem withPHXStartDateC(Object pHXStartDateC) {
		this.pHXStartDateC = pHXStartDateC;
		return this;
	}

	@JsonProperty("PHXTermDays__c")
	public Double getPHXTermDaysC() {
		return pHXTermDaysC;
	}

	@JsonProperty("PHXTermDays__c")
	public void setPHXTermDaysC(Double pHXTermDaysC) {
		this.pHXTermDaysC = pHXTermDaysC;
	}

	public OrderItem withPHXTermDaysC(Double pHXTermDaysC) {
		this.pHXTermDaysC = pHXTermDaysC;
		return this;
	}

	@JsonProperty("PHXTermMonths__c")
	public Double getPHXTermMonthsC() {
		return pHXTermMonthsC;
	}

	@JsonProperty("PHXTermMonths__c")
	public void setPHXTermMonthsC(Double pHXTermMonthsC) {
		this.pHXTermMonthsC = pHXTermMonthsC;
	}

	public OrderItem withPHXTermMonthsC(Double pHXTermMonthsC) {
		this.pHXTermMonthsC = pHXTermMonthsC;
		return this;
	}

	@JsonProperty("PHXOrderItemLTV__c")
	public Double getPHXOrderItemLTVC() {
		return pHXOrderItemLTVC;
	}

	@JsonProperty("PHXOrderItemLTV__c")
	public void setPHXOrderItemLTVC(Double pHXOrderItemLTVC) {
		this.pHXOrderItemLTVC = pHXOrderItemLTVC;
	}

	public OrderItem withPHXOrderItemLTVC(Double pHXOrderItemLTVC) {
		this.pHXOrderItemLTVC = pHXOrderItemLTVC;
		return this;
	}

	@JsonProperty("PHXDailyValue__c")
	public Double getPHXDailyValueC() {
		return pHXDailyValueC;
	}

	@JsonProperty("PHXDailyValue__c")
	public void setPHXDailyValueC(Double pHXDailyValueC) {
		this.pHXDailyValueC = pHXDailyValueC;
	}

	public OrderItem withPHXDailyValueC(Double pHXDailyValueC) {
		this.pHXDailyValueC = pHXDailyValueC;
		return this;
	}

	@JsonProperty("ConversionOrderItem__c")
	public Boolean getConversionOrderItemC() {
		return conversionOrderItemC;
	}

	@JsonProperty("ConversionOrderItem__c")
	public void setConversionOrderItemC(Boolean conversionOrderItemC) {
		this.conversionOrderItemC = conversionOrderItemC;
	}

	public OrderItem withConversionOrderItemC(Boolean conversionOrderItemC) {
		this.conversionOrderItemC = conversionOrderItemC;
		return this;
	}

	@JsonProperty("ConversionOrderItemPHX__c")
	public Boolean getConversionOrderItemPHXC() {
		return conversionOrderItemPHXC;
	}

	@JsonProperty("ConversionOrderItemPHX__c")
	public void setConversionOrderItemPHXC(Boolean conversionOrderItemPHXC) {
		this.conversionOrderItemPHXC = conversionOrderItemPHXC;
	}

	public OrderItem withConversionOrderItemPHXC(Boolean conversionOrderItemPHXC) {
		this.conversionOrderItemPHXC = conversionOrderItemPHXC;
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

	public OrderItem withRevenueExternalSystemRefC(
			Object revenueExternalSystemRefC) {
		this.revenueExternalSystemRefC = revenueExternalSystemRefC;
		return this;
	}

	@JsonProperty("Primary_CEO__c")
	public Object getPrimaryCEOC() {
		return primaryCEOC;
	}

	@JsonProperty("Primary_CEO__c")
	public void setPrimaryCEOC(Object primaryCEOC) {
		this.primaryCEOC = primaryCEOC;
	}

	public OrderItem withPrimaryCEOC(Object primaryCEOC) {
		this.primaryCEOC = primaryCEOC;
		return this;
	}

	@JsonProperty("Attrition_Quantity__c")
	public Double getAttritionQuantityC() {
		return attritionQuantityC;
	}

	@JsonProperty("Attrition_Quantity__c")
	public void setAttritionQuantityC(Double attritionQuantityC) {
		this.attritionQuantityC = attritionQuantityC;
	}

	public OrderItem withAttritionQuantityC(Double attritionQuantityC) {
		this.attritionQuantityC = attritionQuantityC;
		return this;
	}

	@JsonProperty("Total_Amount__c")
	public Double getTotalAmountC() {
		return totalAmountC;
	}

	@JsonProperty("Total_Amount__c")
	public void setTotalAmountC(Double totalAmountC) {
		this.totalAmountC = totalAmountC;
	}

	public OrderItem withTotalAmountC(Double totalAmountC) {
		this.totalAmountC = totalAmountC;
		return this;
	}

	@JsonProperty("Rejected__c")
	public Boolean getRejectedC() {
		return rejectedC;
	}

	@JsonProperty("Rejected__c")
	public void setRejectedC(Boolean rejectedC) {
		this.rejectedC = rejectedC;
	}

	public OrderItem withRejectedC(Boolean rejectedC) {
		this.rejectedC = rejectedC;
		return this;
	}

	@JsonProperty("Rejected_Reason__c")
	public Object getRejectedReasonC() {
		return rejectedReasonC;
	}

	@JsonProperty("Rejected_Reason__c")
	public void setRejectedReasonC(Object rejectedReasonC) {
		this.rejectedReasonC = rejectedReasonC;
	}

	public OrderItem withRejectedReasonC(Object rejectedReasonC) {
		this.rejectedReasonC = rejectedReasonC;
		return this;
	}

	@JsonProperty("Compliance_Comments__c")
	public Object getComplianceCommentsC() {
		return complianceCommentsC;
	}

	@JsonProperty("Compliance_Comments__c")
	public void setComplianceCommentsC(Object complianceCommentsC) {
		this.complianceCommentsC = complianceCommentsC;
	}

	public OrderItem withComplianceCommentsC(Object complianceCommentsC) {
		this.complianceCommentsC = complianceCommentsC;
		return this;
	}

	@JsonProperty("Adjustment_Team__c")
	public Object getAdjustmentTeamC() {
		return adjustmentTeamC;
	}

	@JsonProperty("Adjustment_Team__c")
	public void setAdjustmentTeamC(Object adjustmentTeamC) {
		this.adjustmentTeamC = adjustmentTeamC;
	}

	public OrderItem withAdjustmentTeamC(Object adjustmentTeamC) {
		this.adjustmentTeamC = adjustmentTeamC;
		return this;
	}

	@JsonProperty("TACV_Attrition_Required__c")
	public String getTACVAttritionRequiredC() {
		return tACVAttritionRequiredC;
	}

	@JsonProperty("TACV_Attrition_Required__c")
	public void setTACVAttritionRequiredC(String tACVAttritionRequiredC) {
		this.tACVAttritionRequiredC = tACVAttritionRequiredC;
	}

	public OrderItem withTACVAttritionRequiredC(String tACVAttritionRequiredC) {
		this.tACVAttritionRequiredC = tACVAttritionRequiredC;
		return this;
	}

	@JsonProperty("ErrorText__c")
	public Object getErrorTextC() {
		return errorTextC;
	}

	@JsonProperty("ErrorText__c")
	public void setErrorTextC(Object errorTextC) {
		this.errorTextC = errorTextC;
	}

	public OrderItem withErrorTextC(Object errorTextC) {
		this.errorTextC = errorTextC;
		return this;
	}

	@JsonProperty("hasError__c")
	public Boolean getHasErrorC() {
		return hasErrorC;
	}

	@JsonProperty("hasError__c")
	public void setHasErrorC(Boolean hasErrorC) {
		this.hasErrorC = hasErrorC;
	}

	public OrderItem withHasErrorC(Boolean hasErrorC) {
		this.hasErrorC = hasErrorC;
		return this;
	}

	@JsonProperty("Trailing_ACV_CEO__c")
	public Object getTrailingACVCEOC() {
		return trailingACVCEOC;
	}

	@JsonProperty("Trailing_ACV_CEO__c")
	public void setTrailingACVCEOC(Object trailingACVCEOC) {
		this.trailingACVCEOC = trailingACVCEOC;
	}

	public OrderItem withTrailingACVCEOC(Object trailingACVCEOC) {
		this.trailingACVCEOC = trailingACVCEOC;
		return this;
	}

	@JsonProperty("sfbase__Partner_Fee__c")
	public Object getSfbasePartnerFeeC() {
		return sfbasePartnerFeeC;
	}

	@JsonProperty("sfbase__Partner_Fee__c")
	public void setSfbasePartnerFeeC(Object sfbasePartnerFeeC) {
		this.sfbasePartnerFeeC = sfbasePartnerFeeC;
	}

	public OrderItem withSfbasePartnerFeeC(Object sfbasePartnerFeeC) {
		this.sfbasePartnerFeeC = sfbasePartnerFeeC;
		return this;
	}

	@JsonProperty("sfbase__CompensationEndDate__c")
	public String getSfbaseCompensationEndDateC() {
		return sfbaseCompensationEndDateC;
	}

	@JsonProperty("sfbase__CompensationEndDate__c")
	public void setSfbaseCompensationEndDateC(String sfbaseCompensationEndDateC) {
		this.sfbaseCompensationEndDateC = sfbaseCompensationEndDateC;
	}

	public OrderItem withSfbaseCompensationEndDateC(
			String sfbaseCompensationEndDateC) {
		this.sfbaseCompensationEndDateC = sfbaseCompensationEndDateC;
		return this;
	}

	@JsonProperty("sfbase__OrderTermCompensation__c")
	public String getSfbaseOrderTermCompensationC() {
		return sfbaseOrderTermCompensationC;
	}

	@JsonProperty("sfbase__OrderTermCompensation__c")
	public void setSfbaseOrderTermCompensationC(
			String sfbaseOrderTermCompensationC) {
		this.sfbaseOrderTermCompensationC = sfbaseOrderTermCompensationC;
	}

	public OrderItem withSfbaseOrderTermCompensationC(
			String sfbaseOrderTermCompensationC) {
		this.sfbaseOrderTermCompensationC = sfbaseOrderTermCompensationC;
		return this;
	}

	@JsonProperty("sfbase__PromoCode__c")
	public Object getSfbasePromoCodeC() {
		return sfbasePromoCodeC;
	}

	@JsonProperty("sfbase__PromoCode__c")
	public void setSfbasePromoCodeC(Object sfbasePromoCodeC) {
		this.sfbasePromoCodeC = sfbasePromoCodeC;
	}

	public OrderItem withSfbasePromoCodeC(Object sfbasePromoCodeC) {
		this.sfbasePromoCodeC = sfbasePromoCodeC;
		return this;
	}

	@JsonProperty("sfbase__PartnerUnitPrice__c")
	public Double getSfbasePartnerUnitPriceC() {
		return sfbasePartnerUnitPriceC;
	}

	@JsonProperty("sfbase__PartnerUnitPrice__c")
	public void setSfbasePartnerUnitPriceC(Double sfbasePartnerUnitPriceC) {
		this.sfbasePartnerUnitPriceC = sfbasePartnerUnitPriceC;
	}

	public OrderItem withSfbasePartnerUnitPriceC(Double sfbasePartnerUnitPriceC) {
		this.sfbasePartnerUnitPriceC = sfbasePartnerUnitPriceC;
		return this;
	}

	@JsonProperty("sfbase__Entitlement__c")
	public Object getSfbaseEntitlementC() {
		return sfbaseEntitlementC;
	}

	@JsonProperty("sfbase__Entitlement__c")
	public void setSfbaseEntitlementC(Object sfbaseEntitlementC) {
		this.sfbaseEntitlementC = sfbaseEntitlementC;
	}

	public OrderItem withSfbaseEntitlementC(Object sfbaseEntitlementC) {
		this.sfbaseEntitlementC = sfbaseEntitlementC;
		return this;
	}

	@JsonProperty("sfbase__TotalCreditMemoTerm__c")
	public Double getSfbaseTotalCreditMemoTermC() {
		return sfbaseTotalCreditMemoTermC;
	}

	@JsonProperty("sfbase__TotalCreditMemoTerm__c")
	public void setSfbaseTotalCreditMemoTermC(Double sfbaseTotalCreditMemoTermC) {
		this.sfbaseTotalCreditMemoTermC = sfbaseTotalCreditMemoTermC;
	}

	public OrderItem withSfbaseTotalCreditMemoTermC(
			Double sfbaseTotalCreditMemoTermC) {
		this.sfbaseTotalCreditMemoTermC = sfbaseTotalCreditMemoTermC;
		return this;
	}

	@JsonProperty("sfbill__CMStatus__c")
	public String getSfbillCMStatusC() {
		return sfbillCMStatusC;
	}

	@JsonProperty("sfbill__CMStatus__c")
	public void setSfbillCMStatusC(String sfbillCMStatusC) {
		this.sfbillCMStatusC = sfbillCMStatusC;
	}

	public OrderItem withSfbillCMStatusC(String sfbillCMStatusC) {
		this.sfbillCMStatusC = sfbillCMStatusC;
		return this;
	}

	@JsonProperty("sfbill__CMTriggerDatetime__c")
	public String getSfbillCMTriggerDatetimeC() {
		return sfbillCMTriggerDatetimeC;
	}

	@JsonProperty("sfbill__CMTriggerDatetime__c")
	public void setSfbillCMTriggerDatetimeC(String sfbillCMTriggerDatetimeC) {
		this.sfbillCMTriggerDatetimeC = sfbillCMTriggerDatetimeC;
	}

	public OrderItem withSfbillCMTriggerDatetimeC(
			String sfbillCMTriggerDatetimeC) {
		this.sfbillCMTriggerDatetimeC = sfbillCMTriggerDatetimeC;
		return this;
	}

	@JsonProperty("sfbase__ElaUnitPrice__c")
	public Double getSfbaseElaUnitPriceC() {
		return sfbaseElaUnitPriceC;
	}

	@JsonProperty("sfbase__ElaUnitPrice__c")
	public void setSfbaseElaUnitPriceC(Double sfbaseElaUnitPriceC) {
		this.sfbaseElaUnitPriceC = sfbaseElaUnitPriceC;
	}

	public OrderItem withSfbaseElaUnitPriceC(Double sfbaseElaUnitPriceC) {
		this.sfbaseElaUnitPriceC = sfbaseElaUnitPriceC;
		return this;
	}

	@JsonProperty("sfbase__ShortTermOrder__c")
	public Boolean getSfbaseShortTermOrderC() {
		return sfbaseShortTermOrderC;
	}

	@JsonProperty("sfbase__ShortTermOrder__c")
	public void setSfbaseShortTermOrderC(Boolean sfbaseShortTermOrderC) {
		this.sfbaseShortTermOrderC = sfbaseShortTermOrderC;
	}

	public OrderItem withSfbaseShortTermOrderC(Boolean sfbaseShortTermOrderC) {
		this.sfbaseShortTermOrderC = sfbaseShortTermOrderC;
		return this;
	}

	@JsonProperty("sfbase__ProductBillingFrequency__c")
	public Double getSfbaseProductBillingFrequencyC() {
		return sfbaseProductBillingFrequencyC;
	}

	@JsonProperty("sfbase__ProductBillingFrequency__c")
	public void setSfbaseProductBillingFrequencyC(
			Double sfbaseProductBillingFrequencyC) {
		this.sfbaseProductBillingFrequencyC = sfbaseProductBillingFrequencyC;
	}

	public OrderItem withSfbaseProductBillingFrequencyC(
			Double sfbaseProductBillingFrequencyC) {
		this.sfbaseProductBillingFrequencyC = sfbaseProductBillingFrequencyC;
		return this;
	}

	@JsonProperty("sfbase__BillingRevenueModel__c")
	public Object getSfbaseBillingRevenueModelC() {
		return sfbaseBillingRevenueModelC;
	}

	@JsonProperty("sfbase__BillingRevenueModel__c")
	public void setSfbaseBillingRevenueModelC(Object sfbaseBillingRevenueModelC) {
		this.sfbaseBillingRevenueModelC = sfbaseBillingRevenueModelC;
	}

	public OrderItem withSfbaseBillingRevenueModelC(
			Object sfbaseBillingRevenueModelC) {
		this.sfbaseBillingRevenueModelC = sfbaseBillingRevenueModelC;
		return this;
	}

	@JsonProperty("sfbill__DoNotBill__c")
	public Boolean getSfbillDoNotBillC() {
		return sfbillDoNotBillC;
	}

	@JsonProperty("sfbill__DoNotBill__c")
	public void setSfbillDoNotBillC(Boolean sfbillDoNotBillC) {
		this.sfbillDoNotBillC = sfbillDoNotBillC;
	}

	public OrderItem withSfbillDoNotBillC(Boolean sfbillDoNotBillC) {
		this.sfbillDoNotBillC = sfbillDoNotBillC;
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

	public OrderItem withExternalIDC(Object externalIDC) {
		this.externalIDC = externalIDC;
		return this;
	}

	@JsonProperty("sfbase__ExternalTenantId__c")
	public Object getSfbaseExternalTenantIdC() {
		return sfbaseExternalTenantIdC;
	}

	@JsonProperty("sfbase__ExternalTenantId__c")
	public void setSfbaseExternalTenantIdC(Object sfbaseExternalTenantIdC) {
		this.sfbaseExternalTenantIdC = sfbaseExternalTenantIdC;
	}

	public OrderItem withSfbaseExternalTenantIdC(Object sfbaseExternalTenantIdC) {
		this.sfbaseExternalTenantIdC = sfbaseExternalTenantIdC;
		return this;
	}

	@JsonProperty("sfbase__ExternalTenantName__c")
	public Object getSfbaseExternalTenantNameC() {
		return sfbaseExternalTenantNameC;
	}

	@JsonProperty("sfbase__ExternalTenantName__c")
	public void setSfbaseExternalTenantNameC(Object sfbaseExternalTenantNameC) {
		this.sfbaseExternalTenantNameC = sfbaseExternalTenantNameC;
	}

	public OrderItem withSfbaseExternalTenantNameC(
			Object sfbaseExternalTenantNameC) {
		this.sfbaseExternalTenantNameC = sfbaseExternalTenantNameC;
		return this;
	}

	@JsonProperty("sfbase__ExternalTenantOwner__c")
	public Object getSfbaseExternalTenantOwnerC() {
		return sfbaseExternalTenantOwnerC;
	}

	@JsonProperty("sfbase__ExternalTenantOwner__c")
	public void setSfbaseExternalTenantOwnerC(Object sfbaseExternalTenantOwnerC) {
		this.sfbaseExternalTenantOwnerC = sfbaseExternalTenantOwnerC;
	}

	public OrderItem withSfbaseExternalTenantOwnerC(
			Object sfbaseExternalTenantOwnerC) {
		this.sfbaseExternalTenantOwnerC = sfbaseExternalTenantOwnerC;
		return this;
	}

	@JsonProperty("TenantData__c")
	public Object getTenantDataC() {
		return tenantDataC;
	}

	@JsonProperty("TenantData__c")
	public void setTenantDataC(Object tenantDataC) {
		this.tenantDataC = tenantDataC;
	}

	public OrderItem withTenantDataC(Object tenantDataC) {
		this.tenantDataC = tenantDataC;
		return this;
	}

	@JsonProperty("OTVCriteria__c")
	public Object getOTVCriteriaC() {
		return oTVCriteriaC;
	}

	@JsonProperty("OTVCriteria__c")
	public void setOTVCriteriaC(Object oTVCriteriaC) {
		this.oTVCriteriaC = oTVCriteriaC;
	}

	public OrderItem withOTVCriteriaC(Object oTVCriteriaC) {
		this.oTVCriteriaC = oTVCriteriaC;
		return this;
	}

	@JsonProperty("NCO__c")
	public Boolean getNCOC() {
		return nCOC;
	}

	@JsonProperty("NCO__c")
	public void setNCOC(Boolean nCOC) {
		this.nCOC = nCOC;
	}

	public OrderItem withNCOC(Boolean nCOC) {
		this.nCOC = nCOC;
		return this;
	}

	@JsonProperty("OpptyOwnerEmail__c")
	public Object getOpptyOwnerEmailC() {
		return opptyOwnerEmailC;
	}

	@JsonProperty("OpptyOwnerEmail__c")
	public void setOpptyOwnerEmailC(Object opptyOwnerEmailC) {
		this.opptyOwnerEmailC = opptyOwnerEmailC;
	}

	public OrderItem withOpptyOwnerEmailC(Object opptyOwnerEmailC) {
		this.opptyOwnerEmailC = opptyOwnerEmailC;
		return this;
	}

	@JsonProperty("OpptyOwnerNotified__c")
	public Boolean getOpptyOwnerNotifiedC() {
		return opptyOwnerNotifiedC;
	}

	@JsonProperty("OpptyOwnerNotified__c")
	public void setOpptyOwnerNotifiedC(Boolean opptyOwnerNotifiedC) {
		this.opptyOwnerNotifiedC = opptyOwnerNotifiedC;
	}

	public OrderItem withOpptyOwnerNotifiedC(Boolean opptyOwnerNotifiedC) {
		this.opptyOwnerNotifiedC = opptyOwnerNotifiedC;
		return this;
	}

	@JsonProperty("Annual_Value__c")
	public Double getAnnualValueC() {
		return annualValueC;
	}

	@JsonProperty("Annual_Value__c")
	public void setAnnualValueC(Double annualValueC) {
		this.annualValueC = annualValueC;
	}

	public OrderItem withAnnualValueC(Double annualValueC) {
		this.annualValueC = annualValueC;
		return this;
	}

	@JsonProperty("AccountLocation__c")
	public String getAccountLocationC() {
		return accountLocationC;
	}

	@JsonProperty("AccountLocation__c")
	public void setAccountLocationC(String accountLocationC) {
		this.accountLocationC = accountLocationC;
	}

	public OrderItem withAccountLocationC(String accountLocationC) {
		this.accountLocationC = accountLocationC;
		return this;
	}

	@JsonProperty("AgreementPriceRule__c")
	public Object getAgreementPriceRuleC() {
		return agreementPriceRuleC;
	}

	@JsonProperty("AgreementPriceRule__c")
	public void setAgreementPriceRuleC(Object agreementPriceRuleC) {
		this.agreementPriceRuleC = agreementPriceRuleC;
	}

	public OrderItem withAgreementPriceRuleC(Object agreementPriceRuleC) {
		this.agreementPriceRuleC = agreementPriceRuleC;
		return this;
	}

	@JsonProperty("ParentOrderItem__c")
	public Object getParentOrderItemC() {
		return parentOrderItemC;
	}

	@JsonProperty("ParentOrderItem__c")
	public void setParentOrderItemC(Object parentOrderItemC) {
		this.parentOrderItemC = parentOrderItemC;
	}

	public OrderItem withParentOrderItemC(Object parentOrderItemC) {
		this.parentOrderItemC = parentOrderItemC;
		return this;
	}

	@JsonProperty("ParentProduct__c")
	public Object getParentProductC() {
		return parentProductC;
	}

	@JsonProperty("ParentProduct__c")
	public void setParentProductC(Object parentProductC) {
		this.parentProductC = parentProductC;
	}

	public OrderItem withParentProductC(Object parentProductC) {
		this.parentProductC = parentProductC;
		return this;
	}

	@JsonProperty("PriceListItem__c")
	public String getPriceListItemC() {
		return priceListItemC;
	}

	@JsonProperty("PriceListItem__c")
	public void setPriceListItemC(String priceListItemC) {
		this.priceListItemC = priceListItemC;
	}

	public OrderItem withPriceListItemC(String priceListItemC) {
		this.priceListItemC = priceListItemC;
		return this;
	}

	@JsonProperty("createAssetLine__c")
	public Boolean getCreateAssetLineC() {
		return createAssetLineC;
	}

	@JsonProperty("createAssetLine__c")
	public void setCreateAssetLineC(Boolean createAssetLineC) {
		this.createAssetLineC = createAssetLineC;
	}

	public OrderItem withCreateAssetLineC(Boolean createAssetLineC) {
		this.createAssetLineC = createAssetLineC;
		return this;
	}

	@JsonProperty("AssetLineId__c")
	public Object getAssetLineIdC() {
		return assetLineIdC;
	}

	@JsonProperty("AssetLineId__c")
	public void setAssetLineIdC(Object assetLineIdC) {
		this.assetLineIdC = assetLineIdC;
	}

	public OrderItem withAssetLineIdC(Object assetLineIdC) {
		this.assetLineIdC = assetLineIdC;
		return this;
	}

	@JsonProperty("ConfigurationType__c")
	public String getConfigurationTypeC() {
		return configurationTypeC;
	}

	@JsonProperty("ConfigurationType__c")
	public void setConfigurationTypeC(String configurationTypeC) {
		this.configurationTypeC = configurationTypeC;
	}

	public OrderItem withConfigurationTypeC(String configurationTypeC) {
		this.configurationTypeC = configurationTypeC;
		return this;
	}

	@JsonProperty("BusinessUnit__c")
	public String getBusinessUnitC() {
		return businessUnitC;
	}

	@JsonProperty("BusinessUnit__c")
	public void setBusinessUnitC(String businessUnitC) {
		this.businessUnitC = businessUnitC;
	}

	public OrderItem withBusinessUnitC(String businessUnitC) {
		this.businessUnitC = businessUnitC;
		return this;
	}

	@JsonProperty("Cloud__c")
	public String getCloudC() {
		return cloudC;
	}

	@JsonProperty("Cloud__c")
	public void setCloudC(String cloudC) {
		this.cloudC = cloudC;
	}

	public OrderItem withCloudC(String cloudC) {
		this.cloudC = cloudC;
		return this;
	}

	@JsonProperty("CostCenter__c")
	public String getCostCenterC() {
		return costCenterC;
	}

	@JsonProperty("CostCenter__c")
	public void setCostCenterC(String costCenterC) {
		this.costCenterC = costCenterC;
	}

	public OrderItem withCostCenterC(String costCenterC) {
		this.costCenterC = costCenterC;
		return this;
	}

	@JsonProperty("GeneralLedger__c")
	public String getGeneralLedgerC() {
		return generalLedgerC;
	}

	@JsonProperty("GeneralLedger__c")
	public void setGeneralLedgerC(String generalLedgerC) {
		this.generalLedgerC = generalLedgerC;
	}

	public OrderItem withGeneralLedgerC(String generalLedgerC) {
		this.generalLedgerC = generalLedgerC;
		return this;
	}

	@JsonProperty("Channel__c")
	public Object getChannelC() {
		return channelC;
	}

	@JsonProperty("Channel__c")
	public void setChannelC(Object channelC) {
		this.channelC = channelC;
	}

	public OrderItem withChannelC(Object channelC) {
		this.channelC = channelC;
		return this;
	}

	@JsonProperty("ComponentQuantityFactor__c")
	public Object getComponentQuantityFactorC() {
		return componentQuantityFactorC;
	}

	@JsonProperty("ComponentQuantityFactor__c")
	public void setComponentQuantityFactorC(Object componentQuantityFactorC) {
		this.componentQuantityFactorC = componentQuantityFactorC;
	}

	public OrderItem withComponentQuantityFactorC(
			Object componentQuantityFactorC) {
		this.componentQuantityFactorC = componentQuantityFactorC;
		return this;
	}

	@JsonProperty("DerivedFrom__c")
	public Object getDerivedFromC() {
		return derivedFromC;
	}

	@JsonProperty("DerivedFrom__c")
	public void setDerivedFromC(Object derivedFromC) {
		this.derivedFromC = derivedFromC;
	}

	public OrderItem withDerivedFromC(Object derivedFromC) {
		this.derivedFromC = derivedFromC;
		return this;
	}

	@JsonProperty("Eligible_for_Delight_Data_Conversion__c")
	public Boolean getEligibleForDelightDataConversionC() {
		return eligibleForDelightDataConversionC;
	}

	@JsonProperty("Eligible_for_Delight_Data_Conversion__c")
	public void setEligibleForDelightDataConversionC(
			Boolean eligibleForDelightDataConversionC) {
		this.eligibleForDelightDataConversionC = eligibleForDelightDataConversionC;
	}

	public OrderItem withEligibleForDelightDataConversionC(
			Boolean eligibleForDelightDataConversionC) {
		this.eligibleForDelightDataConversionC = eligibleForDelightDataConversionC;
		return this;
	}

	@JsonProperty("ParentBundleNumber__c")
	public Double getParentBundleNumberC() {
		return parentBundleNumberC;
	}

	@JsonProperty("ParentBundleNumber__c")
	public void setParentBundleNumberC(Double parentBundleNumberC) {
		this.parentBundleNumberC = parentBundleNumberC;
	}

	public OrderItem withParentBundleNumberC(Double parentBundleNumberC) {
		this.parentBundleNumberC = parentBundleNumberC;
		return this;
	}

	@JsonProperty("PreviousOrderItem__c")
	public Object getPreviousOrderItemC() {
		return previousOrderItemC;
	}

	@JsonProperty("PreviousOrderItem__c")
	public void setPreviousOrderItemC(Object previousOrderItemC) {
		this.previousOrderItemC = previousOrderItemC;
	}

	public OrderItem withPreviousOrderItemC(Object previousOrderItemC) {
		this.previousOrderItemC = previousOrderItemC;
		return this;
	}

	@JsonProperty("PrimaryLineNumber__c")
	public Double getPrimaryLineNumberC() {
		return primaryLineNumberC;
	}

	@JsonProperty("PrimaryLineNumber__c")
	public void setPrimaryLineNumberC(Double primaryLineNumberC) {
		this.primaryLineNumberC = primaryLineNumberC;
	}

	public OrderItem withPrimaryLineNumberC(Double primaryLineNumberC) {
		this.primaryLineNumberC = primaryLineNumberC;
		return this;
	}

	@JsonProperty("QuoteLinePrice__c")
	public Double getQuoteLinePriceC() {
		return quoteLinePriceC;
	}

	@JsonProperty("QuoteLinePrice__c")
	public void setQuoteLinePriceC(Double quoteLinePriceC) {
		this.quoteLinePriceC = quoteLinePriceC;
	}

	public OrderItem withQuoteLinePriceC(Double quoteLinePriceC) {
		this.quoteLinePriceC = quoteLinePriceC;
		return this;
	}

	@JsonProperty("RelatedQuoteLine__c")
	public Object getRelatedQuoteLineC() {
		return relatedQuoteLineC;
	}

	@JsonProperty("RelatedQuoteLine__c")
	public void setRelatedQuoteLineC(Object relatedQuoteLineC) {
		this.relatedQuoteLineC = relatedQuoteLineC;
	}

	public OrderItem withRelatedQuoteLineC(Object relatedQuoteLineC) {
		this.relatedQuoteLineC = relatedQuoteLineC;
		return this;
	}

	@JsonProperty("RevenueAllocationPercentage__c")
	public Object getRevenueAllocationPercentageC() {
		return revenueAllocationPercentageC;
	}

	@JsonProperty("RevenueAllocationPercentage__c")
	public void setRevenueAllocationPercentageC(
			Object revenueAllocationPercentageC) {
		this.revenueAllocationPercentageC = revenueAllocationPercentageC;
	}

	public OrderItem withRevenueAllocationPercentageC(
			Object revenueAllocationPercentageC) {
		this.revenueAllocationPercentageC = revenueAllocationPercentageC;
		return this;
	}

	@JsonProperty("SfdcHas_Inconsistent_Asset__c")
	public Boolean getSfdcHasInconsistentAssetC() {
		return sfdcHasInconsistentAssetC;
	}

	@JsonProperty("SfdcHas_Inconsistent_Asset__c")
	public void setSfdcHasInconsistentAssetC(Boolean sfdcHasInconsistentAssetC) {
		this.sfdcHasInconsistentAssetC = sfdcHasInconsistentAssetC;
	}

	public OrderItem withSfdcHasInconsistentAssetC(
			Boolean sfdcHasInconsistentAssetC) {
		this.sfdcHasInconsistentAssetC = sfdcHasInconsistentAssetC;
		return this;
	}

	@JsonProperty("SfdcRenewFromAsset__c")
	public Boolean getSfdcRenewFromAssetC() {
		return sfdcRenewFromAssetC;
	}

	@JsonProperty("SfdcRenewFromAsset__c")
	public void setSfdcRenewFromAssetC(Boolean sfdcRenewFromAssetC) {
		this.sfdcRenewFromAssetC = sfdcRenewFromAssetC;
	}

	public OrderItem withSfdcRenewFromAssetC(Boolean sfdcRenewFromAssetC) {
		this.sfdcRenewFromAssetC = sfdcRenewFromAssetC;
		return this;
	}

	@JsonProperty("SourceAsset__c")
	public Object getSourceAssetC() {
		return sourceAssetC;
	}

	@JsonProperty("SourceAsset__c")
	public void setSourceAssetC(Object sourceAssetC) {
		this.sourceAssetC = sourceAssetC;
	}

	public OrderItem withSourceAssetC(Object sourceAssetC) {
		this.sourceAssetC = sourceAssetC;
		return this;
	}

	@JsonProperty("TransferItem__c")
	public Object getTransferItemC() {
		return transferItemC;
	}

	@JsonProperty("TransferItem__c")
	public void setTransferItemC(Object transferItemC) {
		this.transferItemC = transferItemC;
	}

	public OrderItem withTransferItemC(Object transferItemC) {
		this.transferItemC = transferItemC;
		return this;
	}

	@JsonProperty("updateAsset__c")
	public Boolean getUpdateAssetC() {
		return updateAssetC;
	}

	@JsonProperty("updateAsset__c")
	public void setUpdateAssetC(Boolean updateAssetC) {
		this.updateAssetC = updateAssetC;
	}

	public OrderItem withUpdateAssetC(Boolean updateAssetC) {
		this.updateAssetC = updateAssetC;
		return this;
	}

	@JsonProperty("EntitlementUsageGroup__c")
	public Object getEntitlementUsageGroupC() {
		return entitlementUsageGroupC;
	}

	@JsonProperty("EntitlementUsageGroup__c")
	public void setEntitlementUsageGroupC(Object entitlementUsageGroupC) {
		this.entitlementUsageGroupC = entitlementUsageGroupC;
	}

	public OrderItem withEntitlementUsageGroupC(Object entitlementUsageGroupC) {
		this.entitlementUsageGroupC = entitlementUsageGroupC;
		return this;
	}

	@JsonProperty("MigrationSourceLineId__c")
	public Object getMigrationSourceLineIdC() {
		return migrationSourceLineIdC;
	}

	@JsonProperty("MigrationSourceLineId__c")
	public void setMigrationSourceLineIdC(Object migrationSourceLineIdC) {
		this.migrationSourceLineIdC = migrationSourceLineIdC;
	}

	public OrderItem withMigrationSourceLineIdC(Object migrationSourceLineIdC) {
		this.migrationSourceLineIdC = migrationSourceLineIdC;
		return this;
	}

	@JsonProperty("Bookings_Treatment__c")
	public String getBookingsTreatmentC() {
		return bookingsTreatmentC;
	}

	@JsonProperty("Bookings_Treatment__c")
	public void setBookingsTreatmentC(String bookingsTreatmentC) {
		this.bookingsTreatmentC = bookingsTreatmentC;
	}

	public OrderItem withBookingsTreatmentC(String bookingsTreatmentC) {
		this.bookingsTreatmentC = bookingsTreatmentC;
		return this;
	}

	@JsonProperty("IsSharedUsage__c")
	public Boolean getIsSharedUsageC() {
		return isSharedUsageC;
	}

	@JsonProperty("IsSharedUsage__c")
	public void setIsSharedUsageC(Boolean isSharedUsageC) {
		this.isSharedUsageC = isSharedUsageC;
	}

	public OrderItem withIsSharedUsageC(Boolean isSharedUsageC) {
		this.isSharedUsageC = isSharedUsageC;
		return this;
	}

	@JsonProperty("NormalizedMonthlyUnitPrice__c")
	public Double getNormalizedMonthlyUnitPriceC() {
		return normalizedMonthlyUnitPriceC;
	}

	@JsonProperty("NormalizedMonthlyUnitPrice__c")
	public void setNormalizedMonthlyUnitPriceC(
			Double normalizedMonthlyUnitPriceC) {
		this.normalizedMonthlyUnitPriceC = normalizedMonthlyUnitPriceC;
	}

	public OrderItem withNormalizedMonthlyUnitPriceC(
			Double normalizedMonthlyUnitPriceC) {
		this.normalizedMonthlyUnitPriceC = normalizedMonthlyUnitPriceC;
		return this;
	}

	@JsonProperty("OverageRate__c")
	public Object getOverageRateC() {
		return overageRateC;
	}

	@JsonProperty("OverageRate__c")
	public void setOverageRateC(Object overageRateC) {
		this.overageRateC = overageRateC;
	}

	public OrderItem withOverageRateC(Object overageRateC) {
		this.overageRateC = overageRateC;
		return this;
	}

	@JsonProperty("sfbase__ProductBillingTreatment__c")
	public String getSfbaseProductBillingTreatmentC() {
		return sfbaseProductBillingTreatmentC;
	}

	@JsonProperty("sfbase__ProductBillingTreatment__c")
	public void setSfbaseProductBillingTreatmentC(
			String sfbaseProductBillingTreatmentC) {
		this.sfbaseProductBillingTreatmentC = sfbaseProductBillingTreatmentC;
	}

	public OrderItem withSfbaseProductBillingTreatmentC(
			String sfbaseProductBillingTreatmentC) {
		this.sfbaseProductBillingTreatmentC = sfbaseProductBillingTreatmentC;
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

	public OrderItem withApplicableToRmsC(Boolean applicableToRmsC) {
		this.applicableToRmsC = applicableToRmsC;
		return this;
	}

	@JsonProperty("EvaluateReductionOrderItemForRMS__c")
	public Boolean getEvaluateReductionOrderItemForRMSC() {
		return evaluateReductionOrderItemForRMSC;
	}

	@JsonProperty("EvaluateReductionOrderItemForRMS__c")
	public void setEvaluateReductionOrderItemForRMSC(
			Boolean evaluateReductionOrderItemForRMSC) {
		this.evaluateReductionOrderItemForRMSC = evaluateReductionOrderItemForRMSC;
	}

	public OrderItem withEvaluateReductionOrderItemForRMSC(
			Boolean evaluateReductionOrderItemForRMSC) {
		this.evaluateReductionOrderItemForRMSC = evaluateReductionOrderItemForRMSC;
		return this;
	}

	@JsonProperty("ExtendedListPrice__c")
	public Object getExtendedListPriceC() {
		return extendedListPriceC;
	}

	@JsonProperty("ExtendedListPrice__c")
	public void setExtendedListPriceC(Object extendedListPriceC) {
		this.extendedListPriceC = extendedListPriceC;
	}

	public OrderItem withExtendedListPriceC(Object extendedListPriceC) {
		this.extendedListPriceC = extendedListPriceC;
		return this;
	}

	@JsonProperty("ExternalCloud__c")
	public Object getExternalCloudC() {
		return externalCloudC;
	}

	@JsonProperty("ExternalCloud__c")
	public void setExternalCloudC(Object externalCloudC) {
		this.externalCloudC = externalCloudC;
	}

	public OrderItem withExternalCloudC(Object externalCloudC) {
		this.externalCloudC = externalCloudC;
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

	public OrderItem withReasonNotApplicableToRmsC(
			Object reasonNotApplicableToRmsC) {
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

	public OrderItem withSyncWithRmsC(Boolean syncWithRmsC) {
		this.syncWithRmsC = syncWithRmsC;
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

	public OrderItem withCreatePoC(Boolean createPoC) {
		this.createPoC = createPoC;
		return this;
	}

	@JsonProperty("DPP_List_Price__c")
	public Object getDPPListPriceC() {
		return dPPListPriceC;
	}

	@JsonProperty("DPP_List_Price__c")
	public void setDPPListPriceC(Object dPPListPriceC) {
		this.dPPListPriceC = dPPListPriceC;
	}

	public OrderItem withDPPListPriceC(Object dPPListPriceC) {
		this.dPPListPriceC = dPPListPriceC;
		return this;
	}

	@JsonProperty("PoCorrespondent__c")
	public Object getPoCorrespondentC() {
		return poCorrespondentC;
	}

	@JsonProperty("PoCorrespondent__c")
	public void setPoCorrespondentC(Object poCorrespondentC) {
		this.poCorrespondentC = poCorrespondentC;
	}

	public OrderItem withPoCorrespondentC(Object poCorrespondentC) {
		this.poCorrespondentC = poCorrespondentC;
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

	public OrderItem withPoTrackerC(Object poTrackerC) {
		this.poTrackerC = poTrackerC;
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

	public OrderItem withAdditionalProperty(String name, Object value) {
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
