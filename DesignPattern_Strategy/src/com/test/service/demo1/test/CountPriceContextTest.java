package com.test.service.demo1.test;


import com.test.service.demo1.context.CountPriceContext;
import com.test.service.demo1.model.PayEnum;

public class CountPriceContextTest {

	public static void main(String[] args) {
		CountPriceContext context = new CountPriceContext();
		Double countPriceJD = context.countPrice(PayEnum.JD.getType(), 10000.0);
		Double countPriceWX = context.countPrice(PayEnum.WX.getType(), 10000.0);
		Double countPriceZFB = context.countPrice(PayEnum.ZFB.getType(), 10000.0);
		System.out.println("京东折扣价：" + countPriceJD + "\r微信折扣价：" + countPriceWX + "\r支付宝折扣价：" + countPriceZFB);
		
	}

}
