package com.salesforce.placeorder.util;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import lombok.extern.log4j.Log4j2;
@Log4j2
public class PropertiesReader {

	private Properties _properties = new Properties();
	private String defaultAppFilename = "application.properties";
	private String appFilename;

	public PropertiesReader(String filename) {
		this.appFilename = filename!=null?filename:defaultAppFilename;
		loadProperties();
	}

	private void loadProperties() {
		try {
			InputStream iStream = this.getClass().getClassLoader().getResourceAsStream(appFilename);

			if (iStream != null) {
				_properties.load(iStream);
			} else {
				throw new FileNotFoundException("property file '" + appFilename + "' not found in the classpath");
			}
		}catch(Exception ex) {
			log.error(ex.getMessage());
		}
	}
	
	public Properties get_properties() {
		return _properties;
	}
	
	public String getAppFilename() {
		return appFilename;
	}

	public void setAppFilename(String appFilename) {
		this.appFilename = appFilename;
	}
	
}
