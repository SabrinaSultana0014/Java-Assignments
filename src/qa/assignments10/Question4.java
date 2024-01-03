package qa.assignments10;

public class Question4 {
	
	//Write a Java program to compare a given string to the specified character sequence.
	
	public static void main(String[] args) {
		
		String name1 = "Sabrina";
		String name2 = "Sabrina";
		
		int resultCompare = name1.compareTo(name2);
		System.out.println("CompareTo : "+resultCompare);
	}

}
