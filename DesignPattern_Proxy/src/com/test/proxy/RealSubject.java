package com.test.proxy;

/**
 * 被代理类
 * @author BaiYun
 *
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("我被代理了");
	}

}
