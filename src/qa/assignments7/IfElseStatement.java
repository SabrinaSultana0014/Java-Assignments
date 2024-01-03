package qa.assignments7;

public class IfElseStatement {
	
	//Write a java program to get a number from the user and print whether it is odd or even. 
	
	public static void main(String[] args) {
		
		int num = 9;
		boolean result = (num%2 == 0);
		
		if(result) {
			System.out.println("Input number is even : "+num);
		}else {
			System.out.println("Input number is odd : "+num);
		}
	}

}
