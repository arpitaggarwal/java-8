package com.test.factory;

public class Divide implements Operation {

	@Override
	public int execute(final int x, final int y) {
		return x / y;
	}

}