package com.test.factory;

public class Subtract implements Operation {

	@Override
	public int execute(final int x, final int y) {
		return x - y;
	}

}
