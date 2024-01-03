package qa.assignments8;

public class Question2 {
	
//Write a Java program to print odd numbers from 1 to 100 using while loop, do-while loop. 
	
	public static void showOddNumbers(int num) {
		System.out.println("Number : "+num);
	}
	
	public static void main(String[] args) {
		
		int i = 1;
		
		//While loop
		while(i <= 100) {
			
			showOddNumbers(i);
			
			i=i+2;
			
		//DoWhile loop
			
			do {
				
				showOddNumbers(i);
				i=i+2;
				
				
			}while(i <= 100);
		}
	}

}
