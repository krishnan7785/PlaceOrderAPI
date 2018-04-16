package com.salesforce.placeorder.helper;

import org.apache.log4j.Logger;

public class LogHelper {
	public static Logger logger;
	static {
		if (logger == null) {
			logger = Logger.getLogger(LogHelper.class);
		}
	}

}
