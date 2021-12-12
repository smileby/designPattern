package com.test.factory.demo2;

public class SimpleFactroy {
	
	public static Car getCar(String carName){
		if ("Benz".equalsIgnoreCase(carName)) {
			return new Benz();
		}else if("Audi".equalsIgnoreCase(carName)){
			return new Audi();
		}else if("BMW".equalsIgnoreCase(carName)){
			return new BMW();
		}else{
			System.out.println("无法生产该车型");
			return null;
		}
	}
}
