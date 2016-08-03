package com.practice.chapter4;

public class Customer {

	private String firstName;
	private String lastName;
	private String address;
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getAddress(){
		return this.address;
	}
}
