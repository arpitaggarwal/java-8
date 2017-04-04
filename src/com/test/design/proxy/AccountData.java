package com.test.design.proxy;

public class AccountData implements ProxyInterfaceForAccountData {

	private String accountNumber = "XXXX";
	private int accountBalance = 2000;
	private String username = "user";
	private String password = "secret";

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int getAccountBalanceForUser() {
		return accountBalance;
	}

}
