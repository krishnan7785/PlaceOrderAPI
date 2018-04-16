package com.salesforce.placeorder.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "totalSize", "done", "records" })
public class OrderDetails implements Serializable {

	@JsonProperty("totalSize")
	private Integer totalSize;
	@JsonProperty("done")
	private Boolean done;
	@JsonProperty("records")
	private List<Order> records = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 6241665568711729889L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public OrderDetails() {
	}

	/**
	 * 
	 * @param done
	 * @param records
	 * @param totalSize
	 */
	public OrderDetails(Integer totalSize, Boolean done, List<Order> records) {
		super();
		this.totalSize = totalSize;
		this.done = done;
		this.records = records;
	}

	@JsonProperty("totalSize")
	public Integer getTotalSize() {
		return totalSize;
	}

	@JsonProperty("totalSize")
	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}

	public OrderDetails withTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
		return this;
	}

	@JsonProperty("done")
	public Boolean getDone() {
		return done;
	}

	@JsonProperty("done")
	public void setDone(Boolean done) {
		this.done = done;
	}

	public OrderDetails withDone(Boolean done) {
		this.done = done;
		return this;
	}

	@JsonProperty("records")
	public List<Order> getRecords() {
		return records;
	}

	@JsonProperty("records")
	public void setRecords(List<Order> records) {
		this.records = records;
	}

	public OrderDetails withRecords(List<Order> records) {
		this.records = records;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public OrderDetails withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object other) {
		return EqualsBuilder.reflectionEquals(this, other);
	}

}
