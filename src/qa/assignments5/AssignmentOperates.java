package qa.assignments5;

public class AssignmentOperates {
	
public static void main(String[] args) {
		
		//simple assignment operator =
		
		int num1 = 12;
		int num2 = 5;
		
		System.out.println("Simple Assignment Operator (=)");
		System.out.println("Num1 : "+num1);
		System.out.println("Num2 : "+num2);
		
		//+= (add and assignment operator)
		
		num1 += num2;
		System.out.println("Num1 ( += ) : "+num1);
		
		//-= (subtract and assignment operator)
		num2 -= num1;
		System.out.println("Num2 ( -= ) : "+ num2);
		
		// *=
		
		num2 *= num2;
		System.out.println("Num2 ( *= ) : "+num2);
		
		// /=
		
		num1 /= num2;
		System.out.println("Num1 ( /= ) : "+num1);
		
		// %=
		
		num2 %= num2;
		System.out.println("Num1 ( %= ) : "+num2);
	}

}
