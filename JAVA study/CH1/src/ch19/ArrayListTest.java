package ch19;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentLee=new Student(1001,"Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 50);
		
		Student studentKim=new Student(1002,"Kim");
		studentKim.addSubject("����",70);
		studentKim.addSubject("����",85);
		studentKim.addSubject("����",100);
		
		studentLee.showStudentInfo();
		System.out.println("===");
		studentKim.showStudentInfo();
	}

}