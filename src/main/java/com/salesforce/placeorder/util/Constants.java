package com.salesforce.placeorder.util;

import java.util.Properties;

public class Constants {
	private static Properties _propertiesHolder = new PropertiesReader("application.properties").get_properties();
	public static final String ADMIN_USERNAME = _propertiesHolder.getProperty("admin.username");
	public static final String ADMIN_PASSWORD = _propertiesHolder.getProperty("admin.password");

	public final static String FORCE_API_USERNAME = _propertiesHolder.getProperty("forceapi.username");
	public final static String FORCE_API_PASSWORD = _propertiesHolder.getProperty("forceapi.password");
	public final static String FORCE_API_ENDPOINT_PARTNER = _propertiesHolder.getProperty("forceapi.partner.endpoint");
	public final static String FORCE_API_ENDPOINT_METADATA = _propertiesHolder
			.getProperty("forceapi.metadata.endpoint");
	public final static String FORCE_API_ENDPOINT_APEX = _propertiesHolder.getProperty("forceapi.apex.endpoint");
	public final static boolean API_TRACE_ENABLED = (_propertiesHolder.getProperty("forceapi.traceenabled") == "true")
			? true
			: false;
	public final static String FORCE_API_CONNECTION_TIMEOUT = _propertiesHolder
			.getProperty("forceapi.connection.timeout");
	public final static String FORCE_API_READ_TIMEOUT = _propertiesHolder.getProperty("forceapi.read.timeout");

	// Place order api properties
	public final static String PLACEORDER_API_USERNAME = _propertiesHolder.getProperty("placeorder.api.username");
	public final static String PLACEORDER_API_PASSWORD = _propertiesHolder.getProperty("placeorder.api.password");
	public final static String PlACEORDER_LOGIN_URL = _propertiesHolder.getProperty("placeorder.login.url");
	public final static String PLACEORDER_CLIENT_ID = _propertiesHolder.getProperty("placeorder.client.id");
	public final static String PLACEORDER_CLIENT_SECRET = _propertiesHolder.getProperty("placeorder.client.secret");

	// Default test product and pricebookentry ids
	public final static String DEFAULT_PRICEBOOKENTRY_ID = _propertiesHolder.getProperty("test.pricebookentry.id");
	public final static String DEFAULT_PRODUCT_ID = _propertiesHolder.getProperty("test.product.id");

}