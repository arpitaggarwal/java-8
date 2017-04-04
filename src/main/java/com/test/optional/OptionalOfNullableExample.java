package com.test.optional;

import java.util.Optional;

public class OptionalOfNullableExample {

	public static void main(String[] args) {

		A objA = new A(1, "Arpit");
		Optional<A> optional = Optional.ofNullable(objA);
		System.out.println(optional.map(e -> new B(e.getId(), e.getName())).get());

		Optional<A> optionalOfNull = Optional.ofNullable(null);

		System.out.println(optionalOfNull.map(e -> new B(e.getId(), e.getName())));
	}
}

class A {
	private int id;
	private String name;

	public A(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + "]";
	}
}

class B {
	private int id;
	private String name;

	public B(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "B [id=" + id + ", name=" + name + "]";
	}

}