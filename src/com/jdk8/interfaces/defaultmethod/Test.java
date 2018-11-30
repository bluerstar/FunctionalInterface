package com.jdk8.interfaces.defaultmethod;

public class Test {

	public static void main(String[] args) {
//		MyInterface mi = new MyInterfaceImpl();
//		mi.defaultMethod();
		
		new SubMyInterfaceImpl().defaultMethod();
	}

}
