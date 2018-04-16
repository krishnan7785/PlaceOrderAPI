package com.salesforce.placeorder.custom;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.databind.module.SimpleModule;

public class DateTimeModule extends SimpleModule {
	private static final long serialVersionUID = 1L;

	public DateTimeModule() {
		super();
		addSerializer(ZonedDateTime.class, new DateTimeSerializer());
		addDeserializer(ZonedDateTime.class, new DateTimeDeserializer());
	}

}
