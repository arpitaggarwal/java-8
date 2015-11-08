package com.test.so.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SelectOne {

	public static void main(String[] args) {

		List<String[]> list = new ArrayList<>();
		list.add(new String[] { "Type-A", "Date", "Expert" });
		list.add(new String[] { "Type-A", "Date", "07 Expert" });
		list.add(new String[] { "Type-A", "Date", "10 Expert" });
		list.add(new String[] { "Type-B", "Date", "Expert" });
		list.add(new String[] { "Type-B", "Date", "10 Expert" });
		list.add(new String[] { "Type-C", "Date", "07 Expert" });
		list.add(new String[] { "Type-C", "Date", "10 Expert" });

		List<String[]> modified = list.stream()
				.sorted((s1, s2) -> s2[2].compareTo(s1[2]))
				.filter(isMaxExpert()).collect(Collectors.toList());

		for (String[] strArray : modified) {
			System.out.println(" " + strArray[0] + " " + strArray[1] + " "
					+ strArray[2]);
		}
	}

	private static Predicate<String[]> isMaxExpert() {
		final Map<String, String[]> map = new HashMap<>();
		return p -> {
			if (map.get(p[0]) != null) {
				return false;
			} else {
				map.put(p[0], p);
				return true;
			}
		};
	};
}
