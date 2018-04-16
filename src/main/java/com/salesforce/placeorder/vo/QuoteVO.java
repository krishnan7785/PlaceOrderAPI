package com.salesforce.placeorder.vo;

import net.karneim.pojobuilder.GeneratePojoBuilder;

@GeneratePojoBuilder(intoPackage = "com.salesforce.placeorder.builder")
public class QuoteVO {
	public String id;
	public String recordType;
	public String serviceStartDate;
	public String quoteTerm;
	public String quoteName;
	public String accountId;
	public String opportunityId;
	public String pricelistId;
	public String accountName;
	public String opportunityName;
	public String priceList;
	public String autoRenew;

}
