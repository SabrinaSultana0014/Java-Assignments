package qa.assignments9;

public class Question1 {
	
//Write a Java program to display your name and country 10 times using a for loop.
	
	public static void showNameAndCountry(String name, String country) {
		System.out.println("Name : "+name + " Country : "+country);
	}
	
	public static void main(String[] args) {
		
		//For loop
		for(int i = 0;i < 10;i++) {
		
			showNameAndCountry("Sabrina Sultana", "USA");
			
			
		}
	}
}
