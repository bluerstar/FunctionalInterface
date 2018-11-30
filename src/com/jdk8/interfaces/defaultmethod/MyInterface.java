package com.jdk8.interfaces.defaultmethod;

public interface MyInterface {
	/**
	 * 能被子接口继承
	 * 能被实现类覆写
	 */
	default void defaultMethod() {
		System.out.println("interface default method.");
	}
}
