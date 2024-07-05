package com.velocity.demo4;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

	/*
	 * Functional Interface introduced in java 8 1.Predicate Interface 2.Consumer
	 * Interface 3.Function Interface 4.Supplier Interface
	 */
	public static void main(String[] args) {

		// Predicate Interface : ----> Takes Input & Boolean Output
		Predicate<String> check = str -> str.length() > 5;
		boolean output = check.test("abcd");
		System.out.println(output);

		// Consumer Interface : ----> No Output : To modify the data
		Consumer<Student> studentModification = (Student s) -> s.setName("Default");
		Student student = new Student();
		studentModification.accept(student);
		System.out.println(student.getName());

		// Function Interface : It has Both input and Output
		Function<Integer, String> func = (Integer x) -> "This Double value of the given num is ::" + x * x;
		String output2 = func.apply(22);
		System.out.println(output2);

		// Supplier Interface
		Supplier<String> sup = () -> "My Name is praveen";
		String output3 = sup.get();
		System.out.println(output3);
		
		Supplier<Double> getRandomNumber = ()-> Math.random();
		Double output4 = getRandomNumber.get();
		System.out.println(output4);
	}

}
