package com.syntax.class18;

public class Students {
	//Write a java program of Class Students that takes students name and 3 subject grades. 
	//Inside your class also have a method to Calculate Average Grade. 
	//Test Student class for 5 different students with different marks. 
	//Your program should print an average mark of each students name.
	
	String name;
	int grade1, grade2, grade3;
	int average1;
	
	Students(String sname,int sgrade1, int sgrade2, int sgrade3){
	name=sname;
	grade1=sgrade1;
	grade2=sgrade2;
	grade3=sgrade3;
	}
	void average(){
		int average = (grade1+grade2+grade3)/3;
		
		System.out.println(name+" has "+average+" average point");
	}
	


	public static void main(String[] args) {
		Students obj=new Students("Selma",90,80,70);
		obj.average();
		Students obj2=new Students("Turker",95,85,70);
		obj2.average();
		Students obj3=new Students("Yunus",92,84,60);
		obj3.average();
		Students obj4=new Students("Reyhan",100,80,60);
		obj4.average();
		Students obj5=new Students("Senel",60,80,46);
		obj5.average();
	}

}
