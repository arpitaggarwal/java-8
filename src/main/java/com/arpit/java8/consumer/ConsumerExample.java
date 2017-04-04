package com.arpit.java8.consumer;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * <code>java.util.function.Consumer</code> is a functional interface. It
 * accepts an input and returns no result.
 * 
 * @author ArpitAggarwal
 *
 */
public class ConsumerExample {

	public static void main(String[] args) {

		final String string = "Hello World";
		createList(string);
		System.out.println("Java 8 Consumer");
		createList.accept(string);
	}

	/**
	 * Convert <code>String</code> to <code>List</code>.
	 * 
	 * @param string
	 */
	private static void createList(final String string) {
		System.out.println(Arrays.asList(string.split(" ")));
	}

	/**
	 * Convert <code>String</code> to <code>List</code> using Java 8
	 * <code>java.util.function.Consumer</code>
	 * 
	 * @param string
	 */
	private static Consumer<String> createList = (string) -> {
		System.out.println(Arrays.asList(string.split(" ")));
	};

}
