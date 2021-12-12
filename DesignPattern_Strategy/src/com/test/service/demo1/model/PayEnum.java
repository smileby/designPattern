package com.test.service.demo1.model;

/**
 * 支付的枚举类
 * @author BaiYun
 *
 */
public enum PayEnum {
	JD(1),
	WX(2),
	ZFB(3);
	
	private int type;
	
	PayEnum(int type){
		this.type = type;
	}
	
	public int getType(){
		return type;
	}
}
