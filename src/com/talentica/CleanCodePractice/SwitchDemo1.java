package com.talentica.CleanCodePractice;

public class SwitchDemo1 {
	private static Shape shape = new Square();

	public static double calculateArea() {
		return shape.getArea();
	}

	public double calculatePerimeter() {
		return shape.getPerimeter();
	}

	public static void main(String[] args) {
		// Square square = new Square();
		System.out.println("The area of square is " + calculateArea());
	}
}

interface Shape {
	public double getArea();

	public double getPerimeter();
}

class Square implements Shape {
	private double a = 6.0;

	public double getArea() {
		return a * a;
	}

	public double getPerimeter() {
		return 4 * a;
	}
}

class Rectangle implements Shape {
	private double a;
	private double b;

	public double getArea() {
		return a * b;
	}

	public double getPerimeter() {
		return 2 * (a + b);
	}
}

class Circle implements Shape {
	private double r;

	public double getArea() {
		return Math.PI * r * r;
	}

	public double getPerimeter() {
		return 2 * Math.PI * r;
	}
}