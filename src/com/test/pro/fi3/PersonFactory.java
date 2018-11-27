package com.test.pro.fi3;

/** 这是一个获得person对象的工厂接口，也是一个函数式接口 */
public interface PersonFactory {
	/** 获得person对象的方法 */
	Person createPerson(String firstName, String lastName);
}
