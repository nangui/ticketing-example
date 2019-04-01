package com.ponda.models;

import com.ponda.models.Account;
import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Customer
 *
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c"),
	@NamedQuery(name="Customer.findById", query="SELECT c FROM Customer c WHERE c.id = :id")
})
public class Customer implements Serializable {	
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=true, length=255)
	private String address;
	@Column(length=100, nullable=true)
	private String phone;
	@OneToOne
	private Account account;

	public Customer() {
		super();
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}   
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}   
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
