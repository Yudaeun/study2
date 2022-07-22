package ch09;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		//Ŭ������ �������� ���
		Class c1=Class.forName("ch09.Person");

		Person person=(Person)c1.newInstance();//�ٿ�ĳ����
		person.setName("Riri");
		System.out.println(person);
		
		Class c2=person.getClass(); //�̹� �ν��Ͻ��� �ִ� ���¿��� �ڹ��� ��� Ŭ������ ���� �� �ִ�. ������Ʈ�� ������ �ִ� �Լ�
		Person person2=(Person)c2.newInstance();
		System.out.println(person2); //�̻��·� person2�� �θ��� null�� ��µȴ�.
		
		Class[] parameterTypes= {String.class};
		Constructor cons=c2.getConstructor(parameterTypes);
		Object[] initargs= {"Mimi"};
		Person Mimi=(Person)cons.newInstance(initargs);
		System.out.println(Mimi);
		
		//21~25 ������ �ڵ��� �Ʒ� �ڵ�� ����.
		Person Mimi2=new Person("Mimi");
		//21~25������ �ڵ��� ���ÿ� Person�� �������� ���� �� ����Ѵ�.
		
	}

}
