package com.test.so.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ListCompare {
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");

		List<String> list2 = new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("D");

		IntStream.range(0, list1.size()).forEach(i -> {
			if (list1.get(i).equals(list2.get(i)))
				System.out.println(i);
		});

		int nMatches = IntStream.range(0, list1.size())
				.filter(idx -> !list1.get(idx).equals(list2.get(idx)))
				.findFirst().orElse(list1.size());
		System.out.println(nMatches);

	}
}
