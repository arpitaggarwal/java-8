package com.test.controller;

import java.io.IOException;

import com.arpit.java8.function.CheckedFunction;
import com.test.service.TestService;

public class TestController {

	private TestService testService = new TestService();

	/**
	 * http://stackoverflow.com/questions/18198176/java-8-lambda-function-that-
	 * throws-exception
	 * 
	 * @return
	 * @throws IOException
	 */
	public String get() throws IOException {
		final CheckedFunction<String, String> get = testService::get;
		return get.apply("world");
	}

	public static void main(String[] args) throws IOException {
		TestController controller = new TestController();
		System.out.println(controller.get());
	}
}
