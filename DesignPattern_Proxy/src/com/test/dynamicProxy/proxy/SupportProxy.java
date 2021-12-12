package com.test.dynamicProxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 定义一个代理类，用来动态的生成日志
 * 【动态代理的实现】
 * @author BaiYun
 *
 */
public class SupportProxy implements InvocationHandler{
	private Object object;
	
	public SupportProxy(Object object){
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(object, args);
	}
	
	/**
	 * 实现方式一：
	 */
//	InvocationHandler h = new InvocationHandler() {
//		@Override
//		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//			Object invoke = null;
//			try {
//				// 方法执行前进行功能扩张
//				System.out.println("方法：" + method.getName() + "被执行，参数为：" + (0 == args.length?"":Arrays.asList(args).toString()));
//				invoke = method.invoke(object, args);
//				// 方法执行后进行扩展
//				System.out.println("方法：" + method.getName() + "被执行，结果为：" + invoke);
//				
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("方法：" + method.getName() + "执行异常，异常为:" + e.getCause().getMessage());
//			}
//			
//			
//			return invoke;
//		}
//	};
//	public Object getProxyObj(){
//		return Proxy.newProxyInstance(object.getClass().getClassLoader(), 
//				object.getClass().getInterfaces(), h);
//	}
	
	/**
	 * 实现方式二：
	 */	
	public Object getProxyObj(){
		return Proxy.newProxyInstance(object.getClass().getClassLoader(),
				object.getClass().getInterfaces(),
				new InvocationHandler() {
					Object invoke;
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						try {
							System.out.println("开始执行方法：" + method.getName() + ",参数为：" + ((null != args&&args.length>0)?Arrays.toString(args):""));
							invoke = method.invoke(object, args);
							System.out.println("方法执行结束，结果为：" + invoke.toString());
						} catch (Exception e) {
							System.err.println("方法执行异常，错误消息为：" + e.getCause().getMessage());
						}
						
						return invoke;
					}
				});
	}

}
