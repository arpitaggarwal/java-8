package com.test.so.solutions;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RandomNumbers {
	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);
		int minimum = getInput.nextInt();
		int maximum = getInput.nextInt();

		Random t = new Random();
		IntStream.rangeClosed(minimum, maximum).map(i -> t.nextInt(i))
				.forEach(System.out::println);
		
		getInput.close();
	}
}
