package com.test.factory.demo1;

public class DefaultFactory extends AbstractFactroy {
	
	private AbstractFactroy factory = new AudiFactory();
	
	@Override
	public Car getCar() {
		return factory.getCar();
	}

}
