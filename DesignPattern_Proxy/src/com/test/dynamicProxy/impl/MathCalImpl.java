package com.test.dynamicProxy.impl;

import com.test.dynamicProxy.service.MathCal;

public class MathCalImpl implements MathCal {

	@Override
	public int add(int param1, int param2) {
		return param1 + param2;
	}

	@Override
	public int sub(int param1, int param2) {
		// TODO Auto-generated method stub
		return param1 - param2;
	}

	@Override
	public int mul(int param1, int param2) {
		// TODO Auto-generated method stub
		return param1 * param2;
	}

	@Override
	public int div(int param1, int param2) {
		// TODO Auto-generated method stub
		return param1 / param2;
	}

}
