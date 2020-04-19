package com.syntax.class19;

public class ConstructorCall {
	
	
		public ConstructorCall() {
			System.out.println("i am a non argumant constructor");
			System.out.println("1.si");
		}
		public ConstructorCall(String str) {
			this();//will lead to the prev constr
			System.out.println("2.si");
		}
		public ConstructorCall(String str,String str1) {
			this("Hello");//will lead to the prev constr
			System.out.println("3.su");
		}
		public static void main(String[] args) {
			ConstructorCall obj = new ConstructorCall("Java","Love"); //constructor chaining
		}

}
