package ch14;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employeeLee=new Employee();
		employeeLee.setEmployeeName("����");
		
		System.out.println(Employee.getSerialNum());
	
		Employee employeeRuRu=new Employee();
		employeeRuRu.setEmployeeName("���");
		
		System.out.println(employeeLee.getEmployeeName()+"���� ����� "+ employeeLee.getEmployeeId());
		System.out.println(employeeRuRu.getEmployeeName()+"���� ����� "+ employeeRuRu.getEmployeeId());
	}

}
