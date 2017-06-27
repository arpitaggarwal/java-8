package com.arpit.java8.function;

import java.util.function.Function;

public class FunctionComposition {

	private Function<Integer, Integer> times2 = e -> e * 2;

	private Function<Integer, Integer> squared = e -> e * e;

	/**
	 * Reference :
	 * http://www.deadcoderising.com/2015-09-07-java-8-functional-composition-
	 * using-compose-and-andthen/
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FunctionComposition obj = new FunctionComposition();
		obj.run();

	}

	/**
	 * While the compose function executes the caller last and the parameter
	 * first, the andThen executes the caller first and the parameter last.
	 */
	private void run() {
		int result = times2.compose(squared).apply(4); // Returns 32
		System.out.println(result);
		int result1 = times2.andThen(squared).apply(4); // Returns 64
		System.out.println(result1);
	}

}
