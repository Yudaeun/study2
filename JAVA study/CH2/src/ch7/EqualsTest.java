package ch7;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student std1=new Student(100,"riri");
		Student std2=new Student(100,"riri");
		
		System.out.println(std1==std2); //두개의 주솟값이 같은지 틀린지 확인
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		String str1=new String("abc");
		String str2=new String("abc");
		System.out.println(str1.equals(str2));
		
		std1.setStudentName("mimi");
		Student copyStudent=(Student)std1.clone();
		System.out.println(copyStudent);
	}

}
