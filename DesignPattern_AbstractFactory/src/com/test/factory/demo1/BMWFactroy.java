package com.test.factory.demo1;

public class BMWFactroy extends AbstractFactroy {
	
	@Override
	public Car getCar() {
		return new BMW();
	}

}
