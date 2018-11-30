package com.jdk8.interfaces.lambda8;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		/*
		 * 需求：
		 *  已知	String中有一个实例方法（非静态的） endsWith
		 *  想自己写一个类封装上面的这个方法
		 *  借助于Java8Jdk提供的一个接口Function
		 */
		
		// 使用匿名内部类的方式
		/*String str = "hello world"; // 被判断的一个字符串对象
		Function<String, Boolean> func1 = new Function<String, Boolean>() {
			@Override
			public Boolean apply(String suffix) {
				return str.endsWith(suffix);
			}
		};
		
		Boolean b = func1.apply("world");
		System.out.println(b);*/
		
		// 使用lambda表达式常规写法
		/*String str = "hello world"; // 被判断的一个字符串对象
		Function<String, Boolean> func1 = suffix -> str.endsWith(suffix); 
		
		Boolean b = func1.apply("world");
		System.out.println(b);*/
		
		// 使用lambda表达式 简写  实例方法引用
		String str = "hello world";
		Function<String, Boolean> func1 = str::endsWith;
		
		Boolean b = func1.apply("world");
		System.out.println(b);
		
	}
}
