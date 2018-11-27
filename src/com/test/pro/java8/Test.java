package com.test.pro.java8;

public class Test {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		MyInterface.staticMethod();
		mc.defaultMethod();
//		SubInterface.
		SubInterface si = new SubInterfaceImpl();
		si.defaultMethod();
	}

}
