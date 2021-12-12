package com.test.demo1;

public class DeletageTest {
	public static void main(String[] args) {
		/*
		 * 看上去像是项目经理在干活，实际上是员工在干活
		 * 典型的干活是我的，功劳是你的 
		 */
		Dispatcher dispatcher = new Dispatcher(new TargetA());
		dispatcher.doing();
	}
}
