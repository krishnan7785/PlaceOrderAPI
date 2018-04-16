package com.salesforce.placeorder.vo;

import net.karneim.pojobuilder.GeneratePojoBuilder;

@GeneratePojoBuilder(intoPackage = "com.salesforce.placeorder.builder")
public class OpportunityVO {
	public String id;
	public String recordType;
	public String owner;
	public String ownerid;
	public String name;
	public String currencyISOCode;
	public String type;
	public String amount;
	public String amountConverted;
	public String closeDate;
	public String stage;
	public String forcastCategory;
	public String opportunityCurrency;
	public String accountName;
	public String opptyTeamStatus;
	public String opptyTeamErrorMessage;
	public boolean markForOppurtunityTeamCreate;
}
