package com.qa.account.accountapp;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Runner {
	
	private Runner() {}

	public static void main(String[] args) throws JsonProcessingException {
		Account a1 = new Account("Ben", "Taylor", "34645757");
		Account a2 = new Account("Gareth", "Clifford", "34643464657");
		AccountService serv = new AccountService();
		serv.addAccount(a1);
		serv.addAccount(a2);
		System.out.println(serv.printAccountsAsJSON());
	}
}
