package com.test.factory.demo1;

import java.util.logging.Logger;

public class StudentWork implements Work {
	@Override
	public void doWork() {
		Logger logger = Logger.getLogger("com.test.factory.StudentWork");
		logger.info("学生写作业！！！");
	}

}
