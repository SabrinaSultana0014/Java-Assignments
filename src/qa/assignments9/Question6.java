package qa.assignments9;

import java.util.Scanner;

public class Question6 {
	
//Find the factorial of number using for loop.  (Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. For example: 4! = 4*3*2*1 = 24)
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a factorial number: ");
		int num = scanner.nextInt();
		int factorial = 1;
		
		//For loop
		for(int i = 1;i <= num;i++) {
			factorial = factorial * i;
		}
			
			System.out.println("The factorial of "+ num + " is "+ factorial);		
			
			scanner.close();
	}

}
