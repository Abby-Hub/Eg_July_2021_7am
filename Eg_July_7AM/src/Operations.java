public class Operations {
	 static int a =10;   // Non Static / Instance var
	static int b =20;
	static int c ;
	
	public void add() { // non static
		 c = a + b;
		System.out.println("sum = "+c); // sum = 30
	}
	
	public static void mul() { // non static
		 c = a * b;
		System.out.println("Mul = "+c); 
	}
	
	public int m1() {
		// logic
		return 0;
	}
}


