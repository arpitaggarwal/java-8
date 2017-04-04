package com.test.design.proxy;

public class Main {

	public static void main(String[] args) {
		ProxyInterfaceForAccountData proxy = new AccountData();
		System.out.println(proxy.getAccountBalanceForUser());
	}
}
