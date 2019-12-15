package com.salesforce.placeorder.test;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import org.testng.annotations.Test;
import com.salesforce.placeorder.helper.APIHelper;
import com.salesforce.placeorder.util.Constants;
import com.salesforce.placeorder.util.ObjectUtil;
import com.salesforce.placeorder.vo.AccountVO;
import com.salesforce.placeorder.vo.ContractVO;
import com.salesforce.placeorder.vo.OpportunityVO;
import com.salesforce.placeorder.vo.OrderVO;
import com.salesforce.placeorder.vo.UserVO;

public class LoadContractAndOrdersTest {
	@Test
	public void loadOrdersTest1() throws InterruptedException, ExecutionException, IOException {
		String random = "PODEMO-" + UUID.randomUUID().toString();
		AccountVO acc = AccountVO.builder()
				.name(random).recordType("Sales").numEmployees("2000")
				.billingCity("San francisco").billingCountry("US").billingState("CA")
				.billingStreet("1 Market Street").billingZip("94105").shippingCity("San Francisco")
				.shippingCountry("US").shippingStreet("1 Market Street").shippingState("CA")
				.shippingZip("94105").build();
		OpportunityVO opp = OpportunityVO.builder().accountName(random).type("New Business")
				.recordType("New Business / Add-On").markForOppurtunityTeamCreate(true)
				.forcastCategory("Omitted").name(random).stage("01 - Identifying an Opportunity")
				.closeDate("4/16/2020").build();
		ContractVO cntr = ContractVO.builder().accountName(random).recordType("Sales")
				.contractType("New").contractStatus("Draft").autoRenewal("No")
				.currencyISOCode("USD").billingCity("San francisco")
				.billingCompanyName("PlaceOrderTest1").billingCountry("US")
				.billingEmail("kganesan@salesforce.com").billingFirstName("Krishnan")
				.billingFrequency("1").billingLanguage("English").billingLastName("Ganesan")
				.billingState("CA").billingStreet("1 market Street").billingZip("94105")
				.billingLanguageCode("en_US").contractStartDate("7/1/2019").contractTerm("36")
				.orderPrebillDays("5").paymentTerms("Net 45").paymentType("Check")
				.priceBook("CPQ - Direct - Commercial - Ohana - WW - USD").recordType("Sales")
				.shippingCity("San Francisco").shippingCountry("US")
				.shippingStreet("1 Market Street").shippingState("CA").shippingZip("94105").build();
		OrderVO order = OrderVO.builder().opportunityName(random).markForOrderTeamCreate(true)
				.shippingCity("San Francisco").shippingCountry("US")
				.shippingStreet("1 Market Street").shippingState("CA").shippingZip("94105")
				.orderStatus("Draft").orderType("Initial").customerPoRequired("N/A")
				.orderSubtype("New").orderStartDate("7/1/2019").orderTerm("12")
				.poNumber("12345").poAmount("5000").evaluateRamp(false).build();
		UserVO user = UserVO.builder().username(Constants.ADMIN_USERNAME)
				.password(Constants.ADMIN_PASSWORD).build();
		String pricebookentryid = Constants.DEFAULT_PRICEBOOKENTRY_ID;
		String pricebook2id = Constants.DEFAULT_PRODUCT_ID;
		String accountid = ObjectUtil.createTestAccount(user, acc);
		String opportunityid = ObjectUtil.createTestOpportunity(user, opp, accountid);
		APIHelper helper = new APIHelper();
		helper.initialize();
		helper.setUpData(user, accountid, opportunityid, pricebook2id, pricebookentryid);
		helper.createOrders(cntr, order, 65, 2);
		helper.finalize();
	}
}
