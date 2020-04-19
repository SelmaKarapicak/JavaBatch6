package com.syntax.class21;

public class userClass {
	
	//userClass  that has a constructor that initializes instance variable name and mobile number. 
	//Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
	//Print users name, mobile number and address in userDetails method. Test your code.
	
	String name;
	int mobileNumber;
	
	userClass (String name, int mobileNumber) {
		this.name=name;
		this.mobileNumber=mobileNumber;
	}
	
    public static void main(String[] args) {   //bunu aslinda baska sayfada yapsan daha iyi test class olarak ortada karisik duruyor cunku asagida sublassin var
		
		userInfo obj2=new userInfo("Selma",789564,"Florida");
		obj2.userDetails();
	}
		
}
	
    class userInfo extends userClass{
		String address;
		
		userInfo(String name, int mobileNumber, String address) {
			super(name, mobileNumber);
			this.address=address;
		}
		void userDetails() {
			System.out.println(name+mobileNumber+address);
		}
	
	
}
	


