package com.baiyun.demo1;

public class TestInteger {
	/**
	 * Integer使用了享元模式，在经常使用的valueOf方法中有IntegerCache
	 * 使用的值在-128到127范围内，都会直接从cache中取，这些值早就创建好了，
	 * 所以使用的值在Integer范围内的值创建出来的对象是同一个，然而超过了这个
	 * 范围之后的值，则不相同
	 * @param args
	 */
	public static void main(String[] args) {
		Integer integer = Integer.valueOf(10);
		Integer integer2 = 10;
		System.out.println(integer == integer2);
		
		Integer a = Integer.valueOf(128);
		Integer b = 128;
		System.out.println(a == b);
	}
}
