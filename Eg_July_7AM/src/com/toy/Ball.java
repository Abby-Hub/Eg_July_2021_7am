package com.toy;

public class Ball extends Toy {
	@Override
	public void move() {
		System.out.println("Ball bouncing up&down logic goes Here...");
	}
	

	@Override
	public void makeSound() {
		System.out.println("Ball Making Sound Logics Goes Here...");
	}
}
