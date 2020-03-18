package com.syntax.class04;

public class NestingElseIf {

	public static void main(String[] args) {
		
		boolean quizCompleted=true;
		int score=46;
		
		if(quizCompleted) {
			System.out.println("Lets check your score");
		}
		if (score>90) {
			System.out.println("Great job");
		}
		else if(score>80) {
			System.out.println("Well done");
		}
		else if (score>70) {
			System.out.println("Done better");
		}
		else {
			System.out.println("You failed");
		}
	
		

	}

}
