package com.test.pro.fi3;

/**
 * 构造方法引用
 */
public class Test {

	public static void main(String[] args) {
		/**
		 * 有一个person类
		 * 有一个获得person对象的接口的工厂
		 * 想通过工厂来获得一个person对象
		 * 需要先有一个实际的工厂对象
		 */
		// 使用匿名内部类
		PersonFactory factory = new PersonFactory() {
			@Override
			public Person createPerson(String firstName, String lastName) {
				return new Person(firstName, lastName);
			}
		};
		
		Person person = factory.createPerson("lei", "wang");
		System.out.println(person);
		
		// lambda表达式
		PersonFactory factory2 = (firstName, lastName) -> new Person(firstName, lastName);
		Person person2 = factory2.createPerson("aa", "bb");
		System.out.println(person2);
		
		// lambda表达式简写
		PersonFactory factory3 = Person::new;
		Person person3 = factory3.createPerson("cc", "dd");
		System.out.println(person3);
	}

}
