package com.test.so.solutions;

import java.util.HashMap;
import java.util.Map;

public class FlatMap {

	public static void main(String[] args) {

		Map<String, String> innerMap = new HashMap<>();
		innerMap.put("ONE", "ABC");
		innerMap.put("TWO", "DEF");
		innerMap.put("THREE", "GHI");

		Map<String, Map<String, String>> outerMap = new HashMap<>();
		outerMap.put("OUTER", innerMap);

		outerMap.entrySet().stream()
				.filter(outer -> outer.getKey().equals("OUTER"))
				.flatMap(outer -> outer.getValue().entrySet().stream())
				.forEach(inner -> System.out.println(inner.getValue()));
	}

}
