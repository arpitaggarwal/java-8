package com.arpit.java8.method.reference;

public class Main {

	private static void hello() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// Referring static method
		HelloService helloService = Main::hello;
		// Calling interface method
		helloService.hello();
	}

}
