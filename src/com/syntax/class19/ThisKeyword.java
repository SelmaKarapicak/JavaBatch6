package com.syntax.class19;

public class ThisKeyword {
	
	int a; //instance variable
	int b;
	
	public ThisKeyword() { //no args oldg icin a=0, b=0 
		System.out.println("\ni am a non argument constructor");
	}
	public ThisKeyword(int a, int b) {
		this.a=a; // this access to ur instance variable ‘a’
		this.b=b; // this.b --> the 1st ‘b’ represents the above instance var
	}
	public void sum(int a, int b) { //100 and 200 values
		System.out.println("Some of local variables "+ (a+b));
		System.out.println("Some of the instance varibales "+(this.a+this.b));
	}
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword(10,20);
		obj.sum(100, 200);
		ThisKeyword obj2 = new ThisKeyword(); //no arguments
		obj2.sum(20, 40);
	}

}
