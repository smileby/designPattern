package com.baiyun.demo1;

/**
 * 对梦娜丽莎的微笑进行装饰
 * @author BaiYun
 *
 */
public class Decorator implements Painting {
	
	private Painting painting;
	
	public Decorator(Painting painting){
		this.painting = painting;
	}
	
	@Override
	public void show() {
		System.out.println("加玻璃");
		painting.show();
		System.out.println("加相框");
	}

}
