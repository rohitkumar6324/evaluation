package com.ques3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Ola ola = new Ola();
		System.out.println("Enter the no. of passengers : ");
		int numberOfPassengers = input.nextInt();
		System.out.println("Enter the total no. of kms : ");
		int numberOfKms = input.nextInt();
		
		Car bookedCar = ola.bookCar(numberOfPassengers, numberOfKms);
		int totalFare = ola.calculateBill(bookedCar);
		System.out.println("Total fare amount of your ride is Rs " + totalFare);
	}
}
