package com.salesforce.placeorder.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder(toBuilder = true)
@Setter
@Getter
@ToString
public class OrderVO {
	public String id;
	public String owner;
	public String recordType;
	public String currencyISOCode;
	public String accountName;
	public String contractNumber;
	public String orderStartDate;
	public String orderEndDate;
	public String orderTerm;
	public String orderStatus;
	public String customerPoRequired;
	public String opportunityName;
	public String poNumber;
	public String poAmount;
	public String shippingStreet;
	public String shippingCity;
	public String shippingState;
	public String shippingZip;
	public String shippingCountry;
	public String orderType;
	public String orderSubtype;
	public String commissionStatus;
	public String commissionProcessingMessage;
	public String orderTeamStatus;
	public String orderTeamMessage;
	public boolean markForOrderTeamCreate;
	public boolean doNotCommission;
	public boolean evaluateRamp;
	public String incrementalAcvPercent;
	public String aePercent;
	public String rmPercent;
	public String cashMovement;
	public String cmCode;
	public String cmReason;
	public String orderCommissionType;
	public String orderCommissionSubType;
	public String replacementOrderNumber;
	public String rampStatus;
	public boolean priceRamp;
	public String ramp;
	public String priceRampEndDate;
	public String initialPriceRampOrder;
	public boolean rampProcessHold;
	public String priorPriceRampOrder;
	public String nextPriceRampOrder;
	public String rampDealPrior;
	public String rampDealNext;
	public String rampProcessingMessage;
	public String orderNumber;
	public String reductionOrderCommissionType;
	public String reductionOrderCommissionSubtype;
}
