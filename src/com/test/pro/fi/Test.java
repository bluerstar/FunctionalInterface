package com.test.pro.fi;

public class Test {

	public static void main(String[] args) {
		/**
		 * 匿名内部类
		 */
		MyInterface mi = new MyInterface() {
			@Override
			public void test() {
				System.out.println("fghjk");
			}
		};
		
		/**
		 * 使用lambda表达式常规写法
		 */
		MyInterface mi2 = () -> {
			System.out.println("fghjkljhg");
		};
		
		/**
		 * 使用lambda表达式简写
		 */
		MyInterface mi3 = () ->	System.out.println("fghjkljhg");
		
		/**
		 * 使用lambda表达式简写
		 */
		MyInterface mi4 = () ->	{};
		
		
		mi2.test();
	}

}
