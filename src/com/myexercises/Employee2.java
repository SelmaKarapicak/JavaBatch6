package com.myexercises;

/*Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 -  takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal() adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork() adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
*/
public class Employee2 {
	
	int salary, hours;
	
   Employee2(int salary,int hours){
		this.hours=hours;
		this.salary=salary;
	}   
   void addSal(){
     if(salary<500) {
    	 salary=salary+10;
    	 System.out.println("Salary is "+salary);
     }
    }  
   void addWork() {
	   if(hours>6) {
		   salary=salary+5;
		   System.out.println("Salary is "+salary+" "
		   		+ "because you work more than 6 hours and you have less many");
	  }
	   } 
}
class Intern extends Employee2{
	int bonus;
	Intern( int salary,int hours,int bonus){
		super(hours,salary);
		this.bonus=bonus;
	}
	void bonus() {
		System.out.println("Interns take extra bonus");
	}
	
	void addSal(){
	     if(salary<500) {
	    	 salary=salary+50;
	     }
	    }
	
	 void addWork() {
		   if(hours>6) {
			   salary=salary+20;
		   }
}
	 void display() {
		   System.out.println("For interns final salary is "+salary);
	   }
}