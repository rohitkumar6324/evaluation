package com.ques2;

public class Main {
	public static void main(String[] args) {
		Loan loan = Loan.generateLoanClass();
		Employee emp1 = new PermanentEmployee(123, "Ramesh", 30000);
		Employee emp2 = new TemporaryEmployee(126, "Rakesh", 8,100);
		double loan1 = loan.calculateLoanAmount(emp1);
		double loan2 = loan.calculateLoanAmount(emp2);
		double loan3 = loan.calculateLoanAmount(null);
	}
}
