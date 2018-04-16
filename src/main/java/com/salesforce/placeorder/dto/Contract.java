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
@JsonPropertyOrder({ "attributes", "Id", "RecordTypeId", "AccountId",
		"StartDate", "Status", "ContractTerm", "BillingLanguage",
		"BillingEmail", "BillingLastName", "sfbase__Billing_Frequency__c",
		"ContractType__c", "Billing Street", "BillingCountry", "BillingCity",
		"BillingState", "BillingPostalCode", "Shipping Street",
		"ShippingCountry", "ShippingCity", "ShippingState",
		"ShippingPostalCode", "PaymentTerm", "AutoRenewCode",
		"OrderPrebillDays", "Pricebook2Id", "Orders" })
public class Contract implements Serializable {

	@JsonProperty("attributes")
	private Attributes attributes;
	@JsonProperty("Id")
	private String id;
	@JsonProperty("RecordTypeId")
	private String recordTypeId;
	@JsonProperty("AccountId")
	private String accountId;
	@JsonProperty("StartDate")
	private String startDate;
	@JsonProperty("Status")
	private String status;
	@JsonProperty("ContractTerm")
	private String contractTerm;
	@JsonProperty("BillingLanguage")
	private String billingLanguage;
	@JsonProperty("BillingEmail")
	private String billingEmail;
	@JsonProperty("BillingLastName")
	private String billingLastname;
	@JsonProperty("sfbase__Billing_Frequency__c")
	private String billingFrequency;
	@JsonProperty("ContractType__c")
	private String contractType;
	@JsonProperty("BillingCountry")
	private String billingCountry;
	@JsonProperty("BillingStreet")
	private String billingStreet;
	@JsonProperty("BillingCity")
	private String billingCity;
	@JsonProperty("BillingState")
	private String billingState;
	@JsonProperty("BillingPostalCode")
	private String billingPostalCode;
	@JsonProperty("ShippingCountry")
	private String shippingCountry;
	@JsonProperty("ShippingStreet")
	private String shippingStreet;
	@JsonProperty("ShippingCity")
	private String shippingCity;
	@JsonProperty("ShippingState")
	private String shippingState;
	@JsonProperty("ShippingPostalCode")
	private String shippingPostalCode;
	@JsonProperty("PaymentTerm")
	private String paymentTerm;
	@JsonProperty("AutoRenewCode")
	private String autoRenewCode;
	@JsonProperty("OrderPrebillDays")
	private String orderPrebillDays;
	@JsonProperty("Pricebook2Id")
	private String pricebook2Id;
	@JsonProperty("Orders")
	private Orders orders;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 3447153890476749161L;

	@JsonIgnore
	private String recordTypeName;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Contract() {
	}

	@JsonProperty("attributes")
	public Attributes getAttributes() {
		return attributes;
	}

	@JsonProperty("attributes")
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public Contract withAttributes(Attributes attributes) {
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

	public Contract withId(String id) {
		this.id = id;
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

	public Contract withRecordTypeId(String recordTypeId) {
		this.recordTypeId = recordTypeId;
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

	public Contract withAccountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	@JsonProperty("StartDate")
	public String getStartDate() {
		return startDate;
	}

	@JsonProperty("StartDate")
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Contract withStartDate(String startDate) {
		this.startDate = startDate;
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

	public Contract withStatus(String status) {
		this.status = status;
		return this;
	}

	@JsonProperty("ContractTerm")
	public String getContractTerm() {
		return contractTerm;
	}

	@JsonProperty("ContractTerm")
	public void setContractTerm(String contractTerm) {
		this.contractTerm = contractTerm;
	}

	public Contract withContractTerm(String contractTerm) {
		this.contractTerm = contractTerm;
		return this;
	}

	@JsonProperty("BillingLanguage")
	public String getBillingLanguage() {
		return billingLanguage;
	}

	@JsonProperty("BillingLanguage")
	public void setBillingLanguage(String billingLanguage) {
		this.billingLanguage = billingLanguage;
	}

	public Contract withBillingLanguage(String billingLanguage) {
		this.billingLanguage = billingLanguage;
		return this;
	}

	@JsonProperty("BillingEmail")
	public String getBillingEmail() {
		return billingEmail;
	}

	@JsonProperty("BillingEmail")
	public void setBillingEmail(String billingEmail) {
		this.billingEmail = billingEmail;
	}

	public Contract withBillingEmail(String billingEmail) {
		this.billingEmail = billingEmail;
		return this;
	}

	@JsonProperty("BillingLastName")
	public String getBillingLastName() {
		return billingLastname;
	}

	@JsonProperty("BillingLastName")
	public void setBillingLastName(String billingLastname) {
		this.billingLastname = billingLastname;
	}

	public Contract withBillingLastName(String billingLastname) {
		this.billingLastname = billingLastname;
		return this;
	}

	@JsonProperty("sfbase__Billing_Frequency__c")
	public String getBillingFrequency() {
		return billingFrequency;
	}

	@JsonProperty("sfbase__Billing_Frequency__c")
	public void setBillingFrequency(String billingFrequency) {
		this.billingFrequency = billingFrequency;
	}

	public Contract withBillingFrequency(String billingFrequency) {
		this.billingFrequency = billingFrequency;
		return this;
	}

	@JsonProperty("sfbase__ContractType__c")
	public String getContractType() {
		return contractType;
	}

	@JsonProperty("sfbase__ContractType__c")
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public Contract withContractType(String contractType) {
		this.contractType = contractType;
		return this;
	}

	@JsonProperty("BillingCountry")
	public String getBillingCountry() {
		return billingCountry;
	}

	@JsonProperty("BillingCountry")
	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}

	public Contract withBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
		return this;
	}

	@JsonProperty("BillingCity")
	public String getBillingCity() {
		return billingCity;
	}

	@JsonProperty("BillingCity")
	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	public Contract withBillingCity(String billingCity) {
		this.billingCity = billingCity;
		return this;
	}

	@JsonProperty("BillingStreet")
	public String getBillingStreet() {
		return billingStreet;
	}

	@JsonProperty("BillingStreet")
	public void setBillingStreet(String billingStreet) {
		this.billingStreet = billingStreet;
	}

	public Contract withBillingStreet(String billingStreet) {
		this.billingStreet = billingStreet;
		return this;
	}

	@JsonProperty("BillingState")
	public String getBillingState() {
		return billingState;
	}

	@JsonProperty("BillingState")
	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}

	public Contract withBillingState(String billingState) {
		this.billingState = billingState;
		return this;
	}

	@JsonProperty("BillingPostalCode")
	public String getBillingPostalCode() {
		return billingPostalCode;
	}

	@JsonProperty("BillingPostalCode")
	public void setBillingPostalCode(String billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
	}

	public Contract withBillingPostalCode(String billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
		return this;
	}

	@JsonProperty("ShippingCountry")
	public String getShippingCountry() {
		return shippingCountry;
	}

	@JsonProperty("ShippingCountry")
	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}

	public Contract withShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
		return this;
	}

	@JsonProperty("ShippingStreet")
	public String getShippingStreet() {
		return shippingStreet;
	}

	@JsonProperty("ShippingStreet")
	public void setShippingStreet(String shippingStreet) {
		this.shippingStreet = shippingStreet;
	}

	public Contract withShippingStreet(String shippingStreet) {
		this.shippingStreet = shippingStreet;
		return this;
	}

	@JsonProperty("ShippingCity")
	public String getShippingCity() {
		return shippingCity;
	}

	@JsonProperty("ShippingCity")
	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	public Contract withShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
		return this;
	}

	@JsonProperty("ShippingState")
	public String getShippingState() {
		return shippingState;
	}

	@JsonProperty("ShippingState")
	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}

	public Contract withShippingState(String shippingState) {
		this.shippingState = shippingState;
		return this;
	}

	@JsonProperty("ShippingPostalCode")
	public String getShippingPostalCode() {
		return shippingPostalCode;
	}

	@JsonProperty("ShippingPostalCode")
	public void setShippingPostalCode(String shippingPostalCode) {
		this.shippingPostalCode = shippingPostalCode;
	}

	public Contract withShippingPostalCode(String shippingPostalCode) {
		this.shippingPostalCode = shippingPostalCode;
		return this;
	}

	@JsonProperty("PaymentTerm")
	public String getPaymentTerm() {
		return paymentTerm;
	}

	@JsonProperty("PaymentTerm")
	public void setPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}

	public Contract withPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
		return this;
	}

	@JsonProperty("AutoRenewCode")
	public String getAutoRenewCode() {
		return autoRenewCode;
	}

	@JsonProperty("AutoRenewCode")
	public void setAutoRenewCode(String autoRenewCode) {
		this.autoRenewCode = autoRenewCode;
	}

	public Contract withAutoRenewCode(String autoRenewCode) {
		this.autoRenewCode = autoRenewCode;
		return this;
	}

	@JsonProperty("OrderPrebillDays")
	public String getOrderPrebillDays() {
		return orderPrebillDays;
	}

	@JsonProperty("OrderPrebillDays")
	public void setOrderPrebillDays(String orderPrebillDays) {
		this.orderPrebillDays = orderPrebillDays;
	}

	public Contract withOrderPrebillDays(String orderPrebillDays) {
		this.orderPrebillDays = orderPrebillDays;
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

	public Contract withPricebook2Id(String pricebook2Id) {
		this.pricebook2Id = pricebook2Id;
		return this;
	}

	@JsonProperty("Orders")
	public Orders getOrders() {
		return orders;
	}

	@JsonProperty("Orders")
	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Contract withOrders(Orders orders) {
		this.orders = orders;
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

	public Contract withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	public String getRecordTypeName() {
		return recordTypeName;
	}

	public void setRecordTypeName(String recordTypeName) {
		this.recordTypeName = recordTypeName;
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
