package ch03;

public class StudentTest {
	
	public static void main(String[] args) {
		Student studentLee=new Student();
		studentLee.studentID=12345;
		studentLee.setStudentName("Lee");
		studentLee.address="서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim=new Student();
		studentKim.studentID=54321;
		studentKim.setStudentName("Kim");
		studentKim.address="서울 서초구";
		
		studentKim.showStudentInfo();
		System.out.println(studentKim);
		System.out.println(studentLee);
	}

}
