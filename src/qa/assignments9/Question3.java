package qa.assignments9;

public class Question3 {
	
//Write a Java program to print even numbers from 1000 to 1099 using for loop.
	
	public static void showEvenNumbers(int num) {
		System.out.println("Number : "+num);
	}
	
	public static void main(String[] args) {
		
		//For loop
		for(int i = 1000;i <= 1099;i=i+2) {
			
			showEvenNumbers(i);
			
		}
	}

}
