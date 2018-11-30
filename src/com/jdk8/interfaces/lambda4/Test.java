package com.jdk8.interfaces.lambda4;

public class Test {

	public static void main(String[] args) {
		// 使用匿名内部类的方式
		MyInterface mi1 = new MyInterface() {
			@Override
			public void test() {
				System.out.println(666);
			}
		};

		// 使用lambda表达式常规写法
		MyInterface mi2 = () -> {
			System.out.println(666);
		};

		// 使用lambda表达式...简写
		// 未做任何操作的写法，但是是合法的
		MyInterface mi3 = () -> {};

		mi3.test();

	}

}
