package com.test.so.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CountInt {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c", "d");
		int count = (int) IntStream.range(0, list.size()).count();
		System.out.println(count);
	}
}
