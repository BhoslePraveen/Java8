package com.velocity.demo2;

public class C implements A, B {

	public static void main(String[] args) {
		C c = new C();
		c.m1();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		A.super.m1();
		B.super.m1();
	}

}
