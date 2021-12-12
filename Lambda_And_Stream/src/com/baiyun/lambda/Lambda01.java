package com.baiyun.lambda;

import java.util.Arrays;
import java.util.List;

public class Lambda01 {
	public static void main(String[] args) {
		String[] atp = {"a", "c", "f", "e", "b", "d"};
		List<String> asList = Arrays.asList(atp);
		// 普通循环---》
		for (String string : asList) {
			System.out.print(string);
		}
		System.out.println();
		// 使用lambda 
		asList.forEach(System.out::print);
		System.out.println();
		asList.forEach((str) -> System.out.print(str));
	}
}
