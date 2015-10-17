package com.test.so.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListToMap {

	public static void main(String[] args) {
		System.out.println(listToMap(Arrays.asList('A', 'B', 'C', 'D')));
	}

	private static Map<Character, Integer> listToMap(List<Character> alphabet) {
		Map<Character, Integer> map = alphabet.stream().collect(
				Collectors.toMap(element -> element,
						element -> alphabet.indexOf(element)));

		/** Another way of doing the same.. **/

		IntStream.range(0, alphabet.size()).boxed()
				.collect(Collectors.toMap(alphabet::get, i -> i));

		return map;
	}

}
