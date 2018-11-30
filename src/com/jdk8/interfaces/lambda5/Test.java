package com.jdk8.interfaces.lambda5;

public class Test {

	public static void main(String[] args) {
		
//		// 局部变量
//		int age = 9; // 等同于 final int age = 9;
//		// 使用匿名内部类的方式
//		MyInterface mi1 = new MyInterface() {
//			@Override
//			public void test() {
//				System.out.println(age);
//			}
//		};
//		age = 10;
		
		
		// 使用lambda表达式常规写法
		int age = 9;
		MyInterface mi2 = () -> {
			System.out.println(age);
		};
//		age = 10;
		mi2.test();

	}

}
