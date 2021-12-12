package com.test.factory.demo1;

public class AbstractFactroyTest {
	public static void main(String[] args) {
		AbstractFactroy factroy = new DefaultFactory();
		Car car = factroy.getCar();
		Car car2 = factroy.getCar("BMW");
		System.out.println(car.getName());
		System.out.println(car2.getName());
	}
}
