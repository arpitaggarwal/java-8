package com.test.optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

		Optional<String> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);

		String val = emptyOptional.orElse("default-value");
		System.out.println(val);

		Optional<String> optional = Optional.of("hello");
		System.out.println(optional.get() + " Or Else :: "
				+ optional.orElse("hello-world"));

		optional.ifPresent( System.out::println );

		
		Optional<String> optionalOfNullable = Optional.ofNullable(null);
		System.out.println(optionalOfNullable.isPresent());

	}
}
