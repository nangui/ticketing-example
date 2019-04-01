package com.ponda.cours;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class IRealImpl implements IProxy{

	@Override
	public void makeRequest(String url) {
		try {
			System.out.println(Inet4Address.getByName("http://google.com").getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
