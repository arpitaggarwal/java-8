package com.test.so.solutions;

import java.util.ArrayList;
import java.util.List;

public class ListSort {

	public int a;
	public String b;

	public ListSort(int a, String b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		List<ListSort> list = new ArrayList<>();
		list.add(new ListSort(5, "abc"));
		list.add(new ListSort(1, "aee"));
		list.add(new ListSort(3, "adf"));
		list.add(new ListSort(6, "aad"));
		list.add(new ListSort(2, "xx"));
		list.sort((s1, s2) -> s1.a - s2.a);

		for (ListSort element : list) {
			System.out.println(element.a + element.b);
		}

	}

}
