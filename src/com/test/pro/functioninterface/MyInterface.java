package com.test.pro.functioninterface;

/**
 * 函数式接口。只有一个抽象方法, 比如只能有一个test的抽象方法， 不能再有test2的抽象方法，
 * 不然不能使用下面的注解
 * Runable
 */
@FunctionalInterface
public interface MyInterface {
	
	void test();
	
	static void staticMethod(){}
	
	default void defaultMethod(){}

}
