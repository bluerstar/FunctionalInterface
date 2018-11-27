package com.test.pro.java8;

public class MyClass implements MyInterface {

	@Override
	public void test() {
		System.out.println("Implements test");
	}

	@Override
	public void test2() {
		System.out.println("Implements test2");
	}
	
	/*@Override
	public void test5(){
		System.out.println("Implements test5");
	}*/
	@Override
	public void defaultMethod() {
		System.out.println("MyClass...");
		MyInterface.super.defaultMethod();
	}
}
