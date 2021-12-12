package com.baiyun.demo1.color;

/**
 * 灰色
 * @author BaiYun
 *
 */
public class Gray implements Color {

	@Override
	public void paint(String shape) {
		System.out.println("灰色的：" + shape);
	}

}
