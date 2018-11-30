package com.jdk8.interfaces.lambda7;

public class Test {

	public static void main(String[] args) {
		// 匿名内部类方式
		PersonInterface pi1 = new PersonInterface() {
			@Override
			public int parse(String param) {
				return Integer.parseInt(param);
			}
		};
		
		// lambda表达式 常规写法
		PersonInterface pi2 = param -> Integer.parseInt(param);
		
		// lambda表达式 简写 静态方法引用
		PersonInterface pi3 = Integer::parseInt;
		
		int parse = pi3.parse("4567");
		System.out.println(parse);
	}
}
