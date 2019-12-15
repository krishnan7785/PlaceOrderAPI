package com.salesforce.placeorder.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder(toBuilder = true)
@Setter
@Getter
@ToString
public class UserVO {
	public String id;
	public String recordType;
	public String owner;
	public String username;
	public String password;
	public String email;
	public String firstName;
	public String lastName;
}
