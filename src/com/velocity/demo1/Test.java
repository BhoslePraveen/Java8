package com.velocity.demo1;

public interface Test {
	public void display();// Abstract Method : public abstract

	// Default : Not to break the Implementation classes
	default void show() {
		System.out.println("This a default method from Interface");
	}

	// Static method : To Provide Utility Methods support.
	static void add() {
		System.out.println("This is a  static add method from Interface ");
	}
}
