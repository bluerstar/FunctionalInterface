package com.jdk8.interfaces.staticmethod;

/**
 * java8 之前Java接口里面的方法都是public abstract修饰的抽象方法并且没有方法体
 */
public interface MyInterface {
	void test();
	
	/**
	 * 1.使用static修饰接口中的方法，且有方法体
	 * 2.接口的static方法只能被接口本身调用：接口名.方法名();
	 * 3.接口的static方法不能被子接口继承
	 * 4.接口的static方法不能被实现类覆写及直接调用
	 */
	static void staticMethod(){
		System.out.println("my Interface static method.");
	}
}
