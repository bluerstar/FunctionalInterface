package com.jdk8.interfaces.lambda3;

public class Test {

	public static void main(String[] args) {
		// 使用匿名内部类的方式
		MyInterface mi1 = new MyInterface() {
			@Override
			public void print(String param) {
				System.out.println(param);
			}
		};
		
		// lambda表达式，常规写法
		MyInterface mi2 = (String param) -> {
			System.out.println(param);
		};
			
		// lambda表达式，简写...一个参数，可以省略掉小括号
		MyInterface mi3 = param -> System.out.println(param);
		
		mi3.print("world");
		
	}

}
