package ch09;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Class c=Class.forName("java.lang.String");
		//�������� Ŭ���� �ε�. �ʿ��� �� �ҷ��ͼ� �� �� �ִ�.
		Constructor[] cons=c.getConstructors();
		for(Constructor co: cons) {
			System.out.println(co);
		}
		Method[] m=c.getMethods();
		for(Method mth: m) {
			System.out.println(mth);
		}
		//���÷��� ���α׷���
		//���ÿ� �� ������Ʈ�� ���� �� ���
		
	}

}
