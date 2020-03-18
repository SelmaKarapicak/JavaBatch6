package com.syntax.class11;

import java.util.Scanner;

public class TaskUsername {

	public static void main(String[] args) {
		
		Scanner scan;
		String username;
		String password;
		String confirmedPassword;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your Username");
		username=scan.nextLine();
		System.out.println("Please enter your password");
		password=scan.nextLine();
		System.out.println("Please enter confirmed password");
		confirmedPassword=scan.nextLine();
		
		if(username.isEmpty() && password.isEmpty()) {
			System.out.println("Password cannot be empty");
		}else if(password.length()<8) {
			System.out.println("Password is too short");
		}else if(password.contains(username)) {
			System.out.println("Password cannot contain username");
		}else if(password.equals(confirmedPassword)) {
			System.out.println("Your username and password created");
		}else {
			System.out.println("Password does not match");
		}
		
		
		

	}

}
