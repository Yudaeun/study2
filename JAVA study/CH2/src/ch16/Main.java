package ch16;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Happy";
		String s2="Day";
		
		Stringconcat concat=(s,v)->System.out.println(s+","+v);
		//익명 내부 클래스가 생성된다. 이를 통해 익명 객체가 생성된다.
		concat.makestring(s1, s2);
	}

}
