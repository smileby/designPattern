package com.test.service.demo1.utils;

import java.util.HashMap;

import com.test.service.demo1.impl.JDPayServiceImpl;
import com.test.service.demo1.impl.WXPayServiceImpl;
import com.test.service.demo1.impl.ZFBPayServiceImpl;
import com.test.service.demo1.model.PayEnum;
import com.test.service.demo1.service.SumPrice;

public class StrategyFactory {
	private static StrategyFactory factory = new StrategyFactory();
	private static HashMap<Integer, SumPrice> sumStrategy = new HashMap<Integer, SumPrice>();
	
	static{
		// 在系统启动的时候就将这些算法加载
		sumStrategy.put(PayEnum.JD.getType(), new JDPayServiceImpl());
		sumStrategy.put(PayEnum.WX.getType(), new WXPayServiceImpl());
		sumStrategy.put(PayEnum.ZFB.getType(), new ZFBPayServiceImpl());
	}
	
	private StrategyFactory() {
		// 此处不添加业务逻辑
	}
	
	public static StrategyFactory getNewInstance(){
		return factory;
	}
	
	public SumPrice getSumStrategy(int payType){
		return sumStrategy.get(payType);
	}
}
