package ch09;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Class c=Class.forName("java.lang.String");
		//동적으로 클래스 로딩. 필요할 때 불러와서 쓸 수 있다.
		Constructor[] cons=c.getConstructors();
		for(Constructor co: cons) {
			System.out.println(co);
		}
		Method[] m=c.getMethods();
		for(Method mth: m) {
			System.out.println(mth);
		}
		//리플렉션 프로그래밍
		//로컬에 이 오브젝트가 없을 때 사용
		
	}

}
