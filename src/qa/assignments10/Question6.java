package qa.assignments10;

public class Question6 {
	
	//Write a Java program that checks the letters of the second string are present in the first string return true otherwise false
	
	public static void main(String[] args) {
		
		String firstString = "Sabrina";
		String secondString = "Sultana";
		
		boolean result = secondString.contains(firstString);
		
		System.out.println("Return : "+result);
	}

}
