package ch22;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customerL=new Customer(10010,"라라");
		customerL.bonusPoint=1000;
		int price=customerL.calcPrice(1000);
		System.out.println(customerL.showCustomerInfo()+price+"원의 물건을 구매");
		
		VIPCustomer customerK=new VIPCustomer(10020,"미미");
		customerK.bonusPoint=1000;
		price=customerK.calcPrice(1000);
		System.out.println(customerK.showCustomerInfo()+price+"원의 물건을 구매");
	}

}
