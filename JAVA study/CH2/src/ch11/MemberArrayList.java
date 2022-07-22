package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	public MemberArrayList() {
		arrayList=new ArrayList<>();
	}
	public MemberArrayList(int size) {
		arrayList=new ArrayList<>(size);
	}
	public void addMember(Member member) {
		arrayList.add(member);
	}
	public boolean removeMember(int memberId) {
		//ArrayList���� geti��� �Լ��� �ִ�. �¸� �̿��ؼ� ���� ����� ������ �� �ִ�.
//		for(int i=0;i<arrayList.size();i++) {
//			Member member=arrayList.get(i);
//			
//			int tempId=member.getMamberId();
//			if (tempId==memberId) {
//				arrayList.remove(i);
//				return true;
//			}
//			
//		}
			Iterator<Member> ir=arrayList.iterator();
			//Member�� ��ȯ�ҰŴϱ� ����� �־��ش�. �ϰ͵� �� ������ ������Ʈ
			while(ir.hasNext()) {
				Member member=ir.next();
				int tempId=member.getMamberId();
				if(tempId==memberId) {
					arrayList.remove(member);
					return true;
				}
			}
			
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		for(Member member:arrayList) {
			System.out.println(member);
			
		}
		System.out.println();
	}
}
