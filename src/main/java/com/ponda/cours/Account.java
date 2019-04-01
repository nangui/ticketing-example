package com.ponda.cours;

public class Account{
	protected Long id;
	protected double amount;
	
	public Account() {
		super();
		this.amount = 5000;
	}
	public Account(double amount) {
		super();
		this.amount = amount;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
