package com.test.so.solutions;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MyObjClassTest {

	private MyObjClass myObjClass = new MyObjClass();

	@Test
	public void getMyObjList() {
		assertThat(myObjClass.getMyObjList()).isNotEmpty().extracting("myMap")
				.isNotEmpty().contains(geMap());
	}

	private Map<String, Integer> geMap() {
		final Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		return map;
	}
}
