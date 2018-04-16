package com.salesforce.placeorder.util;

import java.util.Map;

import javax.xml.namespace.QName;

import com.salesforce.placeorder.helper.LogHelper;
import com.salesforce.placeorder.vo.UserVO;
import com.sforce.soap.apex.ExecuteAnonymousResult;
import com.sforce.soap.apex.SoapConnection;
import com.sforce.soap.metadata.CustomField;
import com.sforce.soap.metadata.CustomMetadata;
import com.sforce.soap.metadata.CustomMetadataValue;
import com.sforce.soap.metadata.CustomObject;
import com.sforce.soap.metadata.DeploymentStatus;
import com.sforce.soap.metadata.Error;
import com.sforce.soap.metadata.FieldType;
import com.sforce.soap.metadata.Metadata;
import com.sforce.soap.metadata.MetadataConnection;
import com.sforce.soap.metadata.Profile;
import com.sforce.soap.metadata.ProfileFieldLevelSecurity;
import com.sforce.soap.metadata.SharingModel;
import com.sforce.soap.partner.Connector;
import com.sforce.soap.partner.DeleteResult;
import com.sforce.soap.partner.DescribeSObjectResult;
import com.sforce.soap.partner.Field;
import com.sforce.soap.partner.GetUserInfoResult;
import com.sforce.soap.partner.LoginResult;
import com.sforce.soap.partner.PartnerConnection;
import com.sforce.soap.partner.QueryResult;
import com.sforce.soap.partner.SaveResult;
import com.sforce.soap.partner.fault.LoginFault;
import com.sforce.soap.partner.sobject.SObject;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;
import com.sforce.ws.SessionRenewer;

public class ForceUtil {

	public static GetUserInfoResult getUserInfo() {
		PartnerConnection connection = getConnection();
		try {
			return connection.getUserInfo();
		} catch (ConnectionException e) {
			LogHelper.logger.error("User info Error", e.getCause());
		}

		return null;

	}

	public static SaveResult[] createSobject(String type,
			Map<String, Object> fieldMap) {
		SObject newobj = new SObject();
		newobj.setType(type);
		for (String key : fieldMap.keySet())
			newobj.setField(key, fieldMap.get(key));
		PartnerConnection connection = getConnection();
		try {
			return connection.create(new SObject[] { newobj });
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error("Sobject creation error", e.getCause());
		}

		return null;
	}

	public static SaveResult[] createSobject(UserVO user, String type,
			Map<String, Object> fieldMap) {
		SObject newobj = new SObject();
		newobj.setType(type);
		for (String key : fieldMap.keySet())
			newobj.setField(key, fieldMap.get(key));
		PartnerConnection connection = getConnection(user);
		try {
			return connection.create(new SObject[] { newobj });
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error("Sobject creation error", e.getCause());
		}

		return null;
	}

	public static DeleteResult[] deleteSobject(String[] ids) {
		DeleteResult[] results = null;
		PartnerConnection connection = getConnection();
		try {
			results = connection.delete(ids);
		} catch (ConnectionException e) {
			LogHelper.logger.error("Sobject deletion error", e.getCause());
		}

		return results;
	}

	public static DeleteResult[] deleteSobject(UserVO user, String[] ids) {
		DeleteResult[] results = null;
		PartnerConnection connection = getConnection(user);
		try {
			results = connection.delete(ids);
		} catch (ConnectionException e) {
			LogHelper.logger.error("Sobject deletion error", e.getCause());
		}

		return results;
	}

	public static SaveResult[] updateSobject(UserVO user, String id,
			String type, Map<String, Object> fieldMap) {
		SObject newobj = new SObject();
		newobj.setType(type);
		newobj.setId(id);
		for (String key : fieldMap.keySet())
			newobj.setField(key, fieldMap.get(key));
		PartnerConnection connection = getConnection(user);
		try {
			return connection.update(new SObject[] { newobj });
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error("Sobject update error: "
					+ e.getStackTrace().toString(), e.getCause());
		} catch (Exception ex) {
			LogHelper.logger.error("Sobject update error: "
					+ ex.getStackTrace().toString(), ex.getCause());
		}

		return null;
	}

	public static SObject[] query(UserVO user, String queryString) {
		QueryResult qResult = null;
		PartnerConnection connection = user == null ? getConnection()
				: getConnection(user);
		try {
			qResult = connection.query(queryString);
			if (qResult == null)
				return null;
			SObject[] records = qResult.getRecords();
			return records;
		} catch (ConnectionException ce) {
			LogHelper.logger.error(ce.getMessage(), ce.getCause());
		} catch (Exception e) {
			LogHelper.logger.error(e.getMessage(), e.getCause());
		}
		return null;
	}

	public static void waitForUpdate(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block

		}
	}

	public static SaveResult[] createSobject(SObject[] sobjects) {
		assert sobjects != null;

		PartnerConnection connection = getConnection();
		try {
			return connection.create(sobjects);
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error("Sobject creation error", e.getCause());
		}

		return null;
	}

	public static SaveResult[] createSobject(UserVO user, SObject[] sobjects) {
		assert sobjects != null;

		PartnerConnection connection = getConnection(user);
		try {
			return connection.create(sobjects);
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error("Sobject creation error", e.getCause());
		}

		return null;
	}

	public static SaveResult[] updateSobject(UserVO user, SObject[] sobjects) {
		assert sobjects != null;

		PartnerConnection connection = getConnection(user);
		try {
			return connection.update(sobjects);
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error("Sobject update error", e.getCause());
		}

		return null;
	}

	private static PartnerConnection getConnection() {
		ConnectorConfig config = new ConnectorConfig();
		config.setUsername(Constants.FORCE_API_USERNAME);
		config.setPassword(Constants.FORCE_API_PASSWORD);
		config.setAuthEndpoint(Constants.FORCE_API_ENDPOINT_PARTNER);
		config.setConnectionTimeout(Integer
				.valueOf(Constants.FORCE_API_CONNECTION_TIMEOUT));
		config.setReadTimeout(Integer.valueOf(Constants.FORCE_API_READ_TIMEOUT));
		PartnerConnection connection = null;
		try {
			connection = Connector.newConnection(config);
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			LogHelper.logger
					.error("Partner Connection Exception", e.getCause());
		}
		return connection;
	}

	private static PartnerConnection getConnection(UserVO user) {
		ConnectorConfig config = new ConnectorConfig();
		config.setUsername(user.username);
		config.setPassword(user.password);
		config.setAuthEndpoint(Constants.FORCE_API_ENDPOINT_PARTNER);
		config.setConnectionTimeout(Integer
				.valueOf(Constants.FORCE_API_CONNECTION_TIMEOUT));
		config.setReadTimeout(Integer.valueOf(Constants.FORCE_API_READ_TIMEOUT));
		PartnerConnection connection = null;
		try {
			connection = Connector.newConnection(config);
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			LogHelper.logger
					.error("Partner Connection Exception", e.getCause());
		}
		return connection;
	}

	private static ConnectorConfig getPartnerConfig() {
		ConnectorConfig config = new ConnectorConfig();
		config.setUsername(Constants.FORCE_API_USERNAME);
		config.setPassword(Constants.FORCE_API_PASSWORD);
		config.setManualLogin(true);
		return config;
	}

	public static ConnectorConfig getConnectionConfig() {
		ConnectorConfig config = new ConnectorConfig();
		config.setUsername(Constants.FORCE_API_USERNAME);
		config.setPassword(Constants.FORCE_API_PASSWORD);
		config.setAuthEndpoint(Constants.FORCE_API_ENDPOINT_PARTNER);
		config.setConnectionTimeout(Integer
				.valueOf(Constants.FORCE_API_CONNECTION_TIMEOUT));
		config.setReadTimeout(Integer.valueOf(Constants.FORCE_API_READ_TIMEOUT));

		PartnerConnection connection = null;
		try {
			connection = Connector.newConnection(config);
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			LogHelper.logger
					.error("Partner Connection Exception", e.getCause());
		}
		return connection.getConfig();
	}

	public static ConnectorConfig getConnectionConfig(UserVO user) {
		ConnectorConfig config = new ConnectorConfig();
		config.setUsername(user.username);
		config.setPassword(user.password);
		config.setAuthEndpoint(Constants.FORCE_API_ENDPOINT_PARTNER);
		config.setConnectionTimeout(Integer
				.valueOf(Constants.FORCE_API_CONNECTION_TIMEOUT));
		config.setReadTimeout(Integer.valueOf(Constants.FORCE_API_READ_TIMEOUT));

		PartnerConnection connection = null;
		try {
			connection = Connector.newConnection(config);
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			LogHelper.logger
					.error("Partner Connection Exception", e.getCause());
		}
		return connection.getConfig();
	}

	public static SoapConnection getApexConnection() {
		// getConnection();
		ConnectorConfig config = getConnectionConfig();
		ConnectorConfig apex = new ConnectorConfig();
		apex.setConnectionTimeout(config.getConnectionTimeout());
		apex.setReadTimeout(config.getReadTimeout());
		apex.setSessionId(config.getSessionId());
		apex.setServiceEndpoint(config.getServiceEndpoint().replace("/u/",
				"/s/"));
		LogHelper.logger.debug("Apex Session id" + apex.getSessionId());
		LogHelper.logger.debug("Apex Endpoint Service"
				+ apex.getServiceEndpoint());

		SoapConnection connection = null;
		try {
			connection = com.sforce.soap.apex.Connector.newConnection(apex);
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error("Apex Connection Exception", e.getCause());
		}
		return connection;
	}

	public static MetadataConnection getMetadataConnection() {

		ConnectorConfig result = getConnectionConfig();
		ConnectorConfig metadata = new ConnectorConfig();

		metadata.setSessionId(result.getSessionId());
		metadata.setServiceEndpoint(Constants.FORCE_API_ENDPOINT_METADATA);
		metadata.setReadTimeout(result.getReadTimeout());
		metadata.setConnectionTimeout(result.getConnectionTimeout());
		LogHelper.logger.debug("Metadata Session id " + metadata.getSessionId());
		LogHelper.logger.debug("Metadata Server URL "
				+ metadata.getServiceEndpoint());
		MetadataConnection connection = null;
		try {
			connection = com.sforce.soap.metadata.Connector
					.newConnection(metadata);
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error("Metadata Connection Exception",
					e.getCause());
		}
		return connection;
	}

	public static LoginResult loginToSalesforce() {
		ConnectorConfig config = new ConnectorConfig();
		config.setManualLogin(true);
		config.setAuthEndpoint(Constants.FORCE_API_ENDPOINT_PARTNER);
		config.setConnectionTimeout(Integer
				.valueOf(Constants.FORCE_API_CONNECTION_TIMEOUT));
		config.setReadTimeout(Integer.valueOf(Constants.FORCE_API_READ_TIMEOUT));
		try {
			PartnerConnection connection = Connector.newConnection(config);
			return connection.login(Constants.ADMIN_USERNAME,
					Constants.ADMIN_PASSWORD);
		} catch (LoginFault ex) {
			LogHelper.logger.error(ex.getMessage(), ex);
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error(e.getMessage(), e);
		}
		return null;
	}

	public static LoginResult loginToSalesforce(UserVO user) {
		ConnectorConfig config = new ConnectorConfig();
		config.setManualLogin(true);
		config.setAuthEndpoint(Constants.FORCE_API_ENDPOINT_PARTNER);
		config.setConnectionTimeout(Integer
				.valueOf(Constants.FORCE_API_CONNECTION_TIMEOUT));
		config.setReadTimeout(Integer.valueOf(Constants.FORCE_API_READ_TIMEOUT));
		try {
			PartnerConnection connection = Connector.newConnection(config);
			return connection.login(user.username, user.password);
		} catch (LoginFault ex) {
			LogHelper.logger.error(ex.getMessage(), ex);
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error(e.getMessage(), e);
		}
		return null;
	}

	static class MySessionRenewer implements SessionRenewer {
		@Override
		public SessionRenewalHeader renewSession(ConnectorConfig config)
				throws ConnectionException {
			System.err.println("Renewing Session for Config : " + config);
			config.setManualLogin(true);
			PartnerConnection binding = Connector.newConnection(config);
			LoginResult lr = binding.login(config.getUsername(),
					config.getPassword());
			config.setSessionId(lr.getSessionId());
			config.setServiceEndpoint(lr.getServerUrl());
			SessionRenewalHeader header = new SessionRenewalHeader();
			header.name = new QName("urn:partner.soap.sforce.com",
					"SessionHeader");
			header.headerElement = binding.getSessionHeader();
			return header;

		}
	}

	public static void createCustomObjectMetadata(String objectname) {
		MetadataConnection metadataConnection = null;
		if (objectname == null || objectname.length() < 1) {
			LogHelper.logger.error("Invalid Objectname: " + objectname);
			return;
		}
		try {
			if (!objectname.endsWith("__c"))
				objectname = objectname + "__c";
			CustomObject co = new CustomObject();
			co.setFullName(objectname);
			co.setDeploymentStatus(DeploymentStatus.InDevelopment);
			co.setDescription("Created by the Metadata API");
			co.setEnableActivities(true);
			co.setLabel(objectname + " Object");
			co.setPluralLabel(co.getLabel() + "s");
			co.setSharingModel(SharingModel.ReadWrite);

			CustomField nf = new CustomField();
			nf.setType(FieldType.Text);
			nf.setLabel(co.getFullName() + " Name");
			co.setNameField(nf);

			metadataConnection = getMetadataConnection();
			com.sforce.soap.metadata.SaveResult[] results = metadataConnection
					.createMetadata(new Metadata[] { co });

			for (com.sforce.soap.metadata.SaveResult r : results) {
				if (r.isSuccess()) {
					LogHelper.logger.debug("Created component: "
							+ r.getFullName());
				} else {
					LogHelper.logger
							.error("Errors were encountered while creating "
									+ r.getFullName());
					for (Error e : r.getErrors()) {
						LogHelper.logger.error("Error message: "
								+ e.getMessage());
						LogHelper.logger.error("Status code: "
								+ e.getStatusCode());
					}
				}
			}
		} catch (ConnectionException ce) {
			LogHelper.logger.error(ce.getMessage(), ce);
		}
	}

	public static void deleteCustomObjectMetadata(String objectname) {
		MetadataConnection metadataConnection = null;
		if (objectname == null || objectname.length() < 1) {
			LogHelper.logger.error("Invalid Objectname: " + objectname);
			return;
		}

		try {
			if (!objectname.endsWith("__c"))
				objectname = objectname + "__c";
			CustomObject co = new CustomObject();
			co.setFullName(objectname);

			metadataConnection = getMetadataConnection();
			com.sforce.soap.metadata.DeleteResult[] results = metadataConnection
					.deleteMetadata("CustomObject",
							new String[] { co.getFullName() });

			for (com.sforce.soap.metadata.DeleteResult r : results) {
				if (r.isSuccess()) {
					LogHelper.logger.debug("Deleted component: "
							+ r.getFullName());
				} else {
					LogHelper.logger
							.error("Errors were encountered while creating "
									+ r.getFullName());
					for (Error e : r.getErrors()) {
						LogHelper.logger.error("Error message: "
								+ e.getMessage());
						LogHelper.logger.error("Status code: "
								+ e.getStatusCode());
					}
				}
			}
		} catch (ConnectionException ce) {
			LogHelper.logger.error(ce.getMessage(), ce);
		}
	}

	public static boolean hasObjectMetadata(String objectname) {
		PartnerConnection connection = getConnection();
		try {
			DescribeSObjectResult result = connection
					.describeSObject(objectname);
			if (result != null)
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error(e.getMessage(), e);
		}
		return false;
	}

	public static boolean hasFieldMetadata(String objectname, String fieldname) {
		PartnerConnection connection = getConnection();
		try {
			DescribeSObjectResult result = connection
					.describeSObject(objectname);
			if (result != null) {
				Field[] fields = result.getFields();
				for (Field f : fields) {
					LogHelper.logger
							.info("###Object FieldName: " + f.getName());
					if (f.getName().equals(fieldname))
						return true;
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error(e.getMessage(), e);
		}
		return false;
	}

	public static void updateFieldPermission(String profilefullname,
			String object, String field, boolean visible, boolean readonly) {
		MetadataConnection metadataConnection = null;
		try {
			Profile profile = new Profile();
			profile.setFullName(profilefullname);
			ProfileFieldLevelSecurity security = new ProfileFieldLevelSecurity();
			if (!object.endsWith("__c"))
				object = object + "__c";
			if (!field.endsWith("__c"))
				field = field + "__c";
			String fullname = object + "." + field;
			security.setField(fullname);
			security.setEditable(!readonly);
			security.setReadable(visible);
			profile.setFieldPermissions(new ProfileFieldLevelSecurity[] { security });

			metadataConnection = getMetadataConnection();
			com.sforce.soap.metadata.SaveResult[] results = metadataConnection
					.updateMetadata(new Metadata[] { profile });

			for (com.sforce.soap.metadata.SaveResult r : results) {
				if (r.isSuccess()) {
					LogHelper.logger.debug("Created component: "
							+ r.getFullName());
				} else {
					LogHelper.logger
							.error("Errors were encountered while creating "
									+ r.getFullName());
					for (Error e : r.getErrors()) {
						LogHelper.logger.error("Error message: "
								+ e.getMessage());
						LogHelper.logger.error("Status code: "
								+ e.getStatusCode());
					}
				}
			}
		} catch (ConnectionException ce) {
			LogHelper.logger.error(ce.getMessage(), ce);
		}
	}

	public static void updateCustomMetadataType(String typename,
			String recordname, String label, Map<String, Object> fieldMap) {
		MetadataConnection metadataConnection = null;
		try {
			CustomMetadata metadataType = new CustomMetadata();
			metadataType.setFullName(typename + "." + recordname);
			metadataType.setLabel(label);
			CustomMetadataValue[] values = new CustomMetadataValue[fieldMap
					.size()];
			int count = 0;
			for (String key : fieldMap.keySet()) {
				CustomMetadataValue value = new CustomMetadataValue();

				value.setField(key);
				value.setValue(fieldMap.get(key));
				values[count++] = value;
			}
			metadataType.setValues(values);
			metadataConnection = getMetadataConnection();
			com.sforce.soap.metadata.SaveResult[] results = metadataConnection
					.updateMetadata(new Metadata[] { metadataType });

			for (com.sforce.soap.metadata.SaveResult r : results) {
				if (r.isSuccess()) {
					LogHelper.logger.debug("Created component: "
							+ r.getFullName());
				} else {
					LogHelper.logger
							.error("Errors were encountered while creating "
									+ r.getFullName());
					for (Error e : r.getErrors()) {
						LogHelper.logger.error("Error message: "
								+ e.getMessage());
						LogHelper.logger.error("Status code: "
								+ e.getStatusCode());
					}
				}
			}
		} catch (ConnectionException ce) {
			LogHelper.logger.error(ce.getMessage(), ce);
		}
	}

	public static void deleteCustomMetadataType(String typename,
			String recordname) {
		MetadataConnection metadataConnection = null;
		try {
			String fullname = recordname;
			metadataConnection = getMetadataConnection();
			com.sforce.soap.metadata.DeleteResult[] results = metadataConnection
					.deleteMetadata(typename, new String[] { fullname });

			for (com.sforce.soap.metadata.DeleteResult r : results) {
				if (r.isSuccess()) {
					LogHelper.logger.debug("Deleted component: "
							+ r.getFullName());
				} else {
					LogHelper.logger
							.error("Errors were encountered while creating "
									+ r.getFullName());
					for (Error e : r.getErrors()) {
						LogHelper.logger.error("Error message: "
								+ e.getMessage());
						LogHelper.logger.error("Status code: "
								+ e.getStatusCode());
					}
				}
			}
		} catch (ConnectionException ce) {
			LogHelper.logger.error(ce.getMessage(), ce);
		}
	}

	public static void deleteCustomMetadataType(String typename,
			String[] fullnames) {
		MetadataConnection metadataConnection = null;
		try {
			metadataConnection = getMetadataConnection();
			com.sforce.soap.metadata.DeleteResult[] results = metadataConnection
					.deleteMetadata(typename, fullnames);

			for (com.sforce.soap.metadata.DeleteResult r : results) {
				if (r.isSuccess()) {
					LogHelper.logger.debug("Deleted component: "
							+ r.getFullName());
				} else {
					LogHelper.logger
							.error("Errors were encountered while creating "
									+ r.getFullName());
					for (Error e : r.getErrors()) {
						LogHelper.logger.error("Error message: "
								+ e.getMessage());
						LogHelper.logger.error("Status code: "
								+ e.getStatusCode());
					}
				}
			}
		} catch (ConnectionException ce) {
			LogHelper.logger.error(ce.getMessage(), ce);
		}
	}

	public static void createCustomFieldMetadata(String objectName,
			String fieldname) {
		if (!objectName.endsWith("__c"))
			objectName = objectName + "__c";

		if (!fieldname.endsWith("__c"))
			fieldname = fieldname + "__c";
		// create the text id field
		CustomField field = new CustomField();
		field.setType(FieldType.Text);
		field.setDescription("The custom text field");
		field.setLabel(objectName + "." + fieldname);
		field.setFullName(objectName + "." + fieldname);

		// add the field to the custom object
		field.setLength(255);
		MetadataConnection metadataConnection = null;
		try {
			metadataConnection = getMetadataConnection();
			com.sforce.soap.metadata.SaveResult[] results = metadataConnection
					.createMetadata(new Metadata[] { field });

			for (com.sforce.soap.metadata.SaveResult r : results) {
				if (r.isSuccess()) {
					System.out.println("Created component: " + r.getFullName());
				} else {
					LogHelper.logger
							.error("Errors were encountered while creating "
									+ r.getFullName());
					for (Error e : r.getErrors()) {
						LogHelper.logger.error("Error message: "
								+ e.getMessage());
						LogHelper.logger.error("Status code: "
								+ e.getStatusCode());
					}
				}
			}
		} catch (ConnectionException ex) {
			LogHelper.logger.error(
					"\nFailed to create field, error message was: \n"
							+ ex.getMessage(), ex);
		}

	}

	public static boolean execute(String codeblock) {
		SoapConnection connection = getApexConnection();
		ExecuteAnonymousResult result = null;
		boolean res = false;
		try {
			result = connection.executeAnonymous(codeblock);
			res = result.isSuccess();
			return res;
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			LogHelper.logger.error("Connection Error", e.getCause());
			res = false;
		} catch (Exception ex) {
			LogHelper.logger.error("Anonymous Execute error", ex.getCause());
			res = false;
		}
		LogHelper.logger.debug("Code Block" + codeblock);
		LogHelper.logger.debug("Result" + result.toString());
		return res;
	}

}
