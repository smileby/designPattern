package com.test.factory.demo1;

public class StudentWorkFactory implements WorkFactory{

	@Override
	public Work getWork() {
		return new StudentWork();
	}
	
}
