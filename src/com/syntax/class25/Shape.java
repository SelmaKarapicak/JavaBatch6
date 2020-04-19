package com.syntax.class25;

//Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter. 
//Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.

public interface Shape {
	
	public void calculateArea();
	public void calculatePerimeter();
}

 class Circle implements Shape {
	
	double pi=3.14;
	int r=4;
	
	double area=(pi*(r*r));
	double parameter=2*(pi*r);

	@Override
	public void calculateArea() {
		System.out.println(area);
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println(parameter);
		
	}
 }
	class Square implements Shape{
		int a=6;
	double areas=(a*a);
	double parameters=4*a;

		@Override
		public void calculateArea() {
		System.out.println(areas);	
			
		}

		@Override
		public void calculatePerimeter() {
			System.out.println(parameters);
			
		}
		
		
	}
	


