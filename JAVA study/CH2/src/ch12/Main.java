package ch12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberTreeSet memberTreeSet=new MemberTreeSet();
		
		Member one=new Member(1003,"����");
		Member two=new Member(1004, "�̹�");
		Member three=new Member(1005,"�۸�");
		
		memberTreeSet.addMember(one);
		memberTreeSet.addMember(two);
		memberTreeSet.addMember(three);
		memberTreeSet.showAllMember();
	}

}
