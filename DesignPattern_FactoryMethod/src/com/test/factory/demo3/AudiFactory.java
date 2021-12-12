package com.test.factory.demo3;

import com.test.factory.demo2.Audi;
import com.test.factory.demo2.Car;

public class AudiFactory implements CarFactroy{

	@Override
	public Car getCar() {
		return new Audi();
	}

}
