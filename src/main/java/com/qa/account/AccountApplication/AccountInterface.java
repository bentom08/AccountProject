package com.qa.account.AccountApplication;

public interface AccountInterface {

	void addAccount(String firstName, String lastName, String accountNumber);
	
	Account retrieveAccount(String accountNumber);
}
