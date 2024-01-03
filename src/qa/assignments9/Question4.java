package qa.assignments9;

import java.util.Scanner;

public class Question4 {
	
//Write a Java program to read integers from the user and display a multiplication table using for loop.
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an interger number: ");
		int num = scanner.nextInt();
		
		//For loop
		for(int i = 1;i <= 10;i++) {
			
			System.out.println(num + " * "+ i + " = "+ num*i);
			
		}
	}
}
