package com.ques4;

public class Address {
	String city;
	String state;
	String pinCode;
	
	@Override
	public String toString(){
		return "[City : " + city + ",State : " + state + ", Pincode : " + pinCode + "]"; 
	}
}
