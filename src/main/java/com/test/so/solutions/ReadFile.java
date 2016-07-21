package com.test.so.solutions;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadFile {
	public static void main(String[] args) throws IOException,
			URISyntaxException {
		int[] ints = Files
				.lines(Paths.get(ClassLoader.getSystemResource("input.txt")
						.toURI())).mapToInt(Integer::parseInt).toArray();
		Arrays.stream(ints).forEach(System.out::println);
	}
}
