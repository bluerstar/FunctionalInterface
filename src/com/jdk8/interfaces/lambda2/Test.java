package com.jdk8.interfaces.lambda2;

public class Test {

	public static void main(String[] args) {
		// ʹ�������ڲ���ķ�ʽ
		MyInterface mi = new MyInterface() {
			@Override
			public int sum(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		// ʹ��lambda���ʽ..����д��
		// �������ڲ����в������֣��ͷ����岿��ͨ�� -> ����
		MyInterface mi2 = (int num1, int num2) -> {
			return num1 + num2;
		};
		
		/*
		 *  ʹ��lambda���ʽ����д
		 *  1.�β��б��е��������Ϳ��Բ�д�����Զ��ƶ�
		 *  2.����������еĴ���ֻ��һ�䣬����ʡ�Ե�{}�������return�������ݵģ�����ʡ�Ե�return
		 */
		MyInterface mi3 = (num1, num2) -> num1 + num2;
		
		System.out.println(mi3.sum(123, 456));
	}

}
