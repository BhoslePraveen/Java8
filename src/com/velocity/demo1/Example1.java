package com.velocity.demo1;

public class Example1 implements Test {

	@Override
	public void display() {
		System.out.println("This is abstract method from Exmaple-1");
	}

	// Default-Method
	// Interface.super.methodName();
	public void m1() {
		Test.super.show();
	}

	@Override
	public void show() {
		System.out.println("This is the default method from Exmaple-1");
	}

	// Static method
	// Interface.MethodName()
	// This is redefining the method , Overriding is not possible for static methods
	static void add() {
		System.out.println("This is static method from Example-1");
	}

	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.m1();
		example1.show();

		// Direct Access Through the Interface Name
		Test.add();
	}

}
