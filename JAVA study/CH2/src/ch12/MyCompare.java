package ch12;

import java.util.Set;

public class MyCompare implements Comparator<String>{
//�̹� Comparable�� �����Ǿ����� Comparator�� ���ϴ� ����� �ٽ� ������ �� �ִ�.
	public int compare(String s1,String s2) {
		return (s1.compareTo(s2))*-1;
	}
	public class ComparatorTest{
		public static void main(String[] args) {
			Set<String> set=new TreeSet<String>(new MyCompare());
			set.add("a");
			set.add("b");
			set.add("c");
			System.out.println(set);
		}
	}
}
