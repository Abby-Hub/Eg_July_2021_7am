package com.str;

public class SplitTest {

	public static void main(String[] args) {
		/*
		 * // 0 1 2 3 4 5 String s1 = "Java is very cool prog lang"; String [] tokens =
		 * s1.split(" "); int size = tokens.length; System.out.println(size); for(int
		 * i=0; i<size; i++) { System.out.println(tokens[i]); }
		 */
		
		String s1 = "28/07/2021";
		String [] tokens = s1.split("/");
		int size = tokens.length;
		System.out.println(size);
		for(int i=0; i<size; i++) {
		System.out.println(tokens[i]);
		}
	}

}
