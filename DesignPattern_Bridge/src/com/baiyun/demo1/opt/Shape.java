package com.baiyun.demo1.opt;

import com.baiyun.demo1.color.Color;

/**
 * 将抽象部分与它的实现部分相分离
 * @author BaiYun
 *	形状
 */
public abstract class Shape {
	
	Color color;

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract void draw();
}
