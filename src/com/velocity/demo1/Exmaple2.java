package com.velocity.demo1;

public class Exmaple2 implements Test {

	@Override
	public void display() {
		System.out.println("This is abstract method from Exmaple-2");
	}

	@Override
	public void show() {
		System.out.println("This is the default method from Exmaple-2");
	}

	public static void main(String[] args) {
		Exmaple2 exmaple2 = new Exmaple2();
		exmaple2.show();
	}

}
