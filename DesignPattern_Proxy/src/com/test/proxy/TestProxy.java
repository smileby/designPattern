package com.test.proxy;


public class TestProxy {
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		Proxy proxy = new Proxy(realSubject);
		proxy.request();
	}
}
