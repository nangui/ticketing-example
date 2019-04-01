package com.ponda.models;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Account
 *
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Account.findByLogin", query="SELECT a FROM Account a WHERE a.login = :login")
})
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	@Column(unique=true)
	private String login;
	@Column(length=255, nullable=true)
	private String password;   
	@Column(length=255, nullable=true)
	private String token;
	private boolean isActive;
	@OneToOne(mappedBy="account")
	private Customer customer;

	public Account() {
		super();
	}
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}   
	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
