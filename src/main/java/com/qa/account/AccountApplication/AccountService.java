package com.qa.account.AccountApplication;

import java.util.HashMap;
import java.util.Map;

public class AccountService implements AccountInterface {

	Map<String, Account> accounts;
	
	public AccountService() {
		accounts = new HashMap<String, Account>();
	}
	
	public void addAccount(Account account) {
		accounts.put(account.getAccountNumber(), account);
	}
	
	public Account retrieveAccount(String accountNumber) {
		return accounts.get(accountNumber);
	}
}
