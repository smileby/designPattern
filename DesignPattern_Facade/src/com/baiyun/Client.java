package com.baiyun;

import com.baiyun.facade.Computer;

public class Client {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.start();
		computer.shutdown();
	}
}
