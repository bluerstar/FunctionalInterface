package com.jdk8.interfaces.lambda6;

/** ����һ�����person����Ĺ����ӿڣ�Ҳ��һ������ʽ�ӿ� */
@FunctionalInterface
public interface PersonFactory {
	
	/** ���Person����ķ��� */
	Person createPerson(String firstName,String lastName);

}
