package qa.assignments7;

import java.util.Scanner;

public class SimpleIfStatement {
	
//Write a program to print the Absolute value of a number entered by the user.	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int number = scanner.nextInt();
		
		if (number < 0) {
			number = -number;
		}
		
		System.out.println("The absolute value is: "+ number );
		
		scanner.close();
	}

}
