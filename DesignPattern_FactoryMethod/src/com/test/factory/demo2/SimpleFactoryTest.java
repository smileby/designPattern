package com.test.factory.demo2;

public class SimpleFactoryTest {
	public static void main(String[] args) {
		Car car = SimpleFactroy.getCar("BMW");
		Car car1 = SimpleFactroy.getCar("Audi");
		Car car2 = SimpleFactroy.getCar("Benz");
		System.out.println(car.getName());
		System.out.println(car1);
		System.out.println(car2);
	}
}
