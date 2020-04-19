package com.syntax.class24;

public abstract class Phone {
	
		public void makeCall() {
			System.out.println("iPhone can make a call");
		}
		
		public void text() {
			System.out.println("Phone send text");
		}
		
        //unimplemented methods=undefined methods=abstract methods
		 public abstract void takePicture(); 
		 
		 public abstract void playMusic(); 
	}

 class iphone extends Phone{
	 
	@Override
	public void takePicture() {
		System.out.println("iphone takes pictures");
	}
	@Override
	 public void playMusic() {
		 System.out.println("iphone play music using apple store");
	 }
	
}
 class Samsung extends Phone{
	 
	@Override
	public void takePicture() {
		System.out.println("Samsung takes pictures");
	}
	@Override
	 public void playMusic() {
		 System.out.println("Samsung play music using apple store");
	 }

 }

