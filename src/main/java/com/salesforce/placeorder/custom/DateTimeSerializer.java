package com.salesforce.placeorder.custom;

import java.io.IOException;
import java.time.ZonedDateTime;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.salesforce.placeorder.util.DateUtil;

public class DateTimeSerializer extends JsonSerializer<ZonedDateTime> {

	public DateTimeSerializer() {
		super();
	}

	@Override
	public void serialize(ZonedDateTime dateTime, JsonGenerator jsonGenerator,
			SerializerProvider serializerProvider) throws IOException {
		jsonGenerator.writeString(DateUtil.formatDateTime(dateTime));
	}

}
