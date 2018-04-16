package com.salesforce.placeorder.custom;

import java.io.IOException;
import java.time.ZonedDateTime;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.salesforce.placeorder.util.DateUtil;

public class DateTimeDeserializer extends JsonDeserializer<ZonedDateTime> {

	public DateTimeDeserializer() {
		super();
	}

	@Override
	public ZonedDateTime deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonToken currentToken = p.getCurrentToken();
		if (currentToken == JsonToken.VALUE_STRING) {
			return DateUtil.parseDateTime(p.getText().trim());
		}
		throw JsonMappingException.from(ctxt, "Expected String value, got: "
				+ currentToken);
	}

}
