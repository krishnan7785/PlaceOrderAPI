package com.salesforce.placeorder.api;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.AsyncHttpClientConfig;
import org.asynchttpclient.BoundRequestBuilder;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClientConfig;
import org.asynchttpclient.ListenableFuture;
import org.asynchttpclient.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.salesforce.placeorder.api.http.HttpStatus;
import com.salesforce.placeorder.dto.ApiError;
import com.salesforce.placeorder.dto.ContractDetails;
import com.salesforce.placeorder.dto.Contracts;
import com.salesforce.placeorder.dto.OAuthToken;
import com.salesforce.placeorder.dto.OrderDetails;
import com.salesforce.placeorder.dto.Orderz;
import com.salesforce.placeorder.util.JsonUtil;

/**
 * @author kganesan
 * @since 207
 */
public class PlaceOrderAPIClient {

	final static Logger logger = LogManager
			.getLogger(PlaceOrderAPIClient.class);

	private AsyncHttpClient asyncHttpClient;

	private String username;
	private String password;
	private String clientid;
	private String clientSecret;

	private String lastResponse;
	private String lastRequest;
	private String lastError;
	private String lastToken;

	private String loginUrl;
	private String callbackUrl;
	private String instanceUrl;
	private String apiversion = "30.0";

	private int readTimeout = 120000;
	private int connectionTimeout = 5000;

	public PlaceOrderAPIClient() {
		asyncHttpClient = getAsyncHttpClient();
	}

	public PlaceOrderAPIClient(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public PlaceOrderAPIClient(String username, String password,
			String clientId, String clientSecret) {
		this(username, password);
		this.clientid = clientId;
		this.clientSecret = clientSecret;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getClientid() {
		return clientid;
	}

	public void setClientid(String clientid) {
		this.clientid = clientid;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getLoginUrl() {
		return loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	public String getInstanceUrl() {
		return instanceUrl;
	}

	public void setInstanceUrl(String instanceUrl) {
		this.instanceUrl = instanceUrl;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getApiversion() {
		return apiversion;
	}

	public void setApiversion(String apiversion) {
		this.apiversion = apiversion;
	}

	public OAuthToken login() throws InterruptedException, ExecutionException,
			IOException {
		OAuthToken result;
		String authUrl = constructAuthUrl();
		asyncHttpClient = getAsyncHttpClient();

		try {
			BoundRequestBuilder requestBuilder = asyncHttpClient
					.preparePost(authUrl);
			ListenableFuture<Response> f = requestBuilder.execute();
			Response r = f.get();
			int status = r.getStatusCode();
			if (status != HttpStatus.OK) // 200 = OK
			{
				String statusText = r.getStatusText();
				ApiError error = JsonUtil.fromString(r.getResponseBody(),
						ApiError.class);
				lastError = JsonUtil.prettyPrint(error);
				logger.error("Error calling webservice, status is: " + status
						+ " " + statusText);
				logger.error("Error calling webservice, error message is: "
						+ lastError);

				return null;
			}

			result = JsonUtil.fromString(r.getResponseBody(), OAuthToken.class);
			lastResponse = JsonUtil.prettyPrint(result);
			lastToken = result.getAccessToken();
			instanceUrl = result.getInstanceUrl();
			logger.debug("Login Result: " + lastResponse);
			logger.debug("Access Token from Login: " + lastToken);

		} finally {

		}

		return result;
	}

	public ContractDetails addContractsToExistingAccount(Contracts contracts)
			throws InterruptedException, ExecutionException, IOException {
		ContractDetails result;
		String addContractsUrl = instanceUrl + "/services/data/v" + apiversion
				+ "/commerce/sale";
		asyncHttpClient = getAsyncHttpClient();

		try {
			BoundRequestBuilder requestBuilder = asyncHttpClient
					.preparePost(addContractsUrl);
			logger.debug("Access Token :" + this.lastToken);
			requestBuilder.setHeader("Authorization", "Bearer "
					+ this.lastToken);
			requestBuilder.setHeader("Content-Type", "application/json");
			requestBuilder.setHeader("Accept", "application/json");
			lastRequest = JsonUtil.stringify(contracts);
			logger.debug("Last Request:" + lastRequest);
			requestBuilder.setBody(lastRequest);

			ListenableFuture<Response> f = requestBuilder.execute();
			Response r = f.get();
			int status = r.getStatusCode();
			if (status != HttpStatus.CREATED) // 201 = Created
			{
				String statusText = r.getStatusText();
				ApiError error = JsonUtil.fromString(r.getResponseBody(),
						ApiError.class);
				lastError = JsonUtil.prettyPrint(error);
				logger.error("Error calling webservice, status is: " + status
						+ " " + statusText);
				logger.error("Error calling webservice, error message is: "
						+ lastError);

				return null;
			}

			result = JsonUtil.fromString(r.getResponseBody(),
					ContractDetails.class);
			lastResponse = JsonUtil.prettyPrint(result);
			logger.debug("Login Result: " + lastResponse);

		} finally {

		}

		return result;
	}

	public ContractDetails addOrdersToExistingContract(Contracts contracts,
			String contractId) throws InterruptedException, ExecutionException,
			IOException {
		ContractDetails result;
		String updateOrdersUrl = instanceUrl + "/services/data/v" + apiversion
				+ "/commerce/sale/" + contractId;
		asyncHttpClient = getAsyncHttpClient();

		try {
			BoundRequestBuilder requestBuilder = asyncHttpClient
					.preparePatch(updateOrdersUrl);
			logger.debug("Access Token :" + this.lastToken);
			requestBuilder.setHeader("Authorization", "Bearer "
					+ this.lastToken);
			requestBuilder.setHeader("Content-Type", "application/json");
			requestBuilder.setHeader("Accept", "application/json");
			lastRequest = JsonUtil.stringify(contracts);
			logger.debug("Last Request:" + lastRequest);
			requestBuilder.setBody(lastRequest);

			ListenableFuture<Response> f = requestBuilder.execute();
			Response r = f.get();
			int status = r.getStatusCode();
			if (status != HttpStatus.CREATED) // 201 = Created
			{
				String statusText = r.getStatusText();
				ApiError error = JsonUtil.fromString(r.getResponseBody(),
						ApiError.class);
				lastError = JsonUtil.prettyPrint(error);
				logger.error("Error calling webservice, status is: " + status
						+ " " + statusText);
				logger.error("Error calling webservice, error message is: "
						+ lastError);

				return null;
			}

			result = JsonUtil.fromString(r.getResponseBody(),
					ContractDetails.class);
			lastResponse = JsonUtil.prettyPrint(result);
			logger.debug("Login Result: " + lastResponse);

		} finally {

		}

		return result;
	}

	public ContractDetails updateContractDetails(Contracts contracts,
			String contractid) throws InterruptedException, ExecutionException,
			IOException {
		ContractDetails result;
		String updateContractsUrl = instanceUrl + "/services/data/v"
				+ apiversion + "/commerce/sale/" + contractid;
		asyncHttpClient = getAsyncHttpClient();

		try {
			BoundRequestBuilder requestBuilder = asyncHttpClient
					.preparePatch(updateContractsUrl);
			logger.debug("Access Token :" + this.lastToken);
			requestBuilder.setHeader("Authorization", "Bearer "
					+ this.lastToken);
			requestBuilder.setHeader("Content-Type",
					"application/json; charset=UTF-8");
			requestBuilder.setHeader("Accept", "application/json");
			lastRequest = JsonUtil.stringify(contracts);
			logger.debug("Last Request:" + lastRequest);
			requestBuilder.setBody(lastRequest);

			ListenableFuture<Response> f = requestBuilder.execute();
			Response r = f.get();
			int status = r.getStatusCode();
			logger.debug("Current Status" + status);
			if (status != HttpStatus.OK) // 201 = Created
			{
				String statusText = r.getStatusText();
				ApiError error = JsonUtil.fromString(r.getResponseBody(),
						ApiError.class);
				lastError = JsonUtil.prettyPrint(error);
				logger.error("Error calling webservice, status is: " + status
						+ " " + statusText);
				logger.error("Error calling webservice, error message is: "
						+ lastError);

				return null;
			}

			result = JsonUtil.fromString(r.getResponseBody(),
					ContractDetails.class);
			lastResponse = JsonUtil.prettyPrint(result);
			logger.debug("Login Result: " + lastResponse);

		} finally {

		}

		return result;
	}
	
	public OrderDetails addProductsToExisitingOrder(Orderz order,
			String orderid) throws InterruptedException, ExecutionException,
			IOException {
		OrderDetails result;
		String updateOrdersUrl = instanceUrl + "/services/data/v"
				+ apiversion + "/commerce/sale/order/" + orderid;
		asyncHttpClient = getAsyncHttpClient();

		try {
			BoundRequestBuilder requestBuilder = asyncHttpClient
					.preparePatch(updateOrdersUrl);
			logger.debug("Access Token :" + this.lastToken);
			requestBuilder.setHeader("Authorization", "Bearer "
					+ this.lastToken);
			requestBuilder.setHeader("Content-Type",
					"application/json; charset=UTF-8");
			requestBuilder.setHeader("Accept", "application/json");
			lastRequest = JsonUtil.stringify(order);
			logger.debug("Last Request:" + lastRequest);
			requestBuilder.setBody(lastRequest);

			ListenableFuture<Response> f = requestBuilder.execute();
			Response r = f.get();
			int status = r.getStatusCode();
			logger.debug("Current Status" + status);
			if (status != HttpStatus.OK) // 201 = Created
			{
				String statusText = r.getStatusText();
				ApiError error = JsonUtil.fromString(r.getResponseBody(),
						ApiError.class);
				lastError = JsonUtil.prettyPrint(error);
				logger.error("Error calling webservice, status is: " + status
						+ " " + statusText);
				logger.error("Error calling webservice, error message is: "
						+ lastError);

				return null;
			}

			result = JsonUtil.fromString(r.getResponseBody(),
					OrderDetails.class);
			lastResponse = JsonUtil.prettyPrint(result);
			logger.debug("Login Result: " + lastResponse);

		} finally {

		}

		return result;
	}

	private String constructAuthUrl() {
		String authUrl = loginUrl
				+ "/services/oauth2/token?grant_type=password" + "&client_id="
				+ clientid + "&client_secret=" + clientSecret + "&username="
				+ username + "&password=" + password;
		logger.debug("Auth URL: " + authUrl);
		return authUrl;
	}

	public AsyncHttpClient getAsyncHttpClient() {

		AsyncHttpClientConfig cf = new DefaultAsyncHttpClientConfig.Builder()
				.setConnectTimeout(connectionTimeout)
				.setReadTimeout(readTimeout).build();
		synchronized (cf) {
			if (asyncHttpClient == null)
				return new DefaultAsyncHttpClient(cf);
		}

		return asyncHttpClient;
	}

	public void setAsyncHttpClient(AsyncHttpClient asyncHttpClient) {
		this.asyncHttpClient = asyncHttpClient;
	}

	public void closeConnection() {

		try {
			if (asyncHttpClient != null)
				asyncHttpClient.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}

	}
}
