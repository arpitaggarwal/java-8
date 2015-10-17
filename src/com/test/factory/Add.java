package com.test.factory;

public class Add implements Operation {

	@Override
	public int execute(final int x, final int y) {
		return x + y;
	}

}
