package com.test.pro.java8;

public interface MyInterface {
	
	/**
	 * ʵ�������ʵ��
	 */
	void test();
	
	/**
	 * ʵ�������ʵ��
	 */
	public abstract void test2();
	
	/**
	 * ֻ�ܹ����ӿڵ��õ�
	 * ���ܱ��ӽӿڼ̳�
	 */
	static void staticMethod(){
		System.out.println("interface test4");
	}
	
	/**
	 * �ӿڵ��ò�����ʵ����ɸ�д���ɲ���д
	 * ���Ա��ӽӿڼ̳�
	 */
	default void defaultMethod(){
		System.out.println("interface test5");
	}
}
