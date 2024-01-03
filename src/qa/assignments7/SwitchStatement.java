package qa.assignments7;

public class SwitchStatement {
	
//Write a Java program and print the day of week name using switch statement.	
	
	public static void main(String[] args) {
		
		int weekdays = 5;
		
		String day;
		
		switch(weekdays) {
		
		case 1:
			day = "Sunday";
			break;
			
		case 2:
			day = "Monday";
			break;
			
		case 3:
			day = "Tuesday";
			break;
		
		case 4:
			day = "Wednesday";
			break;
			
		case 5:
			day = "Thursday";
			break;
			
		case 6:
			day = "Friday";
			break;
			
		case 7:
			day = "Saturday";
			break;
			
		default:
			day = "Invalid day number";
		
		}
		
		System.out.println("The day of the week is: "+ day);
	
		}

}
