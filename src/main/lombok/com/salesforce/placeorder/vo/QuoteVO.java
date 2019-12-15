package com.salesforce.placeorder.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder(toBuilder = true)
@Setter
@Getter
@ToString
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
