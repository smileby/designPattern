package com.baiyun.demo1;

public class TestDemo1 {
	
	public static void main(String[] args) {
		MonaLisa monaLisa = new MonaLisa();
		Decorator decorator = new Decorator(monaLisa);
		decorator.show();
	}
}
