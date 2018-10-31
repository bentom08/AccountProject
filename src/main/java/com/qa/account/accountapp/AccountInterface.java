package com.qa.account.accountapp;

public interface AccountInterface {

	void addAccount(Account account);
	
	Account retrieveAccount(String accountNumber);
}
