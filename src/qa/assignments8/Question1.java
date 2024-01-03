package qa.assignments8;

public class Question1 {
	
	//Write a Java program to display your name and country 10 times using a while, do-while loop.
	
	public static void showNameAndCountry(String name, String country) {
		System.out.println("Name : "+name + " Country : "+country);
	}
	
	public static void main(String[] args) {
		
		int i = 0;
		
		//While loop
		while(i < 10) {
			
			showNameAndCountry("Sabrina Sultana", "USA");
			
			i++;
			
		//DoWhile loop
			
			do {
				
				showNameAndCountry("Sabrina Sultana", "USA");
				i++;
				
				
			}while(i < 10);
		}
	}

}
