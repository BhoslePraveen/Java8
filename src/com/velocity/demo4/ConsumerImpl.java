package com.velocity.demo4;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<Student> {

	@Override
	public void accept(Student t) {
		t.setName("Vijay kumar");
	}

	public static void main(String[] args) {
		Consumer<Student> consumer = new ConsumerImpl();
		Student student = new Student();
		consumer.accept(student);
		System.out.println(student.getName());

		Consumer<Student> consumer2 = (Student s) -> s.setName("Praveen Bhosle");
		Student student2 = new Student();
		consumer2.accept(student2);
		System.out.println(student2.getName());
	}

}
