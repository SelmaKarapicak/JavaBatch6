package com.syntax.class04;

public class NestedContinue {
	
	
	
	 /*eger variablelr ayniysa else if li kullanabilirsin ama variablelr farkliysa if kullaniyorsun asagidaki gibi
	 *  mesela variable in num=1 olsun asagida if else le num==2 diye kullanirsin 
	 * ama burda variabller farkli apple orange diye farkli o yuzden hepsinde ayri if oluyor
	 * 
	 */

	public static void main(String[] args) {
		
		boolean allergy=false;
		boolean appleAllergy=false;
		boolean orangeAllergy=true;
		boolean kiwiAllergy=false;
		
		if(allergy) {
			System.out.println("Please answer below");
			
			if (orangeAllergy) {
				System.out.println("Do not eat oranges");
			}
			
			if (appleAllergy) {
				System.out.println("Do not eat apples");
			}
			
			
			
		} else {
			System.out.println("You are healthy");
		}
		
		
		
		

	}

}
