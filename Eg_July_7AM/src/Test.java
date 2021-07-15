import com.oops.Bank;

public class Test {

	public static void main(String[] args) {
		 
		System.out.println("Main starts...");
		
		Bank cust1 = new Bank(1234, "Scott", 3000);
		
		System.out.println(cust1.accNo);
		System.out.println(cust1.accName);
		System.out.println(cust1.getBalance());
        
    
		    cust1.setBalance(500);
		    
		    System.out.println(cust1.getBalance());
		    
		cust1.withdraw(2000);
		
		System.out.println(cust1.getBalance());
		   
		/*
		 * Student st = new Student(); System.out.println(st.id);
		 * System.out.println(st.name); System.out.println(st.marks);
		 * 
		 * st.id = 101; st.name = "Scott"; st.marks = 85;
		 * System.out.println("*********************"); System.out.println(st.id);
		 * System.out.println(st.name); System.out.println(st.marks);
		 * 
		 * System.out.println("******************");
		 * 
		 * Student st2 = new Student(102, "Tiger", 95); System.out.println(st2.id);
		 * System.out.println(st2.name); System.out.println(st2.marks);
		 */		
		System.out.println("Main ends...");

	}

}




