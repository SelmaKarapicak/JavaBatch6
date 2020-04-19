package com.myexercises;

 class MethodSmallest {
	
	 static int nums(int a, int b, int c){
		    int[] array=new int[3];
		    array[0]=a;
		    array[1]=b;
		    array[2]=c;
		    
		    int smallest=0;
		    for(int i=0; i<array.length; i++){
		      if(smallest<array[i]){
		        smallest=array[i];
		        return smallest;
		      }
		    }
			return smallest;	
		  }
		    
		  public static void main(String[] args) {
		   System.out.println(nums(25,45,65));
		  
		 }

}
