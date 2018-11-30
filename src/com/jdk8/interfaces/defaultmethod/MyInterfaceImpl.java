package com.jdk8.interfaces.defaultmethod;

public class MyInterfaceImpl implements MyInterface {
	@Override
	public void defaultMethod() {
		MyInterface.super.defaultMethod();
		System.out.println("impl default method.");
	}
}
