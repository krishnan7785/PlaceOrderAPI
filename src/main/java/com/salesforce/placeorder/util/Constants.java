package com.salesforce.placeorder.util;

public class Constants {

	public static final String ADMIN_USERNAME = System
			.getProperty("admin.username");
	public static final String ADMIN_PASSWORD = System
			.getProperty("admin.password");

	public final static String FORCE_API_USERNAME = System
			.getProperty("forceapi.username");
	public final static String FORCE_API_PASSWORD = System
			.getProperty("forceapi.password");
	public final static String FORCE_API_ENDPOINT_PARTNER = System
			.getProperty("forceapi.partner.endpoint");
	public final static String FORCE_API_ENDPOINT_METADATA = System
			.getProperty("forceapi.metadata.endpoint");
	public final static String FORCE_API_ENDPOINT_APEX = System
			.getProperty("forceapi.apex.endpoint");
	public final static boolean API_TRACE_ENABLED = (System
			.getProperty("forceapi.traceenabled") == "true") ? true : false;
	public final static String FORCE_API_CONNECTION_TIMEOUT = System
			.getProperty("forceapi.connection.timeout");
	public final static String FORCE_API_READ_TIMEOUT = System
			.getProperty("forceapi.read.timeout");

	// Place order api properties
	public final static String PLACEORDER_API_USERNAME = System
			.getProperty("placeorder.api.username");
	public final static String PLACEORDER_API_PASSWORD = System
			.getProperty("placeorder.api.password");
	public final static String PlACEORDER_LOGIN_URL = System
			.getProperty("placeorder.login.url");
	public final static String PLACEORDER_CLIENT_ID = System
			.getProperty("placeorder.client.id");
	public final static String PLACEORDER_CLIENT_SECRET = System
			.getProperty("placeorder.client.secret");

	// Default test product and pricebookentry ids
	public final static String DEFAULT_PRICEBOOKENTRY_ID = System
			.getProperty("test.pricebookentry.id");
	public final static String DEFAULT_PRODUCT_ID = System
			.getProperty("test.product.id");

}