package com.jdk8.interfaces.lambda3;

public class Test {

	public static void main(String[] args) {
		// ʹ�������ڲ���ķ�ʽ
		MyInterface mi1 = new MyInterface() {
			@Override
			public void print(String param) {
				System.out.println(param);
			}
		};
		
		// lambda���ʽ������д��
		MyInterface mi2 = (String param) -> {
			System.out.println(param);
		};
			
		// lambda���ʽ����д...һ������������ʡ�Ե�С����
		MyInterface mi3 = param -> System.out.println(param);
		
		mi3.print("world");
		
	}

}
