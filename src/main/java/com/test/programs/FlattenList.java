package com.test.programs;

import static java.util.Arrays.asList;

import java.util.List;

public class FlattenList {

	// input :: [1,[2,3], [4, [5,6]]]
	public static void main(String[] args) {
		List<Object> list = asList(1, asList(2, 3), asList(4, asList(5, 6)));
		System.out.println("Input : "+list);
		flattenList(list);
	}
	
	@SuppressWarnings("unchecked")
	private static void flattenList(List<Object> list) {
		list.stream().forEach(pair -> {
			if (pair instanceof List) {
				((List<Object>) pair).stream().forEach(el -> {
					if (el instanceof List) {
						System.out.print(((List<Object>) el).stream().reduce((a,b) -> a + "," + b).get());
					} else {
						System.out.print(el+",");
					}
				});
			} else {
				System.out.print(pair+",");
			}
		});
	}
}
