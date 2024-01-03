package qa.assignments1;

public class Department {
	
	//Instance variables
	public String name;
	private int id;
	protected String location;
	
	
	public void displayDefaultValue() {
		System.out.println("Default Department Name: " + name);
		System.out.println("Default Department ID: " + id);
		System.out.println("Default Department Location: " + location);
		
	}
	
	public void showDepartmentDetails() {
		name = "CS";
		id = 123;
		location = "Flushing";
		
	}
	
	public static void main(String[] args) {
		//instance or object
		Department department = new Department();
		
		department.displayDefaultValue();
		department.showDepartmentDetails();
		department.displayDefaultValue();
	}
}
