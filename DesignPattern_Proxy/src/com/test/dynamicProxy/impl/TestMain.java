package com.test.dynamicProxy.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestMain {
	public interface Hello{
		void sayHello();
	}
		
	public static class HelloImpl implements Hello{
		@Override
		public void sayHello() {
			System.out.println("hello world!");
		}
	}
	
	public static class SupportProxy implements InvocationHandler{
		private Object object;
		
		public SupportProxy(Object object) {
			this.object = object;
		}
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			Object invoke = method.invoke(object, args);
			return invoke;
		}
	}
	
	public static void main(String args[]) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class<?> proxyClass = Proxy.getProxyClass(HelloImpl.class.getClassLoader(), HelloImpl.class.getInterfaces());
		Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
		Hello proxyObj = (Hello)constructor.newInstance(new SupportProxy(new HelloImpl()));
		System.out.println(Proxy.isProxyClass(proxyObj.getClass()));
		proxyObj.sayHello();
		
	}
}
