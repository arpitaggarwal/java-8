package com.test.so.solutions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseArray {
	public static void main(String[] args) {

		double[] array = new double[] { 10.0, 20.0, 2.0, 19.0 };

		Arrays.stream(array).forEach(System.out::println);

		System.out.println("Printing Reverse");

		Arrays.stream(array).boxed()
				.collect(Collectors.toCollection(ArrayDeque::new))
				.descendingIterator().forEachRemaining(System.out::println);
	}
}
