package com.salesforce.placeorder.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;


public class PropertiesReader {

	public static enum PROPERTY_TYPE {
		BUILD
	}

	private final Properties buildProp = new Properties();

	public PropertiesReader() {

		InputStream in2 = this.getClass().getClassLoader()
				.getResourceAsStream("test.properties");

		System.out
				.println("PropertiesReader: Read build/mapping properties from file");

		try {
			buildProp.load(in2);
			// Load override if available as system properties
			for (Object key : this.buildProp.keySet()) {
				String override = System.getProperty((String) key);
				if (override != null)
					buildProp.put(key, override);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



	public String getProperty(PROPERTY_TYPE propType, String key) {
		switch (propType) {
		case BUILD:
			return buildProp.getProperty(key) != null ? buildProp.getProperty(
					key).trim() : buildProp.getProperty(key);
		}
		return "";
	}

	public Set<String> getAllPropertyNames(PROPERTY_TYPE propType) {

		switch (propType) {
		case BUILD:
			return buildProp.stringPropertyNames();
		}
		return null;
	}

	public boolean containsKey(PROPERTY_TYPE propType, String key) {
		switch (propType) {
		case BUILD:
			return buildProp.containsKey(key);
		}
		return false;
	}

}