package com.ques2;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no. of students :");
		int num = input.nextInt();
		Student[] arr = new Student[num];
		int totalMarks = 0;
		System.out.println("-----------------------------------------");
		for(int i = 0; i < num; i++) {
			System.out.println("Enter the roll no. of student " + (i + 1) + " : ");
			int roll = input.nextInt();
			System.out.println("Enter the name of student " + (i + 1) + " : ");
			String name = input.next();
			input.nextLine();
			System.out.println("Enter the address no. of student " + (i + 1) + " : ");
			String address = input.nextLine();
			System.out.println("Enter the marks of student " + (i + 1) + " : ");
			int marks = input.nextInt();
			
			Student student = new Student();
			
			student.setRoll(roll);
			student.setName(name);
			student.setAddress(address);
			student.setMarks(marks);
			
			totalMarks += marks;
			arr[i] = student;
			System.out.println("-----------------------------------------");
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Roll no. of the student " + (i + 1) + " is " + arr[i].getRoll());
			System.out.println("Name of the student " + (i + 1) + " is " + arr[i].getName());
			System.out.println("Address of the student " + (i + 1) + " is " + arr[i].getAddress());
			System.out.println("Marks of the student " + (i + 1) + " is " + arr[i].getMarks());
			System.out.println("-----------------------------------------");
		}
		System.out.println("Average marks of all students is " + ((double)totalMarks/arr.length));
	}
}
