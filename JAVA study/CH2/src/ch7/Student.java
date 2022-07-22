package ch7;

public class Student implements Cloneable{

	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentName=studentName;
		this.studentNum=studentNum;
	}
	
	public void setStudentName(String name) {
		this.studentName=name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public int hashCode() {
		return studentNum; //논리적으로 같은 해쉬코드를 반환
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student std=(Student)obj;//다운캐스팅
			if(this.studentNum==std.studentNum)
				return true;
			else 
				return false;}
		return false;
		
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentName+","+studentNum;
	}
	
}
