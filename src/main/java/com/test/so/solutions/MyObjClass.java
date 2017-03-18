package com.test.so.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyObjClass {

	public List<MyObj> getMyObjList() {
		List<MyObj> list = new ArrayList<>();

		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("A", 1);
		myMap.put("B", 2);

		MyObj myObj = new MyObj();
		myObj.setMyMap(myMap);
		list.add(myObj);
		return list;
	}
}
