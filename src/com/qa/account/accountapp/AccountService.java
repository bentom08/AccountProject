package com.qa.account.accountapp;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;

public class AccountService implements AccountInterface {

	private Map<String, Account> accounts = new HashMap<>();;
	private JSONUtil util;
	
	public void addAccount(Account account) {
		accounts.put(account.getAccountNumber(), account);
	}
	
	public Account retrieveAccount(String accountNumber) {
		return accounts.get(accountNumber);
	}
	
	public String printAccountsAsJSON() throws JsonProcessingException {
		util = new JSONUtil();
		return util.getJSONfromObject(accounts.values());
	}
}
