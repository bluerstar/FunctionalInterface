package com.test.pro.functionalInterface2;

public class Test {

	public static void main(String[] args) {
		
		/**
		 * 使用匿名内部类
		 */
		MyInterface mi = new MyInterface() {
			
			@Override
			public void print(String param) {
				System.out.println("--> " + param);
			}
		};
		
		/**
		 * 使用Lambda表达式
		 */
		MyInterface mi2 = (String param) -> {
			System.out.println("--> " + param);
		};
		
		/**
		 * 使用lambda表达式：简写
		 * 一个参数： param
		 */
		MyInterface mi3 = param -> System.out.println("--> " + param);
		
		mi3.print("ghjk");
	}

}
