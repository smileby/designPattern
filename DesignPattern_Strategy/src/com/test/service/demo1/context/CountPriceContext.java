package com.test.service.demo1.context;

import com.test.service.demo1.service.SumPrice;
import com.test.service.demo1.utils.StrategyFactory;

public class CountPriceContext {
	
	/**
	 * 策略的上下文
	 * @param type 计算类型
	 * @param price 计算金额
	 * @return
	 */
	public Double countPrice(int type, Double price) {
		// 得到策略工厂
		StrategyFactory factory = StrategyFactory.getNewInstance();
		// 从其它方法开始调用，传递计算价格的支付方式，和计算金额
		SumPrice sumStrategy = factory.getSumStrategy(type);
		Double countPrice = null;
		try {
			countPrice = sumStrategy.countPrice(price);
		} catch (Exception e) {
			System.err.println("计算折扣金额失败");
		}
		return countPrice;
	}
}
