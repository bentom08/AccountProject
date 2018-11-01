package com.qa.account.accountapp;

import static javax.transaction.Transactional.TxType.REQUIRED;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.inject.Alternative;
import javax.faces.bean.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Alternative
public class AccountRepositoryAlt implements AccountRepoInterface {
	
	private Map<Long, Account> accountMap = new HashMap<>();
			
	public List<Account> getAllAccounts() {
		return (List<Account>) accountMap.values();
	}
	
	@Transactional(REQUIRED)
	public String createAccount(Account account) {
		accountMap.put(account.getId(), account);
		return "{\"Message\": \"Account Created\"}";
	}
	
	@Transactional(REQUIRED)
	public String deleteAccount(Long id) {
		accountMap.remove(id);
		return "{\"Message\": \"Account Successfully Deleted\"}";
	}
	
	public Account findAnAccount(Long id) {
		return accountMap.get(id);
	}
	
	@Transactional(REQUIRED)
	public String updateAccount(Account account, Long id) {
		accountMap.put(id, account);
		
		return "{\"message\": \"movie sucessfully updated\"}";
	}
}
