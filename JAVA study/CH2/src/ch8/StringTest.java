package ch8;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String java=new String("java");
		String android=new String("android");
		
		System.out.println(System.identityHashCode(java));
		java=java.concat(android);
		System.out.println(System.identityHashCode(java));
		//메모리 낭비가 발생한다.
		
		String java1=new String("java");
		String android1=new String("android");
		
		StringBuilder buffer=new StringBuilder(java1);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android1);
		
		String test=buffer.toString();
		System.out.println(test);
		System.out.println(System.identityHashCode(buffer));
		
	}

}
