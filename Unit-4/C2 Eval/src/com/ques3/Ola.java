package com.ques3;

public class Ola {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		Car car;
		if(numberOfPassenger > 3) {
			car = new Sedan();
		}
		else {
			car = new HatchBack();
		}
		
		car.setNumberOfPassenger(numberOfPassenger);
		car.setNumberOfKms(numberOfKMs);
		return car;
	}
	
	public int calculateBill(Car car) {
		int totalFare;
		if(car instanceof HatchBack) {
			HatchBack hatchCar = (HatchBack)car;
			totalFare = car.getNumberOfKms()*hatchCar.farePerKm;
		}
		else {
			Sedan sedanCar = (Sedan)car;
			totalFare = car.getNumberOfKms()*sedanCar.farePerKm;
		}
		return totalFare;
	}
}
