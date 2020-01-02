package com.salesforce.placeorder.quartz;

import org.flywaydb.core.Flyway;

public class QuartzSchemaMigration {
	 public static void main(String[] args) throws Exception {
	        Flyway flyway = new Flyway();
	        flyway.setDataSource(System.getenv("JDBC_DATABASE_URL"),
	                             System.getenv("JDBC_DATABASE_USERNAME"),
	                             System.getenv("JDBC_DATABASE_PASSWORD"));
	        flyway.migrate();
	    }
}


