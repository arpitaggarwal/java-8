package com.test.design.strategy;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		int sum = context.executeStrategy(2, 2);
		System.out.println(sum);
	}

}
