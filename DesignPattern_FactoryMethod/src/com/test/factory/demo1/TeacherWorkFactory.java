package com.test.factory.demo1;

public class TeacherWorkFactory implements WorkFactory {

	@Override
	public Work getWork() {
		return new TeacherWork();
	}
	
}
