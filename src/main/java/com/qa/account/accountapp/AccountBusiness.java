package com.qa.account.accountapp;

public class AccountBusiness {

	AccountRepoInterface repo;
	
	public AccountBusiness(AccountRepoInterface repo) {
		this.repo = repo;
	}
	
	public String createAccount(Account account) {
		if ("9999".equals(account.getAccountNumber())) {
		return repo.createAccount(account);
		}
		
		return "{\"message\":\"This account is blocked\"}";
	}
}
