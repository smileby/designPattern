package com.test.factory.demo1;

public class AudiFactory extends AbstractFactroy{

	@Override
	public Car getCar() {
		return new Audi();
	}

}
