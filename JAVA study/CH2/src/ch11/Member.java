package ch11;

public class Member {

	private int memberId;
	private String memberName;
	
	public Member(int memberId,String memberName) {
		this.memberId=memberId;
		this.memberName=memberName;
		
	}

	public int getMamberId() {
		return memberId;
	}

	public void setMamberId(int mamberId) {
		this.memberId = mamberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
	
}
