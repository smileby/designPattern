package com.test.dynamicProxy.proxy;

import com.test.dynamicProxy.impl.MathCalImpl;
import com.test.dynamicProxy.service.MathCal;

public class TestProxy {
	public static void main(String[] args) {
		MathCal proxyObj2 = (MathCal) new SupportProxy(new MathCalImpl()).getProxyObj();
		proxyObj2.div(10, 0);
//		System.out.println();
		Integer aInteger = new Integer(1);
	}
}
