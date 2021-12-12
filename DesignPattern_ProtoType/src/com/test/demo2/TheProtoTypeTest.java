package com.test.demo2;

public class TheProtoTypeTest {
	public static void main(String[] args) {
		TheGreatestSage theGreatestSage = new TheGreatestSage();
		try {
			theGreatestSage.change();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
