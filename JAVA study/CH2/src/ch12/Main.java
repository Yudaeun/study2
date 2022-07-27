package ch12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberTreeSet memberTreeSet=new MemberTreeSet();
		
		Member one=new Member(1003,"府府");
		Member two=new Member(1004, "固固");
		Member three=new Member(1005,"港港");
		
		memberTreeSet.addMember(one);
		memberTreeSet.addMember(two);
		memberTreeSet.addMember(three);
		memberTreeSet.showAllMember();
	}

}
