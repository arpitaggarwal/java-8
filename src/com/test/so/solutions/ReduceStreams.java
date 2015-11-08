package com.test.so.solutions;

public class ReduceStreams {

	public static void main(String[] args) {
		String str = "123456789";
		int i = 0;
		for (char c : str.toCharArray()) {
			if (c >= 48 && c <= 57) {
				i = i * 10 + (c - 48);
			}
		}

		System.out.println(i);

		int reduced = str.chars()
				.filter(element -> element >= 48 && element <= 57)
				.reduce(0, (a, b) -> a * 10 + (b - 48));
		System.out.println(reduced);
	}
}
