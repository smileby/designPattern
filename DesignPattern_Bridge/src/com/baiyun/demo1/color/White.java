package com.baiyun.demo1.color;

/**
 * 白色
 * @author BaiYun
 *
 */
public class White implements Color {

	@Override
	public void paint(String shape) {
		System.out.println("白色的：" + shape);
	}

}
