package com.baiyun.demo1;

import com.baiyun.demo1.color.Color;
import com.baiyun.demo1.color.Gray;
import com.baiyun.demo1.opt.Circle;

public class TestDemo1 {
	public static void main(String[] args) {
		Color color = new Gray();
		Circle circle = new Circle();
		circle.setColor(color);
		circle.draw();
	}
}
