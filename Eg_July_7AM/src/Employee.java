import java.util.Scanner;

public class Employee {
	
	int empId;
	String empName;
	
	public void getData() {
		// getting logic
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EMP Id : ");
		empId = sc.nextInt();
		System.out.println("Enter EMP Name :");
		empName = sc.next();

	}
	
	public void putData() {
		// Display Logic
		System.out.println("Id : "+ empId);
		System.out.println("Name : " +empName);
	}

	
	
}
