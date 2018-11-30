package com.jdk8.interfaces.functioninterface;

@FunctionalInterface
public interface MyInterface {
	void test();
	
//	void test3();
	
	static void test1(){}
	
	default void test2(){}
}
