package com.test.so.solutions;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class PassFunctionAsAFunction {

	public void pass() {
		run(() -> System.out.println("Hello world"));
	}

	public void run(Runnable function) {
		function.run();
	}

	/**
 * 
 */
	// Here I want to store the method references
	List<Function> listOfMethodsToExecute = new LinkedList<>();

	// Add a new function to the list
	public void addFunction(Function f) {
		if (f != null) {
			listOfMethodsToExecute.add(f);
		}
	}

	// Executes all the methods previously stored on the list
	public void executeAll() {
		listOfMethodsToExecute.stream().forEach((Function function) -> {
			function.apply(null);
		});
	}
}
