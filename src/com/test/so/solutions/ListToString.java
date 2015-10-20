package com.test.so.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListToString {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");

		System.out.println(String.join(",", list));
		System.out.println(list.stream().collect(Collectors.joining(",")));
		System.out.println(getStringPriorJava8(list));
	}

	public static String getStringPriorJava8(List<String> list) {
		StringBuilder listString = new StringBuilder();
		for (String id : list) {
			listString.append(id).append(",");
		}
		return listString.toString().replaceAll(",$", "");
	}
}
