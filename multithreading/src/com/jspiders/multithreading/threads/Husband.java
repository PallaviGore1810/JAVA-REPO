package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resource.Account;

public class Husband extends Thread {

	private Account account;

	public Husband(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.deposit(10000);
		account.withdraw(2000);
	}
}