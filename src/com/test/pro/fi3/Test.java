package com.test.pro.fi3;

/**
 * ���췽������
 */
public class Test {

	public static void main(String[] args) {
		/**
		 * ��һ��person��
		 * ��һ�����person����ĽӿڵĹ���
		 * ��ͨ�����������һ��person����
		 * ��Ҫ����һ��ʵ�ʵĹ�������
		 */
		// ʹ�������ڲ���
		PersonFactory factory = new PersonFactory() {
			@Override
			public Person createPerson(String firstName, String lastName) {
				return new Person(firstName, lastName);
			}
		};
		
		Person person = factory.createPerson("lei", "wang");
		System.out.println(person);
		
		// lambda���ʽ
		PersonFactory factory2 = (firstName, lastName) -> new Person(firstName, lastName);
		Person person2 = factory2.createPerson("aa", "bb");
		System.out.println(person2);
		
		// lambda���ʽ��д
		PersonFactory factory3 = Person::new;
		Person person3 = factory3.createPerson("cc", "dd");
		System.out.println(person3);
	}

}
