package com.arpit.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamAndParallelStream {

	public static void main(String... args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			list.add(i);
		}
		printUsingStream(list);
		printUsingParallelStream(list);
	}

	private static void printUsingStream(List<Integer> list) {
		list.stream().forEach(System.out::println);
	}

	/**
	 * If we change stream() to parallelStream() this is not the case anymore
	 * all number are written, but in a different order. So, apparently,
	 * parallelStream() indeed uses multiple threads.
	 * 
	 * 
	 * @param list
	 */
	private static void printUsingParallelStream(List<Integer> list) {
		list.parallelStream().forEach(System.out::println);
	}
}
