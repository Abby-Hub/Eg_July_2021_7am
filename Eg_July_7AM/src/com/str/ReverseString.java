package com.str;

public class ReverseString {

	
	
	public static void main(String[] args) {
		String s = "Hello";
		
		for(int i = s.length()-1; i>=0; i--)
		System.out.print(s.charAt(i));
		
		//String s = "pqr.mno"     //.
		
		// mno.pqr
	}

}
