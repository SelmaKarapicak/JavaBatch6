package com.syntax.class02;

public class Arithmetic0perators {

	public static void main(String[] args) {

		int x = 5;
		int y = 8;

		int add = (x + y);
		int subtract = (x - y);
		int multiply = (x * y);
		int divide = (x / y);

		System.out.println("The total numbers " + x + " and " + y + " is equal to " + add);
		System.out.println("The subtract numbers " + x + " and " + y + " is equal to " + subtract);
		System.out.println("The multiply numbers " + x + " and " + y + " is equal to " + multiply);
		System.out.println("The division numbers " + x + " and " + y + " is equal to " + divide);

		double a = 2.9;
		double b = a * a;

		System.out.println("The square of the " + a + " is " + b);

		int width = 5;
		int height = 8;
		int area = width * height;
		int perimeter = 2 * (width + height);

		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height + " is equal to " + perimeter + " and the area is " + area);

	}

}
