package com.salesforce.placeorder.rabbitmq.worker;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;
import com.salesforce.placeorder.helper.APIHelper;
import com.salesforce.placeorder.util.Constants;
import com.salesforce.placeorder.util.ObjectUtil;
import com.salesforce.placeorder.vo.AccountVO;
import com.salesforce.placeorder.vo.ContractVO;
import com.salesforce.placeorder.vo.OpportunityVO;
import com.salesforce.placeorder.vo.OrderVO;
import com.salesforce.placeorder.vo.UserVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class LoadOrderProductsExistingOrderWorker {

	public static void main(String args[]) {
		try {
			ConnectionFactory factory = new ConnectionFactory();
			factory.setUri(System.getenv("CLOUDAMQP_URL"));
			Connection connection = factory.newConnection();
			Channel channel = connection.createChannel();
			String queueName = "work-queue-1";
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("x-ha-policy", "all");
			channel.queueDeclare(queueName, true, false, false, params);
			QueueingConsumer consumer = new QueueingConsumer(channel);
			channel.basicConsume(queueName, false, consumer);

			while (true) {
				QueueingConsumer.Delivery delivery = consumer.nextDelivery();
				if (delivery != null) {
					String msg = new String(delivery.getBody(), "UTF-8");
					log.info("Message Received: " + msg);
					doWork(msg);
					log.info("Done with Work: " + msg);
					channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
				}
			}
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
	}

	public static void doWork(String message) {
		if (message != null && message.equals("LoadOrderProductsExistingOrderJob")) {
			try {
				String random = "PODEMO-" + UUID.randomUUID().toString();
				AccountVO acc = AccountVO.builder().name(random).recordType("Sales").numEmployees("2000")
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
						.billingLanguageCode("en_US").contractStartDate("7/1/2020").contractTerm("36")
						.orderPrebillDays("5").paymentTerms("Net 45").paymentType("Check")
						.priceBook("CPQ - Direct - Commercial - Ohana - WW - USD").recordType("Sales")
						.shippingCity("San Francisco").shippingCountry("US")
						.shippingStreet("1 Market Street").shippingState("CA").shippingZip("94105").build();
				OrderVO order = OrderVO.builder().opportunityName(random).markForOrderTeamCreate(true)
						.shippingCity("San Francisco").shippingCountry("US")
						.shippingStreet("1 Market Street").shippingState("CA").shippingZip("94105")
						.orderStatus("Draft").orderType("Initial").customerPoRequired("N/A")
						.orderSubtype("New").orderStartDate("7/1/2020").orderTerm("12")
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
				helper.createOrders(cntr, order, 5, 1);
				String orderid = helper.getDetails().getRecords().get(0).getOrders().getRecords().get(0).getId();
				helper.createOrderProducts(order, 5, orderid);
				helper.finalize();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				log.error(e.getMessage());
			}
		}
	}
}
