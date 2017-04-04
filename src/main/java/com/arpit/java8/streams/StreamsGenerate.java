package com.arpit.java8.streams;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsGenerate {
	public static void main(String[] args) {
		// Supplier<String> supplier = String::new;
		Supplier<String> helloSupplier = () -> new String("hello");
		List<String> list = Stream.generate(helloSupplier).limit(10)
				.collect(Collectors.toList());
		for (String element : list) {
			System.out.println(element);
		}
	}
}
