package com.jdk8.interfaces.lambda1;

public class Test {

	public static void main(String[] args) {
		MyInterface mi = new MyInterfaceImpl();
		System.out.println(mi.sum(123, 456));
	}

}
