package com.test.so.solutions;

import java.util.stream.IntStream;

public class AlphabetsLooping {
	static final String input = "hello";

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("");
		input.chars().mapToObj(i -> builder.append((char) i))
				.forEach(System.out::println);

		System.out.println("********");

		IntStream.range(0, input.length())
				.mapToObj(index -> input.substring(0, index + 1))
				.forEach(System.out::println);
	}
}
