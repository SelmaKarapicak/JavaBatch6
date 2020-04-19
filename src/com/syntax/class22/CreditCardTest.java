package com.syntax.class22;

public class CreditCardTest {

	public static void main(String[] args) {
	
		CreditCard credit=new CreditCard(1000);
		double interest=credit.calculate();
		System.out.println(interest);
		
		Visa visa=new Visa(1000);
		 interest=visa.calculate();
		 System.out.println(interest);
		
		AX ax=new AX(1000);
		interest=ax.calculate();
		System.out.println(interest);



	}

}
