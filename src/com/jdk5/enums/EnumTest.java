package com.jdk5.enums;

public class EnumTest {

	public static void main(String[] args) {
		System.out.println(Week.MONDAY.getClass());
		System.out.println(Week.MONDAY.name().getClass());
		System.out.println(Week.MONDAY);
		System.out.println(Week.MONDAY.name());
		System.out.println(Week.MONDAY.getCode());
		System.out.println(Week.MONDAY.getDesc());
		System.out.println(Week.MONDAY.ordinal());
		Week.MONDAY.print();
	}

}
