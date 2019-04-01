package com.ponda.cours;

public class IAccountImpl implements IAccount{

	@Override
	public void depot(double amount, Long id) {
		Account account = new Account();
		account.setId(id);
		account.setAmount(account.getAmount() + amount);
	}

	@Override
	public void retrait(double amount, Long id) {
		Account account = new Account();
		account.setId(id);
		
		account.setAmount(account.getAmount() - amount);
	}
}
