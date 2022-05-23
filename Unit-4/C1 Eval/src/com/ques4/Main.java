package com.ques4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students you want to enter : ");
		int num = input.nextInt();
		System.out.println("=======================");
		for(int i = 0; i < num; i++) {
			System.out.print("Enter roll number of the student : ");
			int rollNumber = input.nextInt();
			input.nextLine();
			System.out.print("Enter name of the student : ");
			String studentName = input.nextLine();
			System.out.print("Enter marks of the student : ");
			int marks = input.nextInt();
			System.out.println();
			Student stud = new Student(rollNumber,studentName,marks);
			
			System.out.println("Student detail "+ (i+1));
			System.out.println("Student Roll Number : " + stud.getRollNumber());
			System.out.println("Student Name : " + stud.getStudentName());
			System.out.println("Student Mark : " + stud.getMarks());
			System.out.println("=======================");
		}
		
	}
}


class Student{
	private int rollNumber;
	private String studentName;
	private int marks;
	
	Student(){
		
	}
	Student(int r, String n, int m){
		this.rollNumber = r;
		this.studentName = n;
		this.marks = m;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}