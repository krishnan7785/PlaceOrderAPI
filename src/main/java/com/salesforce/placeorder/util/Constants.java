package com.salesforce.placeorder.util;

import com.salesforce.placeorder.util.PropertiesReader.PROPERTY_TYPE;

public class Constants {
	private final static PropertiesReader _holder = PropertiesReader.getInstance();
	public static final String ADMIN_USERNAME = _holder.getProperty(PROPERTY_TYPE.BUILD, "admin.username");
	public static final String ADMIN_PASSWORD = _holder.getProperty(PROPERTY_TYPE.BUILD, "admin.password");

	public final static String FORCE_API_USERNAME = _holder.getProperty(PROPERTY_TYPE.BUILD, "forceapi.username");
	public final static String FORCE_API_PASSWORD = _holder.getProperty(PROPERTY_TYPE.BUILD, "forceapi.password");
	public final static String FORCE_API_ENDPOINT_PARTNER = _holder.getProperty(PROPERTY_TYPE.BUILD, "forceapi.partner.endpoint");
	public final static String FORCE_API_ENDPOINT_METADATA = _holder.getProperty(PROPERTY_TYPE.BUILD, "forceapi.metadata.endpoint");
	public final static String FORCE_API_ENDPOINT_APEX = _holder.getProperty(PROPERTY_TYPE.BUILD, "forceapi.apex.endpoint");
	public final static boolean API_TRACE_ENABLED = (_holder.getProperty(PROPERTY_TYPE.BUILD, "forceapi.traceenabled") == "true") ? true : false;
	public final static String FORCE_API_CONNECTION_TIMEOUT = _holder.getProperty(PROPERTY_TYPE.BUILD, "forceapi.connection.timeout");
	public final static String FORCE_API_READ_TIMEOUT = _holder.getProperty(PROPERTY_TYPE.BUILD, "forceapi.read.timeout");

	// Place order api properties
	public final static String PLACEORDER_API_USERNAME = _holder.getProperty(PROPERTY_TYPE.BUILD, "placeorder.api.username");
	public final static String PLACEORDER_API_PASSWORD = _holder.getProperty(PROPERTY_TYPE.BUILD, "placeorder.api.password");
	public final static String PlACEORDER_LOGIN_URL = _holder.getProperty(PROPERTY_TYPE.BUILD, "placeorder.login.url");
	public final static String PLACEORDER_CLIENT_ID = _holder.getProperty(PROPERTY_TYPE.BUILD, "placeorder.client.id");
	public final static String PLACEORDER_CLIENT_SECRET = _holder.getProperty(PROPERTY_TYPE.BUILD, "placeorder.client.secret");

	// Default test product and pricebookentry ids
	public final static String DEFAULT_PRICEBOOKENTRY_ID = _holder.getProperty(PROPERTY_TYPE.BUILD, "test.pricebookentry.id");
	public final static String DEFAULT_PRODUCT_ID = _holder.getProperty(PROPERTY_TYPE.BUILD, "test.product.id");

}