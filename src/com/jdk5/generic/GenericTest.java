package com.jdk5.generic;

public class GenericTest {

	public static void main(String[] args) {
		Box<String> name = new Box<String>("corn");
		Box<Integer> age = new Box<Integer>(712);
		Box<Number> number = new Box<Number>(314);

		getData(name);
		getData(age);
		getData(number);
		getNumData(age);
		getNumData(number);
//		getNumberData(age);
		getNumberData(number);
	}

	public static void getData(Box<?> data) { // ?类型通配符
		System.out.println("data :" + data.getData());
	}
	
	public static void getNumData(Box<? extends Number> data) { // 通配符上限，Number类型及其子类
		System.out.println("num data :" + data.getData());
	}
	
	public static void getNumberData(Box<Number> data) { // 不能传入Box<Integer>的参数
		System.out.println("number data :" + data.getData());
	}

}
