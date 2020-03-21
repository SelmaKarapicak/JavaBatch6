package com.syntax.class02;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		 Scanner scan;
		  String name;
		  String responsibility;
		  
		  scan=new Scanner (System.in);
		  System.out.println("Enter name of the instructor");
		  name=scan.nextLine();
		  
		  
		  switch (name){
		    
		  case "Shiva":
		  responsibility="Will take care of Java Assignment";
		  break;
		   case "Sandish":
		  responsibility="Will take care of SDLC Assignment";
		  break;
		   case "Weqas":
		  responsibility="Will take care of Selenium Assignment";
		  break;
		   case "Asel":
		  responsibility="Will take care of every Assignment";
		  break;
		  default:
		  responsibility="Invalid instructor selected";
		  
		  }
		  
		  
		}
		

	}


