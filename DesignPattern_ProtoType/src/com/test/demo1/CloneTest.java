package com.test.demo1;

import java.util.ArrayList;
import java.util.Arrays;

public class CloneTest {
	
	/*
	 * 有一个现成的对象，这个对象里有值，
	 * 要将这个对象里的值赋值给另一对象，赋值的对象值要和之前的一样
	 * 对象的copy在使用ORM的时候经常用到
	 * 
	 * 能够直接拷贝的类型只有基本数据类型和String类型
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		
		ConcreteProtoType cpt = new ConcreteProtoType();
		cpt.setAge(14);
		cpt.setName("test");
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("TEST");
		cpt.setLists(arrayList);
		
		ConcreteProtoType cpt1 = (ConcreteProtoType)cpt.clone();
		System.out.println(cpt == cpt1);
		System.out.println(cpt1.getAge());
		System.out.println(cpt1.getName());
		// 拷贝的是同一个对象，也就是说这两个对象中的List是公用的
		// 拷贝这种类型数据需要实现对象的深拷贝
		System.out.println(cpt1.getLists() == cpt.getLists()); 
		
	}
}
