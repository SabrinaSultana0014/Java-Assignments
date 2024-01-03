package qa.assignments6;

public class LogicalOperates {
	
	public static void main(String[] args) {
		
		int num1 = 40;
		int num2 = 80;
		
		boolean resultAnd = (num1 < num2) && (num1 < 41);
		System.out.println("("+num1 + " < "+num2 + ") && (" +num1 +" < 21 ) = " +resultAnd);
		
		boolean resultOr = (num1 < num2) || (num1 < 41);
		System.out.println("("+num1 + " < "+num2 + ") || (" +num1 +" < 21 ) = " +resultOr);
		
		boolean resultNot = ! (num1 == num2);
		System.out.println("!("+num1 + " == "+num2 + ") = " +resultNot);
		
	}

}
