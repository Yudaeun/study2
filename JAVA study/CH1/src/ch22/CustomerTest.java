package ch22;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customerL=new Customer(10010,"���");
		customerL.bonusPoint=1000;
		int price=customerL.calcPrice(1000);
		System.out.println(customerL.showCustomerInfo()+price+"���� ������ ����");
		
		VIPCustomer customerK=new VIPCustomer(10020,"�̹�");
		customerK.bonusPoint=1000;
		price=customerK.calcPrice(1000);
		System.out.println(customerK.showCustomerInfo()+price+"���� ������ ����");
	}

}
