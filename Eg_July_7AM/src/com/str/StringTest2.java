package com.str;

public class StringTest2 {

	public static void main(String[] args) {
		          // 01234567890123456
		String s1 = "Java is very cool";
		String s2 = s1.substring(8);
		System.out.println(s2);
		String s3 = s1.substring(8, 12);
		System.out.println(s3); // very
		
		String user = " Scott ";
		System.out.println(user.trim()); //Scott
		System.out.println(user); // Scott 
	}

}
