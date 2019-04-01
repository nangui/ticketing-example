package com.ponda.repositories;

import java.util.List;

import com.ponda.models.Customer;

public interface ICustomer {
	public Customer getCustomerByLoginAndPassword(String login, String password);
	public Customer getCustomerByLogin(String login);
	public String getTokenByLogin();
	public List<Customer> getCustomers();
	public Customer getCustomerById(Long id);
	public Customer register(String login, String password);
}
