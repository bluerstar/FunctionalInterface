package com.jdk8.interfaces.staticmethod;

/**
 * java8 ֮ǰJava�ӿ�����ķ�������public abstract���εĳ��󷽷�����û�з�����
 */
public interface MyInterface {
	void test();
	
	/**
	 * 1.ʹ��static���νӿ��еķ��������з�����
	 * 2.�ӿڵ�static����ֻ�ܱ��ӿڱ�����ã��ӿ���.������();
	 * 3.�ӿڵ�static�������ܱ��ӽӿڼ̳�
	 * 4.�ӿڵ�static�������ܱ�ʵ���าд��ֱ�ӵ���
	 */
	static void staticMethod(){
		System.out.println("my Interface static method.");
	}
}
