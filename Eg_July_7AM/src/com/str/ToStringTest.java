package com.str;

class Student extends Object{
	int id;
	String sname;
	String address;

	
	
	public Student(int id, String sname, String address) {
		this.id = id;
		this.sname = sname;
		this.address = address;
	}

	
	  @Override public String toString() { return
	  "id :"+id+" name : "+sname+" address: "+address; }
	 
	
}


public class ToStringTest {

	public static void main(String[] args) {
		String name = new String("Fana");
		System.out.println(name.toString()); // Fana
		Student st = new Student(101, "Scott", "Pune");
		System.out.println(st); // 101
	}

}
