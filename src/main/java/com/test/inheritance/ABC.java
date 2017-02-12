package com.test.inheritance;

import java.util.ArrayList;
import java.util.List;

public interface ABC<T, D, K, V> {

	default List<String> getSrc(DEF def, XYZ xyz) {
		final List<String> defaultList = new ArrayList<>();
		defaultList.add("default");
		defaultList.add("another-default");
		return defaultList;
	}
}
