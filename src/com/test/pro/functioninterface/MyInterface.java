package com.test.pro.functioninterface;

/**
 * ����ʽ�ӿڡ�ֻ��һ�����󷽷�, ����ֻ����һ��test�ĳ��󷽷��� ��������test2�ĳ��󷽷���
 * ��Ȼ����ʹ�������ע��
 * Runable
 */
@FunctionalInterface
public interface MyInterface {
	
	void test();
	
	static void staticMethod(){}
	
	default void defaultMethod(){}

}
