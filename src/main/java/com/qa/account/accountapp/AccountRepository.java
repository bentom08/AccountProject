package com.qa.account.accountapp;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.List;

import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@Transactional(SUPPORTS)
@Default
public class AccountRepository implements AccountRepoInterface {


	@PersistenceContext(unitName = "primary")
	EntityManager em;
	
	public List<Account> getAllAccounts() {
		TypedQuery<Account> query = em.createQuery("SELECT a FROM Account a", Account.class);
		return query.getResultList();
	}
	
	@Transactional(REQUIRED)
	public String createAccount(Account account) {
		em.persist(account);
		return "{\"Message\": \"Account Created\"}";
	}
	
	@Transactional(REQUIRED)
	public String deleteAccount(Long id) {
		Account account = em.find(Account.class, id);
		if (account != null) {
			em.remove(account);
		}
		return "{\"Message\": \"Account Successfully Deleted\"}";
	}
	
	public Account findAnAccount(Long id) {
		return em.find(Account.class, id);
	}
	
	@Transactional(REQUIRED)
	public String updateAccount(Account account, Long id) {
		Account oldAccount = em.find(Account.class, id);
		
		oldAccount.setFirstName(account.getFirstName());
		oldAccount.setLastName(account.getLastName());
		oldAccount.setAccountNumber(account.getAccountNumber());
		
		return "{\"message\": \"movie sucessfully updated\"}";
	}
}
