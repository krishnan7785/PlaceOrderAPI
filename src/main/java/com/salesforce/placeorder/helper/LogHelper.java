package com.salesforce.placeorder.helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogHelper {
    public static Logger logger;
    static {
        if (logger == null) {
        	logger = LogManager.getLogger(LogHelper.class);
        }
    }


}