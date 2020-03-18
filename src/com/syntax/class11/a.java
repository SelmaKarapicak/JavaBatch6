package com.syntax.class11;

public class a {

	public static void main(String[] args) {
		
		// Create an array of cars : american, german, korean, italian. 
				//Then retrieve all values from that array using 2 different loops

		String [][] cars= { {"chevrolet","GM","Ford","Dodge","Jeep"},
				{"mercedes","walksvagen","bmw","audi"},
			    {"toyota","honda","hyundai"}};
int sum=0;
 
System.out.println("*********nested for loop***********");

     for(int i=0;i<cars.length;i++) {
     for(int j=0;j<cars[i].length;j++) {
	   System.out.print(cars[i][j]+" ");
	   sum+=1;
 }
     System.out.println();
}
    System.out.println("Total number of cars: "+sum);

    System.out.println("*********advanced  loop***********");

      sum=0;
      for(String[] array:cars) {
      for(String items:array) {
	    System.out.print(items+ " ");
	    sum++;
    }
       System.out.println();
   }
       System.out.println("Total number of cars: "+sum);
	}

}
