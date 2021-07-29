
public class Int extends Object{
	int x;
	
	// a,b,c
	// a=10, b=20;
	// c = a+b;
	
	
	/*
	 * @Override public String toString() { // TODO Auto-generated method stub
	 * return String.valueOf(x); }
	 */
	
	
	public static void main(String[] args) {
		Int i1 = new Int();
		i1.x = 10;
		String s = String.valueOf(i1.x);
		System.out.println(s);
		
		Int i2 = new Int();
		i2.x = 20;
		s = String.valueOf(i2.x);
		System.out.println(s);
		
		
		Int i3 = new Int();
		i3.x= i1.x+i2.x;
		s = String.valueOf(i3.x);
		System.out.println(s);
		
	
		char [] ch =s.toCharArray();
		System.out.println(ch[1]);
		
	}

}
