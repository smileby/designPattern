package com.test.demo1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteProtoType implements Cloneable {
	
	private int age;
	
	private String name;
	
	public ArrayList<String> lists = new ArrayList<String>();
	
	public List<String> getLists() {
		return lists;
	}

	public void setLists(ArrayList<String> lists) {
		this.lists = lists;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * 实现当前对象的深拷贝
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		ConcreteProtoType pType = (ConcreteProtoType)super.clone();
		// ArrayList实现了clone方法
		pType.lists = (ArrayList<String>)lists.clone(); 
		// 克隆是基于字节码操作的
		// 如果类型设计list嵌套map，map嵌套list的，则可以使用循环获取反射实现
		return pType;
	}
	
	
	
}
