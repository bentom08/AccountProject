package com.qa.account.AccountApplication;

public interface AccountInterface {

	void addAccount(Account account);
	
	Account retrieveAccount(String accountNumber);
}
