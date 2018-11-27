package com.test.pro.fi4;

/**
 * 静态方法引用
 */
public class Test {

	public static void main(String[] args) {
		// 匿名内部类
		ParseInteger pi1 = new ParseInteger() {
			@Override
			public int parse(String param) {
				return Integer.parseInt(param);
			}
		};
		
		// lambda表达式常规写法
		ParseInteger pi2 = param -> Integer.parseInt(param);
		
		// 简写，静态方法引用
		ParseInteger pi3 = Integer::parseInt;
		System.out.println(pi3.parse("567"));
		
	}
}
