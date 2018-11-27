package com.test.pro.functionalInterface;

public class Test {

	public static void main(String[] args) {
		/**
		 * ������ʵ�ֽӿ�
		 */
		MyInterface sum1 = new MyInterfaceImpl();
		System.out.println(sum1.sum(123, 456));
		
		/**
		 * ʹ�������ڲ���
		 */
		MyInterface sum2 = new MyInterface() {
			@Override
			public int sum(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		System.out.println(sum2.sum(123, 456));
		
		/**
		 * ʹ��Lambda���ʽ
		 */
		MyInterface sum3 = (int num1, int num2) -> {
			return num1 + num2;
		};
		
		System.out.println(sum3.sum(123, 456));
		
		/**
		 * ʹ��lambda���ʽ����д
		 * 1.�β��б��е��������Ϳ��Բ�д�����Զ��ж�
		 * 2.��������еĴ���ֻ��һ�䣬����ʡ�Դ�����{}�������return�������ݵģ�����ʡ�Ե�return
		 * 
		 */
		MyInterface sum4 = (num1, num2) -> num1 + num2;
		System.out.println(sum4.sum(123, 456));
		
	}

}
