package com.ques4;

public class Main {
	public static void main(String[] args) {
		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println(newTeacher);
	}
	
	public static Person generatePerson(Person person) {
		person.setDetails();
		return person;
	}
}
