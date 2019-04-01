package com.ponda.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-01-14T19:24:54.012+0000")
@StaticMetamodel(Account.class)
public class Account_ {
	public static volatile SingularAttribute<Account, Long> id;
	public static volatile SingularAttribute<Account, String> login;
	public static volatile SingularAttribute<Account, String> password;
	public static volatile SingularAttribute<Account, String> token;
	public static volatile SingularAttribute<Account, Boolean> isActive;
	public static volatile SingularAttribute<Account, Customer> customer;
}
