package com.arpit.java8.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * <code>java.util.function.Function</code> is a functional interface. It
 * accepts an input and produces a result.
 * 
 * @author ArpitAggarwal
 *
 */
public class FunctionExample {

	public static void main(String[] args) {
		final String string = "Hello World";
		final List<String> list = getList(string);
		System.out.println(list);
		System.out.println("Java 8 Function");
		System.out.println(getList.apply(string));
	}

	/**
	 * Convert <code>String</code> to <code>List<String></code>
	 * 
	 * @param string
	 * @return {@link List<String>}
	 */
	private static List<String> getList(final String string) {
		return Arrays.asList(string.split(" "));
	}

	/**
	 * Convert <code>String</code> to <code>List<String></code> using Java 8
	 * <code>java.util.function.Function</code>
	 * 
	 * @param string
	 * @return {@link List<String>}
	 */
	private static Function<String, List<String>> getList = (string) -> {
		return Arrays.asList(string.split(" "));
	};

}
