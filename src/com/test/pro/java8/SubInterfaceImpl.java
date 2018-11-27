package com.test.pro.java8;

public class SubInterfaceImpl implements SubInterface {

	@Override
	public void test() {

	}

	@Override
	public void test2() {

	}
	
	@Override
	public void defaultMethod() {
		System.out.println("subInterfaceImpl....");
		SubInterface.super.defaultMethod();
	}

}
