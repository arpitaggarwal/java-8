package com.test.programs;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FizzBuzz {

	private static final IntPredicate fizz = (x) -> x % 3 == 0;
	private static final IntPredicate buzz = (x) -> x % 5 == 0;

	public static void main(String[] args) {
		IntStream.range(1, 100).boxed().map(element -> {
			if (fizz.and(buzz).test(element)) {
				return "Fizz Buzz";
			} else if (fizz.test(element)) {
				return "Fizz";
			} else if (buzz.test(element)) {
				return "Buzz";
			}
			return element;
		}).forEach(System.out::println);
		
	}
}
