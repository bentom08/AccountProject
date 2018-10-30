package com.qa.account.AccountApplication;

import java.util.HashMap;
import java.util.Map;

public class AccountService implements AccountInterface {

	private Map<String, Account> accounts;
	
	public AccountService() {
		accounts = new HashMap<>();
	}
	
	public void addAccount(String firstName, String lastName, String accountNumber) {
		accounts.put(accountNumber, new Account(firstName, lastName, accountNumber));
	}
	
	public Account retrieveAccount(String accountNumber) {
		return accounts.get(accountNumber);
	}
}
