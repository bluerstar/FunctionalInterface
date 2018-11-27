package com.test.pro.fi5;

import java.util.function.Function;

/**
 * ʵ����������
 */
public class Test {

	public static void main(String[] args) {
		/**
		 * ��֪String����һ��ʵ���������Ǿ�̬�ģ�endsWith
		 * ���Լ�дһ�����װ������������
		 * 
		 * ������jdk8�ṩ��һ���ӿ�Function
		 * @FunctionalInterface
			public interface Function<T, R> {
			    R apply(T t);
			}
		 */
		// ʹ�������ڲ���ķ�ʽ
		/*String str = "hello.world";
		Function<String, Boolean> fun1 = new Function<String, Boolean>() {
			public Boolean apply(String suffix) {
				return str.endsWith(suffix);
			}
		};
		
		Boolean b = fun1.apply("world");
		System.out.println(b);*/
		
		/*// ʹ��lambda���ʽ����д��
		String str = "hello.world";
		Function<String, Boolean> fun1 = suffix -> str.endsWith(suffix);
		Boolean b = fun1.apply("world");
		System.out.println(b);*/
		
		// ʹ��lambda���ʽ��д��ʵ����������
		String str = "hello.world";
		Function<String, Boolean> fun1 = str::endsWith;
		Boolean b = fun1.apply("world");
		System.out.println(b);
	}
}
