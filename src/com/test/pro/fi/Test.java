package com.test.pro.fi;

public class Test {

	public static void main(String[] args) {
		/**
		 * �����ڲ���
		 */
		MyInterface mi = new MyInterface() {
			@Override
			public void test() {
				System.out.println("fghjk");
			}
		};
		
		/**
		 * ʹ��lambda���ʽ����д��
		 */
		MyInterface mi2 = () -> {
			System.out.println("fghjkljhg");
		};
		
		/**
		 * ʹ��lambda���ʽ��д
		 */
		MyInterface mi3 = () ->	System.out.println("fghjkljhg");
		
		/**
		 * ʹ��lambda���ʽ��д
		 */
		MyInterface mi4 = () ->	{};
		
		
		mi2.test();
	}

}
