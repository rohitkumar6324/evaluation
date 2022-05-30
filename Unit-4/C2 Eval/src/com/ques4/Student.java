package com.ques4;

import java.util.Scanner;

public class Student extends Person{
	int studentId;
	String courseEnrolled;
	int courseFee;
	
	@Override
	public void setDetails() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of the student :");
		name = input.next();
		System.out.println("Enter the gender of the student :");
		gender = input.next();
		System.out.println("Enter the student id :");
		studentId = input.nextInt();
		System.out.println("Enter the enrolled course of the student :");
		courseEnrolled = input.next();
		System.out.println("Enter the course fee of the student :");
		courseFee = input.nextInt();
		System.out.println("Enter the city of student :");
		address.city = input.next();
		System.out.println("Enter the state of student :");
		address.state = input.next();
		System.out.println("Enter the pincode of the student :");
		address.pinCode = input.next();
	}
	
	@Override
	public String toString() {
		return "[studentId = " + studentId + ", courseFee = " + courseFee  + ", courseEnrolled = " + courseEnrolled + ", address=Address[city=" + address.city + ", state=" + address.state + ", pincode" + address.pinCode;
	}
}
