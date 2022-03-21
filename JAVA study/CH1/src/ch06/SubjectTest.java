package ch06;

public class SubjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee=new Student(100,"Lee");
		studentLee.setKoreaSubject("국어",100);
		studentLee.setMathSubject("수학", 99);
		
		Student studentKim=new Student(200,"Kim");
		studentKim.setKoreaSubject("국어", 92);
		studentKim.setMathSubject("수학", 83);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	}

}
