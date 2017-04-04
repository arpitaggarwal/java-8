package com.arpit.java8.streams;

import java.util.stream.Stream;

class Employee {
	private final int age;

	public Employee(final int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

public class Reduce {

	public static void main(String[] args) {
		Employee employee = new Employee(10);
		Employee employee1 = new Employee(15);
		Employee employee2 = new Employee(20);
		int sum = Stream.of(employee, employee1, employee2)
				.map(Employee::getAge).
				reduce(0, (a, b) -> -a + b);
		System.out.println(sum);

	}

}
