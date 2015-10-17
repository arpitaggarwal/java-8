package com.test.factory;

public class Main {

	public static void main(String[] args) {
		String operation = "add";
		String nextOperation = "subtract";
		Operation add = OperationFactory.getOperation(operation);
		System.out.println(add.execute(20, 10));
		Operation subtract = OperationFactory.getOperation(nextOperation);
		System.out.println(subtract.execute(20, 10));
	}

}
