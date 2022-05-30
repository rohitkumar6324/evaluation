package com.ques4;

public class Person {
	String name;
	String gender;
	Address address = new Address();
	
	@Override
	public String toString() {
		return "[Name : " + name + ",Gender : " + gender + "Address=Address[" + "[City : " + address.city + ",State : " + address.state + ", Pincode : " + address.pinCode + "]";
	}
	
	
	
	public void setDetails() {
		
	}
}
