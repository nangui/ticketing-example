package com.ponda.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ponda.models.Customer;
import com.ponda.repositories.ICustomer;

public class CustomerImpl implements ICustomer{
	
	private EntityManager em;
	private int ok;
	
	public CustomerImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ticketing");
		em = emf.createEntityManager();
	}

	@Override
	public Customer getCustomerByLoginAndPassword(String login, String password) {
		return null;
	}

	@Override
	public Customer getCustomerByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTokenByLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomers() {
		List<Customer> list = em.createNamedQuery("Customer.findAll").getResultList();
		return list;
	}

	@Override
	public Customer register(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerById(Long id) {
		return em.find(Customer.class, id);
	}

}
