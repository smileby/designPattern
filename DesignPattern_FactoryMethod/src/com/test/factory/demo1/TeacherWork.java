package com.test.factory.demo1;

import java.util.logging.Logger;

public class TeacherWork implements Work {

	@Override
	public void doWork() {
		Logger logger = Logger.getLogger("com.test.factory.TeacherWork");
		logger.info("老师批作业！！！");
	}

}
