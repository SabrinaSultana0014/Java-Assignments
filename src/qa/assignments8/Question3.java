package qa.assignments8;

public class Question3 {
	
//Write a Java program to print even numbers from 1000 to 1099 using while loop, do-while loop. 
	
	public static void showEvenNumbers(int num) {
		System.out.println("Number : "+num);
	}
	
	public static void main(String[] args) {
		
		int i = 1000;
		
		//While loop
		while(i <= 1099) {
			
			showEvenNumbers(i);
			
			i=i+2;
			
		//DoWhile loop
			
			do {
				
				showEvenNumbers(i);
				i=i+2;
				
				
			}while(i <= 1099);
		}
	}

}
