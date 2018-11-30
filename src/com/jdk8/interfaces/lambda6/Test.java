package com.jdk8.interfaces.lambda6;

public class Test {

	public static void main(String[] args) {
		/**
		 * 需求：
		 * 	1.有一个Person类
		 *  2.有一个获得Person对象的接口的工厂
		 *  3.想通过工厂来获得一个Person对象
		 *  4.需要先有一个实际的工厂对象
		 */
		
		// 使用匿名内部类方式
		PersonFactory factory = new PersonFactory() {
			@Override
			public Person createPerson(String firstName, String lastName) {
				return new Person(firstName, lastName);
			}
		};
		
		// 使用lambda表达式常规写法
		PersonFactory factory2 = (firstName, lastName) -> new Person(firstName, lastName);
		
		// 使用lambda表达式 简写  构造方法引用...要求接口参数方法和对象构造函数参数一致
		PersonFactory factory3 = Person::new;
		
		Person person = factory3.createPerson("hello", "world");
		System.out.println(person);
	}
}
