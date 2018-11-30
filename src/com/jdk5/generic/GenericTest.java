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

	public static void getData(Box<?> data) { // ?����ͨ���
		System.out.println("data :" + data.getData());
	}
	
	public static void getNumData(Box<? extends Number> data) { // ͨ������ޣ�Number���ͼ�������
		System.out.println("num data :" + data.getData());
	}
	
	public static void getNumberData(Box<Number> data) { // ���ܴ���Box<Integer>�Ĳ���
		System.out.println("number data :" + data.getData());
	}

}
