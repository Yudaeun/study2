package ch16;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Happy";
		String s2="Day";
		
		Stringconcat concat=(s,v)->System.out.println(s+","+v);
		//�͸� ���� Ŭ������ �����ȴ�. �̸� ���� �͸� ��ü�� �����ȴ�.
		concat.makestring(s1, s2);
	}

}
