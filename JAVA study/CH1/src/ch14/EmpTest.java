package ch14;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employeeLee=new Employee();
		employeeLee.setEmployeeName("리리");
		
		System.out.println(Employee.getSerialNum());
	
		Employee employeeRuRu=new Employee();
		employeeRuRu.setEmployeeName("루루");
		
		System.out.println(employeeLee.getEmployeeName()+"님의 사번은 "+ employeeLee.getEmployeeId());
		System.out.println(employeeRuRu.getEmployeeName()+"님의 사번은 "+ employeeRuRu.getEmployeeId());
	}

}
