package com.test.so.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceList {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10, 15, 16);
		List<Integer> list2 = Arrays.asList(1, 2, 12, 10, 11, 14, 16);
		List<Integer> list = new ArrayList<Integer>(list2);
		
		list.retainAll(list1);
		
		System.out.println(list);
	}
}
