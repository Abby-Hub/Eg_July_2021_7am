import com.oops.A;
import com.oops.B;
import com.oops.Bank;

public class Test {

	public static void main(String[] args) {
		 
		System.out.println("Main starts...");
		
		A a1 = new A();
		System.out.println(a1.x);
		//System.out.println(a1.y);
		a1.m1();
		//a1.m2();
		System.out.println("**************");
		B b1 = new B();
		System.out.println(b1.x);
		System.out.println(b1.y);
		b1.m1();
		b1.m2();
		
		
		/*
		 * Bank cust1 = new Bank(1234, "Scott", 3000);
		 * 
		 * System.out.println(cust1.getAccNo()); System.out.println(cust1.getAccName());
		 * System.out.println(cust1.getBalance());
		 * cust1.setBalance(500);
		 * System.out.println(cust1.getBalance());
		 * 
		 * cust1.withdraw(2000);
		 * 
		 * System.out.println(cust1.getBalance());
		 */   
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




