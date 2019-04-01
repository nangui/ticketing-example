package com.ponda.cours;

import java.io.IOException;
import java.net.Inet4Address;

public class IProxyImpl implements IProxy {
	IProxy realProxy;
	
	@Override
	public void makeRequest(String url) {
		try {
			if (Inet4Address.getByName(url).isReachable(1500)) {
				realProxy = new IRealImpl();
				realProxy.makeRequest(url);
			} else {
				System.out.println("This website isn't reachable");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
