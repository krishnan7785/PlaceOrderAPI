package com.salesforce.placeorder.vo;

import net.karneim.pojobuilder.GeneratePojoBuilder;

@GeneratePojoBuilder(intoPackage = "com.salesforce.placeorder.builder")
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
