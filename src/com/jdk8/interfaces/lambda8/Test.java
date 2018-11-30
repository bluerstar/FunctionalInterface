package com.jdk8.interfaces.lambda8;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		/*
		 * ����
		 *  ��֪	String����һ��ʵ���������Ǿ�̬�ģ� endsWith
		 *  ���Լ�дһ�����װ������������
		 *  ������Java8Jdk�ṩ��һ���ӿ�Function
		 */
		
		// ʹ�������ڲ���ķ�ʽ
		/*String str = "hello world"; // ���жϵ�һ���ַ�������
		Function<String, Boolean> func1 = new Function<String, Boolean>() {
			@Override
			public Boolean apply(String suffix) {
				return str.endsWith(suffix);
			}
		};
		
		Boolean b = func1.apply("world");
		System.out.println(b);*/
		
		// ʹ��lambda���ʽ����д��
		/*String str = "hello world"; // ���жϵ�һ���ַ�������
		Function<String, Boolean> func1 = suffix -> str.endsWith(suffix); 
		
		Boolean b = func1.apply("world");
		System.out.println(b);*/
		
		// ʹ��lambda���ʽ ��д  ʵ����������
		String str = "hello world";
		Function<String, Boolean> func1 = str::endsWith;
		
		Boolean b = func1.apply("world");
		System.out.println(b);
		
	}
}
