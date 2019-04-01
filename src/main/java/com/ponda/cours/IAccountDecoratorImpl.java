package com.ponda.cours;

public class IAccountDecoratorImpl implements IAccount{

	@Override
	public void depot(double amount, Long id) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setId(id);
		account.setAmount(account.getAmount() + amount);
		
		if (account.getAmount() > 10000) {
			System.out.println("Message to the client with id = " + id);
		}
	}

	@Override
	public void retrait(double amount, Long id) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setId(id);
		
		if (account.getAmount() < amount) {
			System.out.println("Amount of cash of this account is < to " + amount);
		} else {
			account.setAmount(account.getAmount() - amount);
		}
	}

}
