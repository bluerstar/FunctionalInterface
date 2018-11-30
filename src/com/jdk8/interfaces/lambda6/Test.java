package com.jdk8.interfaces.lambda6;

public class Test {

	public static void main(String[] args) {
		/**
		 * ����
		 * 	1.��һ��Person��
		 *  2.��һ�����Person����ĽӿڵĹ���
		 *  3.��ͨ�����������һ��Person����
		 *  4.��Ҫ����һ��ʵ�ʵĹ�������
		 */
		
		// ʹ�������ڲ��෽ʽ
		PersonFactory factory = new PersonFactory() {
			@Override
			public Person createPerson(String firstName, String lastName) {
				return new Person(firstName, lastName);
			}
		};
		
		// ʹ��lambda���ʽ����д��
		PersonFactory factory2 = (firstName, lastName) -> new Person(firstName, lastName);
		
		// ʹ��lambda���ʽ ��д  ���췽������...Ҫ��ӿڲ��������Ͷ����캯������һ��
		PersonFactory factory3 = Person::new;
		
		Person person = factory3.createPerson("hello", "world");
		System.out.println(person);
	}
}
