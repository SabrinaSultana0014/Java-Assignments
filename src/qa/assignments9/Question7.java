package qa.assignments9;

import java.util.Scanner;

public class Question7 {
	
	//Write a Java program calculate the sum of numbers if user input the negative numbers, then terminate the loop. (Use break)

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int n = scanner.nextInt();
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("Enter a number : ");
			int num = scanner.nextInt();
			if(num < 0) {
				break;
			}
			sum = sum + num;
		}
		
		System.out.println("Sum is : "+sum);
	}
}
