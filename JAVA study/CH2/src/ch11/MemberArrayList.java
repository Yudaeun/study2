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
		//ArrayList에는 geti라는 함수가 있다. 걔를 이용해서 지울 멤버를 선택할 수 있다.
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
			//Member를 반환할거니까 멤버를 넣어준다. 암것도 안 넣으면 오브젝트
			while(ir.hasNext()) {
				Member member=ir.next();
				int tempId=member.getMamberId();
				if(tempId==memberId) {
					arrayList.remove(member);
					return true;
				}
			}
			
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member member:arrayList) {
			System.out.println(member);
			
		}
		System.out.println();
	}
}
