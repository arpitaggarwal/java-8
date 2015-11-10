package com.test.so.solutions;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FindAverage {
	public static void main(String[] args) throws IOException,
			URISyntaxException {

		Double average = Arrays
				.stream(Files
						.lines(Paths.get(ClassLoader.getSystemResource(
								"input1.txt").toURI()))
						.reduce((a, b) -> a + " " + b).map(e -> e.split(" "))
						.get()).filter(e -> e.matches("\\d+"))
				.map(Integer::new)
				.collect(Collectors.averagingInt(Integer::intValue));

		System.out.println("Average = " + average);
	}
}
