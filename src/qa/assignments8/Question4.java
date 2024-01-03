package qa.assignments8;

import java.util.Scanner;

public class Question4 {

//Write a Java program to read integers from the user and display multiplication tables using while loop, do-while loop.
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an interger number: ");
		int num = scanner.nextInt();
		
		int i = 1;
		
		//While loop
		while(i <= 10) {
			
			System.out.println(num + " * "+ i + " = "+ num*i);
			
			i++;
			
		//DoWhile loop
			
			do {
				
				System.out.println(num + " * "+ i + " = "+ num*i);
				i++;
				
				
			}while(i <= 10);
		}
	}
}
