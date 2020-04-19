package com.myexercises;

public class TestPerson {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.name="Joe";
		obj.lastName="Smith";
		obj.age=35;
		obj.salary=35000;
		obj.employee();
		
		Student obj2=new Student();
		obj2.name="Adam";
		obj2.lastName="Smith";
		obj2.age=15;
		obj2.grade=10;
		obj2.student();
		
		Retiree obj3=new Retiree();
		obj3.name="Frank";
		obj3.lastName="Smith";
		obj3.age=15;
		obj3.seniorActivity="tour";
		obj3.retiree();
		
		
		

	}

}
