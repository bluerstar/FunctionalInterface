package com.jdk8.interfaces.lambda7;

public class Test {

	public static void main(String[] args) {
		// �����ڲ��෽ʽ
		PersonInterface pi1 = new PersonInterface() {
			@Override
			public int parse(String param) {
				return Integer.parseInt(param);
			}
		};
		
		// lambda���ʽ ����д��
		PersonInterface pi2 = param -> Integer.parseInt(param);
		
		// lambda���ʽ ��д ��̬��������
		PersonInterface pi3 = Integer::parseInt;
		
		int parse = pi3.parse("4567");
		System.out.println(parse);
	}
}
