package com.salesforce.placeorder.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder(toBuilder = true)
@Setter
@Getter
@ToString
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
