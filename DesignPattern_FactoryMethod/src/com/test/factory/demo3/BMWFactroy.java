package com.test.factory.demo3;

import com.test.factory.demo2.BMW;
import com.test.factory.demo2.Car;

public class BMWFactroy implements CarFactroy {
	
	@Override
	public Car getCar() {
		return new BMW();
	}

}
