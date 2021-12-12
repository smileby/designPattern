package com.test.service.demo1.impl;

import com.test.service.demo1.service.SumPrice;

/**
 * 计算京东支付折扣优惠的方法
 * @author BaiYun
 *
 */
public class JDPayServiceImpl implements SumPrice {
	
	/**
	 * 京东支付九折优惠
	 */
	@Override
	public Double countPrice(Double price) {
		return price * 0.9;
	}

}
