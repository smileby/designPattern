package com.test.factory.demo1;

public class TestWorkFactory {
	public static void main(String[] args) {
		StudentWorkFactory studentWorkfactory = new StudentWorkFactory();
		TeacherWorkFactory teacherWorkFactory = new TeacherWorkFactory();
		studentWorkfactory.getWork().doWork();
		teacherWorkFactory.getWork().doWork();
	}
}
