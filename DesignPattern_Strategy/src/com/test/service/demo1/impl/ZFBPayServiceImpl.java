package com.test.service.demo1.impl;

import com.test.service.demo1.service.SumPrice;

/**
 * 计算支付宝支付折扣优惠的方法
 * @author BaiYun
 *
 */
public class ZFBPayServiceImpl implements SumPrice{
	
	/**
	 * 支付宝支付五折优惠
	 */
	@Override
	public Double countPrice(Double price) {
		return price * 0.5;
	}

}
