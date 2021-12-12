package com.test.service.demo1.impl;

import com.test.service.demo1.service.SumPrice;
/**
 * 计算微信支付折扣优惠的方法
 * @author BaiYun
 *
 */
public class WXPayServiceImpl implements SumPrice{
	
	/**
	 * 微信支付7折优惠
	 */
	@Override
	public Double countPrice(Double price) {
		return price * 0.7;
	}

}
