package com.arpit.java8.supplier;

import java.util.function.Supplier;

/**
 * <code>java.util.function.Supplier</code> does the opposite of the consumer,
 * so it takes no arguments but it returns some value by calling its get()
 * method.
 * 
 * @author ArpitAggarwal
 *
 */
public class SupplierExample {

	public static void main(String[] args) {
		System.out.println(returnHello());
		System.out.println("Java 8 Supplier");
		System.out.println(returnHello.get());
	}

	/**
	 * Return <code>String</code>
	 * 
	 * @return {@link String}
	 */
	private static String returnHello() {
		return "Hello";
	}

	/**
	 * Return <code>String</code> using Java 8
	 * <code>java.util.function.Supplier</code>
	 * 
	 * @return {@link String}
	 */
	private static Supplier<String> returnHello = () -> {
		return "Hello";
	};
}
