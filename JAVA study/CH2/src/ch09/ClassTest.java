package ch09;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		//클래스를 가져오는 방법
		Class c1=Class.forName("ch09.Person");

		Person person=(Person)c1.newInstance();//다운캐스팅
		person.setName("Riri");
		System.out.println(person);
		
		Class c2=person.getClass(); //이미 인스턴스가 있는 상태에서 자바의 모든 클래스를 가질 수 있다. 오브젝트가 가지고 있는 함수
		Person person2=(Person)c2.newInstance();
		System.out.println(person2); //이상태로 person2를 부르면 null이 출력된다.
		
		Class[] parameterTypes= {String.class};
		Constructor cons=c2.getConstructor(parameterTypes);
		Object[] initargs= {"Mimi"};
		Person Mimi=(Person)cons.newInstance(initargs);
		System.out.println(Mimi);
		
		//21~25 라인의 코딩은 아래 코드와 같다.
		Person Mimi2=new Person("Mimi");
		//21~25라인의 코딩은 로컬에 Person이 존재하지 않을 때 사용한다.
		
	}

}
