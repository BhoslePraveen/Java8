package com.velocity.demo2;

public interface Sample {

	public default void m1() {
		System.out.println("This is M1 from Interface");
	}

	public default void m2() {
		System.out.println("This is M2 from Interface");
	}

}
