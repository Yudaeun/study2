package ch13;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberHashMap memberHashMap=new MemberHashMap();
		
		Member one=new Member(1001,"����");
		Member two=new Member(1002,"�̹�");
		Member three=new Member(1003,"����");
		
		memberHashMap.addMember(one);
		memberHashMap.addMember(two);
		memberHashMap.addMember(three);
		
		memberHashMap.showAllMember();

		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1001, "����");
		hashMap.put(1004, "���");
		System.out.println(hashMap);
	}

}
