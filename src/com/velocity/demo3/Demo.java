package com.velocity.demo3;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public void m1() {
		Test test = () -> System.out.println("This is from lambda");
		test.show();
	}

	public static void main(String[] args) {

		Eagle eagle = new Eagle();
		eagle.canFly("eagle");

		Bird bird = new Eagle();
		bird.canFly("Egale");

	}

}
