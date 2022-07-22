package ch11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList memberArrayList=new MemberArrayList();
		
		Member one=new Member(1001,"府府");
		Member two=new Member(1002,"固固");
		Member three=new Member(1003,"单捞");
		Member four=new Member(1004,"港港");
		
		memberArrayList.addMember(one);
		memberArrayList.addMember(two);
		memberArrayList.addMember(three);
		memberArrayList.addMember(four);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(one.getMamberId());
		memberArrayList.showAllMember();
	}

}
