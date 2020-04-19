package com.syntax.class24;

public class PhoneTest {

	public static void main(String[] args) {
	
		//new Phone(); CE: cannot instantiate/create an object of Phone class because it is ABSTRACT
		
		Phone iphone=new iphone();
		iphone.makeCall();
		iphone.playMusic();
		iphone.takePicture();
		iphone.text();
		
		Phone samsung=new Samsung();
		samsung.makeCall();
		samsung.playMusic();
		samsung.takePicture();
		samsung.text();
		

	}

}
