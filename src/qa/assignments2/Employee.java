package qa.assignments2;

public class Employee {
	
	static int employeeCount;
	static String companyName;
	
	int id;
	String name;
	double salary;
	
	public void printEmployeeDetails() {
		
		String localDepartment = "Computer Science";
		double localTaxRate = 0.9;
		
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: $"+salary);
		
		System.out.println("LocalDepartment: "+localDepartment);
		System.out.println("LocalTaxRate: "+localTaxRate);
	}
	
	public void showEmployeeDetails() {
		
		id = 101;
		name = "Sabrina Sultana";
		salary = 1000000.0;
	}
	
	public static void main(String[] args) {
		
		employeeCount = 1;
		companyName = "Amazon";
		
		Employee employee = new Employee();
		
		employee.showEmployeeDetails();
		employee.printEmployeeDetails();
		employee.showEmployeeDetails();
		
	}

}
