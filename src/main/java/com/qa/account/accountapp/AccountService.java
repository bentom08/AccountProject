package com.qa.account.accountapp;

import java.util.HashMap;
import java.util.Map;

public class AccountService implements AccountInterface {

	private Map<String, Account> accounts = new HashMap<>();;
	private JSONUtil util;
	
	public void addAccount(Account account) {
		accounts.put(account.getAccountNumber(), account);
	}
	
	public Account retrieveAccount(String accountNumber) {
		return accounts.get(accountNumber);
	}
	
	public String printAccountsAsJSON() {
		util = new JSONUtil();
		return util.getJSONfromObject(accounts.values());
	}
	
	public int countAccounts(String name) {
		System.out.println(accounts.values());
		return (int) accounts.values().stream().filter(i -> i.getFirstName().equals(name)).count();
	}
}
