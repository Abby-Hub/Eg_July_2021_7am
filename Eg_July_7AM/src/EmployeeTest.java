import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee [] emp = new Employee[3];
		for(int i=0; i<emp.length; i++) {
		emp[i] = new Employee();
		emp[i].getData();
		
		}
		
		System.out.println("Enter an EmpId to Search : ");
	    int id = new Scanner(System.in).nextInt();
	    boolean flag = false;
		// id verification
	    for(int i=0; i<emp.length; i++) {
	    	if(emp[i].empId == id) {
	    		flag = true;
	    		emp[i].putData();
	    		break;
	    	}
	    	
	    }
	    
	    if(!flag)
	    	System.out.println("Emp Id Not Found");
	    
		
	}

}
