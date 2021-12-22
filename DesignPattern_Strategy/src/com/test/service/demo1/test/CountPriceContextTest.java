package com.test.service.demo1.test;


import com.test.service.demo1.context.CountPriceContext;

public class CountPriceContextTest {

	public static void main(String[] args) {
		CountPriceContext context = new CountPriceContext();
		Double countPriceJD = context.countPrice(1, 10000.0);
		Double countPriceWX = context.countPrice(2, 10000.0);
		Double countPriceZFB = context.countPrice(3, 10000.0);
		System.out.println("京东折扣价：" + countPriceJD + "\r微信折扣价：" + countPriceWX + "\r支付宝折扣价：" + countPriceZFB);
		
	}

}
