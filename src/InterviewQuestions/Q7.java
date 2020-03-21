package InterviewQuestions;

import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?
		
	​         int[] numbers = { 32, 61, 16, 89, 74, 25 };
	​
			// 1st way
			Arrays.sort(numbers);
			System.out.println("Smallest " + numbers[0]);
			System.out.println("Biggest " + numbers[numbers.length - 1]);
			System.out.println("Second Largest " + numbers[numbers.length - 2]);

	}

	}
