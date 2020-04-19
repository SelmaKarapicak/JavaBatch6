package com.syntax.class15;

public class Calculator {
	
	//define methods to calculate add,sub.div,mul
	
	void add(int a, int b) {
		
		System.out.println(a+b);
	}
	
	void sub(int a, int b) {
		System.out.println(a/b);
		}
	
	void mult(int a, int b) {
		System.out.println(a*b);	
	}
	
	void div(double a, double b) {
		System.out.println(a/b);
	}
	
    public static void main(String[] args) {
		
		Calculator calc=new Calculator();
		
		calc.add(100,200);
		calc.sub(1000,300);
		calc.mult(50, 7);
		calc.div(540, 35);
		
		calc.add(1000,2000);
		calc.sub(10,3);
	}

}
