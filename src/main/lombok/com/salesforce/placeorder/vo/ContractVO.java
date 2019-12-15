package com.salesforce.placeorder.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder(toBuilder = true)
@Setter
@Getter
@ToString
public class ContractVO {
	public String id;
	public String owner;
	public String recordType;
	public String accountName;
	public String contractNumber;
	public String contractType;
	public String contractStartDate;
	public String contractTerm;
	public String contractStatus;
	public String currencyISOCode;
	public String priceBook;
	public String initialContractEnddate;
	public String autoRenewal;
	public int renewalTerm;
	public int renewalDays;
	public String billingStreet;
	public String billingCity;
	public String billingState;
	public String billingZip;
	public String billingCountry;
	public String shippingStreet;
	public String shippingCity;
	public String shippingState;
	public String shippingZip;
	public String shippingCountry;
	public String billingCompanyName;
	public String billingContactName;
	public String billingFirstName;
	public String billingLastName;
	public String billingLanguage;
	public String billingEmail;
	public String paymentTerms;
	public String orderPrebillDays;
	public String billingFrequency;
	public String billingLanguageCode;
	public String paymentType;
	public String VATExemptionReason;
}
