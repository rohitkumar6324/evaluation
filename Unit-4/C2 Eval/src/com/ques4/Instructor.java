package com.ques4;

import java.util.Scanner;

public class Instructor extends Person{
	int instructorId;
	int salary;
	
	@Override
	public void setDetails() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of the instructor :");
		name = input.next();
		System.out.println("Enter the gender of the instructor :");
		gender = input.next();
		System.out.println("Enter the instructor id :");
		instructorId = input.nextInt();
		System.out.println("Enter the salary of the instructor :");
		salary = input.nextInt();
		System.out.println("Enter the city of instructor :");
		address.city = input.next();
		System.out.println("Enter the state of instructor :");
		address.state = input.next();
		System.out.println("Enter the pincode of the instrucstsor :");
		address.pinCode = input.next();
	}
	
	@Override
	public String toString() {
		return "[instructorId = " + instructorId + ", salary = " + salary  + ", address=Address[city=" + address.city + ", state=" + address.state + ", pincode=" + address.pinCode +"]";
	}
}
