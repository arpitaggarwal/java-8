package com.test.design.singleton;

public class EagerSingleton {

	private static volatile EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {

	}

	public synchronized static EagerSingleton getInstance() {
		return instance;
	}

}
