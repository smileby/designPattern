package com.test.service.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyListTest {
	public static void main(String[] args) {
		ArrayList<Long> arrayList = new ArrayList<Long>();
		Collections.sort(arrayList, new Comparator<Long>() {
			// 返回值是固定的  -1 , 0 , 1
			@Override
			public int compare(Long o1, Long o2) {
				// 中间的执行逻辑是不一样的
				return 0;
			}
		});
	}
}
