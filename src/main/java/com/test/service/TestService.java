package com.test.service;

import java.io.IOException;

public class TestService {

	public String get(final String param) throws IOException {
		return "hello " + param;
	}
}
