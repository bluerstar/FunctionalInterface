package com.jdk8.interfaces.lambda5;

public class Test {

	public static void main(String[] args) {
		
//		// �ֲ�����
//		int age = 9; // ��ͬ�� final int age = 9;
//		// ʹ�������ڲ���ķ�ʽ
//		MyInterface mi1 = new MyInterface() {
//			@Override
//			public void test() {
//				System.out.println(age);
//			}
//		};
//		age = 10;
		
		
		// ʹ��lambda���ʽ����д��
		int age = 9;
		MyInterface mi2 = () -> {
			System.out.println(age);
		};
//		age = 10;
		mi2.test();

	}

}
