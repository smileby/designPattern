package com.test.factory.demo1;

public class BenzFactroy extends AbstractFactroy {

	@Override
	public Car getCar() {
		return new Benz();
	}

}
