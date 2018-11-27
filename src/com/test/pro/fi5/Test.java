package com.test.pro.fi5;

import java.util.function.Function;

/**
 * 实例方法引用
 */
public class Test {

	public static void main(String[] args) {
		/**
		 * 已知String中有一个实例方法（非静态的）endsWith
		 * 想自己写一个类封装上面的这个方法
		 * 
		 * 借助于jdk8提供的一个接口Function
		 * @FunctionalInterface
			public interface Function<T, R> {
			    R apply(T t);
			}
		 */
		// 使用匿名内部类的方式
		/*String str = "hello.world";
		Function<String, Boolean> fun1 = new Function<String, Boolean>() {
			public Boolean apply(String suffix) {
				return str.endsWith(suffix);
			}
		};
		
		Boolean b = fun1.apply("world");
		System.out.println(b);*/
		
		/*// 使用lambda表达式常规写法
		String str = "hello.world";
		Function<String, Boolean> fun1 = suffix -> str.endsWith(suffix);
		Boolean b = fun1.apply("world");
		System.out.println(b);*/
		
		// 使用lambda表达式简写：实例方法引用
		String str = "hello.world";
		Function<String, Boolean> fun1 = str::endsWith;
		Boolean b = fun1.apply("world");
		System.out.println(b);
	}
}
