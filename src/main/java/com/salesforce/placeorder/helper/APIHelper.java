package com.salesforce.placeorder.helper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.salesforce.placeorder.api.PlaceOrderAPIClient;
import com.salesforce.placeorder.dto.Attributes;
import com.salesforce.placeorder.dto.Contract;
import com.salesforce.placeorder.dto.ContractDetails;
import com.salesforce.placeorder.dto.Contracts;
import com.salesforce.placeorder.dto.OAuthToken;
import com.salesforce.placeorder.dto.Order;
import com.salesforce.placeorder.dto.OrderDetails;
import com.salesforce.placeorder.dto.OrderItem;
import com.salesforce.placeorder.dto.OrderItems;
import com.salesforce.placeorder.dto.Orders;
import com.salesforce.placeorder.dto.Orderz;
import com.salesforce.placeorder.util.Constants;
import com.salesforce.placeorder.util.DateUtil;
import com.salesforce.placeorder.util.ObjectUtil;
import com.salesforce.placeorder.vo.ContractVO;
import com.salesforce.placeorder.vo.OrderVO;
import com.salesforce.placeorder.vo.UserVO;

public class APIHelper {
	private String accountid;
	private String opportunityid;
	private String pricebook2id;
	private String pricebookentryid;
	private ContractDetails details;
	private OrderDetails orderDetails;


	private UserVO user;

	private PlaceOrderAPIClient CLIENT = null;

	public APIHelper() {
		CLIENT = new PlaceOrderAPIClient();
	}

	public void initialize() throws InterruptedException, ExecutionException,
			IOException {
		login(CLIENT);
	}

	public void setUpData(UserVO user, String accountid, String opportunityid,
			String pricebook2id, String pricebookentryid) {
		this.accountid = accountid;
		this.opportunityid = opportunityid;
		this.pricebook2id = pricebook2id;
		this.pricebookentryid = pricebookentryid;
		this.user = user;
	}

	public void createOrders(ContractVO contrct, OrderVO ordr) {
		try {
			details = createContractAndAdditionOrder(this.user, this.CLIENT,
					this.accountid, this.opportunityid, this.pricebook2id,
					this.pricebookentryid, contrct, ordr, 10, 10);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error(e.getMessage());
		}
	}

	public void createOrders(ContractVO contrct, OrderVO ordr, int orderCount,
			int orderItemCount) {
		try {
			details = createContractAndAdditionOrder(this.user, this.CLIENT,
					this.accountid, this.opportunityid, this.pricebook2id,
					this.pricebookentryid, contrct, ordr, orderCount,
					orderItemCount);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error(e.getMessage());
		}
		// return details;
	}

	public void createReductionOrders(ContractVO contrct, OrderVO ordr,
			int orderCount, int orderItemCount, String contractid) {
		try {

			details = createReductionOrderOnExistingContract(this.user,
					this.CLIENT, this.accountid, contractid, this.pricebook2id,
					this.pricebookentryid, this.details, ordr, orderCount,
					orderItemCount);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error(e.getMessage());
		}
		// return details;
	}

	public void createReplacementOrders(ContractVO contrct, OrderVO ordr,
			int orderCount, int orderItemCount, String contractid) {
		try {
			details = createReplacementOrderOnExisitngContract(this.user,
					this.CLIENT, this.accountid, this.opportunityid,
					contractid, this.pricebook2id, this.pricebookentryid,
					this.details, ordr, orderCount, orderItemCount);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error(e.getMessage());
		}
		// return details;
	}
	
	public void createOrderProducts(OrderVO order, int orderitemCount, String orderid){
		try {
			this.orderDetails = createOrderProductsExistingOrder(this.user,
					this.CLIENT, this.accountid, this.opportunityid,
					orderid, this.pricebook2id, this.pricebookentryid, order, orderitemCount);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error(e.getMessage());
		}
	}
	
	private static OrderDetails createOrderProductsExistingOrder(
			UserVO user, PlaceOrderAPIClient client, String accountid,
			String opportunityid, String orderid, String pricebook2id,
			String pricebookentryid, OrderVO ordr,
			int orderItemCount) throws InterruptedException,
			ExecutionException, IOException {
		
		Orderz holder = new Orderz();
		List<Order> orders = new ArrayList<Order>();
		Order order = new Order();
		order.setAttributes(new Attributes().withType("Order"));
		order.setId(orderid);

		OrderItems orderitemsHolder = new OrderItems();
		OrderItem item = new OrderItem();
		item.setAttributes(new Attributes().withType("OrderItem"));
		item.setPricebookEntryId(pricebookentryid);
		item.setQuantity(200.0);
		item.setUnitPrice(10.0);
		item.setOrderId(orderid);

		for (int i = 0; i < orderItemCount; i++) {
			orderitemsHolder.getRecords().add(item);
		}
		
		order.setOrderItems(orderitemsHolder);
		orders.add(order);
		holder.setRecords(orders);
		OrderDetails details1 = client.addProductsToExisitingOrder(holder,
				orderid);
		return details1;
	}

	@Override
	public void finalize() {
		if (CLIENT != null) {
			CLIENT.closeConnection();
		}
	}

	private OAuthToken login(PlaceOrderAPIClient CLIENT)
			throws InterruptedException, ExecutionException, IOException {
		CLIENT.setUsername(Constants.ADMIN_USERNAME);
		CLIENT.setPassword(Constants.ADMIN_PASSWORD);
		CLIENT.setClientid(Constants.PLACEORDER_CLIENT_ID);
		CLIENT.setClientSecret(Constants.PLACEORDER_CLIENT_SECRET);
		CLIENT.setLoginUrl(Constants.PlACEORDER_LOGIN_URL);
		OAuthToken result = CLIENT.login();
		return result;
	}

	private static ContractDetails createContractAndAdditionOrder(UserVO user,
			PlaceOrderAPIClient client, String accountid, String opportunityid,
			String pricebook2id, String pricebookentryid, ContractVO cntrct,
			OrderVO ordr, int orderCount, int orderItemCount)
			throws InterruptedException, ExecutionException, IOException {

		Contracts holder = new Contracts();
		List<Contract> contracts = new ArrayList<Contract>();
		Contract contract = new Contract();
		contract.setAttributes(new Attributes().withType("Contract"));
		contract.setAccountId(accountid);
		contract.setStartDate(DateUtil
				.convertApiFormat(cntrct.contractStartDate));
		contract.setStatus("Draft");
		contract.setContractTerm(cntrct.contractTerm);
		contract.setAutoRenewCode("No");
		contract.setOrderPrebillDays("12");
		contract.setBillingLanguage("en_US");
		contract.setBillingCity("San Francisco");
		contract.setBillingCountry("US");
		contract.setBillingState("CA");
		contract.setBillingStreet("1 California");
		contract.setBillingPostalCode("94105");
		contract.setShippingCity("San Francisco");
		contract.setShippingStreet("1 California");
		contract.setShippingCountry("US");
		contract.setShippingState("CA");
		contract.setShippingPostalCode("94105");
		contract.setPaymentTerm("Net30");

		contract.setPricebook2Id(pricebook2id);
		contract.setBillingEmail("boofed@salesforce.com");
		contract.setBillingLastName("Krishnan Ganesan");
		contract.setContractType("New");
		contract.setBillingFrequency("12");
		contract.setRecordTypeId(ObjectUtil.getRecordtypeId(user, "Sales",
				contract.getAttributes().getType()));

		OrderItems orderitemsHolder = new OrderItems();
		OrderItem item = new OrderItem();

		item.setPricebookEntryId(pricebookentryid);
		item.setQuantity(200.0);
		item.setUnitPrice(10.0);

		for (int i = 0; i < orderItemCount; i++) {
			orderitemsHolder.getRecords().add(item);
		}

		Orders orderholder = new Orders();
		List<Order> olist = orderholder.getRecords();
		String recordTypeid = ObjectUtil.getRecordtypeId(user, "New Business",
				"Order");
		for (int i = 0; i < orderCount; i++) {
			Order order = new Order();
			order.setStatus("Draft");
			order.setAttributes(new Attributes().withType("Order"));
			order.setRecordTypeId(recordTypeid);
			order.setEffectiveDate(DateUtil
					.convertApiFormat(ordr.orderStartDate));
			order.setSfbaseOrderTermApsC(Double.valueOf(ordr.orderTerm));
			order.setType("Initial");
			order.setOrderSubTypeC("Add");
			order.setSfbaseOpportunityC(opportunityid);
			order.setSfbaseCustomerPORequiredC("N/A");
			order.setSfbaseSuppressProvisioningC(true);
			order.setPoNumber("12345");
			order.setSfbasePOAmountC("5000");
			order.setSfbaseMarkForOrderTeamCreateC(true);
			order.setEvaluateRampC(ordr.evaluateRamp);
			order.setShippingCity("San Francisco");
			order.setShippingStreet("1 California");
			order.setShippingCountry("US");
			order.setShippingState("CA");
			order.setShippingPostalCode("94105");
			order.setOrderItems(orderitemsHolder);
			olist.add(order);
		}

		contract.setOrders(orderholder);
		contracts.add(contract);
		holder.setRecords(contracts);
		// Execute
		ContractDetails details = client.addContractsToExistingAccount(holder);

		return details;
	}

	private static ContractDetails createReplacementOrderOnExisitngContract(
			UserVO user, PlaceOrderAPIClient client, String accountid,
			String opportunityid, String contractid, String pricebook2id,
			String pricebookentryid, ContractDetails details, OrderVO ordr,
			int orderCount, int orderItemCount) throws InterruptedException,
			ExecutionException, IOException {

		Contracts holder = new Contracts();
		List<Contract> contracts = new ArrayList<Contract>();

		Contract contract = new Contract();
		contract.setAttributes(new Attributes().withType("Contract"));
		contract.setId(contractid);

		OrderItems orderitemsHolder = new OrderItems();
		OrderItem item = new OrderItem();

		item.setPricebookEntryId(pricebookentryid);
		item.setQuantity(200.0);
		item.setUnitPrice(10.0);

		for (int i = 0; i < orderItemCount; i++) {
			orderitemsHolder.getRecords().add(item);
		}

		Orders orderholder = new Orders();
		List<Order> olist = orderholder.getRecords();
		for (int i = 0; i < orderCount; i++) {
			Order order = new Order();
			order.setStatus("Draft");
			order.setAttributes(new Attributes().withType("Order"));
			order.setRecordTypeId(ObjectUtil.getRecordtypeId(user,
					"New Business", order.getAttributes().getType()));
			order.setEffectiveDate(DateUtil
					.convertApiFormat(ordr.orderStartDate));
			order.setSfbaseOrderTermApsC(Double.valueOf(ordr.orderTerm));
			order.setContractId(contractid);
			order.setType(ordr.orderType);
			order.setOrderSubTypeC(ordr.orderSubtype);
			order.setSfbaseOpportunityC(opportunityid);
			order.setSfbaseCustomerPORequiredC("N/A");
			order.setSfbaseSuppressProvisioningC(true);
			order.setPoNumber("12345");
			order.setSfbasePOAmountC("5000");
			order.setSfbaseMarkForOrderTeamCreateC(true);
			order.setEvaluateRampC(ordr.evaluateRamp);
			order.setShippingCity("San Francisco");
			order.setShippingStreet("1 California");
			order.setShippingCountry("US");
			order.setShippingState("CA");
			order.setShippingPostalCode("94105");
			order.setOrderItems(orderitemsHolder);
			olist.add(order);
		}

		contract.setOrders(orderholder);
		contracts.add(contract);
		holder.setRecords(contracts);

		ContractDetails details1 = client.addOrdersToExistingContract(holder,
				contractid);
		return details1;
	}

	private static ContractDetails createReductionOrderOnExistingContract(
			UserVO user, PlaceOrderAPIClient client, String accountid,
			String contractid, String pricebook2id, String pricebookentryid,
			ContractDetails details, OrderVO ordr, int orderCount,
			int orderItemCount) throws InterruptedException,
			ExecutionException, IOException {

		Contracts holder = new Contracts();
		List<Contract> contracts = new ArrayList<Contract>();
		Contract reduction = new Contract();
		reduction.setAttributes(new Attributes().withType("Contract"));
		reduction.setId(contractid);

		Order reductionOrder = new Order();
		reductionOrder.setStatus("Draft");
		reductionOrder.setAttributes(new Attributes().withType("Order"));
		reductionOrder.setRecordTypeId(ObjectUtil.getRecordtypeId(user,
				"Attrition", reductionOrder.getAttributes().getType()));
		reductionOrder.setEffectiveDate(DateUtil
				.convertApiFormat(ordr.orderStartDate));
		reductionOrder.setEndDate(DateUtil.convertApiFormat(ordr.orderEndDate));
		reductionOrder.setContractId(contractid);
		reductionOrder.setType("Cancel");
		reductionOrder.setSfbaseCMCodeC(ordr.cmCode);
		reductionOrder.setSfbaseCMReasonC(ordr.cmReason);
		reductionOrder.setIsReductionOrder(true);
		reductionOrder.setSfbaseSuppressProvisioningC(true);
		reductionOrder.setOrdCommissionType(ordr.reductionOrderCommissionType);
		reductionOrder
				.setOrdCommissionSubtype(ordr.reductionOrderCommissionSubtype);

		reductionOrder.setSfbillCashMovementC(ordr.cashMovement);

		OrderItems reductionOrderItemsHolder = new OrderItems();

		List<OrderItem> ids = new ArrayList<OrderItem>();
		List<Order> orginalOrders = details.getRecords().get(0).getOrders()
				.getRecords();
		for (Order oOrder : orginalOrders) {
			List<OrderItem> orderitems = oOrder.getOrderItems().getRecords();
			ids.addAll(orderitems);
		}

		for (int i = 0; i < orderItemCount; i++) {
			OrderItem ritem = new OrderItem();
			ritem.setQuantity(-1.0);
			ritem.setUnitPrice(10.0);
			ritem.setPricebookEntryId(pricebookentryid);
			ritem.setOriginalOrderItemId(ids.get(i).getId());
			reductionOrderItemsHolder.getRecords().add(ritem);
		}

		reductionOrder.setOrderItems(reductionOrderItemsHolder);

		Orders orderholder = new Orders();
		for (int i = 0; i < orderCount; i++) {
			orderholder.getRecords().add(reductionOrder);
		}

		reduction.setOrders(orderholder);
		contracts.add(reduction);
		holder.setRecords(contracts);

		ContractDetails details1 = client.addOrdersToExistingContract(holder,
				contractid);
		return details1;
	}

	// G&S
	public String getAccountid() {
		return accountid;
	}

	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}

	public String getOpportunityid() {
		return opportunityid;
	}

	public void setOpportunityid(String opportunityid) {
		this.opportunityid = opportunityid;
	}

	public String getPricebook2id() {
		return pricebook2id;
	}

	public void setPricebook2id(String pricebook2id) {
		this.pricebook2id = pricebook2id;
	}

	public String getPricebookentryid() {
		return pricebookentryid;
	}

	public void setPricebookentryid(String pricebookentryid) {
		this.pricebookentryid = pricebookentryid;
	}

	public ContractDetails getDetails() {
		return details;
	}

	public void setDetails(ContractDetails details) {
		this.details = details;
	}
	
	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}
}
