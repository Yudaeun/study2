package ch11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList memberArrayList=new MemberArrayList();
		
		Member one=new Member(1001,"����");
		Member two=new Member(1002,"�̹�");
		Member three=new Member(1003,"����");
		Member four=new Member(1004,"�۸�");
		
		memberArrayList.addMember(one);
		memberArrayList.addMember(two);
		memberArrayList.addMember(three);
		memberArrayList.addMember(four);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(one.getMamberId());
		memberArrayList.showAllMember();
	}

}
