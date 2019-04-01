package com.ponda.cours;

public class Test {
	public static void main(String[] args) {
		IProxy iProxy = new IRealImpl();
		iProxy.makeRequest("google.com");
	}
}
