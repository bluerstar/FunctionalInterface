package com.test.pro.fi4;

/**
 * ��̬��������
 */
public class Test {

	public static void main(String[] args) {
		// �����ڲ���
		ParseInteger pi1 = new ParseInteger() {
			@Override
			public int parse(String param) {
				return Integer.parseInt(param);
			}
		};
		
		// lambda���ʽ����д��
		ParseInteger pi2 = param -> Integer.parseInt(param);
		
		// ��д����̬��������
		ParseInteger pi3 = Integer::parseInt;
		System.out.println(pi3.parse("567"));
		
	}
}
