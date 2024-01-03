package qa.assignments9;

public class Question2 {
	
//Write a Java program to print odd numbers from 1 to 100 using a for loop.
	
	public static void showOddNumbers(int num) {
		System.out.println("Number : "+num);
	}
	
	public static void main(String[] args) {
		
		//For loop
		for(int i = 1;i <= 100;i=i+2) {
			
			showOddNumbers(i);
			
		}
	}

}
