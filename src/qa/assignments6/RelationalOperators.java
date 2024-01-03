package qa.assignments6;

public class RelationalOperators {
	
	public static void main(String[]args) {
		
		//Equal operator
		
		int num1 = 10;
		int num2 = 10;
		
		boolean resultEql = ( num1 == num2);
		System.out.println(num1 + " == " + num2 + " = "+resultEql);
		
		//Not Equal operator
		
		int num3 = 40;
		int num4 = 40;
		
		boolean notEqual = num3 != num4;
		System.out.println(num3 + " != "+num4 + " = "+notEqual);
		
		
		//GreatherThan operator
		
		int num5 = 31;
		int num6 = 40;
		
		boolean resultGreath = num5 > num6;
		System.out.println(num5 + " > " + num6 + " = "+resultGreath);
		
		//Lessthan operator
		
		int num7 = 60;
		int num8 = 40;
		
		boolean resultLessth = num7 < num8;
		System.out.println(num7 + " < " + num8 + " = "+resultLessth);
		
		//GreathEqual operator
		
		int num9 = 47;
		int num10 = 68;
		boolean resultGrethEql = num9 >= num10;
		System.out.println(num9 + " >= " + num10 + " = "+resultGrethEql);
		
		//LessthEqual operator
		
		int num11 = 100;
		int num12 = 120;
		
		boolean resultLessthEql = num11 <= num12;
		System.out.println(num11 + " <= " + num12 + " = "+resultLessthEql);
		
	}
	
}
