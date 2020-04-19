package com.syntax.class25;

//We have to calculate the average of marks obtained in three subjects by student A and by student B. 
//Create class ‘Marks’ with an abstract method ‘getPercentage’ that will be returning the average percentage of marks. 
//Provide implementation of abstract method in classes ‘A’ and ‘B’.
//The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 
//Test your code

public abstract class Marks {
	
	public abstract void getPercentage();
}

class A extends Marks{
	int mat;
	int science;
	int english;
	
	A(int mat,int science,int english){
		this.mat=mat;
		this.science=science;
		this.english=english;
		
	}

	@Override
	public void getPercentage() {
		double percentage=(mat+science+english)/3;
		System.out.println("For students A the percantages of marks "+percentage);
	}	
}
class B extends Marks{
	
	int mat;
	int science;
	int english;
	int music;
	
	B(int mat,int science,int english){
		this.mat=mat;
		this.science=science;
		this.english=english;
		this.music=music;
	}

	@Override
	public void getPercentage() {
		double percentage=(mat+science+english+music)/4;
		System.out.println("For students B the percantages of marks "+percentage);
		
	}	
}
