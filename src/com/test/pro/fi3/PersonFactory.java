package com.test.pro.fi3;

/** ����һ�����person����Ĺ����ӿڣ�Ҳ��һ������ʽ�ӿ� */
public interface PersonFactory {
	/** ���person����ķ��� */
	Person createPerson(String firstName, String lastName);
}
