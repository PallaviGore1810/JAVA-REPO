package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resource.Account;

public class Wife extends Thread {

	private Account account;

	public Wife(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.deposit(2000);
		account.withdraw(5000);
	}

}
