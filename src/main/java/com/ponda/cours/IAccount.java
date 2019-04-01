package com.ponda.cours;

public interface IAccount {
	public void depot(double amount, Long id);
	public void retrait(double amount, Long id);
}
