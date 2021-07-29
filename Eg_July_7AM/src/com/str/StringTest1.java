package com.str;

public class StringTest1 {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "JAVA";
		
		boolean flag =  s1.equals(s2);
		System.out.println(flag);
		
		flag = s1.equalsIgnoreCase(s2);
		System.out.println(flag);
		
		int i = s2.compareTo(s1);
		System.out.println(i);
		
		 i = s1.compareToIgnoreCase(s2);
		System.out.println(i);
		
		
		//A- 65
		//a- 97
	}

}
