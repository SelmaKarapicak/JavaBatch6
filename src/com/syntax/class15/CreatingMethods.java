package com.syntax.class15;

public class CreatingMethods {
	
	//we want to create a method that will accept marks(90,80)
	//based on the marks it will return grade(A, B, C)
	//if  grade>90==>A, 90<GRADE>80==>B 80<grade>70==> C
	
	String grade(int a) {
		if(a>90) {
			return "A";
		}else if(a>80 && a<=90) {
			return " B";
		}else if(a<80 && a>=70) {
			return " C";
		}else {
			return " F";
		}
	}
	
	public static void main(String[] args) {
	
	CreatingMethods obj=new CreatingMethods();
	
	System.out.println(obj.grade(75));

}
}