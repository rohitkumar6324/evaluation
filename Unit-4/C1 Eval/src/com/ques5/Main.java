package com.ques5;

public class Main {
	public static void main(String[] args) {
		Shapes shape = new Shapes();
		shape.area(new Circle(10));
		shape.area(new Rectangle(10,5));
		shape.area(new Square(10));
		
	// Here we can clearly see that despite all the three methods have the same name but
	// still our program is able to run without any ambiguity. This is because of method overloading
	// where it decides which method to call on the basis of the arguments passed inside it. Hence, 
	// despite having the same name all three of them are printing different results because arguments passed are different. This is called polymorphism. 
	}
}

class Shapes{
	public void area(Circle circle) {
		System.out.println("Area of the circle is " + Math.PI*circle.radius*circle.radius);
	}
	
	public void area(Rectangle rectangle) {
		System.out.println("Area of the rectangle is "+rectangle.breadth*rectangle.length);
	}
	
	public void area(Square square) {
		System.out.println("Area of the square is " + square.side * square.side);
	}
}

class Circle{
	int radius;
	
	Circle(int r){
		this.radius = r;
	}
}

class Rectangle{
	int length;
	int breadth;
	
	Rectangle(int l, int b){
		this.length = l;
		this.breadth = b;
	}
}

class Square{
	int side;
	
	Square(int s){
		this.side = s;
	}
}