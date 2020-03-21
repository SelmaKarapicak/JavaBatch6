package InterviewQuestions;

public class Q1 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable? 
		//Swap  2 strings without a temporary variable?
		
		String s1="Hello";
		String s2="Bye";

		String shorterstr1 = s1+s2;
		s2 = shorterstr1.replace(s2, "");
		s1 = shorterstr1.replace(s2, "");

		System.out.println("The value of s1 = "+s1);
		System.out.println("The value of s2 = "+s2);


	}

}
