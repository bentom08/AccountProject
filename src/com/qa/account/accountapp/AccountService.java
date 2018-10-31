package com.qa.account.accountapp;

import java.util.HashMap;
import java.util.Iterator;
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
	
	public int countAccounts(String name) {
		int count = 0;

		for (Account a: accounts.values()) {
			if (a.getFirstName().equals(name)) {
				count ++;
			}
		}
	    
	    return count;
	}
}
