package com.salesforce.placeorder.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonUtil {

	private static final ObjectMapper defaultObjectMapper = new ObjectMapper();
	private static volatile ObjectMapper objectMapper = null;

	// Returns default object mapper object if there is no set mapper.
	public static ObjectMapper getMapper() {
		if (objectMapper == null) {
			return defaultObjectMapper;
		} else {
			return objectMapper;
		}
	}

	public static void configureDateTimeModule(ObjectMapper mapper) {
		if (mapper != null) {
			mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,
					false);
		} else
			throw new RuntimeException("Unable to configure date time");

	}

	public static JsonNode toJson(final Object data) {
		try {
			return getMapper().valueToTree(data);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static <A> A fromJson(JsonNode json, Class<A> clazz) {
		try {
			return getMapper().treeToValue(json, clazz);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static <A> A fromString(String content, Class<A> clazz) {
		try {
			return getMapper().readValue(content, clazz);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static ObjectNode newObject() {
		return getMapper().createObjectNode();
	}

	public static String stringify(JsonNode json) {
		return json.toString();
	}

	public static String stringify(Object object) {
		try {
			ObjectMapper mapper = getMapper();
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			String result = mapper.writer().withDefaultPrettyPrinter().writeValueAsString(object);
			return result;
		} catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}
	

	public static String prettyPrint(Object object) {
		try {
			return getMapper().writer().withDefaultPrettyPrinter()
					.writeValueAsString(object);
		} catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public static JsonNode parse(String src) {
		try {
			return getMapper().readValue(src, JsonNode.class);
		} catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public static JsonNode parse(java.io.InputStream src) {
		try {
			return getMapper().readValue(src, JsonNode.class);
		} catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	// Set the object mapper
	public static void setObjectMapper(ObjectMapper mapper) {
		objectMapper = mapper;
	}

}
