package com.test.pro.functionalInterface2;

public class Test {

	public static void main(String[] args) {
		
		/**
		 * ʹ�������ڲ���
		 */
		MyInterface mi = new MyInterface() {
			
			@Override
			public void print(String param) {
				System.out.println("--> " + param);
			}
		};
		
		/**
		 * ʹ��Lambda���ʽ
		 */
		MyInterface mi2 = (String param) -> {
			System.out.println("--> " + param);
		};
		
		/**
		 * ʹ��lambda���ʽ����д
		 * һ�������� param
		 */
		MyInterface mi3 = param -> System.out.println("--> " + param);
		
		mi3.print("ghjk");
	}

}
