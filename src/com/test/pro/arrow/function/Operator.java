package com.test.pro.arrow.function;

public class Operator {

	public static void main(String[] args) {
		AddOperator<Long,Long> addOperator = (x, y)-> x + y;
		System.err.println("Custom function listener res = " + addOperator.add(34L, 65L));
	}

}
