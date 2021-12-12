package com.test.factory.demo1;

/**
 * 
 * @author BaiYun
 *
 */
public abstract class AbstractFactroy {
	
	protected abstract Car getCar();
	
	public Car getCar(String carName){
		if ("Benz".equalsIgnoreCase(carName)) {
			return new BenzFactroy().getCar();
		}else if("Audi".equalsIgnoreCase(carName)){
			return new AudiFactory().getCar();
		}else if("BMW".equalsIgnoreCase(carName)){
			return new BMWFactroy().getCar();
		}else{
			System.out.println("无法生产该车型");
			return null;
		}
	}
}
