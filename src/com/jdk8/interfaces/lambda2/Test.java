package com.jdk8.interfaces.lambda2;

public class Test {

	public static void main(String[] args) {
		// 使用匿名内部类的方式
		MyInterface mi = new MyInterface() {
			@Override
			public int sum(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		// 使用lambda表达式..常规写法
		// 将匿名内部类中参数部分，和方法体部分通过 -> 链接
		MyInterface mi2 = (int num1, int num2) -> {
			return num1 + num2;
		};
		
		/*
		 *  使用lambda表达式。简写
		 *  1.形参列表中的数据类型可以不写，会自动推断
		 *  2.如果方法体中的代码只有一句，可以省略掉{}，如果是return返回数据的，可以省略掉return
		 */
		MyInterface mi3 = (num1, num2) -> num1 + num2;
		
		System.out.println(mi3.sum(123, 456));
	}

}
