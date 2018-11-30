package com.jdk5.generic;

// T¡¢E¡¢K¡¢V
public class Box<E> {

	private E data;

	public Box() {

	}

	public Box(E data) {
		this.data = data;
	}

	public E getData() {
		return data;
	}

}
