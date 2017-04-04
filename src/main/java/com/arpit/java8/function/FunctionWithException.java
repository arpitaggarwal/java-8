package com.arpit.java8.function;

import java.util.function.Function;

@FunctionalInterface
public interface FunctionWithException<T, R, E extends Exception> {

	R apply(T t) throws E;

	static <T> Function<T, T> identity() {
		return t -> t;
	}

}
