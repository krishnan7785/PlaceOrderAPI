package com.salesforce.placeorder.rabbitmq.worker;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.salesforce.placeorder.builder.AccountVOBuilder;
import com.salesforce.placeorder.builder.ContractVOBuilder;
import com.salesforce.placeorder.builder.OpportunityVOBuilder;
import com.salesforce.placeorder.builder.OrderVOBuilder;
import com.salesforce.placeorder.builder.UserVOBuilder;
import com.salesforce.placeorder.helper.APIHelper;
import com.salesforce.placeorder.util.Constants;
import com.salesforce.placeorder.util.ObjectUtil;
import com.salesforce.placeorder.vo.AccountVO;
import com.salesforce.placeorder.vo.ContractVO;
import com.salesforce.placeorder.vo.OpportunityVO;
import com.salesforce.placeorder.vo.OrderVO;
import com.salesforce.placeorder.vo.UserVO;

public class LoadOrderProductsExistingOrderWorker {
	final static Logger logger = LogManager.getLogger(LoadOrderProductsExistingOrderWorker.class);
	static ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	public static void main(String args[]) {
		try {
			RabbitTemplate rabbitTemplate = ctx.getBean(RabbitTemplate.class);
	        while (true) {
	        	logger.debug(" In LoadOrderProductsExistingOrderWorker Checking for message...");
	        	Message response = rabbitTemplate.receive();
	            if (response != null) {
	            	String message = new String(response.getBody(), "UTF-8");
	            	logger.debug("Spring Recieved:->" + message);
	            	doWork(message);
	            	logger.debug("Spring Done with Work:->" + message);
	            }
	        }
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
	}

	public static void doWork(String message) {
		if (message != null && message.equals("LoadOrderProductsExistingOrderJob")) {
			try {
				String random = "PODEMO-" + UUID.randomUUID().toString();
				AccountVO acc = new AccountVOBuilder().withName(random).withRecordType("Sales").withNumEmployees("2000")
						.withBillingCity("San francisco").withBillingCountry("US").withBillingState("CA")
						.withBillingStreet("1 Market Street").withBillingZip("94105").withShippingCity("San Francisco")
						.withShippingCountry("US").withShippingStreet("1 Market Street").withShippingState("CA")
						.withShippingZip("94105").build();
				OpportunityVO opp = new OpportunityVOBuilder().withAccountName(random).withType("New Business")
						.withRecordType("New Business / Add-On").withMarkForOppurtunityTeamCreate(true)
						.withForcastCategory("Omitted").withName(random).withStage("01 - Identifying an Opportunity")
						.withCloseDate("4/16/2020").build();
				ContractVO cntr = new ContractVOBuilder().withAccountName(random).withRecordType("Sales")
						.withContractType("New").withContractStatus("Draft").withAutoRenewal("No")
						.withCurrencyISOCode("USD").withBillingCity("San francisco")
						.withBillingCompanyName("PlaceOrderTest1").withBillingCountry("US")
						.withBillingEmail("kganesan@salesforce.com").withBillingFirstName("Krishnan")
						.withBillingFrequency("1").withBillingLanguage("English").withBillingLastName("Ganesan")
						.withBillingState("CA").withBillingStreet("1 market Street").withBillingZip("94105")
						.withBillingLanguageCode("en_US").withContractStartDate("7/1/2020").withContractTerm("36")
						.withOrderPrebillDays("5").withPaymentTerms("Net 45").withPaymentType("Check")
						.withPriceBook("CPQ - Direct - Commercial - Ohana - WW - USD").withRecordType("Sales")
						.withShippingCity("San Francisco").withShippingCountry("US")
						.withShippingStreet("1 Market Street").withShippingState("CA").withShippingZip("94105").build();
				OrderVO order = new OrderVOBuilder().withOpportunityName(random).withMarkForOrderTeamCreate(true)
						.withShippingCity("San Francisco").withShippingCountry("US")
						.withShippingStreet("1 Market Street").withShippingState("CA").withShippingZip("94105")
						.withOrderStatus("Draft").withOrderType("Initial").withCustomerPoRequired("N/A")
						.withOrderSubtype("New").withOrderStartDate("7/1/2020").withOrderTerm("12")
						.withPoNumber("12345").withPoAmount("5000").withEvaluateRamp(false).build();
				UserVO user = new UserVOBuilder().withUsername(Constants.ADMIN_USERNAME)
						.withPassword(Constants.ADMIN_PASSWORD).build();
				String pricebookentryid = Constants.DEFAULT_PRICEBOOKENTRY_ID;
				String pricebook2id = Constants.DEFAULT_PRODUCT_ID;
				String accountid = ObjectUtil.createTestAccount(user, acc);
				String opportunityid = ObjectUtil.createTestOpportunity(user, opp, accountid);
				APIHelper helper = new APIHelper();
				helper.initialize();
				helper.setUpData(user, accountid, opportunityid, pricebook2id, pricebookentryid);
				helper.createOrders(cntr, order, 5, 1);
				String orderid = helper.getDetails().getRecords().get(0).getOrders().getRecords().get(0).getId();
				helper.createOrderProducts(order, 5, orderid);
				helper.finalize();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				logger.error(e.getMessage());
			}
		}
	}
}
