package com.qa.account.accountapp;

import java.util.List;

public interface AccountRepoInterface {

	List<Account> getAllAccounts();
	
	String createAccount(Account account);
	
	String deleteAccount(Long id);
	
	Account findAnAccount(Long id);
	
	String updateAccount(Account account, Long id);
}
