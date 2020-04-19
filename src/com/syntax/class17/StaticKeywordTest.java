package com.syntax.class17;

public class StaticKeywordTest {

	public static void main(String[] args) {
		// access static members of another class
		
		StaticKeyword.brand="Android";
		StaticKeyword.touchscreen=true;
		StaticKeyword.displayGeneralInfo();
		
		//access instance members of another class
		StaticKeyword sk=new StaticKeyword();
		sk.color="red";
		sk.memory=128;
		sk.displaySpecifications();

		//access instance members of another class
		StaticKeyword sk1=new StaticKeyword();
		sk1.color="blue";
		sk1.memory=128;
		
		
				
		//access instance members of another class
		StaticKeyword sk2=new StaticKeyword();
		sk2.color="red";
		sk2.memory=128;
		sk2.brand="Nokia";
		
		sk.displaySpecifications();
		sk1.displaySpecifications();
		sk2.displayGeneralInfo();
	}

}
