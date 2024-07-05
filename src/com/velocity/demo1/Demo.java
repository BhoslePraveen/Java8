package com.velocity.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// Collection ---> Interface
		// Collections ---> Utility Class

		List<Integer> numbers = new ArrayList<>();
		numbers.add(12);
		numbers.add(23);
		numbers.add(88);
		
		List<Integer> synchronizedList = Collections.synchronizedList(numbers);

	}

}
