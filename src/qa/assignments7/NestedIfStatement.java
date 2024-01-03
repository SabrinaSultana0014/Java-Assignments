package qa.assignments7;

import java.util.Scanner;

public class NestedIfStatement {

//Take the length and breadth of the rectangle from the user and check if it's square or not. 	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the lenght of the rectangle: ");
		int length = scanner.nextInt();
		
		System.out.print("Enter the breadth of the rectangle: ");
		int breadth = scanner.nextInt();
		
		if (length > 0 && breadth > 0) {
			if(length == breadth) {
				System.out.println("The rectangle is a square.");
			}else {
				System.out.println("The rectangle is not a square.");
			}
		}else {
			System.out.println("Please enter a valid number.");
		}
		
		scanner.close();
		
	}

}
