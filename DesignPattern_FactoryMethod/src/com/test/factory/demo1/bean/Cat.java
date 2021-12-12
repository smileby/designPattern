package com.test.factory.demo1.bean;

import java.util.Set;

public class Cat<T> {
	
	public static void main(String[] args) {
		Set<String> stringPropertyNames = System.getProperties().stringPropertyNames();
		for (String sysParam : stringPropertyNames) {
			System.out.println(sysParam);
		}
		
		System.err.println("================");
		
		// ISO-8859-1  (文件的编码集)
		System.out.println("file.encoding :" + System.getProperty("file.encoding"));
		System.out.println("user.name :" + System.getProperty("user.name"));
		System.out.println("java.home :" + System.getProperty("java.home"));
		System.out.println("user.language :" + System.getProperty("user.language"));
		System.out.println("java.version :" + System.getProperty("java.version"));
		System.out.println("java.ext.dirs :" + System.getProperty("java.ext.dirs"));
	}
}
class Dog<T>{
	
}