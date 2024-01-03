package qa.assignments9;

import java.util.Scanner;

public class Question8 {
	
//Write a java program to calculate the sum of number if user input the negative number, it should not include in the result.  (Use continue)
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int n = scanner.nextInt();
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("Enter a number : ");
			int num = scanner.nextInt();
			if(num < 0) {
				continue;
			}
			sum = sum + num;
		}
		
	}

}
