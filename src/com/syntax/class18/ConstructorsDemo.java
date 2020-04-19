package com.syntax.class18;

public class ConstructorsDemo {
	
	static String str="Hello";
	
	ConstructorsDemo(){
		System.out.println("I am your constructor");
		System.out.println("I am non argument constructor");
	}
	
	ConstructorsDemo(String str){
		System.out.println("I am a constructor with 1 String parameter "+str);
	}
	
	ConstructorsDemo(int num){
		System.out.println("I am a constructor with 1 int value "+num);
	}
	
	ConstructorsDemo(String str, int num){
		System.out.println("I am a constructor with 2 parameters "+str+"&"+num);
	}
	void ConstructorsDemo(){
		//System.out.println("I am a constructor with 1 int value "+num);
	}

	public static void main(String[] args) {
		// ConstructorsDemo obj=new ConstructorDemo();
		System.out.println(str);
		
		ConstructorsDemo obj=new ConstructorsDemo();
		
		ConstructorsDemo obj1=new ConstructorsDemo(12);
	}

}
