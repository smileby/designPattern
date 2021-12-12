package com.test.demo1;


/**
 * 冲饮料
 * @author BaiYun
 *
 */
public abstract class Benvegrage {
	
	public final void create(){
		// 1、 把水烧开
		boilWater();
		// 2、准备好杯子
		pourInCup();
		// 3、用水冲泡
		brew();
		// 4、添加辅料
		addCoundiments();
	}
	
	public abstract void addCoundiments();

	public abstract void pourInCup();
	
	public void boilWater() {
		System.out.println("起锅烧水！！！");
	}
	
	private void brew() {
		System.out.println("将开水倒入杯中");
	}
	
}
