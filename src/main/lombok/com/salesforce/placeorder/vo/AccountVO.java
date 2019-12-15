package com.salesforce.placeorder.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder(toBuilder = true)
@Setter
@Getter
@ToString
public class AccountVO {
	public String id;
	public String owner;
	public String ownerid;
	public String namedOwnerId;
	public String recordType;
	public String currencyISOCode;
	public String name;
	public String numEmployees;
	public String billingAddress;
	public String shippingAddress;
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
	public String ultimateParentDuns;
}
