package com.qa.account.accountapp;

import javax.inject.Inject;


public class AccountBusiness {

	@Inject
	AccountRepoInterface repo;
	
	@Inject
	JSONUtil util;
	
	public String createAccount(Account account) {
		if ("9999".equals(account.getAccountNumber())) {
		return repo.createAccount(account);
		}
		
		return "{\"message\":\"This account is blocked\"}";
	}
	
	public String getAllAccounts() {
		return util.getJSONfromObject(repo.getAllAccounts());
	}
	
	
	public String deleteAccount(Long id) {
		return repo.deleteAccount(id);
	}
	
	public String findAnAccount(Long id) {
		return util.getJSONfromObject(repo.findAnAccount(id));
	}
	
	public String updateAccount(Account account, Long id) {
		return repo.updateAccount(account, id);
	}
}
