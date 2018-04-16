package com.salesforce.placeorder.util;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.util.Strings;

import com.salesforce.placeorder.helper.LogHelper;
import com.salesforce.placeorder.vo.AccountVO;
import com.salesforce.placeorder.vo.ContractVO;
import com.salesforce.placeorder.vo.OpportunityVO;
import com.salesforce.placeorder.vo.QuoteVO;
import com.salesforce.placeorder.vo.UserVO;
import com.sforce.soap.partner.SaveResult;
import com.sforce.soap.partner.sobject.SObject;

public class ObjectUtil {

	public static SObject[] fetchProduct2(UserVO user, String orderId) {
		String product2qry = "select Pricebookentry.Product2Id from OrderItem where Orderid='"
				+ orderId + "'";
		SObject[] records = ForceUtil.query(user, product2qry);
		Assert.assertNotNull(records);
		return records;
	}

	public static SObject[] getRecordTypes(UserVO user, String objname) {
		String rectypeqry = "SELECT id,Name,isActive,SobjectType FROM RecordType where SobjectType ='"
				+ objname + "'";
		SObject[] recordtypes = ForceUtil.query(user, rectypeqry);

		return recordtypes;
	}

	public static String getPricebookId(UserVO user, String name) {
		String pricebook2qry = "SELECT id,Name FROM Pricebook2 where Name ='"
				+ name + "'";
		SObject[] pricebooks = ForceUtil.query(user, pricebook2qry);
		Assert.assertNotNull(pricebooks);
		Assert.assertNotNull(pricebooks[0]);
		return pricebooks[0].getId();
	}

	public static SObject getPricebookEntry(UserVO user, String productName,
			String pricebookname, boolean isCommissionable) {
		String pricebookqry = "SELECT id,pricebook2id,product2id FROM pricebookentry where pricebook2.name ='"
				+ pricebookname
				+ "'"
				+ " and product2.name='"
				+ productName
				+ "'" + " and product2.Commissionable__c=" + isCommissionable;
		SObject[] pricebooks = ForceUtil.query(user, pricebookqry);
		Assert.assertNotNull(pricebooks);
		Assert.assertNotNull(pricebooks[0]);
		return pricebooks[0];
	}

	public static String getPriceListId(UserVO user, String name) {
		String pricelistqry = "SELECT id,Apttus_Config2__AccountId__c,SfdcSystem__c,Apttus_Config2__Active__c,Apttus_Config2__Type__c,SfdcRelatedPriceBook__c FROM Apttus_Config2__PriceList__c where Apttus_Config2__Active__c=true and SfdcRelatedPriceBook__r.name = '"
				+ name + "'";
		SObject[] pricelists = ForceUtil.query(user, pricelistqry);
		Assert.assertNotNull(pricelists);
		Assert.assertNotNull(pricelists[0]);
		return pricelists[0].getId();
	}

	public static String getContextUserProfileName() {
		SObject[] profiles = null;
		String profileid = ForceUtil.getUserInfo().getProfileId();
		if (profileid != null && profileid.length() > 1) {
			String profileqry = "SELECT id,Name,isActive From Profile where id ='"
					+ profileid + "'";
			profiles = ForceUtil.query(null, profileqry);
			SObject profile = profiles[0];
			if (profile != null)
				return String.valueOf(profile.getField("Name"));
		}
		return null;
	}

	public static String getRecordtypeId(UserVO user, String name,
			String objname) {

		String rectypeid = null;
		SObject[] recordtypes = getRecordTypes(user, objname);
		for (SObject obj : recordtypes) {
			String recname = String.valueOf(obj.getField("Name"));
			if (recname.equals(name)) {
				rectypeid = obj.getId();
				LogHelper.logger.debug("Recordtypeid :" + rectypeid
						+ " Object Name: " + objname);
				return rectypeid;
			}
		}

		return null;
	}

	public static void updateAccountOwner(UserVO user, String accountid,
			String ownerid) {
		SObject item = new SObject();
		item.setType("Account");
		item.setId(accountid);
		item.setField("ownerid ", ownerid);
		SaveResult[] results = ForceUtil.updateSobject(user,
				new SObject[] { item });
		for (SaveResult result : results) {
			if (result.isSuccess())
				LogHelper.logger.debug("Update Success: " + result.getId());
			else {
				for (com.sforce.soap.partner.Error error : result.getErrors())
					LogHelper.logger.error("Update Account Errors :"
							+ error.getMessage());
			}
		}
	}

	public static void updateNamedOwner(UserVO user, String accountid,
			String ownerid) {
		SObject item = new SObject();
		item.setType("Account");
		item.setId(accountid);
		item.setField("Named_Owner__c", ownerid);
		SaveResult[] results = ForceUtil.updateSobject(user,
				new SObject[] { item });
		for (SaveResult result : results) {
			if (result.isSuccess())
				LogHelper.logger.debug("Update Success: " + result.getId());
			else {
				for (com.sforce.soap.partner.Error error : result.getErrors())
					LogHelper.logger.error("Update Account Errors :"
							+ error.getMessage());
			}
		}
	}

	public static void updateOpportunityOwner(UserVO user, String opptyid,
			String ownerid) {
		SObject item = new SObject();
		item.setType("Opportunity");
		item.setId(opptyid);
		item.setField("ownerid ", ownerid);
		SaveResult[] results = ForceUtil.updateSobject(user,
				new SObject[] { item });
		for (SaveResult result : results) {
			if (result.isSuccess())
				LogHelper.logger.debug("Update Success: " + result.getId());
			else {
				for (com.sforce.soap.partner.Error error : result.getErrors())
					LogHelper.logger.error("Update Opportunity Errors :"
							+ error.getMessage());
			}
		}
	}

	public static String createTestAccount(UserVO user, AccountVO acc) {
		SObject account = new SObject();
		account.setType("Account");
		account.setField("Name", acc.name);
		account.setField("billingCountry", acc.billingCountry);
		account.setField("billingCity", acc.billingCity);
		account.setField("billingState", acc.billingState);
		account.setField("billingPostalCode", acc.billingZip);
		account.setField("billingStreet", acc.billingStreet);
		account.setField("shippingCountry", acc.shippingCountry);
		account.setField("shippingState", acc.shippingState);
		account.setField("shippingCity", acc.shippingCity);
		account.setField("shippingStreet", acc.shippingStreet);
		account.setField("shippingPostalCode", acc.shippingZip);
		account.setField("NumberOfEmployees", Integer.valueOf(acc.numEmployees));
		account.setField("RecordTypeId",
				getRecordtypeId(user, acc.recordType, account.getType()));
		if (!Strings.isNullOrEmpty(acc.currencyISOCode))
			account.setField("currencyISOCode", acc.currencyISOCode);
		SaveResult[] results = ForceUtil.createSobject(user,
				new SObject[] { account });
		SaveResult result = results[0];
		for (com.sforce.soap.partner.Error error : result.getErrors())

			LogHelper.logger.error("Create Account Errors :"
					+ error.getMessage());
		Assert.assertNotNull(result.getId());
		LogHelper.logger.debug("Account id: " + result.getId());
		return result.getId();
	}

	public static String createTestOpportunity(UserVO user, OpportunityVO opp,
			String accountId) {

		SObject opportunity = new SObject();
		opportunity.setType("Opportunity");
		opportunity.setField("Name", opp.name);
		opportunity.setField("AccountId", accountId);
		opportunity.setField("StageName", opp.stage);
		opportunity.setField("CloseDate",
				DateUtil.getApiFormattedDate(opp.closeDate));
		if (opp.amount != null)
			opportunity.setField("Amount", opp.amount);
		opportunity.setField("Type", opp.type);
		opportunity.setField("RecordTypeId",
				getRecordtypeId(user, opp.recordType, opportunity.getType()));
		if (!Strings.isNullOrEmpty(opp.currencyISOCode))
			opportunity.setField("currencyISOCode", opp.currencyISOCode);
		SaveResult[] results = ForceUtil.createSobject(user,
				new SObject[] { opportunity });
		SaveResult result = results[0];
		for (com.sforce.soap.partner.Error error : result.getErrors())
			LogHelper.logger.error("Create Opportunity Errors :"
					+ error.getMessage());
		Assert.assertNotNull(result.getId());
		LogHelper.logger.debug("Opportunity id: " + result.getId());
		return result.getId();
	}

	public static String createTestQuote(UserVO user, QuoteVO q,
			String accountId, String opportunityId) {
		SObject quote = new SObject();
		quote.setType("Apttus_Proposal__Proposal__c");
		// quote.setField("Name", q.quoteName);
		quote.setField("Apttus_Proposal__Account__c", accountId);
		quote.setField("Apttus_Proposal__Opportunity__c", opportunityId);
		quote.setField("Apttus_Proposal__ExpectedStartDate__c",
				DateUtil.getApiFormattedDate(q.serviceStartDate));
		quote.setField("Apttus_QPConfig__PriceListId__c",
				getPriceListId(user, q.priceList));
		quote.setField("SfdcContractTermMonths__c", q.quoteTerm);
		quote.setField("SfdcAutoRenew__c", q.autoRenew);
		quote.setField("RecordTypeId",
				getRecordtypeId(user, q.recordType, quote.getType()));
		quote.setField("CurrencyIsoCode", "USD");
		SaveResult[] results = ForceUtil.createSobject(user,
				new SObject[] { quote });
		SaveResult result = results[0];
		for (com.sforce.soap.partner.Error error : result.getErrors())
			LogHelper.logger
					.error("Create Quote Errors :" + error.getMessage());
		Assert.assertNotNull(result.getId());
		LogHelper.logger.debug("Quote id: " + result.getId());
		return result.getId();
	}

	public static String updateOrderRelatedQuote(UserVO user, String orderId,
			String relatedQuoteId) {
		SObject order = new SObject();
		order.setType("Order");
		order.setId(orderId);
		order.setField("SfdcRelatedQuote__c", relatedQuoteId);

		SaveResult[] results = ForceUtil.updateSobject(user,
				new SObject[] { order });
		SaveResult result = results[0];
		for (com.sforce.soap.partner.Error error : result.getErrors())
			LogHelper.logger
					.error("Update Order Errors :" + error.getMessage());
		Assert.assertNotNull(result.getId());
		LogHelper.logger.debug("Order id: " + result.getId());
		return result.getId();
	}

	public static String createTestContract(UserVO user, ContractVO cntr,
			String accountId) {

		SObject contract = new SObject();
		contract.setType("Contract");
		contract.setField("AccountId", accountId);
		contract.setField("Status", cntr.contractStatus);
		contract.setField("StartDate",
				DateUtil.getApiFormattedDate(cntr.contractStartDate));
		contract.setField("shippingCountry", cntr.shippingCountry);
		contract.setField("shippingState", cntr.shippingState);
		contract.setField("shippingCity", cntr.shippingCity);
		contract.setField("shippingStreet", cntr.shippingStreet);
		contract.setField("shippingPostalCode", cntr.shippingZip);
		contract.setField("ContractTerm", Integer.valueOf(cntr.contractTerm));
		contract.setField("sfbase__ContractType__c", cntr.contractType);
		contract.setField("AutoRenewCode", cntr.autoRenewal);
		if (cntr.autoRenewal.equalsIgnoreCase("yes")) {
			contract.setField("RenewalTerm", cntr.renewalTerm);
			contract.setField("RenewalDays", cntr.renewalDays);
		}
		contract.setField("billingCountry", cntr.billingCountry);
		contract.setField("billingCity", cntr.billingCity);
		contract.setField("billingState", cntr.billingState);
		contract.setField("billingPostalCode", cntr.billingZip);
		contract.setField("billingStreet", cntr.billingStreet);
		contract.setField("billingFirstName", cntr.billingFirstName);
		contract.setField("billingLastName", cntr.billingLastName);
		contract.setField("billingEmail", cntr.billingEmail);
		contract.setField("PaymentTerm",
				StringUtils.deleteWhitespace(cntr.paymentTerms));
		contract.setField("OrderPrebillDays",
				Integer.valueOf(cntr.orderPrebillDays));
		contract.setField("sfbase__Billing_Frequency__c", cntr.billingFrequency);
		contract.setField("BillingLanguage", cntr.billingLanguageCode);
		contract.setField("pricebook2id", getPricebookId(user, cntr.priceBook));
		contract.setField("RecordTypeId",
				getRecordtypeId(user, cntr.recordType, contract.getType()));
		if (!Strings.isNullOrEmpty(cntr.currencyISOCode))
			contract.setField("currencyISOCode", cntr.currencyISOCode);
		contract.setField("sfbase__PaymentType__c", cntr.paymentType);
		if (!Strings.isNullOrEmpty(cntr.VATExemptionReason))
			contract.setField("SfdcCustomerVATExemptionReason__c",
					cntr.VATExemptionReason);

		SaveResult[] results = ForceUtil.createSobject(user,
				new SObject[] { contract });
		SaveResult result = results[0];
		for (com.sforce.soap.partner.Error error : result.getErrors())
			LogHelper.logger.error("Create Contract Errors :"
					+ error.getMessage());
		Assert.assertNotNull(result.getId());
		LogHelper.logger.debug("Contract id: " + result.getId());
		return result.getId();
	}

	public static String fetchOrderNumber(UserVO user, String orderId) {
		String rampdetails = "SELECT OrderNumber FROM Order where id = '"
				+ orderId + "' limit 1";
		SObject[] records = ForceUtil.query(user, rampdetails);
		Assert.assertNotNull(records);
		Assert.assertNotNull(records[0]);
		return String.valueOf(records[0].getField("OrderNumber"));
	}

	public static boolean isReductionOrder(UserVO user, String orderId) {
		String rampdetails = "SELECT IsReductionOrder FROM Order where id = '"
				+ orderId + "' limit 1";
		SObject[] records = ForceUtil.query(user, rampdetails);
		Assert.assertNotNull(records);
		Assert.assertNotNull(records[0]);
		return Boolean.valueOf(String.valueOf(records[0]
				.getField("IsReductionOrder")));
	}

	public static SObject fetchContractDetails(UserVO user, String contractid) {
		String contractdetails = "SELECT AccountId,ActivatedDate,AutoRenewCode,BillingCity,BillingCompany,BillingCountry,"
				+ "BillingEmail,BillingFirstName,BillingLanguage,BillingLastName,BillingName,BillingPhone,BillingPostalCode,BillingState,"
				+ "BillingStreet,Billing_Frequency_Change_Date__c,ContractNumber,ContractTerm,ContractType__c,CreatedDate,CurrencyIsoCode,"
				+ "EndDate,Id,InitialContractTerm__c,Initial_Auto_Renewal__c,Initial_Contract_End_Date__c,ManualContractReason__c,"
				+ "OrderPrebillDays,OwnerId,Pricebook2Id,RecordTypeId,RenewalNotificationDays__c,RenewalTerm,sfbase__ContractType__c,"
				+ "sfbase__Division__c,sfbase__PO_Number__c,sfbase__RelatedContractNumber__c,ShippingAddress,ShippingCity,ShippingCountry,ShippingPostalCode,"
				+ "ShippingState,ShippingStreet,Status,StatusCode FROM Contract where id = '"
				+ contractid + "'";
		SObject[] records = ForceUtil.query(user, contractdetails);
		Assert.assertNotNull(records);
		Assert.assertNotNull(records[0]);
		return records[0];
	}

	public static SObject fetchQuoteDetails(UserVO user, String quoteId) {
		String quotedetails = "SELECT Apttus_Proposal__Account__c,Apttus_Proposal__Opportunity__c,"
				+ "Apttus_Proposal__Payment_Term__c,Apttus_QPConfig__PriceListId__c,Id,"
				+ "RecordTypeId,SfdcAutoRenew__c,SfdcCustomerPORequired__c,SfdcDivision__c,"
				+ "SfdcHasRampOrder__c,SfdcPONumber__c,SfdcPriceRamp__c,SfdcPublished__c,"
				+ "SfdcQuoteStatus__c,SfdcQuoteType__c "
				+ "FROM Apttus_Proposal__Proposal__c where id='"
				+ quoteId
				+ "'";
		SObject[] records = ForceUtil.query(user, quotedetails);
		Assert.assertNotNull(records);
		Assert.assertNotNull(records[0]);
		return records[0];
	}

	public static void updateOpportunityRecordType(UserVO user,
			String opportunityid, String recordtype) {
		SObject item = new SObject();
		item.setType("Opportunity");
		item.setId(opportunityid);
		item.setField("RecordTypeId",
				getRecordtypeId(user, recordtype, item.getType()));
		SaveResult[] results = ForceUtil.updateSobject(user,
				new SObject[] { item });
		for (SaveResult result : results) {
			if (result.isSuccess())
				LogHelper.logger.debug("Update Success: " + result.getId());
			else {
				for (com.sforce.soap.partner.Error error : result.getErrors())
					LogHelper.logger.error("Update Opportunity Errors :"
							+ error.getMessage());
			}
		}
	}

	public static void updateOpportunity(UserVO user, OpportunityVO opp,
			String id) {
		SObject item = new SObject();
		item.setType("Opportunity");
		item.setId(id);
		item.setField("StageName", opp.stage);
		item.setField("Amount", opp.amount);
		item.setField("AmountConverted__c", opp.amountConverted);
		SaveResult[] results = ForceUtil.updateSobject(user,
				new SObject[] { item });
		for (SaveResult result : results) {
			if (result.isSuccess())
				LogHelper.logger.debug("Update Success: " + result.getId());
			else {
				for (com.sforce.soap.partner.Error error : result.getErrors())
					LogHelper.logger.error("Update Opportunity Errors :"
							+ error.getMessage());
			}
		}
	}

	public static void activateOrders(UserVO user, String contractid) {
		String query = "Select id from order where contractid='" + contractid
				+ "' and status=\'Draft\' limit 100";
		SObject[] records = ForceUtil.query(user, query);
		SObject[] forupdate = new SObject[records.length];
		for (int i = 0; i < records.length; i++) {
			SObject item = new SObject();
			item.setType("order");
			item.setId(records[i].getId());
			item.setField("status", "Activated");
			forupdate[i] = item;
		}
		SaveResult[] results = ForceUtil.updateSobject(user, forupdate);
		for (SaveResult result : results) {
			if (result.isSuccess())
				LogHelper.logger.debug("Activate Success: " + result.getId());
			else {
				for (com.sforce.soap.partner.Error error : result.getErrors())
					LogHelper.logger.error("Activate Order Errors :"
							+ error.getMessage());
			}
		}
	}

	public static void activateContract(UserVO user, String contractid) {
		String query = "Select id from contract where id='" + contractid
				+ "' and status=\'Draft\'";
		SObject[] records = ForceUtil.query(user, query);
		SObject[] forupdate = new SObject[records.length];
		for (int i = 0; i < records.length; i++) {
			SObject item = new SObject();
			item.setType("contract");
			item.setId(records[i].getId());
			item.setField("status", "Activated");
			forupdate[i] = item;
		}
		SaveResult[] results = ForceUtil.updateSobject(user, forupdate);
		for (SaveResult result : results) {
			if (result.isSuccess())
				LogHelper.logger.debug("Activate Success: " + result.getId());
			else {
				for (com.sforce.soap.partner.Error error : result.getErrors())
					LogHelper.logger.error("Activate Contract Errors :"
							+ error.getMessage());
			}
		}
	}

	public static String createTestOpportunity(UserVO user, String name,
			String stage, String closeDate, String type, String recordType,
			String accountId) {

		SObject opportunity = new SObject();
		opportunity.setType("Opportunity");
		opportunity.setField("Name", name);
		opportunity.setField("AccountId", accountId);
		opportunity.setField("StageName", stage);
		opportunity.setField("CloseDate",
				DateUtil.getApiFormattedDate(closeDate));
		opportunity.setField("Type", type);
		opportunity.setField("RecordTypeId",
				getRecordtypeId(user, recordType, opportunity.getType()));
		opportunity.setField("CurrencyIsoCode", "USD");
		SaveResult[] results = ForceUtil.createSobject(user,
				new SObject[] { opportunity });
		SaveResult result = results[0];
		for (com.sforce.soap.partner.Error error : result.getErrors())
			LogHelper.logger.error("Create Opportunity Errors :"
					+ error.getMessage());
		Assert.assertNotNull(result.getId());
		LogHelper.logger.debug("Opportunity id: " + result.getId());
		return result.getId();
	}

}
