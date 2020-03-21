package InterviewQuestions;

public class Q4 {

	public static void main(String[] args) {
		// Find out how many alpha characters are present in a String?  Find number of words in string?

		String str="I love Florida @@***";
		
		String[] array=str.split(" ");
		
		
		System.out.println(str.replaceAll("[A-Za-z]", "").length());
		
		System.out.println(array.length);
		
		
		
		
	}

}
