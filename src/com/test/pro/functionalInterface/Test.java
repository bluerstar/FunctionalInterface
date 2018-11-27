package com.test.pro.functionalInterface;

public class Test {

	public static void main(String[] args) {
		/**
		 * 常规类实现接口
		 */
		MyInterface sum1 = new MyInterfaceImpl();
		System.out.println(sum1.sum(123, 456));
		
		/**
		 * 使用匿名内部类
		 */
		MyInterface sum2 = new MyInterface() {
			@Override
			public int sum(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		System.out.println(sum2.sum(123, 456));
		
		/**
		 * 使用Lambda表达式
		 */
		MyInterface sum3 = (int num1, int num2) -> {
			return num1 + num2;
		};
		
		System.out.println(sum3.sum(123, 456));
		
		/**
		 * 使用lambda表达式：简写
		 * 1.形参列表中的数据类型可以不写，会自动判断
		 * 2.如果方法中的代码只有一句，可以省略大括号{}，如果是return返回数据的，可以省略掉return
		 * 
		 */
		MyInterface sum4 = (num1, num2) -> num1 + num2;
		System.out.println(sum4.sum(123, 456));
		
	}

}
