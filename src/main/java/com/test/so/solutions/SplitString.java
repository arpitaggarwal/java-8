package com.test.so.solutions;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SplitString {

	public static void main(String[] args) {
		String str = "2014@2@200@0#2014@2@200@0#2012@2@200@0#2012@2@200@0#2011@2@200@0";
		Map<String, TestClass> map = Stream.of(str.split("#")).map(e -> e.split("@")).map(x -> new TestClass(x[1], x[2], x[3], x[0])).collect(Collectors.toMap(TestClass::getA4, z -> z,(p1, p2) -> p1));
		System.out.println(map);
	}
}

class TestClass {

	private final String a1;
	private final String a2;
	private final String a3;
	private final String a4;

	public TestClass(String a1, String a2, String a3, String a4) {
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
	}

	public String getA1() {
		return a1;
	}

	public String getA2() {
		return a2;
	}

	public String getA3() {
		return a3;
	}

	public String getA4() {
		return a4;
	}

	@Override
	public String toString() {
		return "TestClass [a4=" + a4 + ", a1=" + a1 + ", a2=" + a2 + ", a3="
				+ a3 + "]";
	}

}