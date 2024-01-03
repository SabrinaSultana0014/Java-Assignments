package qa.assignments8;

public class Question5 {
	
//Write a java program to find the sum of all natural numbers from 200 to 300 using a while, do-while loop.
	
	public static void main(String[] args) {
	
	int sum = 0;
	int i = 200;
	
	//While loop
	while(i <= 300) {
		
		sum = sum + i;
		i++;
	}
	
		System.out.println("The sum of all natural numbers: "+sum);
		
	//DoWhile loop
		
		do {
			
			sum = sum + i;
			i++;
			
			
		}while(i <= 300);
		System.out.println("The sum of all natural numbers: "+sum);
		
	}

}