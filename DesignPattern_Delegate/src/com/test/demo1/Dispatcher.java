package com.test.demo1;

/**
 * 委派者 【相当于项目经理】
 * @author BaiYun
 *
 */
public class Dispatcher implements IDelegate {
	
	private IDelegate exector;
	
	public Dispatcher(IDelegate exector){
		this.exector = exector;
	}
	
	@Override
	public void doing() {
		this.exector.doing();
	}

}
