package com.test.factory.demo3;


public class FactoryMethodTest {

	public static void main(String[] args) {
		CarFactroy factroy1 = new BenzFactroy();
		CarFactroy factroy2 = new AudiFactory();
		CarFactroy factroy3 = new BMWFactroy();
		System.out.println(factroy1.getCar().getName());
	}
}
