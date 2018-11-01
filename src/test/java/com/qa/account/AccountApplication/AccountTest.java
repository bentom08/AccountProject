package com.qa.account.AccountApplication;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.qa.account.accountapp.Account;
import com.qa.account.accountapp.AccountBusiness;
import com.qa.account.accountapp.AccountRepository;
import com.qa.account.accountapp.AccountRepositoryAlt;
import com.qa.account.accountapp.AccountService;

public class AccountTest {
	
	Account a1;
	Account a2;
	Account a3;
	
	@Mock
	AccountBusiness rules;

	@Before
	public void accountSetup() {
		Account a1 = new Account("Ben", "Taylor", "234535346");
		Account a2 = new Account("Ben", "Other", "9999");
		Account a3 = new Account("Gareth", "Clifford", "4564547");
	}
	
	@Test
	public void accountCountTest() {
		AccountService serv = new AccountService();
		
		serv.addAccount(a1);
		serv.addAccount(a2);
		serv.addAccount(a3);
		
		assertEquals(2, serv.countAccounts("Ben"));
		assertEquals(1, serv.countAccounts("Gareth"));
		assertEquals(0, serv.countAccounts("Tom"));
	}
	
	@Test
	public void testBusinessRules() {
		
		String blockedMessage = "{\"message\":\"This account is blocked\"}";
		String successMessage = "{\"Message\": \"Account Created\"}";
		
		assertEquals(successMessage, rules.createAccount(a1));
		assertEquals(blockedMessage, rules.createAccount(a2));
	}
}
