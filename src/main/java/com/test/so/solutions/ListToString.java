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
		
		
		List<Product> cartList = new ArrayList<>();
		cartList.add(new Product(1, "A"));
		cartList.add(new Product(2, "B"));
		String commaSeperable = cartList.stream().map(e -> e.toString())
				.collect(Collectors.joining(","));
		
		System.out.println(commaSeperable);
	}

	public static String getStringPriorJava8(List<String> list) {
		StringBuilder listString = new StringBuilder();
		for (String id : list) {
			listString.append(id).append(",");
		}
		return listString.toString().replaceAll(",$", "");
	}

}

final class Product {
	private final int id;
	private final String name;

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
}