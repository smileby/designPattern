package com.test.factory.demo3;

import com.test.factory.demo2.Benz;
import com.test.factory.demo2.Car;

public class BenzFactroy implements CarFactroy {

	@Override
	public Car getCar() {
		return new Benz();
	}

}
