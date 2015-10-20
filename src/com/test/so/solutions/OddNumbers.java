package com.test.so.solutions;

import java.util.stream.IntStream;

public class OddNumbers {

	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		int n = scanner.nextInt();
		IntStream.range(0, n).filter(element -> element % 2 != 0)
				.forEach(System.out::println);
	}
}
