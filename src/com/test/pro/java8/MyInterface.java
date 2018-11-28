package com.test.pro.java8;

public interface MyInterface {
	
	/**
	 * 实现类必须实现
	 */
	void test();
	
	/**
	 * 实现类必须实现
	 */
	public abstract void test2();
	
	/**
	 * 只能够被接口调用到
	 * 不能被子接口继承
	 */
	static void staticMethod(){
		System.out.println("interface test4");
	}
	
	/**
	 * 接口调用不到，实现类可复写，可不复写
	 * 可以被子接口继承
	 */
	default void defaultMethod(){
		System.out.println("interface test5");
	}
}
