package com.singleton.realize;

/**
 * 实现简单的单例模式
 * @author BaiYun
 */
public class SimpleSingleton {
	
	// 静态方法只能访问类成员的静态属性
	private static SimpleSingleton SingletonInstace;
	/**
	 * 私有化构造器
	 */
	private SimpleSingleton(){ }
	
	/**
	 * 获取对象的单实例
	 * 这种实现方式是线程不安全的
	 * @return
	 */
	public static SimpleSingleton getInstace(){
		if (null == SingletonInstace) {
			SingletonInstace = new SimpleSingleton();
		}
		return SingletonInstace;
	}
	
}
