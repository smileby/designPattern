package com.test.proxy;

/**
 * 静态代理
 * @author BaiYun
 *
 */
public class Proxy {
	private Subject subject;

	public Proxy() {
		this.subject = new RealSubject();
	}
	
	public Proxy(Subject subject){
		this.subject = subject;
	}
	
	public void request(){
		// 指定代理方法
		subject.request();
	}
}
