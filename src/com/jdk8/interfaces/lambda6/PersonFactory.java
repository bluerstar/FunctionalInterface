package com.jdk8.interfaces.lambda6;

/** 这是一个获得person对象的工厂接口，也是一个函数式接口 */
@FunctionalInterface
public interface PersonFactory {
	
	/** 获得Person对象的方法 */
	Person createPerson(String firstName,String lastName);

}
