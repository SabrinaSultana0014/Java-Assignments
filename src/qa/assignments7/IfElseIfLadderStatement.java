package qa.assignments7;

import java.util.Scanner;

public class IfElseIfLadderStatement {
	
	// Write a java program to get a number from the user and print whether it is positive or negative.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		if (number > 0) {
			System.out.println("The number is positive.");
			
		}else if (number < 0) {
			System.out.println("The number is negative.");
			
		}else {
			System.out.println("The number is zero.");
			
		}
		
		scanner.close();
		
	}

}
