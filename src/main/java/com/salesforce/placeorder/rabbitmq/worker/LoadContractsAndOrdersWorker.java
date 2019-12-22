package com.salesforce.placeorder.rabbitmq.worker;

import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
public class LoadContractsAndOrdersWorker {
	final static Logger logger = LogManager.getLogger(LoadContractsAndOrdersWorker.class);
	
	public static void main(String args[]) {
		ClassPathXmlApplicationContext ctx = null;
		try {
			ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			RabbitTemplate rabbitTemplate = ctx.getBean(RabbitTemplate.class);
			while (true) {
				logger.debug(" In LoadContractsAndOrdersWorker Checking for message...");
				Message response = rabbitTemplate.receive();
				if (response != null) {
					String message = new String(response.getBody(), "UTF-8");
					logger.debug("Spring Recieved:->" + message);
					doWork(message);
					logger.debug("Spring Done with Work:->" + message);
				}
			}
		} catch (Exception e) {
			log.debug(e.getMessage());
		}finally {
			Runtime.getRuntime().addShutdownHook(new Thread() {
				@Override
				public void run() {
					final java.lang.management.ThreadMXBean threadMXBean = java.lang.management.ManagementFactory
							.getThreadMXBean();
					final java.lang.management.ThreadInfo[] threadInfos = threadMXBean
							.getThreadInfo(threadMXBean.getAllThreadIds(), 100);
					for (java.lang.management.ThreadInfo threadInfo : threadInfos) {
						log.debug(threadInfo.getThreadName());
						final Thread.State state = threadInfo.getThreadState();
						log.debug("   java.lang.Thread.State: " + state);
						final StackTraceElement[] stackTraceElements = threadInfo.getStackTrace();
						for (final StackTraceElement stackTraceElement : stackTraceElements) {
							log.debug("        at " + stackTraceElement);
						}
						log.debug("\n");
					}
				}
			});
		}
	}

	public static void doWork(String message) {
		if (message != null && message.equals("LoadContractAndOrdersJob")) {
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
				ContractVO cntr = ContractVO.builder().accountName(random).recordType("Sales").contractType("New")
						.contractStatus("Draft").autoRenewal("No").currencyISOCode("USD").billingCity("San francisco")
						.billingCompanyName("PlaceOrderTest1").billingCountry("US")
						.billingEmail("kganesan@salesforce.com").billingFirstName("Krishnan").billingFrequency("1")
						.billingLanguage("English").billingLastName("Ganesan").billingState("CA")
						.billingStreet("1 market Street").billingZip("94105").billingLanguageCode("en_US")
						.contractStartDate("7/1/2019").contractTerm("36").orderPrebillDays("5").paymentTerms("Net 45")
						.paymentType("Check").priceBook("CPQ - Direct - Commercial - Ohana - WW - USD")
						.recordType("Sales").shippingCity("San Francisco").shippingCountry("US")
						.shippingStreet("1 Market Street").shippingState("CA").shippingZip("94105").build();
				OrderVO order = OrderVO.builder().opportunityName(random).markForOrderTeamCreate(true)
						.shippingCity("San Francisco").shippingCountry("US").shippingStreet("1 Market Street")
						.shippingState("CA").shippingZip("94105").orderStatus("Draft").orderType("Initial")
						.customerPoRequired("N/A").orderSubtype("New").orderStartDate("7/1/2019").orderTerm("12")
						.poNumber("12345").poAmount("5000").evaluateRamp(false).build();
				UserVO user = UserVO.builder().username(Constants.ADMIN_USERNAME).password(Constants.ADMIN_PASSWORD)
						.build();
				String pricebookentryid = Constants.DEFAULT_PRICEBOOKENTRY_ID;
				String pricebook2id = Constants.DEFAULT_PRODUCT_ID;
				String accountid = ObjectUtil.createTestAccount(user, acc);
				String opportunityid = ObjectUtil.createTestOpportunity(user, opp, accountid);
				APIHelper helper = new APIHelper();
				log.info("Initializing PlaceOrder ");
				helper.initialize();
				helper.setUpData(user, accountid, opportunityid, pricebook2id, pricebookentryid);
				helper.createOrders(cntr, order, 65, 2);
				log.info("Created Orders");
				helper.finalize();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				log.error(e.getMessage());
			} 
		}
	}

}