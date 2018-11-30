package com.jdk8.interfaces.lambda4;

public class Test {

	public static void main(String[] args) {
		// ʹ�������ڲ���ķ�ʽ
		MyInterface mi1 = new MyInterface() {
			@Override
			public void test() {
				System.out.println(666);
			}
		};

		// ʹ��lambda���ʽ����д��
		MyInterface mi2 = () -> {
			System.out.println(666);
		};

		// ʹ��lambda���ʽ...��д
		// δ���κβ�����д���������ǺϷ���
		MyInterface mi3 = () -> {};

		mi3.test();

	}

}
