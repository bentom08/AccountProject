package com.qa.account.accountapp;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Runner {
	
	private Runner() {}

	public static void main(String[] args) throws JsonProcessingException {
		AccountService serv = new AccountService();
		
		Account a1 = new Account("Ben", "Taylor", "234535346");
		Account a2 = new Account("Ben", "Other", "83745");
		Account a3 = new Account("Gareth", "Clifford", "4564547");
		
		serv.addAccount(a1);
		serv.addAccount(a2);
		serv.addAccount(a3);
		
		System.out.println(serv.countAccounts("Ben"));
		
		System.out.println(serv.countAccounts("Gareth"));
	}
}
