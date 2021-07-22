package com.toy;

public class ToyDriver {

	public static void main(String[] args) {
		
	//server        // clientside
		Toy t = new Ball();  // Up Casting
		t.move();
		t.makeSound();
	}

}
