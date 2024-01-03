package qa.assignments9;

public class Question5 {
	
//Write a java program to find the sum of all natural numbers from 200 to 300 using for loop.	
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		//For loop
		for(int i = 200;i <= 300;i++) {
			
			sum = sum + i;
			
		}
		
			System.out.println("The sum of all natural numbers: "+sum);
	}

}
