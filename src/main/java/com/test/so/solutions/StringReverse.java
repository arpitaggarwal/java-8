package com.test.so.solutions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringReverse {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a sentence:");
		String sentence = s.nextLine();
		StringBuilder sb = new StringBuilder();
		Arrays.stream(sentence.replaceAll("\\“|”", "").split(" "))
				.collect(Collectors.toCollection(ArrayDeque::new))
				.descendingIterator()
				.forEachRemaining(e -> sb.append(e).append(" "));
		System.out.println(sentence.charAt(0)
				+ sb.toString().replaceAll(" $", "")
				+ sentence.charAt(sentence.length() - 1));
		s.close();
	}
}
