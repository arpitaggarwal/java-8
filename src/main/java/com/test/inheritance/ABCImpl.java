package com.test.inheritance;

import java.util.List;

public class ABCImpl implements ABC<String, Integer, String, Integer> {

	public List<String> getSrcImpl(DEF def, XYZ xyz) {
		final List<String> list = getSrc(def, xyz);
		list.add("implementation");
		return list;
	}
}
