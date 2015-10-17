package com.test.factory;

public class OperationFactory {

	public static Operation getOperation(String operation) {
		switch (operation) {
		case "add":
			return new Add()::execute;
		case "subtract":
			return new Subtract()::execute;
		case "multiply":
			return new Multiply()::execute;
		case "divide":
			return new Divide()::execute;
		default:
			return null;
		}
	}
}
